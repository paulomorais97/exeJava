package ListaExe;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int dias, ano, mes, dia;
		
		System.out.println("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		ano =(dias / 365);
		mes = (dias % 365) / 30;
		dia = (dias % 365) % 30;
		
		System.out.println("Você tem "+ano+" anos "+mes+" meses e "+dia+" dias");

	}

}
