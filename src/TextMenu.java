class TextMenu {
    private static String menuText;

    public static void setMenuText(String nome) {
        menuText = "Bem-vindo " + nome + " ao Conversor de Moedas. Por favor, escolha uma opção abaixo:\n" +
                "\n1) - BRL (Real Brasileiro) para USD (Dólar)" +
                "\n2) - USD (Dólar) para BRL (Real Brasileiro)" +
                "\n3) - USD (Dólar) para ARS (Peso Argentino)" +
                "\n4) - ARS (Peso Argentino) para USD (Dólar)" +
                "\n5) - USD (Dólar) para COP (Peso Colombiano)" +
                "\n6) - COP (Peso Colombiano) para USD (Dólar)" +
                "\n7) - Digite o nome de origem, para qual ser convertida exemplo(BRL, USD, COP) \n"+
                "\nEscolha uma opção válida:";
    }

    public static String getMenuText() {
        return menuText;
    }
}