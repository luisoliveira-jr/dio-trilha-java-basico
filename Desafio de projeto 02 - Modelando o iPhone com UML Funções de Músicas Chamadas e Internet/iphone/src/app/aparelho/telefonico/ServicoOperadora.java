package app.aparelho.telefonico;

public abstract class ServicoOperadora {

    public abstract void ligar(String numero);
	public abstract void atender();
	public abstract void iniciarCorreioVoz();
	
	protected void validarRede() {
		System.out.println("Validando se está conectado a rede telefonica");
	}	
    
}

