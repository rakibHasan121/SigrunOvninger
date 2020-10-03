package sprint1.övning7;

public class LiksidigTriangel extends Figur{

    private int bas;
    private int höjd;

    //startpunkten antas vara översta hörnet
    public LiksidigTriangel(int startx, int starty, int bas, int höjd){
        super(new Punkt(startx,starty));
        this.bas = bas;
        this.höjd = höjd;
    }

    public double area(){
        return bas*höjd/2;
    }

}
