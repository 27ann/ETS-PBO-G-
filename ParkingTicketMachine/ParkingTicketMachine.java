import java.util.Scanner;

public class ParkingTicketMachine {
    // Atribut
    private int balance;
    private int ticketPrice;
    private int ticketTime;

    // Konstruktor
    public ParkingTicketMachine(int ticketPrice) {
        this.ticketPrice = ticketPrice;
        this.balance = 0;
        this.ticketTime = 0;
    }

    // Metode untuk menambahkan uang
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Uang sebesar Rp" + amount + " telah dimasukkan.");
        } else {
            System.out.println("Jumlah uang yang dimasukkan tidak valid.");
        }
    }

    // Metode untuk mengeluarkan tiket
    public void issueTicket() {
        if (balance >= ticketPrice) {
            ticketTime = balance / ticketPrice;  // Hitung waktu parkir yang dibeli
            balance = balance % ticketPrice; // Sisa saldo
            System.out.println("Tiket dikeluarkan. Waktu parkir yang dibeli: " + ticketTime + " jam.");
        } else {
            System.out.println("Saldo tidak mencukupi. Harga tiket per jam: Rp" + ticketPrice);
        }
    }

    // Metode untuk mendapatkan jumlah jam parkir yang telah dibeli
    public int getTimePurchased() {
        return ticketTime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Masukkan harga tiket
        System.out.print("Masukkan harga tiket per jam: ");
        int ticketPrice = scanner.nextInt();

        // Buat instance mesin tiket
        ParkingTicketMachine machine = new ParkingTicketMachine(ticketPrice);

        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Mesin Tiket Parkir ---");
            System.out.println("1. Masukkan Uang");
            System.out.println("2. Keluarkan Tiket");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan jumlah uang (Rp): ");
                    int amount = scanner.nextInt();
                    machine.insertMoney(amount);
                    break;
                case 2:
                    machine.issueTicket();
                    System.out.println("Waktu parkir yang dibeli: " + machine.getTimePurchased() + " jam.");
                    break;
                case 3:
                    exit = true;
                    System.out.println("Terima kasih telah menggunakan mesin tiket parkir.");
                    break;
                default:
                    System.out.println("Opsi tidak valid, silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
