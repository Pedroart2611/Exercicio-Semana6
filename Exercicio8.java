import java.util.Stack;

public class ex8 {
    public static void main(String[] args) {
        // Criar uma pilha de números inteiros
        Stack<Integer> pilha = new Stack<>();

        System.out.println("=== PILHA DE NÚMEROS ===");
        System.out.println();

        // 1. Empilhe os números: 2, 4, 6, 8, 10
        System.out.println("1) EMPILHANDO NÚMEROS");
        pilha.push(2);
        System.out.println("Empilhado: " + pilha.peek() + " | Pilha: " + pilha);

        pilha.push(4);
        System.out.println("Empilhado: " + pilha.peek() + " | Pilha: " + pilha);

        pilha.push(6);
        System.out.println("Empilhado: " + pilha.peek() + " | Pilha: " + pilha);

        pilha.push(8);
        System.out.println("Empilhado: " + pilha.peek() + " | Pilha: " + pilha);

        pilha.push(10);
        System.out.println("Empilhado: " + pilha.peek() + " | Pilha: " + pilha);

        System.out.println("\nPilha completa: " + pilha);
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Topo da pilha: " + pilha.peek());
        System.out.println();

        // 2. Desempilhe até sobrar apenas dois elementos
        System.out.println("2) DESEMPILHANDO ELEMENTOS");
        int elementosParaRemover = pilha.size() - 2;
        System.out.println("Precisamos remover " + elementosParaRemover + " elementos para deixar 2 na pilha");
        System.out.println();

        for (int i = 1; i <= elementosParaRemover; i++) {
            System.out.println("--- Desempilhamento " + i + " ---");
            int elementoRemovido = pilha.pop();
            System.out.println("Elemento removido: " + elementoRemovido);
            System.out.println("Pilha atual: " + pilha);
            System.out.println("Topo atual: " + (pilha.isEmpty() ? "Pilha vazia" : pilha.peek()));
            System.out.println("Elementos restantes: " + pilha.size());
            System.out.println();
        }

        // 3. Mostre o elemento do topo
        System.out.println("3) ELEMENTO DO TOPO");
        if (!pilha.isEmpty()) {
            int topo = pilha.peek();
            System.out.println("Elemento no topo da pilha: " + topo);
            System.out.println("Posição: último elemento empilhado que restou");
        } else {
            System.out.println("A pilha está vazia!");
        }
        System.out.println();

        // 4. Mostre o tamanho da pilha
        System.out.println("4) TAMANHO DA PILHA");
        int tamanho = pilha.size();
        System.out.println("Tamanho atual da pilha: " + tamanho + " elemento(s)");
        System.out.println();

        // RELATÓRIO FINAL
        System.out.println("=== RELATÓRIO FINAL ===");
        System.out.println("Pilha final: " + pilha);
        System.out.println("Estado da pilha: " + (pilha.isEmpty() ? "VAZIA" : "COM ELEMENTOS"));

        if (!pilha.isEmpty()) {
            System.out.println("\nELEMENTOS RESTANTES (da base ao topo):");
            for (int i = 0; i < pilha.size(); i++) {
                System.out.println("Posição " + i + ": " + pilha.get(i) +
                        (i == pilha.size() - 1 ? " ← TOPO" : ""));
            }
        }

        System.out.println("\n=== ANÁLISE LIFO ===");
        System.out.println("Ordem de empilhamento: 2 → 4 → 6 → 8 → 10");
        System.out.println("Ordem de desempilhamento: 10 ✓ → 8 ✓ → 6 ✓ → 4 → 2");
        System.out.println("Princípio LIFO comprovado: último a entrar é o primeiro a sair!");
    }
}