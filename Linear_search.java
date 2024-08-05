/*Linear search */
import java.util.Scanner;
class Linearsearch{
    public static int search(int arr[], int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of value");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the values:");

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int x =sc.nextInt();
        
        int result = search(arr,x);
        if(result != -1){
            System.out.println("Value " + x + " found at " + result);
        }
        else{
            System.out.println("Value " + x + " not found  at index");

        }
        }

    }





