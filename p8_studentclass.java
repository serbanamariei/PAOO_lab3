import java.util.Arrays;

public class StudentClass extends Student
{
    private Student[] v;
    private int n;
    private final int N=10;

    public StudentClass()
    {
        v=new Student[N];
        n=0;
    }

    public StudentClass(int nr)
    {
        n=0;
        v=new Student[nr];
    }

    public void Add(Student s)
    {
        if(n<v.length)
        {
            v[n]=new Student(s);
            n++;
        }
        else
        {
            System.out.println("CLASA ESTE FULL");
            return;
        }
    }

    public void Print()
    {
        System.out.println("Date studenti admisi:");
        for(int i=0;i<n;++i)
        {
            System.out.println("Date student "+(i+1)+": "+v[i].toString());
        }
    }

    public void Sort() {
        if (n > 1)
        {
            Arrays.sort(v, 0, n);
        }
    }

    public int Getn()
    {
        return n;
    }
}
