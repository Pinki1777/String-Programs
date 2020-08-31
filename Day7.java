import java.util.*;
class Day7  {
   
     /****************** 1. ***************** */

    static int StringLength(char[] str,int i)    {
            if(i==str.length)    {
                return 0;  
            }
                return 1 + StringLength(str,i+1);
    }	
	
     /****************** 2. ***************** */

    static long print_factorial(int x)  {
        if(x>=1)
           return x * print_factorial(x-1);     
       else
           return 1;
   }

   static void printfact(int n)    {
       long factorial=print_factorial(n);
       System.out.println(factorial);
   }

    /****************** 3. ***************** */

   static int fibonacci(int n,int m,int p)    {
    if(n!=0)    {
        System.out.println(m);
        return fibonacci(n-1,p,m+p);
    }
    else
        return 0;
}

     /****************** 4. ***************** */

    static int print_table(int x,int y)  {
        if(y<=10)   {
            System.out.printf(" \n%d * %d = %d ",x,y,(x*y));
            return print_table(x,y+1);     
        }
        else
            return 1;
    }
     /****************** Main method ***************** */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int a=sc.nextInt();
       // printfact(a);
       // fibonacci(a,0,1);
       // print_table(a,1);
          String s=sc.nextLine();
          char[] a=s.toCharArray();
          System.out.println(StringLength(a,0));
    }
}