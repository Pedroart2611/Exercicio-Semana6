import java.util.LinkedList;

public class ex3 {
    public static void main(String[] args) {
        // Criar uma LinkedList<String>
        LinkedList<String> linguagens = new LinkedList<>();

        System.out.println("=== ADICIONANDO ELEMENTOS ===");
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C++");
        linguagens.add("Java");
        linguagens.add("Go");

        System.out.println("Lista original: " + linguagens);
        System.out.println("Tamanho: " + linguagens.size());
        System.out.println();


        System.out.println("=== REMOVENDO PRIMEIRA OCORRÊNCIA DE 'Java' ===");
        boolean removidoJava = linguagens.removeFirstOccurrence("Java");
        System.out.println("Elemento 'Java' removido? " + removidoJava);
        System.out.println("Lista após remoção: " + linguagens);
        System.out.println();

        System.out.println("=== REMOVENDO ELEMENTO 'C++' ===");
        boolean removidoCpp = linguagens.remove("C++");
        System.out.println("Elemento 'C++' removido? " + removidoCpp);
        System.out.println("Lista após remoção: " + linguagens);
        System.out.println();


        System.out.println("=== RESULTADO FINAL ===");
        System.out.println("Lista final: " + linguagens);
        System.out.println("Tamanho final: " + linguagens.size());


        System.out.println("\nElementos restantes:");
        for (int i = 0; i < linguagens.size(); i++) {
            System.out.println("Posição " + i + ": " + linguagens.get(i));
        }


        System.out.println("\n=== VERIFICAÇÕES ===");
        System.out.println("Contém 'Java'? " + linguagens.contains("Java"));
        System.out.println("Contém 'Python'? " + linguagens.contains("Python"));
        System.out.println("Contém 'C++'? " + linguagens.contains("C++"));
        System.out.println("Primeiro elemento: " + linguagens.getFirst());
        System.out.println("Último elemento: " + linguagens.getLast());
    }
}
