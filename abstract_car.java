import java.util.*;
abstract class car
{
    int rno;
    car(int rno)
    {
        this.rno=rno;
        System.out.println("Registration No.="+rno);
    }
    void opentank()
    {
        System.out.println("Fill the tank");
    }
    abstract void steering(String direction,int angle);
    abstract void breaking(int force);
}
class car1 extends car
{
    car1(int rno)
    {
         super(rno);
    }
    void steering(String direction,int angle)
    {
        System.out.println("hydraulic breaks");
        System.out.println("Steering dir.="+direction);
        System.out.println("Steering angle="+angle);
    }
    void breaking(int force)
    {
        System.out.println("gas breaks");
        System.out.println("Breaking force="+force);
    }
}
class car2 extends car
{
    car2(int rno)
    {
         super(rno);
    }
    void steering(String direction,int angle)
    {
        System.out.println("hydraulic breaks");
        System.out.println("Steering dir.="+direction);
        System.out.println("Steering angle="+angle);
    }
    void breaking(int force)
    {
        System.out.println("gas breaks");
        System.out.println("Breaking force="+force);
    }
}
class abstract_car
{
    public static void main(String args[])
    {
        car c1=new car1(156);
        c1.opentank();
        c1.steering("North",58);
        c1.breaking(35);
        System.out.println();
        car c2=new car2(256);
        c2.opentank();
        c2.steering("West",56);
        c2.breaking(38);
    }
}