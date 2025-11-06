import java.util.LinkedList;
import java.util.Queue;

public class ex4 {
    public static void main(String[] args) {
        // Criar uma fila usando Queue e LinkedList
        Queue<String> fila = new LinkedList<>();

        System.out.println("=== SIMULAÇÃO DE FILA DE ATENDIMENTO ===");
        System.out.println();

        // a) Adicione 4 pessoas à fila
        System.out.println("a) ADICIONANDO PESSOAS À FILA");
        fila.add("Maria");
        fila.add("João");
        fila.add("Ana");
        fila.add("Carlos");

        System.out.println("Pessoas adicionadas: Maria, João, Ana, Carlos");
        System.out.println("Fila atual: " + fila);
        System.out.println("Tamanho da fila: " + fila.size());
        System.out.println();

        // b) Mostre quem é o próximo da fila (peek)
        System.out.println("b) PRÓXIMO DA FILA");
        String proximo = fila.peek();
        System.out.println("Próximo a ser atendido: " + proximo);
        System.out.println("Fila permanece: " + fila);
        System.out.println();

        // c) Atenda 2 pessoas usando poll()
        System.out.println("c) ATENDENDO 2 PESSOAS");

        // Primeiro atendimento
        String primeiraAtendida = fila.poll();
        System.out.println("1ª pessoa atendida: " + primeiraAtendida);
        System.out.println("Fila após primeiro atendimento: " + fila);

        // Segundo atendimento
        String segundaAtendida = fila.poll();
        System.out.println("2ª pessoa atendida: " + segundaAtendida);
        System.out.println("Fila após segundo atendimento: " + fila);
        System.out.println();

        // d) Exiba a fila restante
        System.out.println("d) FILA RESTANTE");
        System.out.println("Fila final: " + fila);
        System.out.println("Pessoas ainda na fila: " + fila.size());

        if (!fila.isEmpty()) {
            System.out.println("Próximo a ser atendido: " + fila.peek());
        }

        // Detalhamento da fila restante
        System.out.println("\n=== DETALHES DA FILA RESTANTE ===");
        if (fila.isEmpty()) {
            System.out.println("Fila vazia! Todos foram atendidos.");
        } else {
            System.out.println("Ordem de atendimento restante:");
            int posicao = 1;
            for (String pessoa : fila) {
                System.out.println(posicao + "º - " + pessoa);
                posicao++;
            }
        }
    }
}
