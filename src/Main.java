import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome?", "Conversor de Moedas", JOptionPane.QUESTION_MESSAGE);
            TextMenu.setMenuText(nome);

            boolean novaConversao = true;

            while (novaConversao) {
                int menu = Integer.parseInt(JOptionPane.showInputDialog(null, TextMenu.getMenuText(), "Conversor de Moedas", JOptionPane.QUESTION_MESSAGE));

                Conversor conversor = new Conversor();
                String resultado = "";

                switch (menu) {
                    case 1:
                        resultado = realizarConversao(conversor, "BRL", "USD");
                        break;
                    case 2:
                        resultado = realizarConversao(conversor, "USD", "BRL");
                        break;
                    case 3:
                        resultado = realizarConversao(conversor, "USD", "ARS");
                        break;
                    case 4:
                        resultado = realizarConversao(conversor, "ARS", "USD");
                        break;
                    case 5:
                        resultado = realizarConversao(conversor, "USD", "COP");
                        break;
                    case 6:
                        resultado = realizarConversao(conversor, "COP", "USD");
                        break;
                    case 7:
                        // opção para digitar manualmente a conversão
                        String baseCode = JOptionPane.showInputDialog(null, "Digite o código da moeda de origem:", "Conversor de Moedas", JOptionPane.QUESTION_MESSAGE);
                        String targetCode = JOptionPane.showInputDialog(null, "Digite o código da moeda de destino:", "Conversor de Moedas", JOptionPane.QUESTION_MESSAGE);
                        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor que deseja converter:", "Conversor de Moedas", JOptionPane.QUESTION_MESSAGE));
                        resultado = realizarConversao(conversor, baseCode, targetCode, valor);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida! Escolha uma opção de 1 a 7.", "Conversor de Moedas", JOptionPane.ERROR_MESSAGE);
                        continue;
                }

                // mostrar resultado da conversão em uma janela com botões
                int opcao = JOptionPane.showOptionDialog(null, resultado, "Resultado da Conversão", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[]{"Nova Conversão", "Fechar"}, "Nova Conversão");

                if (opcao == 0) {
                    // continuar com nova conversão
                } else {
                    // fechar o programa
                    System.out.println("Programa encerrado.");
                    novaConversao = false;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao converter moeda: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private static String realizarConversao(Conversor conversor, String baseCode, String targetCode) {
        try {
            double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor que deseja converter:", "Conversor de Moedas", JOptionPane.QUESTION_MESSAGE));
            return conversor.converter(baseCode, targetCode, valor);
        } catch (NumberFormatException e) {
            return "Valor inválido! Digite um número válido.";
        } catch (Exception e) {
            return "Erro ao realizar conversão: " + e.getMessage();
        }
    }

    private static String realizarConversao(Conversor conversor, String baseCode, String targetCode, double valor) {
        try {
            return conversor.converter(baseCode, targetCode, valor);
        } catch (Exception e) {
            return "Erro ao realizar conversão: " + e.getMessage();
        }
    }
}
