class Trap extends Musica {
    private String letra;

    public Trap(String nome, String artista, int duracaoSegundos, String letra) {
        super(nome, artista, duracaoSegundos);
        this.letra = letra;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música Trap com batidas pesadas.");
    }

    @Override
    public void exibirLetra() {
        System.out.println("Letra da música Trap: " + letra);
    }

    public void mostrarTemaTrap() {
        System.out.println("Esta é uma música Trap!");
    }
}
