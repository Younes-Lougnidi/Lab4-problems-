package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan0 = new Scanner(System.in);
        System.out.print("\nEnter the number of salespeople: " );
        final int SALESPEOPLE;
        SALESPEOPLE = scan0.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);
        int max;
        int idx_max;
        int min;
        int idx_min;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        max = sales[0];
        idx_max = 0;
        min = sales[0];
        idx_min = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if(sales[i] > max){
                max = sales[i];
                idx_max = i;
            }
            if(sales[i] < min ){
                min = sales[i];
                idx_min = i;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        double avg = (double) sum / sales.length;
        System.out.println("\nAverage sale: " + avg);
        System.out.println("\nSalesperson " + (idx_max+1) + " had the highest sale with $"+ max);
        System.out.println("\nSalesperson " + (idx_min+1) + " had the lowest sale with $"+min);

        int min_value;
        Scanner scan2 = new Scanner(System.in);
        System.out.print("\nEnter the minimum value: ");
        min_value = scan2.nextInt();
        System.out.println("\nSalespeople that exceeded the amount $" + min_value);
        int num_exceed = 0;
        for(int i = 0 ; i < sales.length ; i++){
            if(sales[i] > min_value){
                num_exceed ++ ;
                System.out.println("Salesperson " + (i+1) + " with amount $" + sales[i] +" have exceeded the value.");
            }
        }
        if(num_exceed == 0){
            System.out.println("No salesperson has exceeded the amount");
        }
        else{
            System.out.println("The total number of salespeople whose sales exceeded the value entered is : "+ num_exceed  );
        }


    }
}