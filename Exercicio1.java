import java.util.LinkedList;

public class ex1 {
    public static void main(String[] args) {
        // Criar uma LinkedList para armazenar nomes de alunos
        LinkedList<String> alunos = new LinkedList<>();

        // a) Adicionar 5 nomes
        System.out.println("=== ADICIONANDO 5 NOMES ===");
        alunos.add("Ana Silva");
        alunos.add("Bruno Costa");
        alunos.add("Carla Santos");
        alunos.add("Daniel Oliveira");
        alunos.add("Eduarda Lima");

        System.out.println("Lista após adicionar 5 nomes: " + alunos);
        System.out.println();

        // b) Remover o primeiro nome da lista
        System.out.println("=== REMOVENDO O PRIMEIRO NOME ===");
        String primeiroRemovido = alunos.removeFirst();
        System.out.println("Nome removido: " + primeiroRemovido);
        System.out.println("Lista após remoção: " + alunos);
        System.out.println();

        // c) Exibir o último nome
        System.out.println("=== EXIBINDO O ÚLTIMO NOME ===");
        String ultimoNome = alunos.getLast();
        System.out.println("Último nome da lista: " + ultimoNome);
        System.out.println();

        // d) Exibir todos os nomes usando for-each
        System.out.println("=== EXIBINDO TODOS OS NOMES (FOR-EACH) ===");
        System.out.println("Lista completa de alunos:");
        for (String aluno : alunos) {
            System.out.println("• " + aluno);
        }

        // Informações adicionais da lista
        System.out.println();
        System.out.println("=== INFORMAÇÕES ADICIONAIS ===");
        System.out.println("Tamanho da lista: " + alunos.size());
        System.out.println("Primeiro elemento: " + alunos.getFirst());
        System.out.println("Lista está vazia? " + alunos.isEmpty());
    }
}
