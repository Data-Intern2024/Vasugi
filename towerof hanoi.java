import java.io.*;
import java.math.*;
import java.util.*;
class tower{
    static void Hanoi(int n, char source,char target, char aux ){
        if(n == 0){
            return;
        }
        Hanoi(n-1, source,target,aux);
        System.out.println("Move disk"  +  n  +  "from rod" +  source  + "to rod"
+  target );
        Hanoi(n-1, aux,source,target);
       }
       public static void main(String args[])
       {
        int N = 3;
        Hanoi(N, 'A','C','B');
       }
}