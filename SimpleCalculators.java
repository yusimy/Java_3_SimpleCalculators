import java.util.Scanner;

public class SimpleCalculators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        int num1temp = 0;
        int num2temp = 0;
        while (true){
            System.out.print("Enter operator + or - or * or / or % : ");
            char operator = in.next().trim().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                System.out.print("Enter number 1: ");
                int num1 = in.nextInt();
                num1temp = num1;
                System.out.print("Enter number 2: ");
                int num2 = in.nextInt();
                num2temp = num2;

                if (operator == '+'){
                    ans = num1 + num2;
                }
                if (operator == '-'){
                    ans = num1 - num2;
                }
                if (operator == '*'){
                    ans = num1 * num2;
                }
                if (operator == '/'){
                    if (num2 != 0){
                        ans = num1 + num2;
                    }
                }
                if (operator == '%'){
                    ans = num1 + num2;
                }
                System.out.println("The operation of "+ operator +" between "+num1temp+" and "+ num2temp+" is "+ans);

            }
            else if (operator == 'x' || operator == 'X'){
                break;
            }
            else{
                System.out.println("Invalid operator ! Please enter the correct operator !");
            }

        }


    }
}