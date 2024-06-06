package app.reprodutor.musical;

public abstract class ServicoMusicas {

    public abstract void selecionarMusica(String musica);
	public abstract void tocar();
    public abstract void pausar();
	
	protected void validarArquivosMp3() {
		System.out.println("Validando se o arquivo é mp3");
	}	
    
}
