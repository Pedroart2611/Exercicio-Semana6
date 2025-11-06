import java.util.LinkedList;

public class ex2 {
    public static void main(String[] args) {
        // Criar uma LinkedList contendo os números: 10, 20, 30, 40, 50
        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        System.out.println("Lista original: " + numeros);
        System.out.println();

        // a) Insira o valor 5 no início
        System.out.println("=== INSERINDO VALOR NO INÍCIO ===");
        numeros.addFirst(5);  // Alternativa: numeros.push(5);
        System.out.println("Após adicionar 5 no início: " + numeros);
        System.out.println();

        // b) Insira o valor 60 no final
        System.out.println("=== INSERINDO VALOR NO FINAL ===");
        numeros.addLast(60);  // Alternativa: numeros.add(60);
        System.out.println("Após adicionar 60 no final: " + numeros);
        System.out.println();

        // c) Insira o valor 25 na posição 3
        System.out.println("=== INSERINDO VALOR NA POSIÇÃO 3 ===");
        System.out.println("Posições atuais: 0=" + numeros.get(0) +
                ", 1=" + numeros.get(1) +
                ", 2=" + numeros.get(2) +
                ", 3=" + numeros.get(3));

        numeros.add(3, 25);  // Insere na posição 3 (índice 3)
        System.out.println("Após adicionar 25 na posição 3: " + numeros);
        System.out.println("Agora na posição 3 temos: " + numeros.get(3));
        System.out.println();

        // d) Exiba a lista final
        System.out.println("=== LISTA FINAL ===");
        System.out.println("Lista completa: " + numeros);

        // Exibição detalhada
        System.out.println("\nLista detalhada:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Posição " + i + ": " + numeros.get(i));
        }

        // Informações adicionais
        System.out.println("\n=== INFORMAÇÕES DA LISTA ===");
        System.out.println("Tamanho da lista: " + numeros.size());
        System.out.println("Primeiro elemento: " + numeros.getFirst());
        System.out.println("Último elemento: " + numeros.getLast());
    }
}
