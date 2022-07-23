//Chapter 6
//doubleroducing Classes
import java.util.* ;
class Box{
    double width;
    double height;
    double depth;
    
    Box(){
        width=-1;
        height=-1;
        depth=-1;
    }
    Box(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
    Box(double l){
        width=l;
        height=l;
        depth=l;   
    }
    double volume(){
        return width*height*depth;
    }
};

class BoxDemo{
    public static void main(String args[]){
        Box mybox1=new Box();
        Box mybox2=new Box(1.5, 2, 3);
        Box mybox3=new Box(5);
        double vol;
        vol=mybox1.volume();
        System.out.println(vol);
        vol=mybox2.volume();
        System.out.println(vol);
        vol=mybox3.volume();
        System.out.println(vol);
    }
};

