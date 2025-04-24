package list.OperacoesBasicas.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    private List<Tarefa> tarefalist;

    public ListaDeTarefas() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefalist.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: tarefalist) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefalist.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefalist.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefalist);;
    }
}
