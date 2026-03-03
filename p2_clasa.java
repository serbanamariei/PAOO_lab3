import java.util.ArrayList;

public class Stiva
{
    int[] v;
    private int stackP;

    public Stiva()
    {
        v=new int[100];
        stackP=-1;
    }

    public Stiva(int nr)
    {
        v=new int[nr];
        stackP=-1;
    }

    public void Push(int a)
    {
        if(stackP<v.length-1)
            v[++stackP]=a;
        else
            System.out.println("NU SE POATE STIVA E PLINA!");
    }

    boolean isEmpty()
    {
        return stackP==-1;
    }

    public int Pop()
    {
        if(!(this.isEmpty()))
        {
            return v[stackP--];
        }
        return 0;
    }

}
