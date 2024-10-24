// Kelas induk
class Karyawan {
    String nama;
    int gaji;

    public void bekerja() {
        System.out.println(nama + " sedang bekerja dengan gaji " + gaji + " per bulan.");
    }
}

// Kelas turunan
class Manajer extends Karyawan {
    int jumlahTim;

    public void pimpinRapat() {
        System.out.println(nama + " sedang memimpin rapat dengan tim berjumlah " + jumlahTim + " orang.");
    }
}

// Kelas turunan lainnya
class Programmer extends Karyawan {
    String bahasaPemrograman;

    public void tulisKode() {
        System.out.println(nama + " sedang menulis kode dalam bahasa " + bahasaPemrograman + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        // Objek dari kelas Manajer
        Manajer manajerKu = new Manajer();
        manajerKu.nama = "Brian";
        manajerKu.gaji = 15000000;
        manajerKu.jumlahTim = 10;
        manajerKu.bekerja(); // Output: Brian sedang bekerja dengan gaji 15000000 per bulan.
        manajerKu.pimpinRapat(); // Output: Brian sedang memimpin rapat dengan tim berjumlah 10 orang.

        // Objek dari kelas Programmer
        Programmer programmerKu = new Programmer();
        programmerKu.nama = "Ina";
        programmerKu.gaji = 12000000;
        programmerKu.bahasaPemrograman = "Java";
        programmerKu.bekerja(); // Output: Ina sedang bekerja dengan gaji 12000000 per bulan.
        programmerKu.tulisKode(); // Output: Ina sedang menulis kode dalam bahasa Java.
    }
}
