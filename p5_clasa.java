public class Graph
{
    private boolean[][] mat;
    private int nr;

    public Graph(int NR)
    {
        nr=NR;
        mat=new boolean[nr][nr];
    }

    public int Size()
    {
        return nr;
    }

    public void AddArc(int v, int w)
    {
        if(v<1 || v>nr || w<1 || w>nr)
        {
            System.out.println("Arce inafara limitelor nodurilor");
            return;
        }

        v--;
        w--;

        if(mat[v][w])
        {
            System.out.println("A FOST DEJA ADAUGAT!!!");
            return;
        }


        mat[v][w]=true;
    }

    public boolean IsArc(int v, int w)
    {
        v--;
        w--;
        return mat[v][w];
    }

    public void Print()
    {
        for(int i=0;i<nr;++i)
        {
            String s="";
            for(int j=0;j<nr;++j)
            {
                if(mat[i][j])
                {
                    s+=1+" ";
                }
                else
                {
                    s+=0+" ";
                }
            }
            System.out.println(s);
        }
    }

    public void Dfs(int v, boolean[] vazut)
    {
        vazut[v]=true;
        System.out.println((v+1)+" ");
        for(int k=0;k<nr;++k)
        {
            if(mat[v][k] && !vazut[k])
            {
                Dfs(k,vazut);
            }
        }
    }
}