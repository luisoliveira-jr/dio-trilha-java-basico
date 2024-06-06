package app.navegador.internet;

public abstract class ServidorInternet {

    public abstract void exibirPagina(String url);
	public abstract void adicionarNovaAba();
	public abstract void atualizarPagina();
	
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
    
}
