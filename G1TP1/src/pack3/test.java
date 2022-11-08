package pack3;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
point p=new point(2,5);
pixel px=new pixel(3,4,"bleu");
point p1=new pixel(4,8,"vert");
//pixel px1=(pixel)new point(4,8);
System.out.println(p.toString());
System.out.println(px.toString());
px.deplace(1, 1);
System.out.println(px.toString());
System.out.println(p1.toString());
//System.out.println(px1.toString());
Object pk= new point(-1,2);
Object pk1= new pixel(-1,2,"9azwaardi");
System.out.println(pk.toString());
System.out.println(pk1.toString());
System.out.println("nombre crée des objet = "+point.getMbp() );
doura c =new doura (7,7,"noir",12);
point tab[] =new point [point.getMbp()];
tab[0]=p;
tab[1]=px;
tab[2]=p1;
tab[3]=c;
for (int i=0;i<tab.length;i++)
	System.out.println(tab[i].toString());
for(Object a:tab)
	System.out.println("nombre creeé "+point.getMbp());
	}

}
