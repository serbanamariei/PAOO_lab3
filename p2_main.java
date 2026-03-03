import java.io.*;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Cat de mare sa fie stiva: ");
        n=Integer.parseInt(input.next());
        Stiva s=new Stiva(n);
        int elem;

        System.out.println("Introduceti elemente (0-terminati): ");
        elem=Integer.parseInt(input.next());
        while(elem!=0)
        {
            s.Push(elem);
            elem=Integer.parseInt(input.next());
        }
        int ultim=s.Pop();
        System.out.println("Ultimul element din stiva este: "+ultim);
        System.out.println("Restul elementelor ramase: ");
        while(!(s.isEmpty()))
        {
            System.out.println(" "+s.Pop());
        }
    }
}