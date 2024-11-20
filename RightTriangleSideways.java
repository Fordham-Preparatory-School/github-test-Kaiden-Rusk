import java.util.Scanner;

public class RightTriangleSideways {
    public static void Triangle(int numberOfLines)
    {
        for(int i = numberOfLines; i>0;i--)
        {
            for(int k = 0; k<numberOfLines-i; k++)
            {
                System.out.print(" ");
            }
                
            for(int j = 1; j<=i;j++)
            {  
                if(j==1||j==i||i==numberOfLines)
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
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of lines that you want for your triangle: ");
        int numberOfLines = scanner.nextInt();
        RightTriangleSideways project = new RightTriangleSideways();
        project.Triangle(numberOfLines);
   
    }
}