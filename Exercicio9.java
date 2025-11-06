import java.util.Stack;

public class ex9 {
    public static void main(String[] args) {
        // Array original
        int[] arrayOriginal = {7, 14, 21, 28};

        System.out.println("=== VERIFICAÇÃO DE SEQUÊNCIA INVERTIDA ===");
        System.out.println();

        // Mostrar array original
        System.out.println("ARRAY ORIGINAL:");
        System.out.print("{ ");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.print(arrayOriginal[i]);
            if (i < arrayOriginal.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
        System.out.println("Tamanho do array: " + arrayOriginal.length);
        System.out.println("Ordem: índice 0 → índice " + (arrayOriginal.length - 1));
        System.out.println();

        // Criar a pilha
        Stack<Integer> pilha = new Stack<>();

        // a) Empilhar todos os elementos
        System.out.println("a) EMPILHANDO ELEMENTOS DO ARRAY");
        System.out.println("Processo de empilhamento (push):");

        for (int i = 0; i < arrayOriginal.length; i++) {
            int elemento = arrayOriginal[i];
            pilha.push(elemento);
            System.out.println("Empilhando array[" + i + "] = " + elemento +
                    " | Pilha: " + pilha +
                    " | Topo: " + pilha.peek());
        }

        System.out.println("\n✅ Todos os elementos foram empilhados!");
        System.out.println("Pilha completa: " + pilha);
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Elemento no topo: " + pilha.peek());
        System.out.println();

        // b) Desempilhar (exibir cada remoção)
        System.out.println("b) DESEMPILHANDO ELEMENTOS");
        System.out.println("Processo de desempilhamento (pop):");
        System.out.println();

        // Array para armazenar a sequência invertida
        int[] sequenciaInvertida = new int[arrayOriginal.length];
        int indice = 0;

        while (!pilha.isEmpty()) {
            System.out.println("--- Desempilhamento " + (indice + 1) + " ---");
            System.out.println("Estado anterior da pilha: " + pilha);
            System.out.println("Elemento no topo: " + pilha.peek());

            int elementoRemovido = pilha.pop();
            sequenciaInvertida[indice] = elementoRemovido;

            System.out.println("Elemento removido: " + elementoRemovido);
            System.out.println("Pilha após remoção: " + pilha);
            System.out.println("Próximo topo: " + (!pilha.isEmpty() ? pilha.peek() : "Pilha vazia"));
            System.out.println("Elementos restantes: " + pilha.size());
            System.out.println();

            indice++;
        }

        // c) Verificar que a ordem agora é invertida
        System.out.println("c) VERIFICAÇÃO DA ORDEM INVERTIDA");
        System.out.println();

        System.out.println("📊 COMPARAÇÃO DAS SEQUÊNCIAS:");
        System.out.println();

        System.out.println("SEQUÊNCIA ORIGINAL:");
        System.out.print("Índices:  ");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.printf("%-4d", i);
        }
        System.out.println();

        System.out.print("Valores:  ");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.printf("%-4d", arrayOriginal[i]);
        }
        System.out.println();

        System.out.println("\nSEQUÊNCIA INVERTIDA:");
        System.out.print("Índices:  ");
        for (int i = 0; i < sequenciaInvertida.length; i++) {
            System.out.printf("%-4d", i);
        }
        System.out.println();

        System.out.print("Valores:  ");
        for (int i = 0; i < sequenciaInvertida.length; i++) {
            System.out.printf("%-4d", sequenciaInvertida[i]);
        }
        System.out.println();

        // Demonstração visual da inversão
        System.out.println("\n🔄 PROCESSO DE INVERSÃO:");
        System.out.println("Original:   7  →  14  →  21  →  28");
        System.out.println("Empilhado:  7  →  14  →  21  →  28  (na pilha)");
        System.out.println("Desempilhado:  28  ←  21  ←  14  ←  7  (da pilha)");
        System.out.println("Resultado:  28  →  21  →  14  →  7");

        // Verificação matemática
        System.out.println("\n✅ VERIFICAÇÃO MATEMÁTICA:");
        boolean inversaoCorreta = true;
        for (int i = 0; i < arrayOriginal.length; i++) {
            int original = arrayOriginal[i];
            int invertido = sequenciaInvertida[arrayOriginal.length - 1 - i];
            boolean correto = (original == invertido);
            System.out.println("array[" + i + "] = " + original +
                    " ↔ sequenciaInvertida[" + (arrayOriginal.length - 1 - i) + "] = " + invertido +
                    " → " + (correto ? "✓ CORRETO" : "✗ ERRADO"));
            if (!correto) {
                inversaoCorreta = false;
            }
        }

        System.out.println("\n🎯 CONCLUSÃO:");
        if (inversaoCorreta) {
            System.out.println("✓ A pilha inverteu perfeitamente a sequência!");
            System.out.println("✓ Princípio LIFO comprovado: Último a entrar → Primeiro a sair");
        } else {
            System.out.println("✗ Houve um erro na inversão da sequência");
        }

        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println("Pilha: " + pilha + (pilha.isEmpty() ? " (VAZIA)" : ""));
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Pilha está vazia? " + pilha.isEmpty());
    }
}