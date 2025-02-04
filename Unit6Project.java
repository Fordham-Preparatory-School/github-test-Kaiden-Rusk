import java.util.Arrays;
import java.util.Scanner;
public class Unit6Project 
{
    //Creates an array with ten spots each with null
    static int[] array = new int[10];

    //Method to check if a value is in an array
    public static int searchArray(int value, int[] array)
    {
        int index = 0;
        for(int num:array)
        {  
            if(num == value)
            {
                return index;
            }
            index ++;  
        }
        return -1;
    }
    //Method to get the sum of the integers in an array
    public static int sumOfArray(int[]array)
    {
        int sum = 0;
        for(int num: array)
        {
            sum += num;
        }
        return sum;
    }

    //Method to get the average of the integers in an array
    public static double averageOfArray(int[]array)
    {
        double sum = 0.0;
        for(int num: array)
        {
            sum += num;
        }
        return sum/array.length;
    }

    //Returns the Maximum Value of the array
    public static int maximumVal(int[] array)
    {
        int max = Integer.MIN_VALUE;
        for(int large : array)
        {
            if(large > max)
            {
                max = large;
            }
        }
        return max;
    }
    
    //Returns the Minimum Value of the array
    public static int minimumVal(int[] array)
    {
        int min = Integer.MAX_VALUE;
        for(int small : array)
        {
            if (small < min)
            {
                min = small;
            }
        }
        return min;
    }

    public static void main(String[]args)
    {   
        Scanner scanner = new Scanner(System.in);
        int x = 0;

        //This loop asigns a random number between 1 and 100 to each of the ten spots in the array
        for(int num : array)
        {
            
            int i = (int)(Math.random()*100)+1;
            array[x]=i;
            x++;
        }

        //Before sorting the array is
        System.out.print("The values in the array before sorting are: ");
        for(int num: array)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        //Sorting the array so that it goes up in numerical order then printing the new order
        Arrays.sort(array);
        System.out.print("The values in the array after sorting are: ");
        for(int num: array)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        //Using the user-input to find if your inputed value is in the array
        System.out.println("Please enter in a value to search for in the array ");
        int enteredValue = scanner.nextInt();
        int valueFoundAt = searchArray(enteredValue, array);
        if(valueFoundAt != -1)
        {
            System.out.println("Your value was found at an index of: "+ valueFoundAt);
        }
        else
        {
            System.out.println("Your value was not found in the array.");
        }

        //This code is used to swap a specified index with an integer of your chosing
        System.out.println("Now enter an index that you want to change between 0 and 9");
        
        int index = scanner.nextInt();
        while(index > 9 || index < 0)
        {
            {
                System.out.println("Please enter an acceptable value between 0 and 9");
                index = scanner.nextInt();
            }
        }
        System.out.println("Now enter the integer you would like to change that index to");
        int newValue = scanner.nextInt();
        array[index] = newValue;

        //Displaying the new values inside of the array
        System.out.println("After changing your chose index, the values of the array are: ");
        for(int num: array)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        //Display the sum, average, maximum, and minimum values of the array
        System.out.println("The sum of the integers in the array is: "+ sumOfArray(array)+". The average of the integers in the array is: " + averageOfArray(array) + ". The largest integer in the array is: "+maximumVal(array)+". The smallest number in the array is: "+minimumVal(array));

        //Changing the indicies of two numbers specified by the user
        System.out.println("Now enter two different indicies (0-9) in the array that you would like to switch.");
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        while (index1 > 9 || index1 < 0)
        {
            System.out.println("Please enter an acceptable first value between 0 and 9");
            index1 = scanner.nextInt();
        }
        while (index2 > 9 || index2 < 0)
        {
            System.out.println("Please enter an acceptable second value between 0 and 9");
            index2 = scanner.nextInt();
        }
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        System.out.println("The final array has values of: ");
        for(int num: array)
        {
            System.out.print(num+" ");
        }
        
    }
}
