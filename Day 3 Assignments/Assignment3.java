import java.util.Scanner;

class cab
{
    int fare;
    int d;
    public cab()
    {
        fare=50;
    }
    public cab (int amt)
    {
        fare=amt;
    }
}

public class Assignment3 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int cd;
        System.out.println("Enter distance of tha cab from the user: ");
        cd = in.nextInt();
        if (cd>5)
        {
            cab ob = new cab(50+10*cd);
            System.out.println("Enter the Distance travelled: ");
            ob.d=in.nextInt();
            ob.fare += 10*ob.d;
            System.out.println("Total Fare is "+ob.fare);
        }
        else
        {
            cab ob = new cab ();
            System.out.println("Enter the Distance travelled: ");
            ob.d=in.nextInt();
            ob.fare += 10*ob.d;
            System.out.println("Total Fare is "+ob.fare);
        }
    }
}
