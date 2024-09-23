import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Musica pop = new Pop("Blinding Lights", "The Weeknd", 200,
                "I said, ooh, I'm blinded by the lights\n" +
                        "No, I can't sleep until I feel your touch\n" +
                        "I said, ooh, I'm drowning in the night\n" +
                        "Oh, when I'm like this, you're the one I trust\n" +
                        "(Hey, hey, hey)");

        Musica trap = new Trap("Problemas de um Milionário", "WIU, Teto", 180,
                "Ela não escuta trap\n" +
                        "Só se é o WIU ou o Teto\n" +
                        "Ela tem muito bom gosto (okay)\n" +
                        "Mas eu quero ver mais de perto (ahn)");

        Musica funk = new Funk("Glamurosa", "MC Marcinho", 240,
                "Glamurosa, rainha do funk\n" +
                        "Poderosa, olhar de diamante\n" +
                        "Nos envolve, nos fascina, agita o salão\n" +
                        "Balança gostoso, requebrando até o chão");

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha a música para tocar:");
            System.out.println("1. Pop - Blinding Lights");
            System.out.println("2. Trap - Problemas de um Milionário");
            System.out.println("3. Funk - Glamurosa");
            System.out.println("0. Sair");
            System.out.print("Digite a opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    pop.tocar();
                    if (pop instanceof Pop) {
                        ((Pop) pop).exibirLetra();
                    }
                    break;
                case 2:
                    trap.tocar();
                    if (trap instanceof Trap) {
                        ((Trap) trap).exibirLetra();
                    }
                    break;
                case 3:
                    funk.tocar();
                    if (funk instanceof Funk) {
                        ((Funk) funk).exibirLetra();
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
