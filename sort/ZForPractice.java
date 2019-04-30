package sort;


public class ZForPractice {

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
    public static void sort(int []numbers,int low,int high){
        if (low<high){
            int pivot=partition(numbers,low,high);
            sort(numbers,low,pivot-1);
            sort(numbers,pivot+1,high);
        }
    }

    public static void main(String[] args) {
        int []test={1,3,2,5,4};
        sort(test,0,test.length-1);
        for(int num : test){
            System.out.print(num+" ");
        }
    }
}
