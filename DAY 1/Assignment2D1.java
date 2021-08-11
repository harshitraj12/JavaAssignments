import java.util.Scanner;

class Student 
{
    int rollno;
    String name;
    float marks;

    void input() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollno = in.nextInt();
        System.out.print("Enter Name: ");
        name = in.next();
        System.out.print("Enter Marks: ");
        marks = in.nextFloat();
    }

    void display() 
    {
        System.out.println(rollno + " " + name + " " + marks);
    }
}

class Assignment2D1 
{
    public static void main(String args[]) 
    {
        Student s1 = new Student();
        s1.input();
        s1.display();
    }
}
