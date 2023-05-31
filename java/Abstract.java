import java.lang.*;
import java.util.*;
abstract class A 
{
    public
    void area();
    void circumference();
    
        
    

}
class B extends A
{
    public
    void area()
    {
        float r,a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        r=s.nextFloat();
        a=3.14f*r*r;
        System.out.println("area of circle="+a);

    }
}
class C extends A
{
    void circumference()
    {
        float r,cir;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius of circle");
        r=s.nextFloat();
        cir=2*3.14f*r;
        System.out.println("Circumference of circle="+cir);
        
    }
}
class Abstract 
{
    public static void main(String args[])
    {
        B s=new B();
        s.area();
        C h=new C();
        h.circumference();
    }
}