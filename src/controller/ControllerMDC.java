//5. O m�ximo divisor comum (MDC ou M.D.C) corresponde ao produto dos divisores comuns entre dois ou mais n�meros inteiros. Para calcular o m�ximo divisor comum (MDC) entre n�meros, devemos realizar a fatora��o por meio da decomposi��o em fatores primos dos n�meros indicados.
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