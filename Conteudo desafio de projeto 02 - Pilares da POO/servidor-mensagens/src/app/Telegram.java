package app;
public class Telegram extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo mensagem pelo Telegram");
	}
	public void salvarHistoricoMensagem() {
		validarConectadoInternet();
		System.out.println("Salvando histórico de mensagens pelo Telegram");
	}
}

