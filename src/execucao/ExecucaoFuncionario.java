package execucao;

import java.text.NumberFormat;

import negocio.ControleFuncionario;
import entidade.Funcionario;

public class ExecucaoFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario(102, "Ana", 3990.);
		ControleFuncionario controlFunc = new ControleFuncionario();
		NumberFormat nf = NumberFormat.getCurrencyInstance();

		f1.setCodigo(101);
		f1.setNome("Leo");
		f1.setSalario(5100.);
		
		System.out.println("Codigo :" + f1.getCodigo());
		System.out.println("Nome :" + f1.getNome());
		System.out.println("Salario :" + nf.format(f1.getSalario()));
		System.out.println("Liquido : "
				+ nf.format(controlFunc.calcularSalLiquid(f1.getSalario())));

		System.out.println("Codigo :" + f2.getCodigo());
		System.out.println("Nome :" + f2.getNome());
		System.out.println("Salario :" + nf.format(f2.getSalario()));
		System.out.println("Liquido :"
				+ nf.format(controlFunc.calcularSalLiquid(f2.getSalario())));

	}

}
