package ListaExe;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		
		double n1, n2, n3, media;
		
		System.out.println("--------Calculo de m�dia--------");
		System.out.println("Digite a 1� nota: ");
		n1=ler.nextDouble();
		System.out.println("Digite a 2� nota: ");
		n2=ler.nextDouble();
		System.out.println("Digite a 3� nota: ");
		n3=ler.nextDouble();
		
		n1*=2;
		n2*=3;
		n3*=5;
		media=(n1+n2+n3)/10;
		
		System.out.println("----------------------");
		System.out.println("M�dia do aluno: "+media);
	}

}
