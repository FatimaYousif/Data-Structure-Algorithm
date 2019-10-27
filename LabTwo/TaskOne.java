import java.util.Scanner;
public class TaskOne {
    public static void main(String[] args) {
        int[] array=new int[100]; //declared an array having size 100
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Size of an array"); 
        int size=obj.nextInt();
        System.out.println("Enter Elements");
        for(int i=0; i<size; i++){
            array[i]=obj.nextInt();
        }
        
        
    }
    
}
