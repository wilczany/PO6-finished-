package Base;
import Base.Geometry.Czworokat;
import Base.Geometry.Trojkat;

import java.util.ArrayList;

public class Obraz {
    private ArrayList<Trojkat> tri= new ArrayList<>();
    private ArrayList<Czworokat> quad= new ArrayList<>();
    /*public Obraz(){

    }*/

    public void dodajTrojkat(Trojkat t){
    tri.add(new Trojkat(t));
    }

    public void dodajCzworokat(Czworokat q){
    quad.add(new Czworokat(q));
    }

    public void przesun(int dx,int dy){
        for(Trojkat t : tri){
            t.przesun(dx,dy);
        }
        for(Czworokat q : quad){
            q.przesun(dx,dy);
        }
    }

    public String toString() {
        return "Obraz:" +'\n' +
                "Trojkaty:" + tri +'\n'+
                "Czworokaty:" + quad;
    }
}
