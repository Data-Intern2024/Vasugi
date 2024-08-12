import java.io.*;
public class sumarray {

static boolean swap(int a[],int size,int x){
for(int i=0;i<(size-1);i++){
        for(int j=(i+1);j<size;j++){
            if(a[i] +a[j] == x){
                return true;

            }
        }
    }
    return false;
}
public static  void main(String []args){
    int[] a ={0,-1,2,-3,2};
    int x = -2;
    int size =a.length;

    if(swap(a,size,x)){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }


}
}
