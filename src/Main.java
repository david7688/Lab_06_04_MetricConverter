import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double mesMeters = 0;
        double mesMiles = 0;
        double mesFeet = 0;
        double mesInches = 0;
        String trash = "";

        System.out.print("Enter your measurement in meters: ");

        if(in.hasNextDouble())
        {
            mesMeters = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number!");
        }

        mesMiles = mesMeters / 1609;

        System.out.println("The measurement in miles is " + mesMiles);

        mesFeet = mesMeters * 3.281;

        System.out.println("The measurement in feet is " + mesFeet);

        mesInches = mesMeters * 39.37;

        System.out.println("The measurement in inches is " + mesInches);
    }
}