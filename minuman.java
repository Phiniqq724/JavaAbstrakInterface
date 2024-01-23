import java.util.Scanner;

public abstract class minuman {
    Scanner in = new Scanner(System.in);

    public int jenisMinuman() {
        int harga = 0;
        System.out.println("Tulis pilihan jenis: (coffe/tea)");
        String pilihan = in.nextLine();
        switch (pilihan) {
            case "coffe":
                harga = 15000;
                break;
        
            case "tea":
                harga = 7500;
                break;
            default:
                System.out.println("Error");
        }
        return harga;
    }

    public abstract void tampilJenis(String jenis);
}
