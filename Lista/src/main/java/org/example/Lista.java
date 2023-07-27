package org.example;

public class Lista<Dado> {

    private No<Dado> cabeca;
    private int tamanho;
    public void adicionar(Dado dado){
        No<Dado> n = new No<>(dado);
        if(cabeca == null)
            cabeca = n;
        else
            pegarUltimoNo().setProximo(n);
        tamanho++;
    }

    private No<Dado> pegarUltimoNo(){
        No<Dado> x = cabeca;
        while(x != null){
            if(x.getProximo() == null)
                return x;
            x = x.getProximo();
        }
        return null;
    }

    public Dado recuperar(int posicao){
        No<Dado> x = cabeca;
        for(int i = 0; i<posicao && x != null; i++){
            x = x.getProximo();
        }
        if(x == null)
            throw new IllegalArgumentException("Posicao informada é invalida");
        return x.getDado();
    }
    public No<Dado> recuperarNo(int posicao){
        No<Dado> x = cabeca;
        for(int i = 0; i<posicao && x != null; i++){
            x = x.getProximo();
        }
        if(x == null)
            throw new IllegalArgumentException("Posicao informada é invalida");
        return x;
    }


    public Dado recuperarDado(Dado dado){
        No<Dado> x = cabeca;
        while(x != null){
            if(x.getDado().equals(dado))
                return x.getDado();
            x = x.getProximo();
        }
        return null;
    }
    public int recuperarPosicaoDado(Dado dado){
        No<Dado> x = cabeca;
        int posicao = 0;
        while(x != null){
            if(x.getDado().equals(dado))
                return posicao;
            x = x.getProximo();
            posicao++;
        }
        return -1;
    }

    public void excluir(Dado dado){
        No<Dado> x = cabeca;

        while(x != null){
            if(x.getProximo() != null && x.getProximo().getDado().equals(dado)){
                No<Dado> anterior = x;
                No<Dado> remover = x.getProximo();
                No<Dado> proximo = null;
                if(remover.getProximo() != null)
                    proximo = remover.getProximo();
                anterior.setProximo(proximo);
                remover.setProximo(null);
                tamanho--;
                return;
            }
        }
        throw new IllegalArgumentException("Dado informado não existe na lista");
    }

    public int getTamanho(){
        return tamanho;
    }

    public String toString(){
        String out = "Tamanho: "+getTamanho()+"\n";
        No<Dado> x = cabeca;
        int quantidade = 0;
        while (x != null){
            out+="Nó "+quantidade+" dado: "+x.getDado()+"\n";

            x = x.getProximo();
            quantidade++;
        }
        return out;
    }


}
