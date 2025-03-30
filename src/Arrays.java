public class Arrays {

  public static void main(String args) {
    // 1D ARRAYS //
    // Create a 1d array of Strings of length 4

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one

    // Get the value of the array at index 2 and print it out

    // Get the length of the array and print it out

    // Iterate over the array using a traditional for loop and print out each item

    // Iterate over the array using a for-each loop and print out each item

    // Print the array using Arrays.toString

    // 2D ARRAYS //
    // Use the provided 2d array:
    char[][] grid = {{'q', 'w', 'e', 'r'},
                     {'a', 's', 'd', 'f'},
                     {'z', 'x', 'c', 'v'}};
    /*
     2d arrays are arranged in row, column order.

     grid is a 3x4 ("three by four") rectangular array:
       - it has 3 rows 
       - it has 4 columns

     Each ROW is its own 1d array.
     
     For example, row 0 of grid is:
       {'q', 'w', 'e', 'r'}

     It can be accessed like so:
       grid[0]
     */

     // Assign row 2 (the third row) of grid to a new one dimensional array
     // int[] lastRow = //YOUR EXPRESSION HERE

     // Print out lastRow using Arrays.toString

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
  

  /**
   * Sums the values of a one dimensional array.
   * 
   * Edge case: returns 0 if the array is empty or null
   * 
   * @param arr
   * @return the sum of the values
   */
  public static int sum(int[] arr) {
    return 0;
  }

  /**
   * Sums the values of a two dimensional array.
   * 
   * Edge case: returns 0 if the array is empty or null
   * 
   * @param arr
   * @return the sum of the values
   */
  public static int sum(int[][] arr) {
    return 0;
  }
}
