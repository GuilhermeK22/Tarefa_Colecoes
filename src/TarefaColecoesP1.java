import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TarefaColecoesP1 {

    public static void main(String args[]) {
        TarefaParte1();
    }
    private static void TarefaParte1() {
        System.out.println("****** Tarefa Coleções Parte 1 ******");
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("Pedro Carlos");
        lista.add("Mateus Pinto");
        lista.add("Ana Banana");
        lista.add("Sabrina Sato");
        lista.add("Guto Pimenta");
        lista.add("Ricardo da Silva");
        lista.add("Maria Sousa");
        lista.add("Diego Ferreira");
        lista.add("Renata Carlos");
        lista.add("Sabino Pinto");
        lista.add("Vera Banana");
        lista.add("Rui Sato");
        lista.add("Carla Pimenta");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}