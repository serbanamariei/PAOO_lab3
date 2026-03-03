import java.io.*;


public class Main
{
    public static void main(String[] args) throws IOException
    {
        Matrix m1=new Matrix(3,3);
        Matrix m2=new Matrix(3,3);
        System.out.println("Introducem date m1:");
        m1.citire();
        System.out.println("Introducem date m2:");
        m2.citire();

        System.out.println("Matrice m1:\n"+m1.toString());
        System.out.println("Matrice m2:\n"+m2.toString());

        Matrix m3=m1.add(m2);
        System.out.println("Matrice m3(suma dintre m1 si m2):\n"+m3.toString());

        Matrix m4=m1.mul(m2);
        System.out.println("Matrice m4(produs dintre m1 si m2):\n"+m4.toString());
    }
}