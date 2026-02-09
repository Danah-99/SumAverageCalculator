import java.util.Scanner;
public class SumAverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int num1,num2,num3, sum;
double avrage;
System.out.println("Enter 3 numbers");
       num1=input.nextInt();
       num2=input.nextInt();
       num3=input.nextInt();
      sum= sum(num1,num2,num3);
      avrage =avrage(num1,num2,num3);
      display(sum,avrage);
    }
  public static int sum(int num1, int num2, int num3){
            return num1 + num2 + num3;
        }
  public static double avrage (int num1, int num2,int num3){
      return sum (num1,num2,num3)/3;
        }
        public static void display (int sum, double avrage){
        System.out.println ("The sum of 3 numbers is " + sum);
        System.out.println ("The average of 3 numbers is " + avrage);
    }}