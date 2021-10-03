import java.util.*;
class CheckSymmetricMatrix 
{
    public static void main(String[ ] args) 
    {
        int row_size, col_size, i , j;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows of the matrix: ");
        row_size = sc.nextInt();
        System.out.println("Enter the number of columns of the matrix:");
        col_size = sc.nextInt();

        int matrix[][] =new int[row_size][col_size];

        System.out.println("Enter the elements of the matrix: ");
        for(i=0;i<row_size;i++)
        {
            for(j=0;j<col_size;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Printing the input matrix :");
         
        for (i = 0; i < row_size; i++)
        {
            for (j = 0; j <col_size; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
             
            System.out.println();
        }

        int transpose[][] = new int [col_size] [row_size];

        if(row_size == col_size)
        {
            for(i=0;i<col_size;i++)
            {
                 for(j=0;j<row_size;j++)
                 {
                      transpose[i][j]=matrix[j][i];
                } 
           }
       }

    int flag = 0;       
    for(i=0;i<col_size;i++)
    {
        for(j=0;j<row_size;j++)
        {
            if(matrix[i][j] == transpose[i][j])
            {
                flag = 1;
            }
        }
    }
    if(flag == 1)
    {
        System.out.println("The Matrix is a Symmetric Matrix");
    }
    else
    { 
        System.out.println("The Matrix is not a Symmetric Matrix");
    }
    }
}

