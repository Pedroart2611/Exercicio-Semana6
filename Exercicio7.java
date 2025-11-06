import java.util.Stack;

public class wx7 {
    public static void main(String[] args) {
        // Criar uma pilha para simular navegação
        Stack<String> pilhaNavegacao = new Stack<>();

        System.out.println("=== SISTEMA DE NAVEGAÇÃO WEB ===");
        System.out.println();

        // a) Empilhe as páginas: "Home", "Produtos", "Carrinho", "Pagamento"
        System.out.println("a) NAVEGAÇÃO - ACESSANDO PÁGINAS");
        pilhaNavegacao.push("Home");
        System.out.println("Página acessada: " + pilhaNavegacao.peek());

        pilhaNavegacao.push("Produtos");
        System.out.println("Página acessada: " + pilhaNavegacao.peek());

        pilhaNavegacao.push("Carrinho");
        System.out.println("Página acessada: " + pilhaNavegacao.peek());

        pilhaNavegacao.push("Pagamento");
        System.out.println("Página acessada: " + pilhaNavegacao.peek());

        System.out.println("\nHistórico completo: " + pilhaNavegacao);
        System.out.println("Total de páginas no histórico: " + pilhaNavegacao.size());
        System.out.println();

        // b) Mostre a página atual (peek())
        System.out.println("b) PÁGINA ATUAL");
        String paginaAtual = pilhaNavegacao.peek();
        System.out.println("Você está na página: " + paginaAtual);
        System.out.println("Próximo botão 'Voltar' levará para: " +
                (pilhaNavegacao.size() > 1 ? pilhaNavegacao.get(pilhaNavegacao.size() - 2) : "Nenhuma"));
        System.out.println();

        // c) Volte duas páginas usando pop()
        System.out.println("c) NAVEGANDO PARA TRÁS");

        System.out.println("--- PRIMEIRO CLIQUE NO BOTÃO VOLTAR ---");
        String paginaVoltada1 = pilhaNavegacao.pop();
        System.out.println("Saindo da página: " + paginaVoltada1);
        System.out.println("Página atual: " + pilhaNavegacao.peek());
        System.out.println("Histórico atual: " + pilhaNavegacao);

        System.out.println("\n--- SEGUNDO CLIQUE NO BOTÃO VOLTAR ---");
        String paginaVoltada2 = pilhaNavegacao.pop();
        System.out.println("Saindo da página: " + paginaVoltada2);
        System.out.println("Página atual: " + pilhaNavegacao.peek());
        System.out.println("Histórico atual: " + pilhaNavegacao);
        System.out.println();

        // d) Exiba a pilha final
        System.out.println("d) SITUAÇÃO FINAL");
        System.out.println("Pilha final: " + pilhaNavegacao);
        System.out.println("Página atual: " + pilhaNavegacao.peek());
        System.out.println("Total de páginas no histórico: " + pilhaNavegacao.size());
        System.out.println();

        // RELATÓRIO COMPLETO
        System.out.println("=== RELATÓRIO DE NAVEGAÇÃO ===");
        System.out.println("Páginas visitadas e abandonadas: " + paginaVoltada2 + " ← " + paginaVoltada1);
        System.out.println("Páginas no histórico atual: " + pilhaNavegacao);

        System.out.println("\nHISTÓRICO DETALHADO (da base ao topo):");
        for (int i = 0; i < pilhaNavegacao.size(); i++) {
            System.out.println((i + 1) + "º - " + pilhaNavegacao.get(i));
        }

        System.out.println("\n=== INFORMAÇÕES TÉCNICAS ===");
        System.out.println("Próxima página no botão voltar: " +
                (pilhaNavegacao.size() > 1 ? pilhaNavegacao.get(pilhaNavegacao.size() - 2) : "Nenhuma"));
        System.out.println("Pilha vazia? " + pilhaNavegacao.isEmpty());
        System.out.println("Capacidade de voltar mais: " + (pilhaNavegacao.size() - 1) + " página(s)");
    }
}
