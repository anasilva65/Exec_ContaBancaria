package entidades;

public class ContaEspecial extends ContaCorrente {
	
	public double limite;
	
	public ContaEspecial(int numero, double saldo, int talionario, double limite) {
		super(numero, saldo, talionario);
		this.limite = limite;
	}



	public double getLimite() {
		return limite;
	}



	public void setLimite(double limite) {
		this.limite = limite;
	}

    public double debitar(double valor)
    {
    	double saldoComLimite=getSaldo()+limite;
    	if((saldoComLimite-valor)>=0)
    	{
    		debitar(valor);
    	}
    	else
    	{
    		System.out.println("Você ultrapassou o seu limite!");
    		return limite;
    	}
    	return limite;
    }

	public void CalculaJuros(double valor)
	{
		
		if(getSaldo()<0)
		{
			
			valor=getSaldo()*0.16;
			debitar(valor);
		}
		
	
	}
	

	
	

}
