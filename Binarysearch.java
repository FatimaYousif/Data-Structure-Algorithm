import java.util.Arrays;
public class BinarySearch {
public static void main (String [] args) {
	// defining an array of string having names of fruit as elements
		String arr[] = {"Apples", "Grapes", "Oranges", "Kiwi"};
		// defining the name of fruit to be found
		String st = "Oranges";

		//defining an array of characters
	    char a[] = {'a' , 'b' , 'c' , 'd' , 'e' };
		//defining the character to be found
	    char c = 'e';
	    //for string 
        Arrays.sort(arr);

        int searchIndex = binarySearch(arr,st);

        System.out.println(searchIndex != -1 ? arr[searchIndex]+ " - Index is "+searchIndex : "Not found");
        //for character
        Arrays.sort(a);

        int searchIndex1 = binarySearch(a,c);

        System.out.println(searchIndex1 != -1 ? a[searchIndex1]+ " - Index is "+searchIndex1 : "Not found");
	    
 }
public static int binarySearch(String[] a, String x) {
    int low = 0;
    int high = a.length - 1;
    int mid;

    while (low <= high) {
        mid = (low + high) / 2;

        if (a[mid].compareTo(x) < 0) {
            low = mid + 1;
        } else if (a[mid].compareTo(x) > 0) {
            high = mid - 1;
        } else {
            return mid;
        }
    }

    return -1;
 }
public static int binarySearch(char[] a, char x) {
	int low = 0;
    int high = a.length - 1;

    while (low <= high) {
        int mid = (low + high) >>> 1;
        char midVal = a[mid];

        if (midVal < x)
            low = mid + 1;
        else if (midVal > x)
            high = mid - 1;
        else
            return mid; // key found
    }
    return -(low + 1);  // key not found.
 }
}
 
