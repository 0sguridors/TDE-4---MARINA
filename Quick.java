public class Quick {

    public static void sort(int[] valores) {
        quickSort(valores, 0, valores.length - 1);
    }

    private static void quickSort(int[] valores, int esquerda, int direita) {
        if (esquerda < direita) {
            int pivotIndex = particionar(valores, esquerda, direita);
            quickSort(valores, esquerda, pivotIndex - 1);
            quickSort(valores, pivotIndex + 1, direita);
        }
    }

    private static int particionar(int[] valores, int esquerda, int direita) {
        int pivot = valores[esquerda];
        int i = esquerda + 1; 
w
        for (int j = esquerda + 1; j <= direita; j++) { 
            if (valores[j] <= pivot) {
                swap(valores, i, j);
                i++;
        
            }
        }

        swap(valores, esquerda, i - 1); 
        return i - 1; 
    }

    private static void swap(int[] valores, int i, int j) {
        int temp = valores[i];
        valores[i] = valores[j];
        valores[j] = temp;
    }
}
