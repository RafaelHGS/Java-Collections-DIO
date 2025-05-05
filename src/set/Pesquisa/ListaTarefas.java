package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaDeTarefas;

    public ListaTarefas() {
        this.listaDeTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!listaDeTarefas.isEmpty()){
            for(Tarefa t: listaDeTarefas){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                }
            }
            listaDeTarefas.remove(tarefaParaRemover);
        }
    }

    public void exibirTarefas(){
        System.out.println(listaDeTarefas);
    }

    public void contarTarefas(){
        System.out.println("Quantidade de tarefas: " + listaDeTarefas.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!listaDeTarefas.isEmpty()){
            for(Tarefa t: listaDeTarefas){
                if (t.isTarefaConcluida()){
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!listaDeTarefas.isEmpty()){
            for(Tarefa t: listaDeTarefas){
                if (!t.isTarefaConcluida()){
                    tarefasPendentes.add(t);
                }
            }
        }
        return tarefasPendentes;
    }


    public void marcarTarefaConcluida(String descricao){
        if(!listaDeTarefas.isEmpty()){
            for(Tarefa t: listaDeTarefas){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    if(t.isTarefaConcluida()){
                        System.out.println("Tarefa Já marcada como Concluída");
                    }
                    t.setTarefaConcluida(true);
                    break;
                }
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        if(!listaDeTarefas.isEmpty()){
            for(Tarefa t: listaDeTarefas){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    if(!t.isTarefaConcluida()){
                        System.out.println("Tarefa Já marcada como Pendente");
                    }
                    t.setTarefaConcluida(false);
                    break;
                }
            }
        }
    }

    public void limparListaTarefas(){
        listaDeTarefas.clear();
        System.out.println("Tarefas removidas");
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        // Adicionar tarefas
        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Fazer exercícios físicos");
        lista.adicionarTarefa("Ler um livro");

        // Exibir tarefas
        System.out.println("\nTarefas cadastradas:");
        lista.exibirTarefas();

        // Marcar uma tarefa como concluída
        lista.marcarTarefaConcluida("Estudar Java");

        // Obter tarefas concluídas
        System.out.println("\nTarefas concluídas:");
        System.out.println(lista.obterTarefasConcluidas());

        // Obter tarefas pendentes
        System.out.println("\nTarefas pendentes:");
        System.out.println(lista.obterTarefasPendentes());

        // Contar tarefas
        lista.contarTarefas();

        // Remover tarefa
        lista.removerTarefa("Ler um livro");
        System.out.println("\nApós remover 'Ler um livro':");
        lista.exibirTarefas();

        // Marcar como pendente novamente
        lista.marcarTarefaPendente("Estudar Java");

        // Limpar todas as tarefas
        lista.limparListaTarefas();
        lista.exibirTarefas();
    }


}
