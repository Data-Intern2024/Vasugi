class java
{
    static boolean triangular(int num)
    {
        if(num<0)
          return false;
          int sum = 0;
          for(int n= 1;sum<=num;n++)
          {
            sum=sum+n;
            if(sum == num)
               return true;
          }
        return false;
    }
    public static void main (String[] args){
        int n = 55;
        if (triangular(n))
         System.out.println("The number " +"is a tringular number");
        else

          System.out.println("The number" + "is NOT a triangular number");
    }
}