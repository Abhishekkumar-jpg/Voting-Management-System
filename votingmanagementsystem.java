import java.util.*;
import java.util.Random;

class Dcoder
{
    public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();     
        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;
        int candidate4 = 0;
        int candidate5 = 0;
        int candidate6 = 0;
        
        System.out.println("Please Enter your Age :");
        int age = sc.nextInt();
        
        if (age >= 18)
        {
            System.out.println();
            System.out.println("Yes, you are eligible for vote.");
            System.out.println();
            System.out.println("===================================================================================");
            System.out.println();
            System.out.println("-----------------------------Enter password to start voting------------------------");
            System.out.println();
            System.out.println("===================================================================================");
            System.out.println();
            int generated_password = rand.nextInt(1000000);
            System.out.println("Your password is: " + generated_password);
            System.out.println();
            System.out.println("Please enter your password:");
            int password = sc.nextInt(); 
            System.out.println();
            System.out.println("Your password is Correct now start voting.");
            System.out.println();
            if (password == generated_password)
            { 
              for(int i=1;i<=10;i++){
                System.out.println();
                System.out.println("----------------------------------------------------------------");
                System.out.println();
                System.out.println("Select the Candidate Party name:-");
                System.out.println();
                System.out.println("(1) Bhartiya Janta Party");
                System.out.println("(2) Aam Aadmi Party");
                System.out.println("(3) Congress Party");
                System.out.println("(4) Bahujan Samaj Party");
                System.out.println("(5) Communist Party of India");
                System.out.println("(6) All India Trinamool Congress Party");
                System.out.println();
                System.out.println("Choose your Candidate option:");
                
                int b = sc.nextInt();             
                 switch (b) {
                    case 1:
                        System.out.println("Thank you for voting for Bhartiya Janta Party.");
                        candidate1++;
                        break;
                    case 2:
                        System.out.println("Thank you for voting for Aam Aadmi Party.");
                        candidate2++;
                        break;
                    case 3:
                        System.out.println("Thank you for voting for Congress Party.");
                        candidate3++;
                        break;
                    case 4:
                        System.out.println("Thank you for voting for Bahujan Samaj Party.");
                        candidate4++;
                        break;
                    case 5:
                        System.out.println("Thank you for voting for Communist Party of India.");
                        candidate5++;
                        break;
                    case 6:
                        System.out.println("Thank you for voting for All India Trinamool Congress Party.");
                        candidate6++;
                        break;
                    default:
                        System.out.println("Invalid option.");
                        break;
                }
         }
                System.out.println();
                System.out.println("=========================================================================");
                System.out.println();
                System.out.println("----------------------------Check Candidate votes------------------------");
                System.out.println();
                System.out.println("=========================================================================");
                System.out.println();
                System.out.println("(1) Bhartiya Janta Party");
                System.out.println("(2) Aam Aadmi Party");
                System.out.println("(3) Congress Party");
                System.out.println("(4) Bahujan Samaj Party");
                System.out.println("(5) Communist Party of India");
                System.out.println("(6) All India Trinamool Congress Party");
                System.out.println();
                System.out.println("Choose the party name to see the votes :");
                
                int c = sc.nextInt();
                switch (c) {
                    case 1:
                        System.out.println("Bhartiya Janta Party = " + candidate1 + " votes.");
                        break;
                    case 2:
                        System.out.println("Aam Aadmi Party = " + candidate2 + " votes.");
                        break;
                    case 3:
                        System.out.println("Congress Party = " + candidate3 + " votes.");
                        break;
                    case 4:
                        System.out.println("Bahujan Samaj Party = " + candidate4 + " votes.");
                        break;
                    case 5:
                        System.out.println("Communist Party of India = " + candidate5 + " votes.");
                        break;
                    case 6:
                        System.out.println("All India Trinamool Congress Party = " + candidate6 + " votes.");
                        break;
                    default:
                        System.out.println("Invalid option.");
                        break;
                }
            }
            else 
            {   
                System.out.println();
                System.out.println("Incorrect password. Please try again.");
            }
        }
        else
        {
            System.out.println();
            System.out.println("You are not eligible to vote.");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Try again next time.");
        }
    }
}

