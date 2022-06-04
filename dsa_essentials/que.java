package dsa_essentials;

public class que {
    public static void main(String[] args) {
        //write a code to print diagonal elements of a 3x3 matrix
        int i = 0;
        int j = 0;
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==j)
                {
                    System.out.print(arr[i][j]);
                }
            }
        }
    }
}
