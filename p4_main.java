import java.io.*;


public class Main
{
    public static void main(String[] args) throws IOException
    {

        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.println("De cate elemente doriti sa fie sirul: ");
        int n=input.nextInt();
        IntSet is=new IntSet(n);
        System.out.println("Introduceti elementele in vector (0-terminati):");
        int elem;
        elem=input.nextInt();
        while(elem!=0 && !(is.isFull()))
        {
            is.Add(elem);
            elem=input.nextInt();
        }

        System.out.println("Sirul dvs: "+is.toString());

        System.out.println("Ce element cautati? (0-terminati): ");
        elem=input.nextInt();
        if(is.Contains(elem))
        {
            System.out.println("Elementul exista in sirul dvs");
        }
        else
        {
            System.out.println("Elementul NU exista in sirul dvs");
        }
    }
}