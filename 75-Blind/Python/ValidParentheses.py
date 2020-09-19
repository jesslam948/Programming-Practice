class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        
        start = ["(", "{", "["]
        end = [")", "}", "]"]
        
        for c in s:
            if c in start:
                stack.append(c)
            else:
                if len(stack) is not 0 and start.index(stack[-1]) is end.index(c):
                    stack.pop()
                else:
                    return False
        
        if len(stack) is 0:
            return True
        else:
            return False



# ([{

# 1. stack 
#     a. add to it if the parenthesis is open
#     b. remove if we get the matching closing bracket
