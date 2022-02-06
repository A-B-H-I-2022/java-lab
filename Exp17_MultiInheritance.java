import java.util.Scanner;
class Exp17_MultiInheritance
{
    public static void main(String[] args)
    {
        Result r =new Result();
        r.getno();
        r.getmarks();
        System.out.println("\n");
        r.putno();
        System.out.println("Marks Obtained.");
        r.putmarks();
        r.putwt();
        r.display();
    }
}

interface Sport
{
    final int sportwt=6;
    abstract void putwt();
}

class Students
{
    Scanner sc=new Scanner(System.in);
    int rollno;
    void getno()
    {
        System.out.println("Enter the rollno:");
        rollno=sc.nextInt();
    }
    void putno()
    {
     System.out.println("Rollno:"+rollno);
    } 
}

class Test extends Students
{
    float part1,part2;
    void getmarks()
    {
        System.out.println("Enter the two marks:");
        part1=sc.nextFloat();
        part2=sc.nextFloat();
    }
    void putmarks()
    {
        System.out.println("Marks 1:"+part1+"\nMarks 2:"+part2);
    }
}

class Result extends Test implements Sport
{
    public void putwt()
    {
        System.out.println("Sports weightage:"+sportwt);
    }
    void display()
    {
        System.out.println("total:"+(sportwt+part1+part2));
    }
}