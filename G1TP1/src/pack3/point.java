package pack3;

public class point {
private double abs,ord;
private static int mbp=0;
protected String nomObjet;

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
public point(double abs ,double ord) {
	this.abs=abs;
	this.ord=ord;
	mbp++;
	nomObjet="point";
}
@Override
public String toString() {
	return "c'est le "+nomObjet+":["+this.abs+","+this.ord+"]";
}
public void deplace (double x , double y) {
	this.ord+=x;
			this.abs+=y;
}
public static int getMbp() {
	return mbp;
}

	

}
