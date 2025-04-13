                                                                                                                                                                   //INHERITANCE SUPER KEY WORD
package using_constructor;

import java.util.Scanner;


public class mainEmployee {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        
        int validNumber = 0;
        
        while (true) {
            System.out.println();
            System.out.println("1. FullTime\n2. PartTime\n0. close");
            System.out.println("Employee Type: ");
            String ch = input.nextLine();
            
            try {
                int number = Integer.parseInt(ch);
                if (number == 1 || number == 2 || number == 0) {
                    validNumber = number;
                    

                    switch(number){
                        case 1:
                            System.out.println("Enter your Name: ");
                            String name = input.nextLine();
                            System.out.println("Enter your Age: ");
                            int age = input.nextInt();
                            System.out.println("Monthly Salary: ");
                            int monthlySalary = input.nextInt();
                            System.out.println("Number Of Kids: ");
                            int NumberOfKids = input.nextInt();
                            FullTimeEmployee FT = new FullTimeEmployee(name, age, monthlySalary, NumberOfKids);
                            FT.output();
                     break;
                    
                        case 2:
                            System.out.println("Enter your Name: ");
                            String name1 = input.nextLine();
                            System.out.println("Enter your Age: ");
                            int age1 = input.nextInt();
                            System.out.println("working Hours: ");
                            int workingHours = input.nextInt();
                            System.out.println("Over Time Hours(10% bonus for each 2 hours work): ");
                            int OverTime = input.nextInt();
                            PartTimeEmployee PT = new PartTimeEmployee(name1, age1, workingHours, OverTime);               
                            PT.output();
                    break;
                    
                        case 0:

                    System.exit(0);

                    
                    }
                    
                } else {
                    System.out.println("Error: " + number + " is not 1 or 2. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + ch + "' is not a valid number. Please try again.");
            }
        }
        
    }
    
}
