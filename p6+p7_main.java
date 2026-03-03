import java.io.*;
import java.nio.BufferOverflowException;

public class Main
{
    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader bfr=new BufferedReader(isr);

        System.out.println("Introduceti nr de studenti: ");
        int n=Integer.parseInt(bfr.readLine());
        StudentClass sc=new StudentClass(n);

        System.out.println("Introduceti studenti (nota 0-terminati): ");
        System.out.println("Nume: ");
        String nume=bfr.readLine();
        System.out.println("Varsta: ");
        int varsta=Integer.parseInt(bfr.readLine());
        System.out.println("Nota: ");
        int nota=Integer.parseInt(bfr.readLine());

        while(nota!=0 && sc.Getn()<n)
        {
            Student st=new Student(nume,varsta,nota);
            sc.Add(st);
            System.out.println("Nume: ");
            nume=bfr.readLine();
            System.out.println("Varsta: ");
            varsta=Integer.parseInt(bfr.readLine());
            System.out.println("Nota: ");
            nota=Integer.parseInt(bfr.readLine());
        }

        System.out.println("\n"+"Clasa studenti:");
        sc.Print();

        sc.Sort();
        System.out.println("\n"+"Clasa studenti sortati: ");
        sc.Print();

        System.out.println("Nr studenti: "+sc.Getn());
    }
}