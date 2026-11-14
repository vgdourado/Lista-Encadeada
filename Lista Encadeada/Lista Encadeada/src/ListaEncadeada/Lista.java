package ListaEncadeada;

public class Lista {
    No inicio;
    int qtd;

    public Lista(No inicio, int qtd){
        this.inicio = null;
        qtd = 0;
    }

    public void adicionarNo(Pessoa p){
        No novoNo = new No(p);

        if (verificarListaVazia()) {
            inicio = novoNo;
        }else{
            No atual = inicio;

            while (atual.proximo != null) {
                atual = atual.proximo;
            }

            atual.proximo = novoNo;
        }

        qtd++;
    }

    public boolean verificarListaVazia(){
        return inicio == null;
    }
}
