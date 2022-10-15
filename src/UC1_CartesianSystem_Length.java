import java.sql.SQLOutput;
import java.util.Scanner;

public class UC1_CartesianSystem_Length
{
    public static void main(String[] args)
    {
        double x1,y1,x2,y2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value Of x1:");
        x1=sc.nextDouble();

        System.out.println("Enter The Value Of y1:");
        y1=sc.nextDouble();

        System.out.println("Enter The Value Of x2:");
        x2=sc.nextDouble();

        System.out.println("Enter The Value Of y2:");
        y2=sc.nextDouble();

        double length = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        System.out.println("Length Of Line Is :" + length);

    }
}
