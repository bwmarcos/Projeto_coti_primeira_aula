package negocio;

public class ControleFuncionario {

	public Double calcularSalLiquid(Double salario) {

		Double liquido;

		if (salario >= 5000) {
			liquido = salario * 0.94;
		} else if (salario < 5000 && salario > 3000) {
			liquido = salario * 0.96;
		} else {
			liquido = salario * 0.97;
		}
		return liquido;
	}

}
