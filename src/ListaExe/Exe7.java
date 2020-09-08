package ListaExe;

import java.util.Random;

public class Exe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		float a,b,c,d,e ,f, x=0, y=0;

		
		a=r.nextInt(100);
		b=r.nextInt(100);
		c=r.nextInt(100);
		d=r.nextInt(100);
		e=r.nextInt(100);
		f=r.nextInt(100);
		
		
		x= (c*e-b*f) / (a*e-b*d);
		y =(a+f-c*a) /( a*e-b*d);
		
		System.out.println("X = "+x+" | Y = "+y);
	}

}
