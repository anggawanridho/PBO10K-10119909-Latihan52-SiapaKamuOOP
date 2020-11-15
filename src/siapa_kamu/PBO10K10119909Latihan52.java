package siapa_kamu;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10K10119909Latihan52 {

    public static void main(String[] args) {
        Manusia manusia1 = new Manusia();
        Mahasiswa mhs1 = new Mahasiswa();
        Dosen dosen1 = new Dosen();

        dosen1.setNip("4122789930");
        dosen1.setNama("Rizki Adam Kurniawan");
        dosen1.setUmur(27);
        dosen1.setMataKuliah("PBO");

        mhs1.setNim("10110269");
        mhs1.setNama("Nindi");
        mhs1.setUmur(17);
        mhs1.setKelas("PBO2");

        System.out.println("NIP DOSEN : "+ dosen1.getNip());
        dosen1.siapaKamu();
        dosen1.mengajarApa();

        System.out.println();

        System.out.println("NIM MAHASISWA : "+ mhs1.getNim());
        mhs1.siapaKamu();
        mhs1.kelasApa();


    }
}
