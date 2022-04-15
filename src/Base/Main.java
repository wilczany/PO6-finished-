package Base;

import Base.Geometry.*;

public class Main {

    public static void main(String[] args) {
	Punkt pkt = new Punkt(10,5);
    Punkt pkt1 = new Punkt(4,2);
    Linia lin=new Linia(pkt,pkt1);
    System.out.println(lin);
    lin.przesun(1,1);
    System.out.println(lin);
    }
}
