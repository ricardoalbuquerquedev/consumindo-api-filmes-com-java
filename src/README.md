![CacheLib](https://lh4.googleusercontent.com/Lb2XTpd5bBDdZm2bmdG1y3YpwX18BEyCeEfOlpfpRulDMlWKjy0a1Bvs6J33iTsBcAn0Tew6J1DE2zlAUg7XhUeoE1wBjeVcNpdF6lQeWgdzLIr0tEDlfaPuOvv5vG2KDQ=w1600)

![](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)

## Descrição do Projeto 

Construção de uma aplicação do zero para consumir a API do IMDb e exibir os filmes mais populares, destacando seus pôsteres e visualizando sua classificação...

Criar um gerador de figurinhas explorando outras bibliotecas nativas do Java, para que possamos enviar por Whatsapp os nossos filmes preferidos!

Construção de uma API REST para expor nosso próprio conteúdo, utilizando ferramentas profissionais como o Spring Framework e um banco de dados NoSQL.

Aplicação acessível por qualquer pessoa, fazendo o deploy na nuvem.


## IMERSÃO JAVA

**Aula 01** - Consumindo uma API de filmes com Java:

Nesta primeira aula, vamos construir uma aplicação do zero para
consumir a API do IMDb e exibir os filmes mais populares,
destacando seus pôsteres e visualizando sua classificação...
Tudo isso sem usar nenhuma biblioteca externa!

**Aula 02** - Gerando figurinhas para WhatsApp:

Chegou o momento de pegarmos os filmes do IMDb e gerar figurinhas
com os pôsteres, aproveitando para melhorar nosso código com as
refatorações necessárias para torná-lo mais flexível e fácil de
entender.


**Aula 03** - Ligando as pontas, refatoração e orientação a objetos:

Chegou o momento de pegarmos os filmes do IMDb e gerar figurinhas 
com os pôsteres, aproveitando para melhorar nosso código com as 
refatorações necessárias para torná-lo mais flexível e fácil de 
entender.


## Técnicas e tecnologias utilizadas
Java
Intellij 
Paradigma de orientação a objetos
Maven
Spring Boot
MongoDB
Gson
TMDB API
Nasa API


## Links citados

**Aula 1 :**

Os 250 melhores filmes de acordo com a classificação do IMDB.

A documentação da API do IMDB.

Instalação do Visual Studio Code com o Coding Pack para Java

Documentação da classe HttpRequest do pacote java.net.http.

Classe pronta que utiliza Expressões Regulares para fazer parse de um JSON.

Biblioteca Jackson, que faz parse de JSON.

Site que ajuda a entender Expressões Regulares.

Artigo: Como deixar no seu GitHub com um README interessante.

O endpoint da API do IMDB que devolve os 250 melhores filmes: https://imdb-api.com/en/API/Top250Movies/ + SUA-API-KEY

**Aula 2 :**

Documentação do pacote javax.imageio, que trata de leitura e escrita de imagens.

Documentação da classe BufferedImage, que representa uma imagem no Java

Documentação da classe Graphics2D, a “caneta” que permite escrever, desenhar e imprimir outras imagens em uma imagem original.

Documentação da abstração InputStream, que representa um fluxo de leitura de dados de qualquer fonte, como arquivos, URLs, entre outros.

**Aula 3 :**

Documentação das APIs da NASA.
API da Foto Astronômica do dia da NASA.
Artigo na Alura “Como não aprender Java e Orientação a Objetos: getters e setters”.
Livro “Design Patterns”, de 1994, que descreve soluções comuns para problemas recorrentes de como organizar seu código.
Livro “Refactoring”, de 1999, que cataloga maneiras sistemáticas de melhorar o código sem modificar o que é feito.

**Aula 4 :**

Documentação do Spring Framework.
Link para iniciar um projeto utilizando Spring.
Link para download do Maven.
Link para download do Postman.
Página para fazer o registro e começar a utilizar o MongoDb Atlas.
GitHub com os logos das linguagens de programação.
Artigo sobre o pack de stickers da Alura para Whatsapp e Telegram.

**Aula 5 :**

Dev em T: especialista x generalista.
Site do Heroku, que é um PaaS (plataforma como serviço).
Documentação sobre a Oracle Cloud.
Artigo: Como elaborar um bom arquivo Readme para os seus projetos.

 ## Desafios

**Aula 1 :**

 Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.
 Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais!
 Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente
 Mudar o JsonParser para usar uma biblioteca de parsing de JSON como Jackson ou GSON
 Desafio supremo: criar alguma maneira para você dar uma avaliação ao filme, puxando de algum arquivo de configuração OU pedindo a avaliação para o usuário digitar no terminal.

**Aula 2 :**

 Ler a documentação da classe abstrata InputStream.
 Centralizar o texto na figurinha.
 Fazer um pacote no Whatsapp e/ou Telegram com as suas próprias figurinhas!
 Criar diretório de saída das imagens, se ainda não existir.
 Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes.
 Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha!
 Colocar contorno (outline) no texto da imagem.
 Tratar as imagens retornadas pela API do IMDB para pegar uma imagem maior ao invés dos thumbnails. Opções: pegar a URL da imagem e remover o trecho mostrado durante a aula ou consumir o endpoint de posters da API do IMDB (mais trabalhoso), tratando o JSON retornado.
 Fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.
 Desafio supremo: usar alguma biblioteca de manipulação de imagens como OpenCV pra extrair imagem principal e contorná-la.

**Aula 3 :**

 Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16
 Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP
 Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra
 Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado
 Desafio supremo: consumir outras APIs que contém imagens, como a da Marvel, que é bem diferente. Repositório com APIs públicas: clique aqui.

**Aula 4 :**

 Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada;
 Devolver a listagem ordenada pelo ranking;
 Criar na sua API um modelo de entidade com nomes diferentes de title e image e criar seu próprio extrator de informações personalizado OU, manter com o nome title e image e traduzir para que seja retornado como título e imagem através do uso de DTO (Data Transfer Object);
 Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST;
 Desafio supremo: Aplicar modificações parciais no recurso através do método PATCH, por exemplo, modificando o número de votos ou de pessoas que utilizam cada linguagem de programação.

**Aula 5 :**

 Compartilhe com seus amigos a sua URL do Heroku, para que eles possam consumir a sua API (com o padrão de atributos title e image) e gerar figurinhas do conteúdo que você utilizou (linguagens de programação, filmes, músicas);
 Colocar a aplicação no cloud da Oracle;
 Implementar algum mecanismo de votação na API, para que outros amigos votem nas linguagens preferidas para que se possa fazer um ranking;
 Desafio supremo: Evoluir o projeto das três primeiras aula para que ele gere um bundle de stickers, para que se possa fazer o download e já incluir vários stickers no WhatsApp; Usar os conhecimentos aprendidos em alguma imersão React da Alura e fazer uma aplicação front-end para gerar esse bundle, onde possa se passar a URL do conteúdo e já visualizar os stickers;

## Material Complementar

**Aula 1 :**

Artigo na Alura “O que é JSON?”.

Artigo na Alura sobre como pintar o terminal, com tabelinha de cores e negrito.

Artigo na Alura sobre como usar VS Code para codar em Java.

**Aula 2 :**

Primeira aula do curso “Java Polimorfismo: entenda herança e interfaces” da Alura.
Apêndice da apostila “Java e Orientação a Objetos” da Alura sobre o pacote java.io que explica com mais detalhes a abstração InputStream.

**Aula 3 :**

Artigo na Alura “Como não aprender Java e Orientação a Objetos: herança”.
Podcast Hipsters.tech sobre Práticas de Orientação a Objetos.
Podcast Hipsters.tech sobre Design Patterns.
Podcast Hipsters.tech sobre SOLID.

**Aula 4 :**

Primeira aula do curso “Maven: gerenciamento de dependências e build de aplicações Java” da Alura.
Alura+ “O que é REST?”.
Artigo da Alura “Conceito e fundamentos sobre REST”.
Podcast Hipsters.Tech sobre MongoDB.
Hipters.Tube “O que é SQL e NoSQL?”.
Artigo da Alura “Spring: Conheça esse framework Java”.
Alura+ Introdução ao Postman”.

**Aula 5 :**

Artigo da Alura “Heroku, Vercel e outras opções de Cloud como plataforma”.
Podcast Hipters.Tech “Integração Contínua, Deploy Contínuo e Github Actions”.
Pesquisa da JetBrains, empresa que desenvolve a IDE IntelliJ, sobre o ecossistema Java em 2021.


## Autor

<h1 align="center">
<img src="https://www.petz.com.br/blog/wp-content/uploads/2022/01/curiosidades-sobre-leao2.jpg" width="500" height="300" /> 
</h1>
<br>


## Instrutores e Instrutoras da Alura nessa imersão
 ![Jacqueline Oliveira](https://www.alura.com.br/assets/img/imersao-java/jaque-imersao-java-bio.1657213671.png) |![Alexandre Aquiles](https://www.alura.com.br/assets/img/imersao-java/alexandre-imersao-java-bio.1657213503.png)| ![Paulo Silveira](https://www.alura.com.br/assets/img/imersao-java/paulo-imersao-java-bio.1657213503.png)
| :---: | :---: | :---:
Jacqueline Oliveira | Alexandre Aquiles | Paulo Silveira
 [![Instagram](https://www.alura.com.br/assets/img/imersao-java/instagram.1655844054.svg)](https://www.instagram.com/jacque.tech/) [![LinkedIn](https://www.alura.com.br/assets/img/imersao-java/linkedin.1655291590.svg)](https://www.linkedin.com/in/jacqueline-r-oliveira/)   | [![Instagram](https://www.alura.com.br/assets/img/imersao-java/instagram.1655844054.svg)](https://www.instagram.com/aquiles3137/)[![LinkedIn](https://www.alura.com.br/assets/img/imersao-java/linkedin.1655291590.svg)](https://www.linkedin.com/in/alexandreaquiles/) | [![Instagram](https://www.alura.com.br/assets/img/imersao-java/instagram.1655844054.svg)](https://www.instagram.com/paulo_hipster)[![LinkedIn](https://www.alura.com.br/assets/img/imersao-java/linkedin.1655291590.svg)](https://www.linkedin.com/in/paulosilveira)
