public class Task1 {
    public static void linearCharSearch(char[] array1,char e){ //linear search method of characters
        for(int i=0; i<array1.length; i++){
            
            if(array1[i]==e){//checks if any of the characters matches with the given character
                System.out.println("Character "+array1[i]+" is found at index "+i);//print the character with its index
            }
        }
    }
    public static void linearStringSearch(String[] array2,String x){ //linear search method of string
        for(int i=0; i<array2.length; i++){

            if(array2[i]==x){//checks if any of the names matches with the given name
                System.out.println("Name "+array2[i]+" is found at index "+i);//print the name with its index
            }
        }
    }

    
    public static void main(String[] args) {
        char[] arrayOne={'a','b','c','d','e','f'};
        linearCharSearch(arrayOne,'e');
        String[] arrayTwo={"Sameera","Aliza","Alwaz","Fatima","Rohat","Muntaha","Unsa"};
        linearStringSearch(arrayTwo,"Rohat");
      
      
    }
    
}
