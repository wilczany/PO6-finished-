package Base.Geometry;

public class Czworokat {
    Linia lines[]=new Linia[4];
    public Czworokat(){
        this(new Punkt(0,0),new Punkt(0,1),new Punkt(1,1),new Punkt(1,0));
    }
    //ten konstruktor nie zapewnia spojnosci
    public Czworokat(Linia l1, Linia l2, Linia l3, Linia l4){
        lines[0]=new Linia(l1);
        lines[1]=new Linia(l2);
        lines[2]=new Linia(l3);
        lines[3]=new Linia(l4);
    }
    public Czworokat(Punkt p1, Punkt p2, Punkt p3, Punkt p4){
        lines[0]=new Linia(new Punkt(p1),new Punkt(p2));
        lines[1]=new Linia(new Punkt(p2),new Punkt(p3));
        lines[2]=new Linia(new Punkt(p3),new Punkt(p4));
        lines[3]=new Linia(new Punkt(p4),new Punkt(p1));
    }
    public Czworokat(Czworokat rec){
        this(rec.lines[0],rec.lines[1],rec.lines[2],rec.lines[3]);
    }
    public void przesun(int dx,int dy){
        lines[0].przesun(dx,dy);
        lines[1].przesun(dx,dy);
        lines[2].przesun(dx,dy);
        lines[3].przesun(dx,dy);
    }
    public String toString(){
        return "  |"+lines[0]+","+lines[1]+","+lines[2]+","+lines[3]+"|  ";

    }
}
