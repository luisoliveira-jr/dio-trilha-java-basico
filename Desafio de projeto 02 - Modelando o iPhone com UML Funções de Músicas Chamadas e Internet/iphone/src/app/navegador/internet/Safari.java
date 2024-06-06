package app.navegador.internet;

public class Safari extends ServidorInternet{

    public void exibirPagina(String url) {
		validarConectadoInternet();
		System.out.println("Conectado a página " + url);
	}
	public void atualizarPagina() {
		validarConectadoInternet();
		System.out.println("Página atualizada");
	}
	public void adicionarNovaAba() {
		validarConectadoInternet();
		System.out.println("Nova aba");
	}
}
