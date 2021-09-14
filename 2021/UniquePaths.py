class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        # create our dp array
        dp = [[0 for x in range(n)] for y in range(m)]
        
        # set first row and first column to 1
        #   bc there's only one way to either continually go right or go down
        for i in range(0, m):
            dp[i][0] = 1
        for j in range(0, n):
            dp[0][j] = 1
        
        # calculate the unique paths for each spot in the grid
        for c in range(1, m):
            for r in range(1, n):
                dp[c][r] = dp[c][r - 1] + dp[c - 1][r] # above + left
        
        # the finish corner
        return dp[m-1][n-1]
        
        
        
        
        
# how many paths did I have to take to get to this spot? and then the spot next to it?
# we could have gotten here from above or from the left (since those are the only direction we can go)
# thus the number of paths to get to location z is the # of paths we can take to get to locations x + y


# | | |y| |
# | |x|z| |
# | | | | |
