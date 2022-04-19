package Base;

import Base.Geometry.*;

import java.time.temporal.Temporal;

public class Main {

    public static void main(String[] args) {
	Obraz o=new Obraz();
    Trojkat t=new Trojkat();
    Trojkat t2=new Trojkat();
    t2.przesun(7,13);
    Czworokat q=new Czworokat();
    Czworokat q2=new Czworokat();
    q2.przesun(4,-3);
    o.dodajTrojkat(t);
    o.dodajTrojkat(t2);
    o.dodajCzworokat(q);
    o.dodajCzworokat(q2);
    System.out.println(o);
    o.przesun(2,4);
    System.out.println(o);
    }
}
