package ListaExe;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int seg, hor, min, segs;
		
		System.out.println("Qual a duração do evento? ");
		System.out.println("Digite em segundos...");
		segs = ler.nextInt();
		
		hor = (segs / 3600);
		min = ( segs % 3600) / 30;
		seg = ( segs % 3600) % 30;
		
		
		System.out.println("O evento tem a duração de "+hor+" horas "+min+" minutos e "+seg+" segundos!!!");

	}

}
