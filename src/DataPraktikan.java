import java.util.HashMap;
import java.util.*;

public class DataPraktikan {
    static String np, na;
    static HashMap<String, DataPraktikan> tabelData = new HashMap<>();

    public DataPraktikan(String nimPraktikan, String namaAsisten) {
        np = nimPraktikan;
        na = namaAsisten;
    }

    DataPraktikan dp;

    public boolean tambahData(String inNIM, String inNama) {
        Scanner in = new Scanner(System.in);
        String syarat = "IF";

        System.out.println("======================================");
        System.out.println("            TAMBAH DATA");
        System.out.println("======================================");
        System.out.print("Masukkan dua digit code jurusan : ");
        String awal = in.nextLine();

        if (awal.equals(syarat) == true) {
            System.out.print("Masukkan nim akhir : ");
            String akhir = in.nextLine();
            inNIM = awal + akhir;

            if (inNIM.equals(tabelData.values()) == false) {
                System.out.print("Masukkan nama asisten : ");
                inNama = in.nextLine();

                System.out.println("--Data berhasil di input--");
                dp = tabelData.put("1", new DataPraktikan(inNIM, inNama));
            } else {
                System.out.println("Data sudah tersedia");
            }
        } else {
            System.out.println("Kode jurusan tidak valid");
        }
        return true;
    }

    public void tampil() {
        System.out.println("======================================");
        System.out.println("             TAMPIL DATA");
        System.out.println("======================================");
        System.out.println("Total data yang disimpan : " + tabelData.size());
        if (tabelData.size() != 0) {
            System.out.println("NIM praktikan : " + dp.np);
            System.out.println("Nama asisten  : " + dp.na);
        } else if (tabelData.size() == 0) {
            System.out.println("Data tidak tersedia");
        }
    }

    public void listNimPraktikan() {
        System.out.println("Total data yang disimpan : " + tabelData.size());
        if (tabelData.size() != 0) {
            System.out.println("NIM praktikan : " + dp.np);
        } else if (tabelData.size() == 0) {
            System.out.println("Data tidak tersedia");
        }
    }

    public void listNimAsisten() {
        System.out.println("Total data yang disimpan : " + tabelData.size());
        if (tabelData.size() != 0) {
            System.out.println("Nama Asisten : " + dp.na);
        } else if (tabelData.size() == 0) {
            System.out.println("Data tidak tersedia");
        }
    }

    boolean hapusData() {
        Scanner in = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("              HAPUS DATA");
        System.out.println("======================================");
        System.out.println("Total data yang disimpan : " + tabelData.size());
        if (tabelData.size() != 0) {
            String pilih;
            System.out.println("NIM praktikan : " + dp.np);
            System.out.println("Nama asisten  : " + dp.na);
            System.out.println("Ingin menghapus data? yes / no");
            pilih = in.nextLine();
            switch (pilih) {
                case "yes":
                    tabelData.remove("1");
                    System.out.println("--Data berhasil dihapus--");
                    run();
                    break;
                case "no":
                    run();
                    break;
            }
        } else if (tabelData.size() == 0) {
            System.out.println("Data tidak tersedia");
        }
        return true;
    }

    public void editData(String inNIM, String inNama) {
        Scanner in = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("               EDIT DATA");
        System.out.println("======================================");

        System.out.println("Total data yang disimpan : " + tabelData.size());
        if (tabelData.size() != 0) {
            String pilih;
            String syarat = "IF";
            System.out.println("NIM praktikan : " + dp.np);
            System.out.println("Nama asisten  : " + dp.na);
            System.out.println("Ingin mengedit data? yes / no");
            pilih = in.nextLine();
            switch (pilih) {
                case "yes":
                    System.out.println("======================================");
                    System.out.println("1. Edit NIM");
                    System.out.println("2. Edit Nama");
                    System.out.print("Masukkan pilihan anda : ");
                    int pilih2 = in.nextInt();

                    switch (pilih2) {
                        case 1:
                            Scanner addNIM = new Scanner(System.in);
                            System.out.println("======================================");
                            System.out.print("Masukkan dua digit code jurusan : ");
                            String awal = addNIM.nextLine();
                            if (awal.equals(syarat) == true) {
                                System.out.print("Masukkan nim akhir : ");
                                String akhir = addNIM.nextLine();
                                inNIM = awal + akhir;
                                System.out.println("--Data berhasil diedit--");
                                dp = tabelData.put("1", new DataPraktikan(inNIM, na));
                            } else {
                                System.out.println("dua digit code jurusan tidak valid");
                            }
                            break;
                        case 2:
                            System.out.println("======================================");
                            Scanner addAsisten = new Scanner(System.in);
                            System.out.print("Masukkan nama asisten : ");
                            inNama = addAsisten.nextLine();
                            System.out.println("--Data berhasil diedit--");
                            dp = tabelData.put("1", new DataPraktikan(np, inNama));
                            break;
                        default:
                            break;
                    }
                    run();
                    break;
                case "no":
                    run();
                    break;
            }
        } else if (tabelData.size() == 0) {
            System.out.println("Data tidak tersedia");
        }
    }


    public void run() {
        Scanner in = new Scanner(System.in);
        String menu;
        System.out.println("""
                1. Tambah data
                2. Tampil data
                3. Daftar NIM praktikan
                4. Daftar nama asisten
                5. Hapus data
                6. Edit data
                7. Total email
                8. Logout""");
        System.out.print("Select option : ");
        menu = in.nextLine();

        switch (menu) {
            case "1":
                tambahData(" ", " ");
                run();
                break;
            case "2":
                tampil();
                run();
                break;
            case "3":
                listNimPraktikan();
                run();
                break;
            case "4":
                listNimAsisten();
                run();
                break;
            case "5":
                hapusData();
                run();
                break;
            case "6":
                editData(" ", " ");
                run();
                break;
            case "7":
                Login lg = new Login("", "");
                lg.totalEmail();
                run();
                break;
            case "8":
                System.out.println("GOODBYEEEE EVERYBODY !!!");
                break;
        }
    }
}
