import java.util.Scanner;
class Person
{
    private int age;
    public String FIO;
    public String phone;
    Person(int age, String FIO, String phone)
    {
        this.age = age;
        this.FIO = FIO;
        this.phone = phone;
    }
    public int getAge()
    {
        return this.age;
    }
}
class Student extends Person
{
    public int kurs;
    public String facultet;
    private int date;
    Student(int age, String FIO, String phone, int kurs, String facultet, int date)
    {
        super(age, FIO, phone);
        this.kurs = kurs;
        this.facultet = facultet;
        this.date = date;
    }
    public int getDate()
    {
        return this.date;
    }
}
public class Main
{
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[3];
        students[0] = new Student(17, "Александр Сергеевич Пушкин", "896485586089", 1, "Музыкальный",2024);
        students[1] = new Student(16, "Сергей Александрович Есенин", "89875634567", 3, "Музыкальный", 2022);
        students[2] = new Student(18, "Дмитрий Евгеньевич Маяковский", "89878567834", 1, "Музыкальный", 2024);
        System.out.println(RED + "Список всех студентов: " + RESET);
        for(Student student:students)
        {
            System.out.println(student.FIO + " " + student.getAge());
        }
        System.out.println(RED + "Введите факультет: " + RESET);
        String f = in.next();
        System.out.printf("На %s факультете состоят: \n", f);
        for(Student student:students)
        {
            if (f.equals(student.facultet))
            {
                System.out.println(student.FIO);
            }
        }
        System.out.println(RED + "Введите год: " + RESET);
        int year = Integer.parseInt(in.next());
        System.out.printf(RED + "Студенты, поступившие после %d года: \n" + RESET, year);
        for(Student student:students)
        {
            if (student.getDate() > year)
            {
                System.out.println(student.FIO + " " + "-" + " " + student.getDate());
            }
        }
    }
}