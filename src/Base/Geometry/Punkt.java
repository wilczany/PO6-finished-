package Base.Geometry;

public class Punkt {

    private int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public Punkt(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Punkt(){
        this(0,0);
    }
    public Punkt (Punkt p){
        this(p.x,p.y);
    }
    public void przesun(int dx,int dy){
        x+=dx;
        y+=dy;
    }

    @Override
    public String toString() {
        return "Punkt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
