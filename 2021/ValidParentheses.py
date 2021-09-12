class Solution:
    def isValid(self, s: str) -> bool:
        parMap = {'(':')', '{':'}', '[':']'}
        stack = []
        
        for i in range(0, len(s)):
            # if an open parentheses
            if s[i] in parMap:
                stack.append(s[i])
            else:
                # the closing paren doesn't match
                if len(stack) == 0 or parMap[stack.pop()] != s[i]:
                    return False
        
        # if the stack is empty then all open parentheses have been closed
        return len(stack) == 0
