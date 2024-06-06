package app.aparelho.telefonico;

public class Telefone extends ServicoOperadora{

    public void ligar(String numero) {
		validarRede();
		System.out.println("Ligando para o número " + numero);
	}
	public void atender() {
		validarRede();
		System.out.println("Recebendo recebendo ligação");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Gerando correio de voz");
	}
}
