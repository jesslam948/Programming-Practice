class Node:
    def __init__(self):
        self.isStart = False
        self.children = {}

    def addChild(self, letter: str):
        self.children[letter] = Node()
        
    def setStart(self):
        self.isStart = True

class StreamChecker:
    def __init__(self, words: List[str]):
        self.buffer = "" # for querying later
        self.root = Node() # not an start since no empty suffixes
        for word in words:
            temp = self.root
            for i in range(len(word) - 1, -1, -1):
                letter = word[i]
                # create node
                if len(temp.children) == 0 or letter not in temp.children:
                    temp.addChild(letter)
                temp = temp.children[letter]
            # set startNode
            temp.setStart()
        return
        
        
    def query(self, letter: str) -> bool:
        self.buffer += letter
        hasStart = False
        
        node = self.root
        for i in range(len(self.buffer) - 1, -1, -1):
            myLetter = self.buffer[i]
            if myLetter not in node.children:
                break
                
            node = node.children[myLetter]
            if node.isStart == True:
                hasStart = True
                    
        if len(self.buffer) > 2000:
            self.buffer = self.buffer[1:]
            
        return hasStart



## My original code
# class Node:
#     def __init__(self):
#         self.isEnd = False
#         self.children = {}
#         self.backLink = None

#     def addChild(self, letter: str):
#         self.children[letter] = Node()
        
#     def setLink(self, link: 'Node'):
#         self.backLink = link
        
#     def setEnd(self):
#         self.isEnd = True

# class StreamChecker:
#     def __init__(self, words: List[str]):
#         self.root = Node() # not an end since no empty suffixes
#         self.mySet = {self.root} # this is for when we do the querying later
#         for word in words:
#             temp = self.root
#             for i in range(0, len(word)):
#                 letter = word[i]
#                 # create node
#                 if len(temp.children) == 0 or letter not in temp.children:
#                     # determine if this will be an end node
#                     # print("adding child")
#                     temp.addChild(letter)
#                     # if i == len(word) - 1:
#                     #     temp.addChild(letter, True)
#                     # else:
#                     #     temp.addChild(letter, False)
#                 temp = temp.children[letter]
#                 # create backlink
#                 if letter in self.root.children:
#                     temp.setLink(self.root.children[letter])
#                     # print(letter + " set link")
#                 # set endNode
#                 if i == len(word) - 1:
#                     temp.setEnd()
#         return
        
        
#     def query(self, letter: str) -> bool:
#         updatedSet = {self.root}
#         hasEnd = False
#         while len(self.mySet) > 0:
#             node = self.mySet.pop()
#             if letter in node.children:
#                 child = node.children[letter]
#                 updatedSet.add(child)
#                 if child.isEnd == True:
#                     hasEnd = True
#                 if child.backLink != None:
#                     updatedSet.add(child.backLink)
#                     if child.backLink.isEnd == True:
#                         hasEnd = True
#         self.mySet = updatedSet
#         return hasEnd
    
    
# ISSUE: TLE.. stuff with backlinks seems to be slow... looking around it looks like 
#   reversing the word before putting it in the trie may work?

# example:
# "abc", "xyz", "xya", "xab"

#    .
#   a x
#   . .
#   b y  a
#   . .    .
#   c z a  b
#   . . .  .

# x - y - a  --> true
# b - c --> true

# prob 1 account for multi-char suffixes --> point back to corresponding 1 char
# prob 2 how do we store this?
#   node structure
#       - bool leaf?
#       - hashmap key:value <--> next letter branch:node

# plan for init
# create root node
# iterate through the words list and add each character as a branch in this "tree"
#   if the first letter or so of a word in the is the same as the beginning of a previously
#       read word, then follow that branch down until there is a difference and make new
#       branches


# plan for query
# store our current positions in the tree
# return true if the query leads us to a end node

# first start with the root
# look at the children to see if the letter is there
#   if NOT then stay at the root position
#   else keep one pointer at the root and store another pointer that's looking at that child
# look down backlink for the child and store a pointer to it IF a pointer doesn't already exist 
# check if that child or the backlink of the child (if distinct) is a leaf
#   if so, return true (else false)

# for each pointer to a node
#   look at their children to see if the letter is there
#       remove this pointer
#       if YES then store another pointer that's looking at the child
#           look down the backlink for this child and store a pointer to it IF one doesn't exist
#   check if any of our pointers point to a leaf node
#       if YES then set hasLeaf = TRUE
# return hasLeaf

# prob how to store node pointers??
#   - need add & remove functionality
#   - quick way to check if the pointer is already in there


# Your StreamChecker object will be instantiated and called as such:
# obj = StreamChecker(words)
# param_1 = obj.query(letter)
