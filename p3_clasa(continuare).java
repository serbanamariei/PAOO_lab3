import java.io.*;

public class Matrix
{
    private double[][] mat;
    private int n, m;

    public Matrix()
    {
        n=3;
        m=3;
        mat=new double[3][3];
    }

    public Matrix(int N, int M)
    {
        n=N;
        m=M;
        mat=new double[n][m];
    }

    public void citire()
    {
        java.util.Scanner input=new java.util.Scanner(System.in);
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j)
            {
                mat[i][j]=0;
            }
        }
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<m;++j)
            {
                System.out.println("mat["+i+"]["+j+"] = ");
                mat[i][j]=Double.parseDouble(input.next());
            }
        }
    }

    public Matrix add(Matrix m2)
    {
        if(this.n==m2.n && this.m==m2.m)
        {
            Matrix mat3=new Matrix(m2.n,m2.m);
            for(int i=0;i<this.n;++i)
            {
                for(int j=0;j<m2.m;++j)
                {
                    mat3.mat[i][j]=this.mat[i][j]+m2.mat[i][j];
                }
            }
            return mat3;
        }
        else
        {
            System.out.println("NU CORESPUND DIMENSIUNILE LA MATRICI!!!");
            return new Matrix(3,3);
        }
    }

    public Matrix mul(Matrix m2)
    {
        Matrix mat3 = new Matrix(this.n, m2.m);
        for (int i=0;i<this.n;++i)
        {
            for (int j=0;j<m2.m;++j)
            {
                mat3.mat[i][j]=0;
                for (int k=0;k<this.m;++k)
                {
                    mat3.mat[i][j]+=this.mat[i][k]*m2.mat[k][j];
                }
            }
        }

        return mat3;
    }

    public String toString()
    {
        String s="";
        for(int i=0;i<this.n;++i)
        {
            for(int j=0;j<this.m;++j)
            {
                s+=this.mat[i][j]+" ";
            }
            s+="\n";
        }
        return s;
    }
}
