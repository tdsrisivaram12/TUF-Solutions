class Solution {
    // Function to print pattern7
    public void pattern7(int n) {
        
        // Outer loop which will loop for the rows.
        for (int i = 0; i < n; i++) {
            
            // This loop will print the spaces
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            
            // Inner loop will print asterisks 
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            /* As soon as stars for each iteration are printed,
             move to the next row and give a line break */
            System.out.println();
        }
    }
}