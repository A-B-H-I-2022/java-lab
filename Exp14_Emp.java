import java.util.Scanner;
public class Exp14_Emp
{
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    int age,phno,salary;
    String name,address,specialization,department;
    System.out.println("\nEnter  name,address,specialization,age,phno,salary for officer:");
    name=sc.nextLine();
    address=sc.nextLine();
    specialization=sc.nextLine();
    age=sc.nextInt();
    phno=sc.nextInt();
    salary=sc.nextInt();
    Officer of=new Officer(name,address,specialization,age,phno,salary);
    System.out.println("Name:"+of.name);
    System.out.println("Address:"+of.address);
    System.out.println("Specialization:"+of.specialization);
    System.out.println("Age:"+of.age);
    System.out.println("Phone no:"+of.phno);
    of.printsalary();
    sc.nextLine();

    System.out.println("\nEnter  name,address,department,age,phno,salary for manager:");
    name=sc.nextLine();
    address=sc.nextLine();
    department=sc.nextLine();
    age=sc.nextInt();
    phno=sc.nextInt();
    salary=sc.nextInt();
    Manager mn=new Manager(name,address,department,age,phno,salary);
    System.out.println("Name:"+mn.name);
    System.out.println("Address:"+mn.address);
    System.out.println("Department:"+mn.department);
    System.out.println("Age:"+mn.age);
    System.out.println("Phone no:"+mn.phno);
    mn.printsalary();
    sc.nextLine();
    sc.close();
   }
    
}
class Employee
{
    String name,address;
    int age,phno,salary;
    void printsalary()
    {
        System.out.println("Salary is:"+salary);
    }
}

class Officer extends Employee
{
    String specialization;
    Officer(String n,String ad,String sp,int a,int p,int s)
    {
        name=n;
        address=ad;
        age=a;
        phno=p;
        salary=s;
        specialization=sp;
    }
}
class Manager extends Employee
{
    String department;
    Manager(String n,String ad,String d,int a,int p,int s)
    {
        name=n;
        address=ad;
        age=a;
        phno=p;
        salary=s;
        department=d;
    }
}