package sort;

public class QuickSort {
    private static int partition(int []array,int low,int high){
        int pivot=array[low];
        while (low<high){
            while (low<high&&array[high]>=pivot)--high;
            array[low]=array[high];
            while (low<high&&array[low]<=pivot)++low;
            array[high]=array[low];
        }
        array[low]=pivot;
        return low;
    }
    public static void sort(int []array,int low,int high){
        if(low<high){
            int pivot=partition(array,low,high);
            sort(array,low,pivot-1);
            sort(array,pivot+1,high);
        }
    }
    public static void main(String []args){
        int []array={1,3,2,4,5};
        sort(array,0,array.length-1);
        sort.ArrayUtils.printArray(array);
    }
}
