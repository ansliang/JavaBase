package sort;

public class ChooseSort {
    public static void sort(int []numbers){
        for(int i=0;i<numbers.length-1;i++){
            int minIndex=i;
            for(int j=minIndex;j<numbers.length;j++){
                if(numbers[minIndex]>numbers[j]) {
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp=numbers[minIndex];
                numbers[minIndex]=numbers[i];
                numbers[i]=temp;
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
