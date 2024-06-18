package trilha_java_basico;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	public static void main(String[] args) {
		
	}
	
	@Override
	public void tocar(){
		System.out.println("Tocando o Reprodutor Musical");
	}
	
	@Override
	public void pausar(){
		System.out.println("Pausando o Reprodutor Musical");
	}
	
	@Override
	public void selecionarMusica(String musica){
		System.out.println("Selecionando a música enviada para o Reprodutor Musical");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo a página enviada para o Navegador de Internet");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba no Navegador de Internet");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página no Navegador de Internet");		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número enviado no Aparelho telefônico");		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo o Aparelho telefônico");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o correio de voz no Aparelho telefônico");
	}
}
