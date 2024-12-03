import java.util.Scanner;

public class GajiTotalKaryawan {
    public static void main(String[] args) throws Exception {

        int[] gajiPokok = {5000000, 6500000, 9500000};
        int[] persenLembur = {30, 32, 34, 36, 38};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
        String golongan = scanner.nextLine().toUpperCase();

        System.out.print("Masukkan Jumlah Jam Lembur: ");
        int jamLembur = scanner.nextInt();

        int indeksGaji;
        switch (golongan) {
            case "A":
                indeksGaji = 0;
                break;           
            case "B;":
                indeksGaji = 1;
                break;
            case "C":
                indeksGaji = 2;
                break;
            case "D":
                indeksGaji = 3;
                break;
            case "E":
                indeksGaji = 4;
                break;
            default:
                System.out.println("Golongan tidak valid");
                scanner.close();
                return;
        }

        double gajiLembur = (persenLembur[indeksGaji] / 100.0) * gajiPokok[indeksGaji] * jamLembur;
        double totalPenghasilan = gajiPokok[indeksGaji] + gajiLembur;

        System.out.println("\nGolongan: " + golongan);
        System.out.println("Gaji Pokok: Rp " + String.format("%,d", gajiPokok[indeksGaji]));
        System.out.println("Gaji Lembur (" + jamLembur + "Jam): Rp  " + String.format("%,.2f", gajiLembur));
        System.out.println("Jumlah Penghasilan: Rp " + String.format("%,.2f", totalPenghasilan));

        scanner.close();
    }
}
