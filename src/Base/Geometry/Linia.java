package Base.Geometry;


public class Linia {
    private Punkt []punkty =new Punkt[2];
    public Linia(){
        punkty[0]=new Punkt();
        punkty[1]=new Punkt(1,1);
    }
    public Linia(Punkt pkt1,Punkt pkt2){
        punkty[0]=new Punkt(pkt1);
        punkty[1]=new Punkt(pkt2);
    }
    public Linia(Linia lin){
        this(lin.punkty[0],lin.punkty[1]);
    }
    public void przestun(int dx,int dy){
        punkty[0].przesun(dx,dy);
        punkty[1].przesun(dx,dy);
    }

    @Override
    public String toString() {
        return "{" +punkty[0].toString()+ "->" + punkty[1].toString() + '}';
    }
}
