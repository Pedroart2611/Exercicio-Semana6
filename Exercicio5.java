import java.util.LinkedList;
import java.util.Queue;

public class wx5 {
    public static void main(String[] args) {
        // Criar uma fila de pedidos
        Queue<String> pedidos = new LinkedList<>();

        System.out.println("=== CONTROLE DE PEDIDOS ===");
        System.out.println();

        // Adicionar os pedidos iniciais
        System.out.println("PEDIDOS INICIAIS:");
        pedidos.add("Pedido #1");
        pedidos.add("Pedido #2");
        pedidos.add("Pedido #3");

        System.out.println("Fila de pedidos: " + pedidos);
        System.out.println("Tamanho inicial: " + pedidos.size());
        System.out.println();

        // a) Adicione o "Pedido #4"
        System.out.println("a) ADICIONANDO NOVO PEDIDO");
        pedidos.add("Pedido #4");
        System.out.println("Pedido adicionado: Pedido #4");
        System.out.println("Fila atualizada: " + pedidos);
        System.out.println("Próximo pedido a ser atendido: " + pedidos.peek());
        System.out.println();

        // b) Atenda dois pedidos
        System.out.println("b) ATENDENDO DOIS PEDIDOS");

        // Primeiro pedido atendido
        String primeiroAtendido = pedidos.poll();
        System.out.println("1º pedido atendido: " + primeiroAtendido);
        System.out.println("Fila após primeiro atendimento: " + pedidos);
        System.out.println("Próximo pedido: " + pedidos.peek());
        System.out.println();

        // Segundo pedido atendido
        String segundoAtendido = pedidos.poll();
        System.out.println("2º pedido atendido: " + segundoAtendido);
        System.out.println("Fila após segundo atendimento: " + pedidos);
        System.out.println("Próximo pedido: " + pedidos.peek());
        System.out.println();

        // c) Mostre o tamanho da fila
        System.out.println("c) TAMANHO DA FILA");
        System.out.println("Quantidade de pedidos na fila: " + pedidos.size());
        System.out.println();

        // d) Informe se a fila está vazia
        System.out.println("d) STATUS DA FILA");
        boolean filaVazia = pedidos.isEmpty();
        System.out.println("A fila está vazia? " + filaVazia);
        System.out.println();

        // RELATÓRIO FINAL
        System.out.println("=== RELATÓRIO FINAL ===");
        System.out.println("Pedidos atendidos: " + primeiroAtendido + ", " + segundoAtendido);
        System.out.println("Pedidos pendentes: " + pedidos);

        if (!pedidos.isEmpty()) {
            System.out.println("\nPEDIDOS PENDENTES - ORDEM DE ATENDIMENTO:");
            int ordem = 1;
            for (String pedido : pedidos) {
                System.out.println(ordem + "º - " + pedido);
                ordem++;
            }
        } else {
            System.out.println("\n✓ Todos os pedidos foram atendidos!");
        }

        // Demonstração de métodos adicionais
        System.out.println("\n=== INFORMAÇÕES ADICIONAIS ===");
        System.out.println("Próximo pedido (peek): " + pedidos.peek());
        System.out.println("Próximo pedido (element): " + (pedidos.isEmpty() ? "Fila vazia" : pedidos.element()));
    }
}