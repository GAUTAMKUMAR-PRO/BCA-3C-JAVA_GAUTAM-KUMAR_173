// write a java program of constructor overloading?

class Box {
    double width, height, depth;

Box(){

width=1.5;
height=2.5;
depth=3.5;
    
}

Box(double len)
{

 height=width=depth=len;
}

Box(double W, double H, double D)
{
    width=W;
    height=H;
    depth=D;
}

void volume(){
  double result=width*height*depth;
  System.out.println("Volume of the box is: " + result);
}

}

public class program8{

    public static void main(String[]args){
        Box box1=new Box();
        Box box2=new Box(5.0);
        Box box3=new Box(2.0, 3.0, 4.0);

        box1.volume();
        box2.volume();
        box3.volume();
    }
}

