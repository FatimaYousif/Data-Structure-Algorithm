public class LinearSearch {
public static void main (String [] args) {
	// defining an array of string having names of fruit as elements
	String arr[] = {"Apples", "Grapes", "Oranges", "Kiwi"};
	// defining the name of fruit to be found
	String st = "Oranges";
	//defining an array of characters
    char a[] = {'a' , 'b' , 'c' , 'd' , 'e' };
	//defining the character to be found
    char c = 'e';
	//result is the condition that whether element is in array or not
    boolean result=false;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==st)
        {
            System.out.println(st+" is found at "+(i+1));
            result=true;
            break;
        }
    }
    if(result=false)
    {
        System.out.println(st+" is not present in the array.");
    }
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==c)
        {
            System.out.println(c+" is found at "+(i+1));
            result=true;
            break;
        }
    }
    if(result=false)
    {
        System.out.println(c+" is not present in the array.");
    }
    
}

}
