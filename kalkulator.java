import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numbers1, numbers2, choice, result= 0;
        System.out.println("-----------------------------");
        System.out.println("Kalkulator Sederhana");
        System.out.println("-----------------------------");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("-----------------------------");
 
        // input data
        System.out.print("Angka Pertama: ");
        numbers1 = input.nextInt();
        System.out.print("Angka Kedua: ");
        numbers2 = input.nextInt();
 
        // Pilihan Operasi
        System.out.print("Masukan Operasi: ");
        choice = input.nextInt();
 
        switch (choice)
        {
            case 1 : result = numbers1 + numbers2; break;
            case 2 : result = numbers1 - numbers2; break;
            case 3 : result = numbers1 / numbers2; break;
            case 4 : result = numbers1 * numbers2; break;
            default : System.out.println("Salah Memasukan Pilihan Harap Baca Pilihan di Menu");
        }
        System.out.println("Hasil: " + result);
        System.out.println("-----------------------------");
    }
}

