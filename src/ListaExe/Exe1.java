package ListaExe;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
	
		int ano, mes, dia, diaAno, diaMes;
		
		diaAno = 365;
		diaMes = 30;
		
		
		System.out.println("Digite sua idade...");
		System.out.println("Anos: ");
		ano = ler.nextInt();
		System.out.println("Meses: ");
		mes = ler.nextInt();
		System.out.println("Dias: "); 
		dia = ler.nextInt();
		
		dia+=(ano * diaAno) + (mes * diaMes);
		System.out.println("Você tem "+dia+" dias de vida!!!");
	}

}
