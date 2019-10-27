import java.util.Arrays;
import java.util.Scanner;

class Task6{

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		//User input of rows.
		System.out.print("Please enter the no. of rows: ");
		int row=input.nextInt();

		//User input of columns.
		System.out.print("Please enter the no. of columns: ");
		int col=input.nextInt();

		//Initializing the values into the array indices through loops.
		int[][] mat=new int[row][col];
		System.out.println("Enter the elements of the "+row+"x"+col+" Matrix: ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print("Enter the element "+(i+1)+"x"+(j+1)+": ");
				mat[i][j]=input.nextInt();
			}
			System.out.println();
		}

		/*Sorting the elements of matrix by making an array "temp",
		copying the values into indices of temp one by one
		and using the sort method of Arrays on temp. */
		int[] temp=new int[row*col];
		int tempindex=0;
		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				temp[tempindex++]=mat[i][j];

		Arrays.sort(temp);

		//Copying the sorted elements back into the matrix.
		tempindex=0;
		for(int i=0; i<row; i++)
			for(int j=0; j<col; j++)
				mat[i][j]=temp[tempindex++];

		//Printing the sorted matrix.
		System.out.println("The sorted matrix is: ");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}