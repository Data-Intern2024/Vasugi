public class recursiveselection {
     static int min(int a[],int i, int j){
        if(i == j){
            return i;
        }
        int k = min(a, i+1,j);
        return (a[i] < a[k])? i: k;
     }

     static void  selection(int a [],int n, int index){
        if(index == n)
        return;
        int  k = min(a,index, n-1);
        if (k != index){
            int temp =a[k];
            a[k] = a[index];
            a[index] =temp;
        }
        selection(a,n, index + 1);
     }    
     public static void main(String args[])
     {
        int arr[] = { 3, 2, 5,6, 1, 8};
        selection(arr, arr.length,0);
        for(int i =0;i<arr.length;i++){
            System.out .print(arr[i]+ " ");
        }
     }
    
}
