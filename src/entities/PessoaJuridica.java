package entities;

public class PessoaJuridica extends Contribuinte{
	private Integer qtdFuncionarios;
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer qtdFuncionarios) {
		super(nome, rendaAnual);
		this.qtdFuncionarios = qtdFuncionarios;
	}

	
	
	public Integer getQtdFuncionarios() {
		return qtdFuncionarios;
	}



	public void setQtdFuncionarios(Integer qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}



	@Override
	public Double calculoImposto() {
		Double impostoCalculado;
		
		if (qtdFuncionarios > 10) { //Caso a Quantidade de Funcionários seja Maior que 10, o imposto será de 14%
			impostoCalculado = (getRendaAnual()* 0.14); 
			
		}
		else{ //Caso a Quantidade de Funcionários seja Maior que 10, o imposto será de 16%
			impostoCalculado = (getRendaAnual() * 0.16); 
		}
		return impostoCalculado;
	}
	
	public String toString() {
		return super.toString()+ "ImpostoCalculado: " + calculoImposto();
	}
	
}
