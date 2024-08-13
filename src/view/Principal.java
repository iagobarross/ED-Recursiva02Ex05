package view;

import controller.ControllerMDC;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ControllerMDC contMDC = new ControllerMDC();
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int mdc = contMDC.maximoDivisorComum(n1, n2);
		System.out.println("O MDC de " + n1 + " e " + n2 + " é: " + mdc);
			
	}

}
