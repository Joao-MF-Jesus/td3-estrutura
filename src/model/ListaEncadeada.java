package model;

public class ListaEncadeada<T> {

    private No<T> primeiro;
    private int tamanho;

    public ListaEncadeada() {
        primeiro = null;
        tamanho = 0;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public int tamanho() {
        return tamanho;
    }

    public void adicionar(T elemento) {
        No<T> novo = new No<>(elemento);
        if (estaVazia()) {
            primeiro = novo;
        } else {
            No<T> atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
        tamanho++;
    }

    public boolean remover(T elemento) {
        if (estaVazia()) {
            return false;
        }

        No<T> atual = primeiro;
        No<T> anterior = null;

        while (atual != null) {
            if (atual.getInfo().equals(elemento)) {
                if (anterior == null) {
                    primeiro = atual.getProximo();
                } else {
                    anterior.setProximo(atual.getProximo());
                }
                tamanho--;
                return true;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        No<T> atual = primeiro;
        while (atual != null) {
            sb.append(atual.getInfo());
            if (atual.getProximo() != null) sb.append(" -> ");
            atual = atual.getProximo();
        }
        return sb.toString();
    }
}
