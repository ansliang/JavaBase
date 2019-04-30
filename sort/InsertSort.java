package sort;

public class InsertSort {



    public static void sort(int []numbers){
        for(int i=1;i<numbers.length;i++){
            for(int j=i;j>0;j--){
                if(numbers[j]<numbers[j-1]){
                    sort.ArrayUtils.swap(numbers,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    public static void main(String []args){
        int []numbers={1,3,4,2,5};
        sort(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
