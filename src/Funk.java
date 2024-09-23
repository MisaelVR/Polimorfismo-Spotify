class Funk extends Musica {
    private String letra;

    public Funk(String nome, String artista, int duracaoSegundos, String letra) {
        super(nome, artista, duracaoSegundos);
        this.letra = letra;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Funk com batida envolvente.");
    }

    @Override
    public void exibirLetra() {
        System.out.println("Letra da música Funk: " + letra);
    }

    public void dançarFunk() {
        System.out.println("Vamos dançar ao som do Funk!");
    }
}
