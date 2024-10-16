public class Main {

    public static void main(String[] args) {
        // Imprimir uma palavra no console
        // Quando o utilizador rodar esse programa um nome irá aparecer na tela

        // imprima uma frase
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(elemento(array, -1));
        System.out.println(elemento(array, 2));

        System.out.println("-------------------");
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4, 5};

        System.out.println(areEqual(a, b));
    }

    public static boolean areEqual(int a[], int b[]) {
        int i = 0;
        while (i < a.length) {
            if (a[i] != b[i]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int elemento(int[] array, int posicao) {

        if (posicao >= 0) {
            return array[posicao];
        } else {
            int novaPosicao = posicao + array.length;
            return array[novaPosicao];
        }
    }
}
