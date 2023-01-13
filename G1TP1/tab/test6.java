package tab;
import java.util.Scanner;

public class test6 {
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("donner n: ");
		int n = console.nextInt();
		int v[] = new int[n];
		SaisirTab(n,v);
		Affiche(n,v);
	}
	static void SaisirTab(int n, int v[]) {
		for(int i=0;i<n;i++) {
			System.out.print("donner v["+i+"]: ");
			v[i] = console.nextInt();
		}
	
	}
	static void Affiche(int n, int v[]) {
		for(int i=0;i<n;i++) {
			System.out.println("v[" +i+"]=  "+v[i]);
		}
		
	}
 static boolean existe(int vx,int t[]) {
  int i;
	 for (i=0;i<t.length && vx!=t[i] ;i++); 
		 return i<t.length;
	 
 }
	 static int nbOcc(int vx, int t[]) {
		 int s=0;
		 for (int i=0;i<t.length;i++)
	 if(vx==t[i])
		 s++;
	 return s;
	 }
	 static void tritab(int t[]) {
 for (int i=0; i<t.length-1;i++)
	 for (int j=i+1;j<t.length;j++)
		 if (t[i]>t[j])
		 {
			 int vx =t[j];
			 t[j]=t[i];
			 t[i]=vx;
		 }
		 }
	}
