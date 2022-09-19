/******************************************************************************
Eric Zhang
Comp sci 3
9/24/2020
Radius Program
*******************************************************************************/
import java.io.*;
public class Main
{
        public static void main(String[] args) throws IOException
        {
            DataInputStream reader = new DataInputStream(System.in);
                String YourFirst;
                String YourLast;
                double YourRad;
                String TheirFirst;
                String TheirLast;
                double TheirRad;
                String UserInput;
                final double pi = 3.14;
                String YF;
                String YL;
                String TF;
                String TL;
                String Done = "yes";
                boolean Last = true;
                while (Done.equals ("yes"))
                {
                    System.out.print("Enter your first name: ");
                    YourFirst = reader.readLine();
                    System.out.print("\n\nEnter your last name: ");
                    YourLast = reader.readLine();
                    System.out.print("\n\nEnter the radius of your circle: ");
                    UserInput = reader.readLine();
                    YourRad = Double.parseDouble(UserInput);
                    System.out.print("\n\nEnter your friend's first name: ");
                    TheirFirst = reader.readLine();
                    System.out.print("\n\nEnter your friend's last name: ");
                    TheirLast = reader.readLine();
                    System.out.print("\n\nEnter the radius of your friend's circle: ");
                    UserInput = reader.readLine();
                    TheirRad = Double.parseDouble(UserInput);
                    UserInput = YourFirst.substring(0,1);
                    YourFirst= YourFirst.toLowerCase ();
                    UserInput = UserInput.toUpperCase ();
                    YourFirst = YourFirst.substring(1);
                    YourFirst=(UserInput + YourFirst);
                    //comment
                    UserInput = YourLast.substring(0,1);
                    YourLast= YourLast.toLowerCase ();
                    UserInput = UserInput.toUpperCase ();
                    YourLast = YourLast.substring(1);
                    YourLast=(UserInput + YourLast);
                    //comment
                    UserInput = TheirFirst.substring(0,1);
                    TheirFirst= TheirFirst.toLowerCase ();
                    UserInput = UserInput.toUpperCase ();
                    TheirFirst = TheirFirst.substring(1);
                    TheirFirst=(UserInput + TheirFirst);
                    //comment
                    UserInput = TheirLast.substring(0,1);
                    TheirLast= TheirLast.toLowerCase ();
                    UserInput = UserInput.toUpperCase ();
                    TheirLast = TheirLast.substring(1);
                    TheirLast=(UserInput + TheirLast);
                    //comment
                    YourRad = (YourRad * YourRad);
                    YourRad = (YourRad *pi);
                    TheirRad = (TheirRad * TheirRad);
                    TheirRad = (TheirRad * pi);
                    //start of outputs
                    System.out.print("\n\n" + YourFirst + " " +YourLast + "’s circle has an area of " + YourRad + “.”);
                    System.out.print("\n\n\n"  + TheirFirst + " " +TheirLast + "’s circle has an area of " + TheirRad + “.”);
                    YF = YourFirst.substring(0,1); 
                    YL = YourLast.substring(0,1); 
                    TF = TheirFirst.substring(0,1); 
                    TL = TheirLast.substring(0,1); 
                    if(YourRad > TheirRad)
                    {
                        System.out.print("\n\n"+YF +"."+YL +".'s circle has a larger area." );
                    }
                    else if (YourRad == TheirRad)
                    {
                        System.out.print("\n\n"+YF +"."+YL +".'s circle has the same area as " + TF +"." +TL +".");
                    }
                    else
                    {
                        System.out.print("\n\n"+TF +"."+TL +".'s circle has a larger area." );
                    }
                    Last = YourLast.equals(TheirLast);
                    if(Last == true)
                    {
                        System.out.print("\n\n"+YF +"."+YL +".'s last name is the same as " + TF +"." +TL +"'s .");
                    }
                    else
                    {
                        System.out.print("\n\n"+YF +"."+YL +". and " + TF +"." +TL +". do not have the same last name.");
                    }
                    
                    System.out.print("\n\nWould you like to do this again? (Yes / No): ");
                    
                    Done = reader.readLine();
                    Done = Done.toLowerCase();
            }
        }
}