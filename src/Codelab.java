import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Codelab {
    public static void main(String[] args) {
        Scanner xinput = new Scanner(System.in);

        System.out.println("\n//input\n");

        System.out.print("Nama: ");
        String xname = xinput.nextLine();
        System.out.print("Jenis kelamin (P/L): ");
        String xgender = xinput.nextLine();
        String gender = (xgender.equalsIgnoreCase("P")) ? "Perempuan" : "Laki-laki";
        System.out.print("Tanggal lahir (YYYY-MM-DD): ");
        String xbirthday = xinput.nextLine();
        LocalDate birthday = LocalDate.parse(xbirthday);

        LocalDate day = LocalDate.now();
        Period agePeriod = Period.between(birthday, day);
        int xyears = agePeriod.getYears();
        int xmonths = agePeriod.getMonths();

        System.out.println("\n//output");

        System.out.println("\nData Diri:");
        System.out.println("Nama: " + xname);
        System.out.println("Jenis Kelamin: " + gender);
        System.out.println("Umur: " + xyears + " tahun " + xmonths + " bulan");

        xinput.close();
    }
}
