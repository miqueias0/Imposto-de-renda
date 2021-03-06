package entidades;

public class PessoaFisica extends Contribuentes{
	
	private double saude;
	
	public PessoaFisica() {
		super();
	}
	
	
	
	public PessoaFisica(String nome, Double rendaAnual, double saude) {
		super(nome, rendaAnual);
		this.saude = saude;
	}

	

	public double getSaude() {
		return saude;
	}



	public void setSaude(double saude) {
		this.saude = saude;
	}



	@Override
	public double impostoDeRenda() {
		if (rendaAnual > 20000.00) {
			if (saude>0) {
				return (rendaAnual * 0.25) - (saude * 0.5);
			} else {
				return rendaAnual * 0.25;
			}
		} else	{
			if (saude>0) {
				return (rendaAnual * 0.15) - (saude * 0.5);
			} else {
				return rendaAnual * 0.15;
			}
		}
	}
	
	public String toString() {
		
		return	nome + ": $ " + String.format("%.2f", impostoDeRenda());
	}
	
}
