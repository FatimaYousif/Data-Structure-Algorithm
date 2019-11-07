public class Task2 {
    public static int BinaryCharSearch(char[] array1,char e){//binary search of charaters
        
        int i, p,q;
        p=0;q=array1.length-1;
        while(p<=q){
            i=(p+q)/2;
            
             if(array1[i]==e){
                 return i;
             }
             if(array1[i]<e){
                 p=i+1;
                 
             }
             else
             {
                 q=i-1;
             }
             
                
              
        }//while ends 
        return -p-1;
        
    }//method ends
    public static int BinaryStringSearch(String[] array2,String a){//Binary Search of String
        
        int i, p,q;
        p=0;q=array2.length-1;
        while(p<=q){
            i=(p+q)/2;
            
            int r=a.compareTo(array2[i]);
            
             if(r==0){
                 return i;
             }
             if(r>0){
                 p=i+1;
                 
             }
             else
             {
                 q=i-1;
             }
             
                
              
        }//while ends 
        return -p-1;
        
    }//method ends


    
    public static void main(String[] args) {
        char[] arrayOne={'a','b','c','d','e','f'};
        System.out.println("Character Found at index ="+BinaryCharSearch(arrayOne,'e'));
        String[] arrayTwo={"Alwaz","Rohat","Aliza","Sameera","Fatima"};
        System.out.println("String Found at index ="+BinaryStringSearch(arrayTwo,"Sameera"));
        
    }
    
}
