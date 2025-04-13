
package using_constructor;


import java.util.Scanner;


public class Employee {
Scanner input = new Scanner(System.in);
private String Name;
private int Age;
private int ID;
final String Departmnet = "IT";

private static int count = 0;


public Employee(String Name, int Age){
    count ++;
    this.ID = count;
    this.Name = Name;
    this.Age = Age;
    
}


public String getName(){
return Name;
}

public int getAge(){
return Age;
}


}
