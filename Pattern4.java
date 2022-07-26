package Assignment1;

public class Pattern4 {
  
    public static void main(String[] args)
    {
        int num=14;
        for (int i=0;i<num;i++)
        {
            for (int j=0;j<num;j++)
            {
                if (i-j>=(num-1)/2 || i+j>=(num-1)+(num-1)/2)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" "); 
                }
            }
            System.out.println("");
        }
    }
}