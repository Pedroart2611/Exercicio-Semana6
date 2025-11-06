import java.util.Stack;

public class ex10 {
    public static void main(String[] args) {
        // Criar uma pilha para armazenar as operações de edição
        Stack<String> historicoOperacoes = new Stack<>();

        System.out.println("=== SISTEMA DE EDIÇÃO DE TEXTO COM DESFAZER ===");
        System.out.println();

        // a) Simule as operações: "Digitar A", "Digitar B", "Digitar C"
        System.out.println("a) REGISTRANDO OPERAÇÕES DE EDIÇÃO");
        System.out.println();

        // Operação 1: Digitar A
        historicoOperacoes.push("Digitar 'A'");
        System.out.println("✓ Operação realizada: Digitar 'A'");
        System.out.println("  Texto atual: A");
        System.out.println("  Histórico: " + historicoOperacoes);
        System.out.println("  Operações salvas: " + historicoOperacoes.size());
        System.out.println();

        // Operação 2: Digitar B
        historicoOperacoes.push("Digitar 'B'");
        System.out.println("✓ Operação realizada: Digitar 'B'");
        System.out.println("  Texto atual: AB");
        System.out.println("  Histórico: " + historicoOperacoes);
        System.out.println("  Operações salvas: " + historicoOperacoes.size());
        System.out.println();

        // Operação 3: Digitar C
        historicoOperacoes.push("Digitar 'C'");
        System.out.println("✓ Operação realizada: Digitar 'C'");
        System.out.println("  Texto atual: ABC");
        System.out.println("  Histórico: " + historicoOperacoes);
        System.out.println("  Operações salvas: " + historicoOperacoes.size());
        System.out.println();

        // Resumo do estado atual
        System.out.println("📝 ESTADO ATUAL DO EDITOR:");
        System.out.println("Texto: ABC");
        System.out.println("Última operação: " + historicoOperacoes.peek());
        System.out.println("Total de operações no histórico: " + historicoOperacoes.size());
        System.out.println("Operações disponíveis para desfazer: " + historicoOperacoes.size());
        System.out.println();

        // b) Realize 1 operação "desfazer" usando pop()
        System.out.println("b) EXECUTANDO OPERAÇÃO 'DESFAZER'");
        System.out.println();

        if (!historicoOperacoes.isEmpty()) {
            String operacaoDesfeita = historicoOperacoes.pop();
            System.out.println("🔄 Operação desfeita: " + operacaoDesfeita);

            // Simular o efeito no texto
            String textoAtual = "ABC";
            if (operacaoDesfeita.equals("Digitar 'C'")) {
                textoAtual = "AB";
            } else if (operacaoDesfeita.equals("Digitar 'B'")) {
                textoAtual = "A";
            } else if (operacaoDesfeita.equals("Digitar 'A'")) {
                textoAtual = "";
            }

            System.out.println("  Texto atual: " + textoAtual);
            System.out.println("  Histórico após desfazer: " + historicoOperacoes);
            System.out.println("  Operações restantes: " + historicoOperacoes.size());
            System.out.println("  Próxima operação no histórico: " +
                    (historicoOperacoes.isEmpty() ? "Nenhuma" : historicoOperacoes.peek()));
        } else {
            System.out.println("❌ Nada para desfazer! Histórico vazio.");
        }
        System.out.println();

        // c) Exiba o que ainda está na pilha
        System.out.println("c) HISTÓRICO RESTANTE");
        System.out.println();

        if (historicoOperacoes.isEmpty()) {
            System.out.println("📭 O histórico está vazio");
            System.out.println("Não há mais operações para desfazer");
        } else {
            System.out.println("📋 Operações ainda no histórico: " + historicoOperacoes.size());
            System.out.println("Conteúdo da pilha: " + historicoOperacoes);
            System.out.println();

            System.out.println("📊 DETALHAMENTO DO HISTÓRICO (da mais antiga para a mais recente):");
            for (int i = 0; i < historicoOperacoes.size(); i++) {
                String status = (i == historicoOperacoes.size() - 1) ? "← PRÓXIMA A DESFAZER" : "";
                System.out.println("  " + (i + 1) + ". " + historicoOperacoes.get(i) + " " + status);
            }

            System.out.println();
            System.out.println("🎯 Próxima operação disponível para desfazer: " + historicoOperacoes.peek());
        }

        // RELATÓRIO FINAL
        System.out.println();
        System.out.println("=== RELATÓRIO DO SISTEMA ===");
        System.out.println("Total de operações realizadas: 3");
        System.out.println("Operações desfeitas: 1");
        System.out.println("Operações no histórico atual: " + historicoOperacoes.size());
        System.out.println("Capacidade de desfazer adicional: " + historicoOperacoes.size() + " operação(ões)");

        // Demonstração do fluxo LIFO
        System.out.println();
        System.out.println("=== FLUXO LIFO APLICADO ===");
        System.out.println("Ordem das operações:");
        System.out.println("1. Digitar 'A' → Histórico: [Digitar 'A']");
        System.out.println("2. Digitar 'B' → Histórico: [Digitar 'A', Digitar 'B']");
        System.out.println("3. Digitar 'C' → Histórico: [Digitar 'A', Digitar 'B', Digitar 'C']");
        System.out.println("4. DESFAZER → Remove: 'Digitar C' ← (ÚLTIMO a entrar)");
        System.out.println("5. Histórico final: [Digitar 'A', Digitar 'B']");
        System.out.println();
        System.out.println("✅ Princípio LIFO: Última operação a entrar é a primeira a ser desfeita!");
    }
}