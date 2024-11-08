public class Numeros {
    public int[] aleatorio1 = {5, 2, 9, 1, 5, 6};
    public int[] aleatorio2 = {3, 4, 2, 8, 6, 1};
    public int[] aleatorio3 = {7, 9, 3, 1, 4, 2, 3};
    public int[] crescente1 = {1, 2, 3, 4, 5, 6};
    public int[] crescente2 = {10, 20, 30, 40, 50, 60};
    public int[] crescente3 = {100, 200, 300, 400, 500};
    public int[] decrescente1 = {6, 5, 4, 3, 2, 1};
    public int[] decrescente2 = {60, 50, 40, 30, 20, 10};
    public int[] decrescente3 = {500, 400, 300, 200, 100};

    public int[] getArray(int index) {
        switch (index) {
            case 1: return aleatorio1;
            case 2: return aleatorio2;
            case 3: return aleatorio3;
            case 4: return crescente1;
            case 5: return crescente2;
            case 6: return crescente3;
            case 7: return decrescente1;
            case 8: return decrescente2;
            case 9: return decrescente3;
            default: return null;
        }
    }
}