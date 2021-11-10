import java.util.HashMap;
import java.util.Scanner;


public class Login {
    static HashMap<String, Login> tabelDataLogin = new HashMap<>();
    static String em, pa;

    public Login(String email, String pass) {
        em = email;
        pa = pass;
    }

    Login lo;

    public void log(String inEmail, String inPass) {
        Scanner in = new Scanner(System.in);
        DataPraktikan dp = new DataPraktikan("", "");

        String emailDepan = "[a-z A-Z 0-9._-]+@[webmail]+\\.+[umm]+\\.+[ac]+\\.+[id]+";
        System.out.print("Email : ");
        inEmail = in.nextLine();
        if (inEmail.matches(emailDepan)) {
            System.out.print("Password : ");
            inPass = in.nextLine();
            System.out.println("Berhasil Login yay");
            lo = tabelDataLogin.put("1", new Login(inEmail, inPass));
            dp.run();
        } else {
            System.out.println("Format email salah");
        }
    }

    public void totalEmail() {
        System.out.println("Total data yang disimpan : " + tabelDataLogin.size());
        if (tabelDataLogin.size() != 0) {
            System.out.println("NIM praktikan : " + lo.em);
        } else if (tabelDataLogin.size() == 0) {
            System.out.println("Data tidak tersedia");
        }
    }

    public void run() {

        Scanner in = new Scanner(System.in);
        String menu;

        System.out.println("1. Login\n" +
                "2. Logout");
        System.out.print("Select option : ");
        menu = in.nextLine();
        switch (menu) {
            case "1":
                log(" ", " ");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Login lg = new Login("", "");
        lg.run();
    }
}
