package Base.Geometry;

public class Trojkat {
    private final Linia lines[]=new Linia[3];
    public Trojkat(){
        this(new Punkt(0,0),new Punkt(0,1),new Punkt(1,0));
    }
    //ten konstruktor nie zapewnia spojnosci
    public Trojkat(Linia l1,Linia l2,Linia l3){
        lines[0]=new Linia(l1);
        lines[1]=new Linia(l2);
        lines[2]=new Linia(l3);
    }
    public Trojkat(Punkt p1,Punkt p2,Punkt p3){
        lines[0]=new Linia(new Punkt(p1),new Punkt (p2));
        lines[1]=new Linia(new Punkt(p2),new Punkt (p3));
        lines[2]=new Linia(new Punkt(p3),new Punkt (p1));
    }
    public Trojkat(Trojkat tri){
        this(tri.lines[0],tri.lines[1],tri.lines[2]);
    }
    public void przesun(int dx,int dy){
        lines[0].przesun(dx,dy);
        lines[1].przesun(dx,dy);
        lines[2].przesun(dx,dy);
    }

    public String toString(){
    return "  <"+lines[0]+" , "+lines[1]+" , "+lines[2]+">  ";
    }
}
