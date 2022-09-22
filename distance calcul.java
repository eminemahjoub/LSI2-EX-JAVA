public class point(){ //declaration d une classe point
// declaration d une champs : x,y
private int x;
private int y;
//declaration de consruct
public point (int startX, int startY){
    x=startX;
    y=startY;
}
// declartion de 3 methods
public int getX(){
    return x;
} 
public int getY(){
    return y;
}
public double distance(point otherPt)
{
int dx=x-otherPt.getX();
int dy=y-otherPt.getY();
return Math.sqrt(dx*dx+dy*dy)
}
//declaration de methode statique main
public static void main (String[] args){
point p1=new point(3,4);
point p2=new point(6,8);
System.out.println(p1.distance(P2));
}
}
