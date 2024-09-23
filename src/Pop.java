class Pop extends Musica {
    private String letra;

    public Pop(String nome, String artista, int duracaoSegundos, String letra) {
        super(nome, artista, duracaoSegundos);
        this.letra = letra;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música Pop com batidas eletrônicas.");
    }

    @Override
    public void exibirLetra() {
        System.out.println("Letra da música Pop: " + letra);
    }

    public void mostrarInformacaoPop() {
        System.out.println("Esta é uma música Pop!");
    }
}
