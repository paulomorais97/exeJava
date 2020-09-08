package ListaExe;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		int a, b, c, r, s, d;
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de B: ");
		b=ler.nextInt();
		System.out.println("Digite o valor de C: ");
		c=ler.nextInt();
		
		
		r =(int) Math.pow((a+b), 2);
		s = (int)Math.pow((b+c), 2);
		d = (r+s)/2;
		
		System.out.println("Expressão...\nS = B+C²\nR = A+B²\nD = R+S/2");
		System.out.println("-------------------");
		System.out.println("Valor de R: "+r);
		System.out.println("Valor de S: "+s);
		System.out.println("Valor de D: "+d);
	}

}
