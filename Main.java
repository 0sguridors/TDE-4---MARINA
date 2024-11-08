import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = readCsvFile("aleatorio_10000.csv");

        if (arr == null || arr.length == 0) {
            System.out.println("Array vazio ou inválido.");
            return;
        }

        System.out.println("Escolha tipo de ordenação:");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Insertion Sort");
        System.out.println("3 - Quick Sort");
        int choiceAlgorithm = scanner.nextInt();

        switch (choiceAlgorithm) {
            case 1:
                System.out.println("Ordenando com Bubble Sort:");
                medirTempo(() -> Bubble.sort(arr));
                break;
            case 2:
                System.out.println("Ordenando com Insertion Sort:");
                medirTempo(() -> Insert.sort(arr));
                break;
            case 3:
                System.out.println("Ordenando com Quick Sort:");
                medirTempo(() -> Quick.sort(arr));
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }
        
        System.out.println("Lista ordenada:");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    public static void medirTempo(Runnable algoritmo) {
        long inicio = System.nanoTime(); 

        algoritmo.run();

        long fim = System.nanoTime();

        long tempoExecucao = fim - inicio;
        System.out.println("Tempo de execução: " + tempoExecucao + " nanosegundos.");
    }

    public static int[] readCsvFile(String fileName) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                for (String dado : dados) {
                    try {
                        numbers.add(Integer.parseInt(dado.trim()));
                    } catch (NumberFormatException e) {
                        System.out.println("Erro : " + dado);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro : " + e.getMessage());
        }

        int[] arr = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            arr[i] = numbers.get(i);
        }
        return arr;
    }
}
