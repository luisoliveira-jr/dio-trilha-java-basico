import app.aparelho.telefonico.ServicoOperadora;
import app.aparelho.telefonico.Telefone;
import app.navegador.internet.Safari;
import app.navegador.internet.ServidorInternet;
import app.reprodutor.musical.Ipod;
import app.reprodutor.musical.ServicoMusicas;

public class Iphone {

    public static void main(String[] args) {
		
		ServicoOperadora ope = new Telefone();
		String numero = "11959806331";
		ope.ligar(numero);
		ope.atender();
		ope.iniciarCorreioVoz();

		ServidorInternet sit = new Safari();
		String url = "www.dio.com";
		sit.exibirPagina(url);
		sit.adicionarNovaAba();
		sit.atualizarPagina();		

		ServicoMusicas rpm = new Ipod();
		String musica = "Bad Romance - Lady Gaga";
		rpm.selecionarMusica(musica);
		rpm.tocar();
		rpm.pausar();
	}
    
}
