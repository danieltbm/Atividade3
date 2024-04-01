package visao;

import javax.swing.JOptionPane;

import controle.PilhaComputador;
import modelagem.Computador;

public class VisaoComputador {
    public static void main(String[] args) {
        PilhaComputador pilhaComputador = new PilhaComputador(5);

        while (true) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "======== MONTE SEU PC ========\nEscolha sua opção:\n" +
                            "1. Adicionar componente\n" +
                            "2. Remover componente\n" +
                            "3. Visualizar pilha\n"));

            switch (opcao) {
                case 1:
                    String componente = JOptionPane.showInputDialog("Digite o nome do componente:");
                    pilhaComputador.empilhar(new Computador(componente));
                    break;
                case 2:
                    Computador componenteRemovido = pilhaComputador.desempilhar();
                    if (componenteRemovido != null) {
                        JOptionPane.showMessageDialog(null, "Componente removido: " + componenteRemovido.getComponente());
                    }
                    break;
                case 3:
                    String mensagem = "Componentes na pilha:\n";
                    for (int i = pilhaComputador.getTopo(); i >= 0; i--) {
                        mensagem += pilhaComputador.getPilha()[i].getComponente() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, mensagem);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }
    }
}
