package ArraY_Reverse;

/* 
STEP 1: START
STEP 2: INITIALIZE arr[] = {1, 2, 3, 4, 5}
STEP 3: PRINT "Original Array:"
STEP 4: REPEAT STEP 5 for(i=0; i<arr.length ; i++)
STEP 5: PRINT arr[i]
STEP 6: PRINT "Array in reverse order"
STEP 7: REPEAT STEP 8 for(i= arr.length-1; i>=0; i--)
STEP 8: PRINT a[i]
STEP 9: END 

*/

public class reverse {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {49,50,51,53,55};  
        
        System.out.println("Original array: ");  
        
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println(); 
        
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
    //Answer
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  
