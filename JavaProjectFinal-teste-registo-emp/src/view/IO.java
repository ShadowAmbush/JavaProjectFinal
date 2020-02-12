package view;

import java.util.Scanner;

public class IO {

	// =============== FUNÇÕES IO =========
	// Ler do dispositivo sandard de entrada
	// uma string que converte em interiro
	// que retorna
	public static int getInt() {
		@SuppressWarnings("resource")
		Scanner t = new Scanner(System.in);
		try {
			return Integer.parseInt(t.nextLine());
		} catch (Exception e) {
			return 0;
		}
	}

	// Ler do dispositivo sandard de entrada
	// uma string que converte em double
	// que retorna
	public static double getDouble() {
		@SuppressWarnings("resource")
		Scanner t = new Scanner(System.in);
		try {
			return Double.parseDouble(t.nextLine());
		} catch (Exception e) {
			return 0;
		}
	}

	// Ler do dispositivo sandard de entrada
	// uma string que converte em double
	// que retorna
	public static float getFloat() {
		@SuppressWarnings("resource")
		Scanner t = new Scanner(System.in);
		try {
			return Float.parseFloat(t.nextLine());
		} catch (Exception e) {
			return 0;
		}
	}

	// Ler do dispositivo sandard de entrada
	// uma string que retorna
	public static String getString() {
		@SuppressWarnings("resource")
		Scanner t = new Scanner(System.in);
		try {
			return t.nextLine();
		} catch (Exception e) {
			return "";
		}
	}	
	
}
