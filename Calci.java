package complexpack;
public class Calci{
    private double num1;
    private double num2;

    private double[] com1;
    private double[] com2;

    //parameterised constructor
    public Calci(double a,double b)
    {
        this.num1 = a;
        this.num2 = b;
    }

    public Calci(double[] a,double[] b)
    {
        this.com1 = a;
        this.com2 = b;
    }

    public double norm_add()
    {
        return (num1+num2);
    }

    public double norm_sub()
    {
        return (num1-num2);
    }

    public double norm_mul()
    {
        return (num1*num2);
    }

    public double norm_div()
    {
        return (num1/num2);
    }

    public double[] comp_add()
    {
        double c[] = {com1[0]+com2[0],com1[1]+com2[1]};
        return c;
    }

    public double[] comp_sub()
    {
        double c[] = {com1[0]-com2[0],com1[1]-com2[1]};
        return c;
    }

    public double[] comp_mul()
    {
        double c[] = {com1[0]*com2[0] - com1[1]*com2[1],com1[0]*com2[1]+com1[1]*com2[0]};
        return c;
    }

    public double[] comp_div()
    {
        double c[] = {(com1[0]*com2[0]+com1[1]*com2[1])/(com2[0]*com2[0]+com2[1]*com2[1]),
            (com1[1]*com2[0]-com1[0]*com2[1])/(com2[0]*com2[0]+com2[1]*com2[1])};
        return c;
    }
}
