package entidades;

public abstract class Contribuentes {
	
	protected String nome;
	protected Double rendaAnual;
	
	public Contribuentes() {
		super();
	}

	public Contribuentes(String nome, Double rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}
	
	public abstract double impostoDeRenda();
}
