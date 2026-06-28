class Student{
    String name;
    int age, mark;

    void setDetails(String stu_name, int stu_age, int stu_mark){
        name = stu_name;
        age = stu_age;
        mark = stu_mark;
    }

    void displayDetails(){
        System.out.println("Name of the student is: " + name);
        System.out.println("Age of the student is: " + age);
        System.out.println("Mark of the student is: " + mark);
    }
}

public class oops{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setDetails("Madhan", 20, 98);
        s1.displayDetails();

        s2.setDetails("Sameer", 21, 96);
        s2.displayDetails();

    }
}

