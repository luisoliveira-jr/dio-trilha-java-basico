package app;
public class MSNMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
	public void salvarHistoricoMensagem() {
		validarConectadoInternet();
		System.out.println("Salvando histórico de mensagens pelo MSN Messenger");
	}
}
