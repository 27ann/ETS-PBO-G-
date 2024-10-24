public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Book menggunakan konstruktor
        Book bukuKu = new Book("Belajar Java", "John Doe", 2023, "Penerbit Ilmu", "Pemrograman");

        // Memanggil metode printDetails untuk mencetak detail buku
        bukuKu.printDetails();
    }
}