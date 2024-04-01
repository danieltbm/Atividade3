package controle;

import javax.swing.JOptionPane;

import modelagem.Computador;

public class PilhaComputador {
    private int tamanhoMaximo;
    private Computador[] pilha;
    private int topo;

    public int getTamanhoMaximo() {
		return tamanhoMaximo;
	}

	public void setTamanhoMaximo(int tamanhoMaximo) {
		this.tamanhoMaximo = tamanhoMaximo;
	}

	public Computador[] getPilha() {
		return pilha;
	}

	public void setPilha(Computador[] pilha) {
		this.pilha = pilha;
	}

	public int getTopo() {
		return topo;
	}

	public void setTopo(int topo) {
		this.topo = topo;
	}

	public PilhaComputador(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.pilha = new Computador[tamanhoMaximo];
        this.topo = -1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == tamanhoMaximo - 1;
    }

    public void empilhar(Computador componente) {
        if (!estaCheia()) {
            topo++;
            pilha[topo] = componente;
        } else {
            JOptionPane.showMessageDialog(null, "A pilha está cheia!");
        }
    }

    public Computador desempilhar() {
        if (!estaVazia()) {
            Computador componenteDesempilhado = pilha[topo];
            pilha[topo] = null;
            topo--;
            return componenteDesempilhado;
        } else {
            JOptionPane.showMessageDialog(null, "A pilha está vazia!");
            return null;
        }
    }
}
