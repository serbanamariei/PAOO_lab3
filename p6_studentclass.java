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
        if(n<N-1)
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

    public void Sort() throws CloneNotSupportedException
    {
        for(int i=0;i<n-1;++i)
        {
            for(int j=i+1;j<n;++j)
            {
                if(v[i].compareTo(v[j])==-1)
                {
                    Student aux=new Student(v[i]);
                    v[i]=v[j].clone();
                    v[j]=aux.clone();
                }
            }
        }
    }

    public int Getn()
    {
        return n;
    }
}
