class Solution {
    public String convert(String s, int numRows) {
        
        StringBuilder[] zigzag = new StringBuilder[numRows];
        
        for (int i = 0; i < numRows; i++) {
            zigzag[i] = new StringBuilder();            
        }
        
        int currentChar =0;
        int sLength = s.length();
        while (currentChar < sLength) {
            for (int i = 0; i < numRows && currentChar < sLength; i++) {
                zigzag[i].append(s.charAt(currentChar));
                currentChar++;
            }
            for (int i = numRows - 2; i > 0 && currentChar < sLength; i--) {
                zigzag[i].append(s.charAt(currentChar));
                currentChar++;
            } 
        }
        StringBuilder result = new StringBuilder();
        for (int i=0; i<numRows; i++) {
            result.append(zigzag[i].toString());
            }
        return result.toString();
    }
}
