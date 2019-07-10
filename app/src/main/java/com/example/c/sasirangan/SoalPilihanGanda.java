package com.example.c.sasirangan;


public class SoalPilihanGanda {

    public String pertanyaan[] = {
            "Kain Sasirangan berasal dari daerah ...", //1
            "Kain sasirangan merupakan warisan dari abad …", //2
            "Awalnya kain sasirangan dikenal untuk digunakan sebagai kain …", //3
            "Kain sasirangan berwarna ungu biasa digunakan untuk mengobati …", //4
            "Untuk memberi warna kuning pada kain sasirangan bahan yang digunakan adalah …", //5
            "Gambar motif di atas merupakan motif …", //6
            "Motif kain sasirangan yang memiliki makna sebagai simbol keakraban yaitu …", //7
            "Gambar motif di atas merupakan motif …", //8
            "Gambar motif di atas merupakan motif …" //9
    };

    private String pilihanJawaban[][] = {
            {"Jogja", "Banjarmasin", "Samarinda" }, //1
            {"XI","XIII","XII"}, //2
            {"Kekebalan", "Penyembuhan", "Pembawa keberuntungan"}, //3
            {"Gangguan jiwa", "Lumpuh", "Sakit perut"}, //4
            {"Kunyit", "Daun pandan", "Lengkuas"}, //5
            {"Raja Bayam", "Ular lidi", "Turun dayang"}, //6
            {"Kambang Sasaki", "Raja Bayam", "Kambang Kacang"}, //7
            {"Kulat Karikit", "Kangkung kaombakan", "Ramak sahang"}, //8
            {"Turun Dayang", "Gelombang", "Ombak Sinapur Karang"} //9
    };

    private String jawabanBenar[] = {
            "Banjarmasin", //1
            "XII", //2
            "Penyembuhan", //3
            "Sakit perut", //4
            "Kunyit", //5
            "Raja Bayam", //6
            "Kambang Kacang", //7
            "Kulat Karikit", //8
            "Gelombang" //9
    };

    private String image[] = {
            "putih", //1
            "putih", //2
            "putih", //3
            "putih", //4
            "putih", //5
            "rajabayam", //6
            "putih", //7
            "kulat_karikit", //8
            "gelombang", //9
            "gigiharuan" //10
    };



    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
