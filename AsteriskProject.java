import java.util.Scanner;
public class AsteriskProject {
    public void createTriangle (int numberOfLines)
    {
        for(int i =1; i<=numberOfLines;i++)
        {
            for(int k = 0; k<i; k++)
            {
                if(k==0 || k == i-1|| i==numberOfLines)
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
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of lines that you want for your triangle: ");
        int numberOfLines = scanner.nextInt();

        AsteriskProject project= new AsteriskProject();
        project.createTriangle(numberOfLines);
    }
}
