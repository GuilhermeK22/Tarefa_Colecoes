import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TarefaColecoesP2{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String name;
        System.out.println("Insira o nome da pessoa");
        System.out.println("M se for do sexo Masculino e F se for do sexo Feminino");
        System.out.println("Seguido de traço - e após isso digitar virgula ,");
        System.out.println("Exemplo: Nome-M,Nome-F");

        name=scanner.next();

        String [] resultName = name.split(",");
        List<String> masculino = new ArrayList<String>();
        List<String> feminino = new ArrayList<String>();
        Arrays.sort(resultName);
        for (String names: resultName) {
            if(names.contains("-M")){
                masculino.add(names);
            } else if (names.contains("-F")) {
                feminino.add(names);
            }
        }
        System.out.println("Pessoas do gênero Masculino:" + masculino);
        System.out.println("Pessoas do gênero Feminino:" + feminino);
    }
}