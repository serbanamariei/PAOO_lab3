public class IntSet
{
    private int[] v;
    int dim;

    public IntSet()
    {
        v=new int[100];
        dim=0;
    }

    public IntSet(int n)
    {
        v=new int[n];
        dim=0;
    }

    public boolean Contains(int e)
    {
        for (int i:v)
        {
            if (i==e) return true;
        }
        return false;
    }

    public boolean isFull()
    {
        return v.length==dim;
    }

    public void Add(int e)
    {
        if(Contains(e)) return;
        if(dim<v.length)
        {
            v[dim]=e;
            dim++;

        }
        else
        {
            System.out.println("NU MAI E LOC");
            return;
        }
    }

    public String toString()
    {
        String s="";
        for(int i=0;i<dim;++i)
        {
            s+=v[i]+" ";
        }
        return s;
    }
}
