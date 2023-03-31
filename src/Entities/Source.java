package Entities;

public class Source {
	private String nome;
	private int id;
	private double salario;
	
	public Source(String nome, int id, double salario) {
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}

	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
