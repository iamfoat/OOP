public class l2_w1 {
    public static void main(String[] args){
        complex a = new complex(1.0,2.0);
        complex b = new complex(3.0, 4.0);
        complex c = new complex(a);
        c.add(b);
        c.print();
        
        c.setR(1);
        c.setI(2);
        c.sub(b);
        c.print();

        c.setR(1);
        c.setI(2);
        c.mul(b);
        c.print();

        c.setR(1);
        c.setI(2);
        c.div(b);
        c.print();
    }
}

class complex{
    private double r,i;
    complex(double r, double i){
        this.r = r;
        this.i = i;
    }
    complex(complex c){
        this(c.r,c.i);
    }
    public void setR(double r){
        this.r = r;
    }
    public void setI(double i){
        this.i = i;
    }
    public void add(complex c){
        r += c.r;
        i += c.i;
    }
    public void sub(complex c){
        r -= c.r;
        i -= c.i;
    }
    public void mul(complex c){
        double r = this.r*c.r-this.i*c.i;
        double i = this.r*c.i+this.i*c.r;
        this.r = r;
        this.i = i;
    }
    public void div(complex c){
        double r = (this.r*c.r-this.i*c.i)/(Math.pow(c.r, 2)+Math.pow(c.i, 2));
        double i = (this.r*c.i-this.i*c.r)/(Math.pow(c.r, 2)+Math.pow(c.i, 2));
    }
    public void print(){
        System.out.println(r+"+ i"+i);
    }
}

