import java.util.ArrayList;
import java.util.Scanner;

public class FoodOrder {
    // Atribut
    private ArrayList<String> menuItems;
    private double totalPrice;
    private boolean isPaid;
    private double balance;  // Saldo yang dimasukkan oleh pengguna

    // Konstruktor untuk inisialisasi pesanan
    public FoodOrder() {
        this.menuItems = new ArrayList<>();
        this.totalPrice = 0.0;
        this.isPaid = false;
        this.balance = 0.0;
    }

    // Menambahkan item ke dalam pesanan
    public void addMenuItem(String item, double price) {
        menuItems.add(item);
        totalPrice += price;
        System.out.println(item + " seharga Rp " + price + " telah ditambahkan ke pesanan.");
    }

    // Mendapatkan total harga dari pesanan
    public double getTotalPrice() {
        return totalPrice;
    }

    // Menambahkan uang ke saldo
    public void insertMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Uang yang dimasukkan: Rp " + amount);
        } else {
            System.out.println("Masukkan jumlah uang yang positif!");
        }
    }

    // Proses pembayaran, menghitung kembalian
    public void pay() {
        if (balance >= totalPrice) {
            double change = balance - totalPrice;
            System.out.println("Pesanan telah dibayar. Total: Rp " + totalPrice);
            System.out.println("Kembalian Anda: Rp " + change);
            isPaid = true;
        } else {
            System.out.println("Saldo tidak cukup. Anda butuh Rp " + (totalPrice - balance) + " lagi.");
        }
    }

    // Mengecek apakah pesanan sudah dibayar
    public boolean isPaid() {
        return isPaid;
    }

    // Memulai proses pesanan, meminta input dari pengguna
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean ordering = true;

        while (ordering) {
            printMenu(); // Tampilkan daftar menu setiap kali pengguna ingin menambah item
            System.out.print("> ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addMenuItem("Nasi Goreng", 25000);
                    break;
                case 2:
                    addMenuItem("Mie Ayam", 15000);
                    break;
                case 3:
                    addMenuItem("Sate Ayam", 30000);
                    break;
                case 4:
                    addMenuItem("Teh Manis", 5000);
                    break;
                case 5:
                    System.out.println("Pesanan selesai.");
                    ordering = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }

        System.out.println("Total harga pesanan: Rp " + getTotalPrice());
        System.out.print("Silakan masukkan jumlah uang Anda: Rp ");
        double amount = scanner.nextDouble();
        insertMoney(amount);

        if (!isPaid) {
            pay();  // Melakukan pembayaran setelah memasukkan uang
        }

        if (!isPaid) {
            System.out.println("Pesanan belum dibayar. Silakan masukkan uang tambahan.");
        }

        scanner.close();
    }

    // Menampilkan daftar menu
    public void printMenu() {
        System.out.println("\n--- Daftar Menu ---");
        System.out.println("1. Nasi Goreng    Rp 25.000");
        System.out.println("2. Mie Ayam       Rp 15.000");
        System.out.println("3. Sate Ayam      Rp 30.000");
        System.out.println("4. Teh Manis      Rp 5.000");
        System.out.println("5. Selesai Memesan");
    }

    public static void main(String[] args) {
        // Membuat objek FoodOrder dan memulai pemesanan
        FoodOrder order = new FoodOrder();
        order.start();
    }
}
