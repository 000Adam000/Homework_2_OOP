
package using_constructor;


public class PartTimeEmployee extends Employee {
    
    
    private double WithOverTime;
    private double ExtraSalary;

    public PartTimeEmployee(String Name, int Age, double workingHours, int OverTime) {
        super(Name, Age);
        this.WithOverTime=OverTime;
        setExtraSalary();
    }
    

public double getWithOverTime(){
return WithOverTime;
}

public double getExtraSalary(){
return ExtraSalary;
}

public void setExtraSalary() {
        int bonusUnits = (int)(WithOverTime / 2);
        ExtraSalary = bonusUnits * 10;
    }

    
    public void output(){
        System.out.println("Part Time Employee information: ");
                    System.out.println("name\t age\t Department\t Extra Salary");
                    System.out.println("****\t ****\t *********\t **********");
                    System.out.println("");
                    System.out.println(getName()+"\t "+getAge()+"\t "+super.Departmnet+"\t "+getExtraSalary()+"% bonus");
        
    }
}
