package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> conjuntoDePalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoDePalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoDePalavras.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        Palavra palavraParaRemover = null;
      if (!conjuntoDePalavras.isEmpty()){
          for (Palavra p:conjuntoDePalavras) {
              if(p.getPalavra() == palavra){
                  palavraParaRemover = p;
                  break;
              }
          }
      }
        conjuntoDePalavras.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra){
        Palavra palavraParaVerificacao = null;
        if (!conjuntoDePalavras.isEmpty()){
            for (Palavra p:conjuntoDePalavras) {
                if(p.getPalavra() == palavra){
                    System.out.println("A Palavra está no conjunto");
                    break;
                }
            }
        }
    }

    public void exibirConvidados(){
        System.out.println(conjuntoDePalavras);
    }


}
