import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class main {

    public static void main(String[] args) throws Exception {
        // fazer uma conexão HTTP
        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json";
        String url = "https://api.nasa.gov/planetary/apod?api_key=BiFJ5ei3w3IF2MLT0PBBxOHm5mqARu7eQRBf2H0z";
        //String url =  "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/NASA-APOD.json";
        var http = new ClienteHttp();
         String json = http.buscaDados(url);


        // exibir e manipular os dados
        ExtratorDeConteudoDaNasa extrator = new ExtratorDeConteudoDaNasa();
        List<Conteudo> conteudos = extrator.extraiConteudos(json);

        var geradora = new GeradoraDeFigurinhas();


        for (int i = 0; i< 3; i++) {

            Conteudo conteudo = conteudos.get(i);

            InputStream inputStream = new URL(conteudo.getUrlimagem()).openStream();
            String nomeArquivo ="saida/" + conteudo.getTitulo() + ".png";

            geradora.cria(inputStream, nomeArquivo);
            System.out.println(conteudo.getTitulo());
            System.out.println();
        }
    }
}
