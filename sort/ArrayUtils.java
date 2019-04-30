package sort;
public class ArrayUtils {
    public static void swap(int arr[],int i,int j){
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }
    public static void printArray(int []array){
        System.out.print("{ ");
        for(int i=0;i< array.length;i++){
            System.out.print(array[i]);
            if (i<array.length-1){
                System.out.print(",");
            }
        }
        System.out.println(" }");
    }
}
