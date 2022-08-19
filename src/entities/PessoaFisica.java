package entities;

public class PessoaFisica extends Contribuinte{
	private Double gastoSaude;
	
	public PessoaFisica (String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	
	public Double getGastoSaude() {
		return gastoSaude;
	}


	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}


	@Override
	public Double calculoImposto() {
		Double impostoCalculado;
		
		if (getRendaAnual() < 20000.00) { //Caso a renda Anual seja menor que 20000.00, o imposto será de 15%
			impostoCalculado = (getRendaAnual()* 0.15) - (this.gastoSaude * 0.5);
			
		}
		else{ //Caso a renda Anual seja maior ou igual a 20000.00, o imposta será de 25%
			impostoCalculado = (getRendaAnual() * 0.25) - (this.gastoSaude * 0.5);
		}
		return impostoCalculado;
	}
	
	public String toString() {
		return super.toString()+ " ImpostoCalculado: "+ calculoImposto();
	}
}

	
