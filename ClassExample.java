package homework7;

public class ClassExample {

    public int x;
    public int y;


    public void printXY () {

        System.out.println(x);
        System.out.println(y);
    }


    public void setX (int x1) {
        this.x=x1;
    }


    public void setY (int y1) {
        this.y= y1;
    }

    public int sumXY (){
        return x+y;
    }

    public int compareXY(){
        if (x>y) return x;
        else return y;
    }
}
