import java.util.LinkedList;
import java.util.Queue;

public class ex6 {
    public static void main(String[] args) {
        // Criar uma fila normal de pacientes
        Queue<String> pacientes = new LinkedList<>();

        System.out.println("=== SISTEMA DE ATENDIMENTO MÉDICO ===");
        System.out.println();

        // Adicionar pacientes iniciais
        System.out.println("FILA INICIAL DE PACIENTES:");
        pacientes.add("Lucas");
        pacientes.add("Bruna");
        pacientes.add("José");
        pacientes.add("Ana");

        System.out.println("Fila atual: " + pacientes);
        System.out.println("Total de pacientes: " + pacientes.size());
        System.out.println("Próximo a ser atendido: " + pacientes.peek());
        System.out.println();

        // a) Adicionar "Maria" no final
        System.out.println("a) NOVA CHEGADA NA FILA");
        pacientes.add("Maria");
        System.out.println("Paciente adicionado: Maria");
        System.out.println("Fila atualizada: " + pacientes);
        System.out.println("Ordem completa: Lucas → Bruna → José → Ana → Maria");
        System.out.println("Total de pacientes agora: " + pacientes.size());
        System.out.println();

        // b) Atender 3 pacientes com poll()
        System.out.println("b) ATENDIMENTO DE PACIENTES");

        // Primeiro atendimento
        System.out.println("--- 1º ATENDIMENTO ---");
        String paciente1 = pacientes.poll();
        System.out.println("Paciente atendido: " + paciente1);
        System.out.println("Fila após atendimento: " + pacientes);
        System.out.println("Próximo na fila: " + pacientes.peek());
        System.out.println();

        // Segundo atendimento
        System.out.println("--- 2º ATENDIMENTO ---");
        String paciente2 = pacientes.poll();
        System.out.println("Paciente atendido: " + paciente2);
        System.out.println("Fila após atendimento: " + pacientes);
        System.out.println("Próximo na fila: " + pacientes.peek());
        System.out.println();

        // Terceiro atendimento
        System.out.println("--- 3º ATENDIMENTO ---");
        String paciente3 = pacientes.poll();
        System.out.println("Paciente atendido: " + paciente3);
        System.out.println("Fila após atendimento: " + pacientes);
        System.out.println("Próximo na fila: " + pacientes.peek());
        System.out.println();

        // c) Mostrar quem será o próximo a ser atendido
        System.out.println("c) PRÓXIMO PACIENTE A SER ATENDIDO");
        String proximoPaciente = pacientes.peek();
        System.out.println("Próximo a ser chamado: " + proximoPaciente);
        System.out.println();

        // d) Exibir os pacientes restantes
        System.out.println("d) PACIENTES RESTANTES NA FILA");
        System.out.println("Fila final: " + pacientes);
        System.out.println("Quantidade restante: " + pacientes.size());
        System.out.println();

        // RELATÓRIO COMPLETO
        System.out.println("=== RELATÓRIO DE ATENDIMENTO ===");
        System.out.println("Pacientes já atendidos: " + paciente1 + ", " + paciente2 + ", " + paciente3);
        System.out.println("Pacientes aguardando: " + pacientes.size());

        if (!pacientes.isEmpty()) {
            System.out.println("\nORDEM DE ATENDIMENTO RESTANTE:");
            int posicao = 1;
            // Criar uma cópia para não afetar a fila original
            Queue<String> copiaFila = new LinkedList<>(pacientes);
            while (!copiaFila.isEmpty()) {
                System.out.println(posicao + "º - " + copiaFila.poll());
                posicao++;
            }
        }

        System.out.println("\n=== INFORMAÇÕES DO SISTEMA ===");
        System.out.println("Fila está vazia? " + pacientes.isEmpty());
        System.out.println("Próximo paciente (peek): " + pacientes.peek());
        System.out.println("Total atendido nesta sessão: 3 pacientes");
        System.out.println("Total restante: " + pacientes.size() + " pacientes");
    }
}