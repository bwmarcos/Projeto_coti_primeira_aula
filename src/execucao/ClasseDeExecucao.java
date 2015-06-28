package execucao;

import entidade.Aluno;

public class ClasseDeExecucao {
	
public static void main(String[] args) {
	
	Aluno a1 = new Aluno();
	Aluno a2 = new Aluno();
	
	a1.setNome("Nat");
	a1.setIdade(28);
	a1.setEmail("Email@email");
	
	a2.setNome("Rui");
	a2.setIdade(35);
	a2.setEmail("Test@email");
	
	
	System.out.println("Nome :" + a1.getNome());
	System.out.println("Idade :" + a1.getIdade());
	System.out.println("Email :" + a1.getEmail());
	
	System.out.println();
	
	System.out.println("Nome :" + a2.getNome());
	System.out.println("Idade :" + a2.getIdade());
	System.out.println("Email :" + a2.getEmail());
}
	
	
	
	

}
