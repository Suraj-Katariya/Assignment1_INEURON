package Assignment1;
public class Pattern {
  
    public static void main(String[] args)
    {
    int num=10;
    for (int i=0;i<num;i++)
    {
        for (int j=0;j<num;j++){
            if(i==0 || i==num-1 || j==num/2)
            {
                System.out.print("*");
            } 
            else
            {
                System.out.print(" ");   
            }
    }
        System.out.print(" ");
        for (int j=0;j<num;j++)
        {
            if(j==0 || j==num-1 || i==j)
            {
                System.out.print("*");
            } 
            else
            {
                System.out.print(" ");   
            }
        }
        System.out.print(" ");
        for (int j=0;j<num;j++)
        {
            if(j==0 || i==0 || i==num/2 || i==num-1)
            {
                System.out.print("*");
            } 
            else
            {
                System.out.print(" ");   
            }
        }
        System.out.print(" ");
        for (int j=0;j<num;j++)
        {
            if(j==0 || i==num-1 || j==num-1)
            {
                System.out.print("*");
            } 
            else
            {
                System.out.print(" ");   
            }
        }
        System.out.print(" ");
        for (int j=0;j<num;j++)
        {
            if(j==0 || i==0 || i==num/2 || (j==num-1 && i<num/2) || (i==j && i>num/2) )
            {
                System.out.print("*");
            } 
            else
            {
                System.out.print(" ");   
            }
        }
        System.out.print(" ");
        for (int j=0;j<num;j++)
        {
            if(i==0 || j==0 || i==num-1 || j==num-1)
            {
                System.out.print("*");
            } 
            else
            {
                System.out.print(" ");   
            }
        }
        System.out.print(" ");
        for (int j=0;j<num;j++)
        {
            if(j==0 || j==num-1 || i==j)
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