package main.java.com.company;
import com.company.anObj;
public class Main  {

    public static void main(String[] args) {
	System.out.print("Hello world");
	anObj aname =new anObj();


//	aname.x=5;
		int p;
		aname.x=20;
	System.out.print(aname.x);
	anObj plus=new anObj();
	p= plus.aPlus(6);
		System.out.print(p);
		System.out.println();
    aname.setEncapsulation("LALA");
    System.out.println(aname.getEncapsulation());

    }



}
