class Musica {
    private String nome;
    private String artista;
    private int duracaoSegundos;

    // Construtor com parâmetros
    public Musica(String nome, String artista, int duracaoSegundos) {
        this.nome = nome;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
    }

    // Construtor sem parâmetros
    public Musica() {
        this.nome = "Desconhecida";
        this.artista = "Desconhecido";
        this.duracaoSegundos = 0;
    }

    public void tocar() {
        System.out.println("Tocando a música: " + nome + " de " + artista);
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    // Método que será sobrescrito pelos filhos
    public void exibirLetra() {
        System.out.println("Letra não disponível.");
    }
}
