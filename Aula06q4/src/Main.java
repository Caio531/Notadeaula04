public class Main {
    public static void main(String[] args) {

        Leao leao = new Leao("Mamífero", "Patas", "Juba");
        Arara arara = new Arara();

        System.out.println("Informações do Leao:");
        leao.exibirInformacoes();

        System.out.println("\nInformações da Arara:");
        System.out.println(arara.getClasse());
        System.out.println(arara.getLocomocao());
        System.out.println(arara.getQtdeOvos());

    }
}