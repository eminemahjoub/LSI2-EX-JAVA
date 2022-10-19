package pack2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
		/*System.out.print("Donner a ");
		int a=s1.nextInt();
		System.out.print("Donner b ");
		int b=s1.nextInt();
		System.out.print("somme ="+(a+b));
		//--------------------------
		System.out.print("donner une chaine");
		String ch = s1.next();
		System.out.print("hello <"+ch+">");*/
		//----------------------
		System.out.print("donner votre nom");
		String n=s1.next();
		System.out.print("donner votre prenom");
		String p=s1.next();
		char st[] =p.toCharArray();
		st[0]=Character.toUpperCase(st[0]);
		for(int i=1;i<st.length;i++)
			st[i]=Character.toLowerCase(st[i]);
		p= new String(st);
		System.out.println(n.toUpperCase()+" "+p);
		
		do {
			System.out.println("donner ");
			int pf =s1.nextInt();
		}
		while(pf>=ch1.langth)
			
		}
	}

}
