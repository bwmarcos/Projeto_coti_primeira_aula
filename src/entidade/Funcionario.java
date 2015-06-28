package entidade;

public class Funcionario {

	private Integer codigo;
	private String nome;
	private Double salario;

	public Funcionario() {

		this.salario = 724.;

	}

	public Funcionario(Integer codigo, String nome, Double salario) {

		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;

	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
