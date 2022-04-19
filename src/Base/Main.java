package Base;

import Base.Geometry.*;

public class Main {

    public static void main(String[] args) {
	Obraz o=new Obraz();
    Trojkat t=new Trojkat();
    Czworokat q=new Czworokat();
    o.dodajTrojkat(t);
    o.dodajTrojkat(t);
    o.dodajCzworokat(q);
    System.out.println(o);
    o.przesun(2,4);
    System.out.println(o);
    }
}
