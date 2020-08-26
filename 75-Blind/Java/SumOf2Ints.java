class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int c = a & b; // this determines if there is a carry
            a = a ^ b; // this tells us if there will be a 1 output at each placeholder, regardless of the carry
            b = c << 1; // this shifts the carry to the correct place
        } // ends when a is the sum of a and b and when there aren't anymore carries to deal with
        
        return a;
    }
    
    /**
    a: 5 : 0101
    b: 2 : 0010
    
    c:a&b: 0000
    a:a^b: 0111
    b:c<<1:0000
    7 : 0111
    
    
    a: 3 : 0011
    b: 3 : 0011
    
    c:a&b: 0011
    a:a^b: 0000
    b:c<<1:0110
    
    c:a&b: 0000
    a:a^b: 0110
    b:c<<1:0000
    6 : 0110
    **/
}
