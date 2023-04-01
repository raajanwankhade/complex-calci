package complexpack;
import java.util.Scanner;

public class Mainops 
{
    public static void main(String[] args) 
    {
        int repmain = 1;
        while(repmain==1)
        {
            //printing menu
            MenuNorCom men = new MenuNorCom();
            men.meu();

            //taking choice
            int cho;
            Scanner scn = new Scanner(System.in);
            System.out.println("choice: ");
            cho = scn.nextInt();

            //menuasmd object
            MenuASMD masmd = new MenuASMD();
            
            int rept = 1;
            while(rept != 0)
            {
                //going two ways
                switch(cho)
                {
                    case 1:
                    {
                        int rep = 1;
                        while(rep != 0)
                        {
                            double num1,num2;
                            System.out.println("Enter operands:");
                            num1 = scn.nextDouble();
                            num2 = scn.nextDouble();
                            masmd.meme();
                            System.out.println("choice: ");
                            int br = scn.nextInt();

                            switch(br)
                            {
                                case 1:
                                {
                                    
                                    Calci nad = new Calci(num1, num2);
                                    System.out.println(nad.norm_add());
                                    rep = 0;
                                    break;
                                }
                                case 2:
                                {
                                    Calci nsu = new Calci(num1, num2);
                                    System.out.println(nsu.norm_sub());
                                    rep = 0;
                                    break;
                                }
                                case 3:
                                {
                                    Calci nmu = new Calci(num1, num2);
                                    System.out.println(nmu.norm_mul());
                                    rep = 0;
                                    break;
                                }
                                case 4:
                                {
                                    Calci ndi = new Calci(num1, num2);
                                    System.out.println(ndi.norm_div());
                                    rep = 0;
                                    break;
                                }
                                default:
                                {
                                    System.out.println("Enter a valid operator!");
                                    rep = 1;
                                }
                            }       
                        }
                        rept = 0;
                        break;
                    }
                    case 2:
                    {
                        double[] com1 = {0,0},com2 = {0,0};
                        System.out.println("Enter real(A) and imaginary(B) parts (A+iB) of first complex no.: ");
                        com1[0]=scn.nextDouble();
                        com1[1]=scn.nextDouble();
                        System.out.println("Enter real(A) and imaginary(B) parts (A+iB) of second complex no.: ");
                        com2[0]=scn.nextDouble();
                        com2[1]=scn.nextDouble();

                        int rep = 1;
                        while(rep != 0)
                        {   
                            //taking asmd choice
                            masmd.meme();
                            System.out.println("choice: ");
                            int br = scn.nextInt();
                            switch(br)
                            {
                                case 1:
                                {
                                    Calci cad = new Calci(com1,com2);
                                    CompPrint cp = new CompPrint(cad.comp_add());
                                    cp.prin();
                                    rep = 0;
                                    break;
                                }
                                case 2:
                                {
                                    Calci csu = new Calci(com1,com2);
                                    CompPrint cp = new CompPrint(csu.comp_sub());
                                    cp.prin();
                                    rep = 0;
                                    break;
                                }
                                case 3:
                                {
                                    Calci cmu = new Calci(com1,com2);
                                    CompPrint cp = new CompPrint(cmu.comp_mul());
                                    cp.prin();
                                    rep = 0;
                                    break;
                                }
                                case 4:
                                {
                                    Calci cdi = new Calci(com1,com2);
                                    CompPrint cp = new CompPrint(cdi.comp_div());
                                    cp.prin();
                                    rep = 0;
                                    break;
                                }
                                default:
                                {
                                    System.out.println("Enter a valid operator!");
                                    rep = 1;
                                }
                            }
                        }
                        rept = 0;
                        break;
                    }
                    default:
                    {
                        System.out.println("Enter a valid option!");
                        rept = 1;
                        break;
                    }
                }
            }
            System.out.println("Want to calculate again? (1 for Y/0 for N): ");
            repmain = scn.nextInt();
        }    
    }
}
