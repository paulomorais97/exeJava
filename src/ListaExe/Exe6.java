package ListaExe;

import java.util.Random;

public class Exe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		/*
		 * Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula

que efetua tal cálculo é:

d = mat.arredondar(mat.raiz((mat.potencia(x2-x1,2.0)+mat.potencia(y2-y1,2.0)),2.0),2.0)
		 */
		int x1, x2, y1, y2, d;
		
		x1 = r.nextInt(100);
		y1 = r.nextInt(100);
		x2 = r.nextInt(100);
		y2 = r.nextInt(100);
	
		d =(int) Math.sqrt(((int) Math.pow((x2-x1), 2)) +((int) Math.pow((y2-y1), 2)));
		System.out.println("P1 x1:"+x1+ " y1: "+y1+ " | P2 x2: "+x2+ " y2: "+y2);
		System.out.println("A distância entre os dois pontos é: "+d);
		
	}

}
