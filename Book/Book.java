class Book {
    // Atribut
    String judul;
    String penulis;
    int tahunTerbit;
    String penerbit;
    String kategori;

    // Konstruktor untuk menginisialisasi atribut
    public Book(String judul, String penulis, int tahunTerbit, String penerbit, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
        this.kategori = kategori;
    }

    // Metode untuk mencetak detail buku
    public void printDetails() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Kategori: " + kategori);
    }
}

