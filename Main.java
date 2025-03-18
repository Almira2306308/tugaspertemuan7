package stopwatch;
import java.util.Random;;

public class Main {
    //method selection sort
    static void selectionSort(int[] angka){
        int panjang = angka.length;
        int temp = 0;

        for(int i = 0; i < panjang - 1; i++){
            int min = i;

            //mengecek angka
            for(int j = i + 1; j < panjang; j++){
                if(angka[j] < angka[min]){
                    min = j;
                }
            }

            //menukar angka
            temp = angka[min];
            angka[min] = angka[i];
            angka[i] = temp;
        }
    }

    public static void main(String[] args) {
        //array untuk 100.000 angka acak
        int banyak = 100000;
        int[] angka = new int[banyak];
        Random pengacak = new Random();

        //menambahkan angka acak antara 0 - 999.999
        for(int i = 0; i < banyak; i++){
            angka[i] = pengacak.nextInt(1000000);
        }

        //melakukan perhitungan
        StopWatch stopWatch = new StopWatch();

        //memulai stopwatch -> menampilkan waktu dalam milidetik sejak 1 Januari 1970
        stopWatch.start();

        //melakukan pengurutan
        selectionSort(angka);

        //menghentikan stopwatch
        stopWatch.stop();

        System.out.println("\nTotal waktu eksekusi: " + stopWatch.getElapsedTime() + " milidetik");
    }
}
