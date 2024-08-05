public class palindrome {
    public static void main(String arg[]){
        String name = "MADAM";
        String a = "";
        for(int i = name.length()-1;i>=0;i--)
        {
           System.out.println("the reverse value  "+ name.charAt(i));
           a = a + name.charAt(i);
        }
           if(name.equals(a))
           {
            System.out.println("it is palindrome"); 
           }
           else
           {
            System.out.println("it is not a palindrome");
           }

            

    }
    
}
