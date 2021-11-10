import java.util.HashMap;
import java.util.Scanner;

public class Testing {
    String nama, kelas, matkulPraktikum;
    int nim;

    public Testing(String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Testing> mhs = new HashMap<>();
        String input;
        Testing data;

        mhs.put("1", new Testing("Putri", "3C", "Strukdat", 202000));

        System.out.println("Masukkan ID : ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null) {
            System.out.println("Data Mahasiswa : " + data.nama + ", kelas : " + data.kelas + ", mata kuliah : " + data.matkulPraktikum + ", nim : " + data.nim);
        }
    }
}