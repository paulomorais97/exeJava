package ListaExe;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		
		double n1, n2, n3, media;
		
		System.out.println("--------Calculo de média--------");
		System.out.println("Digite a 1º nota: ");
		n1=ler.nextDouble();
		System.out.println("Digite a 2º nota: ");
		n2=ler.nextDouble();
		System.out.println("Digite a 3º nota: ");
		n3=ler.nextDouble();
		
		n1*=2;
		n2*=3;
		n3*=5;
		media=(n1+n2+n3)/10;
		
		System.out.println("----------------------");
		System.out.println("Média do aluno: "+media);
	}

}
