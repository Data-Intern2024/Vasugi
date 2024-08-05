/* reverse number
public class reverse {
    public static void main(String arg[]){
    int num = 123;
    int r;
    while(num > 0){
        r = num % 10;
        num = num / 10;
        System.out.print(r);
    }
    }   
*/
/*reverse string */
public class reverse{
    public static void main(String arg[]){
        String name ="vasugi";
        for(int i= name.length()-1;i>=0;i--){
            System.out.println(name.charAt(i));    
         }
    }
}

