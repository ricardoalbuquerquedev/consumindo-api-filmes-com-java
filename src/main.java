import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class main {

    public static void main(String[] args) throws Exception {
        // fazer uma conexão HTTP
        // String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json";
        // ExtratorDeConteudo extrator = new ExtratorDeConteudoDoIMDB();



        // String url =  "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/NASA-APOD.json";
        // String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/NASA-APOD.json"

        ExtratorDeConteudo extrator = new ExtratorDeConteudoDaNasa();
        String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14";
        //String url = "https://api.mocki.io/v2/549a5d8b/NASA-APOD"


        var http = new ClienteHttp();
         String json = http.buscaDados(url);

        // exibir e manipular os dados
        List<Conteudo> conteudos = extrator.extraiConteudos(json);

        var geradora = new GeradoraDeFigurinhas();


        for (int i = 0; i< 3; i++) {

            Conteudo conteudo = conteudos.get(i);

            InputStream inputStream = new URL(conteudo.getUrlimagem()).openStream();
            String nomeArquivo ="saida/" + conteudo.getTitulo().replace(":", "-") + ".png";
            geradora.cria(inputStream, nomeArquivo);
            System.out.println(conteudo.getTitulo());
            System.out.println();
        }
    }
}
