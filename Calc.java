import java.util.Scanner;

public class Calc 
{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws InterruptedException 
    {
        int option;
        char operator;
        double num2, result;

        System.out.println("\nWelcome to Calc fx360");
        Thread.sleep(1000);

        do 
        {
            result = 0;
            System.out.println("\nPlease choose an option:");
            System.out.println("[1] Perform Calculation");
            System.out.println("[2] Exit\n");
            System.out.print("Option: ");
            option = sc.nextInt();

            switch (option) 
            {
                case 1:
                {
                    System.out.print("\nPlease enter your number: ");
                    num2 = sc.nextDouble();
                    result = result + num2;
                    System.out.printf("%.2f\n", result);

                    do
                    {
                        System.out.println("\n(+): Addition");
                        System.out.println("(-): Subtraction");
                        System.out.println("(*): Multiplication");
                        System.out.println("(/): Division");
                        System.out.println("(=): Result");
                        System.out.println("(R): Return");
                        System.out.print("Enter an operator: ");
                        operator = sc.next().charAt(0);

                        switch (operator)
                        {
                            case '+':
                            {
                                System.out.print("\nEnter another number: ");
                                num2 = sc.nextDouble();
                                result = result + num2;
                                System.out.printf("Result = %.2f\n", result);
                                Thread.sleep(1000);
                                break;
                            }

                            case '-':
                            {
                                System.out.print("\nEnter another number: ");
                                num2 = sc.nextDouble();
                                result = result - num2;
                                System.out.printf("Result = %.2f\n", result);
                                Thread.sleep(1000);
                                break;
                            }

                            case '*':
                            {
                                System.out.print("\nEnter another number: ");
                                num2 = sc.nextDouble();
                                result = result * num2;
                                System.out.printf("Result = %.2f\n", result);
                                Thread.sleep(1000);
                                break;
                            }

                            case '/':
                            {
                                System.out.print("\nEnter another number: ");
                                num2 = sc.nextDouble();
                                result = result / num2;

                                if (num2 != 0)
                                {
                                    System.out.printf("Result = %.2f\n", result);
                                    Thread.sleep(1000);
                                    break;
                                }
                                else
                                {
                                    System.out.println("\nSyntax Error");
                                    Thread.sleep(1000);
                                    break;
                                }
                            }

                            case '=':
                            {
                                System.out.printf("\nTotal Result = %.2f\n",result);
                                Thread.sleep(1000);
                                break;
                            }

                            case 'R':
                            {
                                System.out.println("\nReturning home");
                                Thread.sleep(1000);
                                break;
                            }

                            default:
                            {
                                System.out.println("\nIncorrect Operator");
                                break;
                            }
                        } 
                    }
                    while (operator != '=' && operator != 'R' && num2 != 0);

                    if (operator == '=' || operator == 'R' || num2 == 0)
                    {
                        break;
                    }
                }

                case 2:
                {
                    System.out.println("\nThank you for using Calc fx360!");
                    Thread.sleep(1000);

                    System.out.println("Program will now exit");
                    System.exit(0);
                }

                default:
                {
                    System.out.println("\nIncorrect Option");
                    Thread.sleep(1000);
                }
            }
        }
        while (option != 2);
    }

}
