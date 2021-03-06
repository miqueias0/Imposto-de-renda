package entidades;



public class PessoaJuridica extends Contribuentes{
	
	private int numeroDeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	

	@Override
	public double impostoDeRenda() {
		if (numeroDeFuncionarios > 10) {
			return rendaAnual * 0.14;
		} else {
			return rendaAnual * 0.16;
		}
	}
	
	public String toString() {
		
		return	nome + ": $ " + String.format("%.2f", impostoDeRenda());
	}
}
