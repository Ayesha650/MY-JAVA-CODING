                          // weekly project on Encapsulation  // data hiding    
                          // by using setters and getters methods  

                          // EMPLOYEE INFORMATION WHO IS WORKING IN A BANK    

class Employee{

    private int emp_id;   // data hide 
    private String name;
    private int salary;
    private String Address;
    private String Deptartment;

    public void setDepartment(String Deptartment){
        this.Deptartment = Deptartment;
    }
    public String getDepartment(){
        return Deptartment;
    }

    public void setAddress(String Address){
       this.Address = Address;
    }
    public String getAddress(){
        return Address;
    }

    public void setEmp_Id(int emp_id){
        this.emp_id = emp_id;
    }
    public int getEmp_Id(){
        return emp_id;
    }

public void setName(String name)
{
    this.name = name;
}
public String getName()
{
    return name;
}
public void setSalary(int salary)
{
   this.salary = salary;
}
public int getSalary()
{
    return salary;
}
}
class Bank{

    private int Account;

    public void setAmount(int Account)
    {
        this.Account = Account;
    }
        int getInterest()
        {
        return Account;
       }
    }
    public class Test2{
        public static void main(String[] args){

            Bank b = new Bank();
            b.setAmount(30000);
            System.out.println("The interest is: " +b.getInterest());
        


            Employee e = new Employee();
             e.setName("Ayesha");
             e.setSalary(100000000);
             e.setEmp_Id(101);
             e.setAddress("Alraheem villas");
             e.setDepartment("Computer Science");
            System.out.println("The name of the Employee is : " + e.getName());
            System.out.println("The salary is: " +e.getSalary());
            System.out.println(" Employee id is: " +e.getEmp_Id());
            System.out.println("The Address of the employee is : " + e.getAddress());
            System.out.println("The Department of the employee is : " + e.getDepartment());


        }
    }
