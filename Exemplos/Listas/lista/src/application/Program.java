package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Adalberto");
        list.add("Joao");
        list.add("Vasco");
        list.add("Carla");
        list.add("Anna");
        list.add("Joana");
        list.add("Marco");
        list.add(2, "Palito"); /*Adiciona elemento no index desejado */ 

        System.out.println(list.size()); /*Mostra o tamanho da lista */

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("--------------------------");
        list.remove(7); /*Remove por index, comparação */
        list.removeIf(x -> x.charAt(0) == 'M'); /*Remove por predicado */

         for (String x : list) {
            System.out.println(x);
        }
        System.out.println("--------------------------");

        System.out.println("Index do Vasco: " + list.indexOf("Vasco"));
        System.out.println("Index do Marco: " + list.indexOf("Marco"));
        /*Quando o indexOf nao encontra o elemento ele retornara -1 */
        System.out.println("--------------------------");

        List<String> resultado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        /*Esse comando acima cria uma nova lista e adiciona nela  seu filtro pretendido */
        for (String x : resultado) {
            System.out.println(x);
        }
        System.out.println("--------------------------");

        String nome = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        /*Encontra o primeiro elemento de acordo com a função lambda, caso nao encontre retorna nulo */
        System.out.println(nome);

    }

}
