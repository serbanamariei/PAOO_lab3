public class Student implements Comparable<Student>
{
    protected String name;
    protected int age;
    protected int grade;

    public Student()
    {
        name="";
        age=0;
        grade=0;
    }

    public Student(String Name, int Age, int Grade)
    {
        name=Name;
        age=Age;
        grade=Grade;
    }

    public Student(Student s)
    {
        this.name=s.name;
        this.age=s.age;
        this.grade=s.grade;
    }

    public String GetName()
    {
        return name;
    }

    public int GetAge()
    {
        return age;
    }

    public int GetGrade()
    {
        return grade;
    }

    @Override
    public String toString()
    {
        String s="";
        s+="Name: "+name+" Age: "+age+" Grade: "+grade;
        return s;
    }

    @Override
    public Student clone() throws CloneNotSupportedException
    {
        try {
            return (Student) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            return new Student(this);
        }
    }

    @Override
    public int compareTo(Student o)
    {
        if(this.grade>o.grade)
        {
            return 1;
        }
        else if(this.grade==o.grade)
        {
            return 0;
        }
        return -1;
    }

}
