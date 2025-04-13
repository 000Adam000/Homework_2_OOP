
package using_constructor;


public class FullTimeEmployee extends Employee {
    
    private double YearlySalary;
    private double Tax;

    public FullTimeEmployee(String Name, int Age, double MonthlySalary, int NumberOfKids) {
        super(Name, Age);
        this.YearlySalary=MonthlySalary * 12;
        this.Tax=FindTax(MonthlySalary, NumberOfKids);
    }
    
    public double FindTax(double monthlySalary, int numberOfKids) {
        return 0.25 * ((monthlySalary * 11) - (numberOfKids * 450));
    }
    
    
public double getYearlySalary(){
return YearlySalary;
}

public double getTax(){
return Tax;
}

public void output(){
    System.out.println("Full Time Employee information: ");
                    System.out.println("name\t age\t Department\t Salary\t Tax");
                    System.out.println("****\t ****\t *********\t ****\t ****");
                            System.out.println("");
                    System.out.println(getName()+"\t "+getAge()+"\t "+super.Departmnet+"\t $"+getYearlySalary()+"\t $"+getTax());
}
    
}
