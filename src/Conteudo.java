public class Conteudo {


    private final String titulo;
    private final String urlimagem;

    public Conteudo(String titulo, String urlimagem) {
        this.titulo = titulo;
        this.urlimagem = urlimagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getUrlimagem() {
        return urlimagem;
    }
}
