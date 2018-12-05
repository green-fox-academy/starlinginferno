public class DiagonalMatrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
// - Print this two dimensional array to the output
    public static void main(String[] args) {

   /*     int[] numberArray = {1, 0, 0, 0};



        String[][] multiArray = new String [4][3];
        for(int i = 0; i < multiArray.length; i++)
        {
            for(int j = 0; j < multiArray[i].length; j++)
            {
                multiArray[i][j] = i + " " + j;
            }
        }

        for(int i = 0; i < multiArray.length; i++)
        {
            for(int j = 0; j < multiArray[i].length; j++)
            {
                System.out.print(multiArray[i][j]);
            }
            System.out.println();
        }
*/

   int firstArray[][] = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0,0,1,0},{0,0,0,1}};
  // int secondArray[][] = {{0,0,1,0},{0,0,0,1}};

        display(firstArray);

  //      display(secondArray);
    }
    public static void display(int x [][]){
        for(int row=0;row<x.length;row++){
            for(int column=0;column<x[row].length;column++){
                System.out.print(x[row][column]+"\t");
            }
            System.out.println();
        }
    }
}

