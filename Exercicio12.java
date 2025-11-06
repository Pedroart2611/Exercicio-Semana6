import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ex11 {
    public static void main(String[] args) {
        // Criar fila para pessoas
        Queue<String> filaPessoas = new LinkedList<>();

        // Criar pilha para malas
        Stack<String> pilhaMalas = new Stack<>();

        System.out.println("=== SISTEMA DE EMBARQUE ===");
        System.out.println("💺 Fila de Pessoas  |  🧳 Pilha de Malas");
        System.out.println();

        // Inicializar a fila de pessoas
        System.out.println("🏁 INICIALIZANDO SISTEMA:");
        filaPessoas.add("Pessoa 1");
        filaPessoas.add("Pessoa 2");
        filaPessoas.add("Pessoa 3");
        System.out.println("✅ Fila de pessoas criada: " + filaPessoas);

        // Inicializar a pilha de malas
        pilhaMalas.push("Mala A");
        pilhaMalas.push("Mala B");
        pilhaMalas.push("Mala C");
        System.out.println("✅ Pilha de malas criada: " + pilhaMalas);
        System.out.println();

        // Exibir situação inicial
        System.out.println("📊 SITUAÇÃO INICIAL:");
        System.out.println("Fila de pessoas: " + filaPessoas + " | Tamanho: " + filaPessoas.size());
        System.out.println("Pilha de malas: " + pilhaMalas + " | Tamanho: " + pilhaMalas.size());
        System.out.println("Próxima pessoa: " + filaPessoas.peek());
        System.out.println("Última mala: " + pilhaMalas.peek());
        System.out.println();

        // a) Atender 2 pessoas
        System.out.println("a) 🎫 ATENDENDO 2 PESSOAS");
        System.out.println();

        // Atender primeira pessoa
        System.out.println("--- Primeiro Atendimento ---");
        String pessoa1 = filaPessoas.poll();
        System.out.println("✅ Pessoa atendida: " + pessoa1);
        System.out.println("Fila atual: " + filaPessoas);
        System.out.println("Próxima pessoa: " + (filaPessoas.isEmpty() ? "Nenhuma" : filaPessoas.peek()));
        System.out.println();

        // Atender segunda pessoa
        System.out.println("--- Segundo Atendimento ---");
        String pessoa2 = filaPessoas.poll();
        System.out.println("✅ Pessoa atendida: " + pessoa2);
        System.out.println("Fila atual: " + filaPessoas);
        System.out.println("Próxima pessoa: " + (filaPessoas.isEmpty() ? "Nenhuma" : filaPessoas.peek()));
        System.out.println();

        // b) Guardar 2 malas
        System.out.println("b) 🧳 GUARDANDO 2 MALAS");
        System.out.println();

        // Guardar primeira mala
        System.out.println("--- Primeira Mala Guardada ---");
        String mala1 = pilhaMalas.pop();
        System.out.println("✅ Mala guardada: " + mala1);
        System.out.println("Pilha atual: " + pilhaMalas);
        System.out.println("Próxima mala: " + (pilhaMalas.isEmpty() ? "Nenhuma" : pilhaMalas.peek()));
        System.out.println();

        // Guardar segunda mala
        System.out.println("--- Segunda Mala Guardada ---");
        String mala2 = pilhaMalas.pop();
        System.out.println("✅ Mala guardada: " + mala2);
        System.out.println("Pilha atual: " + pilhaMalas);
        System.out.println("Próxima mala: " + (pilhaMalas.isEmpty() ? "Nenhuma" : pilhaMalas.peek()));
        System.out.println();

        // c) Exibir situação da fila e da pilha
        System.out.println("c) 📈 SITUAÇÃO FINAL");
        System.out.println();

        System.out.println("🎯 ESTADO ATUAL DO SISTEMA:");
        System.out.println("=================================");

        // Situação da fila de pessoas
        System.out.println("👥 FILA DE PESSOAS:");
        if (filaPessoas.isEmpty()) {
            System.out.println("   📭 Fila vazia - todas as pessoas foram atendidas");
        } else {
            System.out.println("   Conteúdo: " + filaPessoas);
            System.out.println("   Tamanho: " + filaPessoas.size() + " pessoa(s)");
            System.out.println("   Próxima: " + filaPessoas.peek());

            System.out.println("   Ordem de atendimento:");
            int posicao = 1;
            for (String pessoa : filaPessoas) {
                System.out.println("   " + posicao + "º - " + pessoa);
                posicao++;
            }
        }
        System.out.println();

        // Situação da pilha de malas
        System.out.println("🧳 PILHA DE MALAS:");
        if (pilhaMalas.isEmpty()) {
            System.out.println("   📭 Pilha vazia - todas as malas foram guardadas");
        } else {
            System.out.println("   Conteúdo: " + pilhaMalas);
            System.out.println("   Tamanho: " + pilhaMalas.size() + " mala(s)");
            System.out.println("   Próxima a guardar: " + pilhaMalas.peek());

            System.out.println("   Ordem de guardar (do topo para base):");
            for (int i = pilhaMalas.size() - 1; i >= 0; i--) {
                String indicador = (i == pilhaMalas.size() - 1) ? "← PRÓXIMA" : "";
                System.out.println("   " + (pilhaMalas.size() - i) + "º - " + pilhaMalas.get(i) + " " + indicador);
            }
        }
        System.out.println();

        // RELATÓRIO COMPARATIVO
        System.out.println("📋 RELATÓRIO COMPARATIVO");
        System.out.println("========================");

        System.out.println("✅ PESSOAS ATENDIDAS: " + pessoa1 + ", " + pessoa2);
        System.out.println("✅ MALAS GUARDADAS: " + mala1 + ", " + mala2);
        System.out.println();

        System.out.println("🔄 COMPORTAMENTO DEMONSTRADO:");
        System.out.println("Fila (FIFO): Primeira pessoa a chegar → Primeira a ser atendida");
        System.out.println("   " + pessoa1 + " (1ª na fila) → 1ª atendida");
        System.out.println("   " + pessoa2 + " (2ª na fila) → 2ª atendida");
        System.out.println();

        System.out.println("Pilha (LIFO): Última mala a chegar → Primeira a ser guardada");
        System.out.println("   " + mala1 + " (última a chegar) → 1ª guardada");
        System.out.println("   " + mala2 + " (penúltima a chegar) → 2ª guardada");
        System.out.println();

        System.out.println("🎯 PRÓXIMAS AÇÕES DISPONÍVEIS:");
        System.out.println("• Atender mais " + filaPessoas.size() + " pessoa(s)");
        System.out.println("• Guardar mais " + pilhaMalas.size() + " mala(s)");

        if (!filaPessoas.isEmpty()) {
            System.out.println("• Próxima pessoa na fila: " + filaPessoas.peek());
        }
        if (!pilhaMalas.isEmpty()) {
            System.out.println("• Próxima mala na pilha: " + pilhaMalas.peek());
        }
    }
}
