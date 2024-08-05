import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        Pilha pilha = new Pilha(lista);
        System.out.println(pilha.pop());
        System.out.println(pilha.push("Livro 1"));
        System.out.println(pilha.push("Livro 3"));
        System.out.println(pilha.push("Livro 2"));
        System.out.println(pilha.push("Livro 4"));
        System.out.println(pilha.show());
        System.out.println(pilha.pop());
        System.out.println(pilha.show());
    }
}

class Pilha {
    List<String> lista = new ArrayList<String>();

    public Pilha(List<String> lista) {
        this.lista = lista;
    }

    public String pop(){
        if(this.lista.isEmpty()){
            return "A pilha está vazia";
        }

        String ultimo_item = this.lista.get(lista.size() - 1);
        this.lista.remove(ultimo_item);
        return "Retirando "+ultimo_item;
    }

    public String push(String item){
        this.lista.add(item);
        return item + " foi adicionado ao topo da pilha";
    }

    public String show(){
        for (int i = this.lista.size() - 1; i >= 0; i--) {
            System.out.println("| " + this.lista.get(i) + " |");
        }
        return "Total de elementos na lista: " + this.lista.size();
    }

}
