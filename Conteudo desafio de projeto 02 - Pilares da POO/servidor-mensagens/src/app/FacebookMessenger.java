package app;
public class FacebookMessenger extends ServicoMensagemInstantanea {
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}

	public void salvarHistoricoMensagem() {
		validarConectadoInternet();
		System.out.println("Salvando histórico de mensagens Facebook Messenger");
	}
}

