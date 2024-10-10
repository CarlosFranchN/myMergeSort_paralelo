import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class App {
    public static void main(String[] args) throws Exception {
        ForkJoinPool pool = new ForkJoinPool();
        // int[] arr = {38, 27, 43, 3, 9, 82, 10}; // Array de exemplo
        int[]
        int n = arr.length;

        MergeSort_paralelo task = new MergeSort_paralelo(arr, 0, n-1);
        pool.invoke(task);
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(MergeSort_paralelo.get_Time());
    }
        public static int[] gerarArrayAleatorio(int N) {
        Random random = new Random();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(100);  // Gera números aleatórios de 0 a 99
        }

        return array;
    }

}
