package sort;

public class MergeSort {
    private static void merge(int []array,int low,int mid,int high){
        int []temp=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        for(;i<=mid&&j<=high;k++){
            if(array[i]<array[j])temp[k]=array[i++];
            else temp[k]=array[j++];
        }
        while (i<=mid)temp[k++]=array[i++];
        while (j<=high)temp[k++]=array[j++];
        for(int t=0;t<temp.length;t++)array[low+t]=temp[t];
    }
    public static void sort(int []array,int low,int high){
        int mid=(low+high)/2;
        if(low<high){
            sort(array,low,mid);
            sort(array,mid+1,high);
            merge(array,low,mid,high);
        }
    }
    public static void main(String []args){
        int []array={1,3,2,5,4};
        sort(array,0,array.length-1);
        sort.ArrayUtils.printArray(array);
    }
}
