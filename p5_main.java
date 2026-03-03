import java.io.*;


public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.println("Introduceti nr de noduri: ");
        int nr=input.nextInt();
        Graph g=new Graph(nr);
        System.out.println("Introduceti arcele de forma (v,w) (0,0)-terminati: ");
        int v,w;
        v=input.nextInt();
        w=input.nextInt();
        while((v!=0)&&(w!=0))
        {
            g.AddArc(v,w);
            v=input.nextInt();
            w=input.nextInt();
        }

        System.out.println("Matricea de adiacenta: ");
        g.Print();

        int inceput;
        System.out.println("Introduceti nodul de inceput pentru parcurgerea DFS: ");
        inceput=input.nextInt();

        boolean[] vazut=new boolean[nr];
        System.out.println("Parcurgere DFS:");
        g.Dfs(inceput-1,vazut);
    }
}