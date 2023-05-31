import java.lang.*;
import java.util.*;

interface A
{
    void add();
}
interface B
{
    void sub();

}
interface C 
{
    void mul();
}
class D implements A,B,C 
{

    public
    void add()
    { 
        int a,b,sum;
        Scanner s=new Scanner(System.in);
        System.out.println("enter two integer number");
        a=s.nextInt();
        b=s.nextInt();
        sum=a+b;
        System.out.println("sum="+sum);
    }
    
    void sub()
    { 
        int c,d,sub;
        Scanner s=new Scanner(System.in);
        System.out.println("enter two integer number");
        c=s.nextInt();
        d=s.nextInt();
        sub=c-d;
        System.out.println("sub="+sub);
    }
    
    void mul()
    { 
        int e,f,mul;
        Scanner s=new Scanner(System.in);
        System.out.println("enter two integer number");
        e=s.nextInt();
        f=s.nextInt();
        mul=e*f;
        System.out.println("mul="+mul);
    }
}
class Mult
{
    public static void main(String args[])
    {
        D h=new D();
        h.add();
        h.sub();
        h.mul();
    }
}
