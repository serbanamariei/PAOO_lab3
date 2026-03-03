import java.io.*;


public class Main
{
    public static void main(String[] args) throws IOException
    {
        Complex c1=new Complex(1,2);
        Complex c2=new Complex(2,3);
        int p=2;

        System.out.println("Suma: "+(c1.add(c2)).toString());
        System.out.println("Inmultire: "+(c1.mul(c2)).toString());
        System.out.println("Ridicare la putere("+p+"): "+(c1.pow(p)).toString());
        if(c1.Equals(c2))
        {
            System.out.println("Sunt egale c1 cu c2? --> DAAAA");
        }
        else
        {
            System.out.println("Sunt egale c1 cu c2? --> NUUUU");
        }
    }
}