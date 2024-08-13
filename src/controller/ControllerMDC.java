//5. O máximo divisor comum (MDC ou M.D.C) corresponde ao produto dos divisores comuns entre dois ou mais números inteiros. Para calcular o máximo divisor comum (MDC) entre números, devemos realizar a fatoração por meio da decomposição em fatores primos dos números indicados.
package controller;

public class ControllerMDC {
	
	public ControllerMDC() {
		super();
	}
	
	public int maximoDivisorComum(int n1, int n2) {
		if(n1 == n2) {
			return n1;
		} else if (n2 > n1) {
			return maximoDivisorComum(n2, n1);
		} else {
			return maximoDivisorComum(n1 - n2, n2);
		}
	}
}