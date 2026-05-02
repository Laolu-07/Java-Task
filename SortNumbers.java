import java.util.Arrays;

public class SortNumbers{

    public static int[] sorting(int[] array){
        for(int count = 0; count < array.length; count++){
                int smallest = array[count];
            for(int counter = count + 1; counter < array.length; counter++){
                if (array[counter] < smallest){
                    smallest = array[counter];
                    int check = array[count];
                    array[counter] = check;
                    array[count] = smallest;
                
                }

            
            }
        
        
        }
    
    return array;
    }
    
    
    public static void main(String... args){
    int[] numbers = {4,6,-100,34546,5,2,9};
        System.out.println(Arrays.toString(sorting(numbers)));
    
    }
    
 }
    
