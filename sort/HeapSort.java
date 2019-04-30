package sort;

public class HeapSort {

    private static void maxHeap(int []array,int heapSize,int index){
        int left=index*2+1;
        int right=index*2+2;
        int largest=index;
        if(left<heapSize&&array[left]>array[largest]){
            largest=left;
        }
        if(right<heapSize&&array[right]>array[largest]){
            largest=right;
        }
        if(index!=largest){
            sort.ArrayUtils.swap(array,index,largest);
            maxHeap(array,heapSize,largest);
        }
    }

    private static void buildMaxHeap(int []array){
        if(array==null||array.length<=1){
            return;
        }
        int half=array.length/2;
        for(int i=half;i>=0;i--){
            maxHeap(array,array.length,i);
        }
    }

    public static void sort(int []array){
        if (array==null||array.length<=1)return;
        buildMaxHeap(array);
        for(int i=array.length-1;i>=1;i--){
            sort.ArrayUtils.swap(array,0,i);
            maxHeap(array,i,0);
        }
    }

    public static void main(String []arrgs){
        int []array={1,3,2,5,4};
        sort(array);
        sort.ArrayUtils.printArray(array);
    }
}
