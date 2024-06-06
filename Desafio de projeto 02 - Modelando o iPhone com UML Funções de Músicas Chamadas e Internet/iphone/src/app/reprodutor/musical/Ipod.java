package app.reprodutor.musical;

public class Ipod extends ServicoMusicas{

    public void selecionarMusica(String musica) {
        validarArquivosMp3();
		System.out.println("Tocando " + musica);
	}
	public void tocar() {
		System.out.println("Play na musica");
	}
	public void pausar() {
		System.out.println("Musica pausada");
	}
    
}
