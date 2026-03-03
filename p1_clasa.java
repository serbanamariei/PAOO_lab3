public class Complex {
    private double re,im;

    public Complex()
    {

    }

    public Complex(double RE, double IM)
    {
        re=RE;
        im=IM;
    }

    public Complex add(Complex c2)
    {
        return new Complex(this.re+c2.re, this.im+c2.im);
    }

    public Complex mul(Complex c2)
    {
        Complex c3=new Complex();
        double a=this.re;
        double b=this.im;
        double c=c2.re;
        double d=c2.im;
        c3.re=a*c-b*d;
        c3.im=a*d+b*c;
        return c3;
    }

    public Complex pow(int p)
    {
        Complex rez=new Complex(this.re,this.im);
        for(int i=0;i<p;++i)
        {
            rez.mul(rez);
        }
        return rez;
    }

    public Boolean Equals(Complex b)
    {
        return (this.re==b.re && this.im==b.im);
    }

    @Override
    public String toString()
    {
        return this.re+" + "+"i("+this.im+")";
    }

}
