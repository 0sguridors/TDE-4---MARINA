public class Insert { //
    public static void main(String args[]) {
        Numeros numeros = new Numeros();
        int[] arr = numeros.getArray(1);
        sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
    public static void sort(int arr[]) {
            for (int i = 1; i < arr.length; i++) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
    }

