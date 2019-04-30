package sort;

public class BubbleSort {
    public static void sort(int []numbers){
        for(int i=0;i<numbers.length-1;i++){
            for(int j=numbers.length-1;j>i;j--){
                if(numbers[j-1]>numbers[j]){
                    int temp=numbers[j-1];
                    numbers[j-1]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
    }
    public static void main(String []args){
        int []numbers={1,3,2,5,4};
        sort(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}

