import java.util.*;
abstract class plan
{
    int rate;
    abstract void getrate();
    abstract void cal_bill(float units);
}
class comm_plan extends plan
{
    Scanner sc=new Scanner(System.in);
    void getrate()
    {
        System.out.println("Enter rate of each commercial unit");
        rate=sc.nextInt();
    }
    void cal_bill(float units)
    {
        float bill=rate*units;
        System.out.println("Commercial Bill="+bill);
    }
}
class dom_plan extends plan
{
    Scanner sc=new Scanner(System.in);
    void getrate()
    {
        System.out.println("Enter rate of each domestic unit");
        rate=sc.nextInt();
    }
    void cal_bill(float units)
    {
        float bill=rate*units;
        System.out.println("Domestic Bill="+bill);
    }
}
class abstract_billing
{
    public static void main(String args[])
    {
        plan comm=new comm_plan();
        plan dom=new dom_plan();
        comm.getrate();
        comm.cal_bill(10);
        dom.getrate();
        dom.cal_bill(10);
        
    }
}