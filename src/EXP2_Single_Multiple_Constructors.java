import java.util.Scanner;

public class EXP2_Single_Multiple_Constructors {
//---------------------Question 1 : cube class --------------------------------
    /*
static class Cube{
int len , wid, height;

    public Cube() {
        len = 5;
        wid = 10;
        height = 4;

    }

    public Cube(int len, int wid, int height) {
        this.len = len;
        this.wid = wid;
        this.height = height;
    }
    public Cube(Cube c1) {
        len = c1.len;
        wid = c1.wid;
        height = c1.height;
    }
    public void area(){
        System.out.println("Volume is -->" + len*wid*height);
    }
}
public static void main(String [] args){
        Cube a,b,c;
        a= new Cube ();
        b = new Cube(10,20,20);
        c = new Cube (b);
        a.area();;
        b.area();
        c.area();

}

*/
//------------------------Quesiton 2: Mobile class-----------------------------------

static class Phone{
int size;
String name;

    public Phone(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public void show(){
        System.out.println(" Screen size: -> " + size+ " Phone company-> "+name);
    }
}
public static void main (String[] args){
    Phone [] phone = new Phone[5];
    Scanner s = new Scanner(System.in);

for (int i = 0; i <4;i++){
    System.out.println("enter size and name for phone "+i);
    int size = s.nextInt();
    String name = s.next();

    phone [i] = new Phone(size, name);


}
for (int i = 0; i<4; i++){
    phone [i].show();
}



}




}
