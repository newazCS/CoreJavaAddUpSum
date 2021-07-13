package Java;

public class JavaCollections {
    public static void main(String[] args) {
/*
    Given an array of numbers and a number k,
    determine if there are three entries in the array
    which add up to the specified  number k.
* */
        int [] arr= {20,303, 3,4,25};
        int k = 49;
        int value = num(arr,k);
        System.out.println(value);
    }
    public static int num(int[] intArray, int y){
        for(int i=0; i<intArray.length;i++){
            for(int j =i+1; i<intArray.length;i++){
                if(intArray[i] + intArray[j]==y){
                    return i+j;
                }
            }
        }
        return y;
    }
}
