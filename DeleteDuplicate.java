public class DeleteDuplicate {
public static void main(String [] args) {
	int a[] = {20, 20, 30, 40, 50, 50, 50};
	int size= 6;
	for(int i=0; i<size; i++) {
		if(a[i] == a[i+1] ) {
			
		               for(int j=i; j<size; j++)
		               {
		                   a[j] = a[j+1];
		               }
		           
		          }
		}
	System.out.println("Now Array is :");
	for(int x=0; x<(size-2); x++) {
		System.out.print(a[x]);
		System.out.print(" ");
		
	}
}
}
