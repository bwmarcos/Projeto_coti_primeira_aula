package sobrecarga;

public class Calculos {

	public int somar(int num1, int num2) {
		int soma = num1 + num2;
		return soma;

	}

	public int somar(int num1, int num2, int num3) {

		int soma = 0;
		soma = num1 + num2 + num3;
		return soma;
	}

	public int multiplicar(int num1, int num2) {
		int result = 0;
		result = num1 * num2;
		return result;

	}

	public Double multiplicar(Double num1, Double num2) {
		double result = 0;
		result = num1 * num2;
		return result;

	}

	public static void main(String[] args) {

		Calculos c = new Calculos();
		System.out.println("Soma :" + c.somar(15, 30));
		System.out.println("Soma :" + c.somar(13, 20, 40));

		System.out.println("Multiplicar :" + c.multiplicar(30, 30));
		System.out.println("Multiplicar :" + c.multiplicar(30.5, 40.13));

	}
}
