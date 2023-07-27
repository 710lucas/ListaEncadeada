package org.example;

public class No<Dado> {

   private No<Dado> proximo = null;
   private Dado dado;

   public No(Dado dado){
      this.dado = dado;
    }

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }

    public No<Dado> getProximo() {
        return proximo;
    }

    public void setProximo(No<Dado> proximo) {
        this.proximo = proximo;
    }
}
