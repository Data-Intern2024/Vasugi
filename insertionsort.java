public class insertionsort {
    public static void insertionSort(int arr[]){
        int n = arr.length;
        for (int j =1; j<n;j++){
            int key = arr[j];
            int i = j-1;
            while((i>-1)&&(arr[i] > key)){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1]=key;
        }
    }
    public static void main(String args[]){
        int[] arr = {2,4,6,9,7,3};
        System.out.println("before insertion");
        for(int i:arr){
            System.out.println(i+"");
        }
        System.out.println();
        insertionSort(arr);
        System.out.println("After insertion Sort");
        for(int i:arr){
            System.out.println(i+" ");
        
        }

    }
    
}
