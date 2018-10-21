package programame;

import java.util.Scanner;

public class REnos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		boolean res = true;
		int casos = in.nextInt();
		while (casos > 0) {
			int tiempo = in.nextInt();
			if (tiempo > 86400)
				System.out.println("24:00:00");
			else {
				int segundos = tiempo % 60;
				int minutos = tiempo / 60==60?0:tiempo/60;
				int horas = tiempo / 3600==3600?0:tiempo/3600;

				String H=horas<10?"0"+horas:String.valueOf(horas);
				String M=minutos<10?"0"+minutos:String.valueOf(minutos);
				String S=segundos<10?"0"+segundos:String.valueOf(segundos);
				
				System.out.println(H+":" + M+ ":" + S);
			}
			casos--;
		}

	}

}
