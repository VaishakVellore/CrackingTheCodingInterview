/*Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.*/

package Arrays_Strings;

public class ZeroMatrix {

    static void nullifyRows(int[][] matrix, int row)
    {
        for(int j = 0; j<matrix[0].length; j++)
            matrix[row][j] = 0;
    }

    static void nullifyColumn(int[][] matrix, int column)
    {
        for(int i = 0; i<matrix.length; i++)
            matrix[i][column] = 0;
    }

    static int[][] zeroMatrix(int[][] matrix)
    {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for(int i =0 ; i<matrix.length; i++)
        {
            for(int j = 0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for(int i = 0; i<row.length; i++){
            if(row[i]) nullifyRows(matrix, i);
        }

        for(int j = 0; j<column.length; j++){
            if(column[j]) nullifyColumn(matrix, j);
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2},
                          {1,2,3},
                          {4,5,6}};

        int result[][] = zeroMatrix(matrix);
        System.out.println(result);
    }
}
