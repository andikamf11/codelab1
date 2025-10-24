// simpan Hello.java lalu: javac Hello.java && java Hello
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nama: ");
        String name = s.nextLine();
        System.out.print("Umur: ");
        int umur = s.nextInt();
        System.out.println("Halo " + name + ", umurmu " + umur);
    }
}
