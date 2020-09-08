package ListaExe;

import java.util.Scanner;

public class Exe8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor, diferenca;
		
		System.out.println("Digite o valor de Fábrica do veículo: ");
		custoFabrica=ler.nextDouble();
		
		custoFabrica*= 1.28;
		custoConsumidor = custoFabrica*1.45;
		diferenca =Math.round( custoConsumidor - custoFabrica);
		
		
		System.out.println("Preço para o Consumidor: R$ "+custoConsumidor);
		System.out.println("Diferença: R$ "+diferenca); 
	}

}
