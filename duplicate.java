public class duplicate {
    public static void main(String arg[]){
        int[] arr = {1,2,3,4,5,5,6,8,8};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]== arr[j]){
                    System.out.println(arr[j]);
                }
            }

        }

    }
    
}
