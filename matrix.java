package matrix ;
import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
	
	    int i,j;
		int[][] matrix1 = new int[2][2];
		Scanner scan = new Scanner(System.in);
		int[][] matrix2 = new int[2][2];
		int[][] matrix3 = new int[2][2];
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				matrix1[i][j] = scan.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				matrix2[i][j] = scan.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				matrix3[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println(matrix3[i][j]);
			}
		}
}
}
