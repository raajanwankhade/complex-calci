package complexpack;
public class CompPrint {
    private double real;
    private double imag;

    public CompPrint(double[] arr)
    {
        this.real = arr[0];
        this.imag = arr[1];
    }

    public void prin() 
    {
        if(real==0)
        {
            System.out.println(imag+"j");
        }
        else
        {
            if(imag>0)
            {
                System.out.println(real+"+"+imag+"j");
            }
            else if (imag<0)
            {
                System.out.println(real+""+imag+"j");
            }
            else
            {
                System.out.println(real);
            }
        }
    }
}
