package uaspbo1;

//inheritance
public class KependudukanDetail extends Kependudukan {

    //overriding
    public KependudukanDetail(String nama, String nk, String alamat, String status, String kewarganegaraan) {
        super(nama, nk, alamat, status, kewarganegaraan);
    }

    public String getProvinsi (){
        String kodeProv = getNk().substring(0, 2);
        //seleksi Kode Provinsi 
        return switch (kodeProv) {
            case "61" -> "Provinsi Kalimantan Barat";
            case "62" -> "Provinsi Kalimantan Tengah";
            case "63" -> "Provinsi Kalimantan Selatan";
            case "64" -> "Provinsi Kalimantan Timur";
            case "65" -> "Provinsi Kalimantan Utara";
            default -> "Diluar Pulau Kalimantan";
        };
        
    }
   //Seleksi Kode kota atau kabupaten 
    public String getKota() {
    String kodeProv = getNk().substring(0, 2);
    String kodeKota = getNk().substring(2, 4);
        
        if (kodeProv.equals("63")) {
            return switch (kodeKota) {
                case "01" -> "Kabupaten Banjar";
                case "71" -> "Kota Banjarmasin";
                case "72" -> "Kota Banjarbaru";
                default -> "Kota atau Kabupaten Tidak Dikenal di Kalimantan Selatan";
            };
            
        } else if (kodeProv.equals("64")) {
           return switch (kodeKota) {
               case "02" -> "Kabupaten Kutai Kartanegara";
               case "71" -> "Kota Balikpapan";
               case "72" -> "Kota Samarinda";
               default -> "Kota atau Kabupaten Tidak Dikenal di Kalimantan Timur";  
            };      
        } else if (kodeProv.equals("65")) {
           return switch (kodeKota) {
               case "01" -> "Kabupaten Bulungan";
               case "02" -> "Kabupaten Malinau";
               case "71" -> "Kota Tarakan";
               default -> "Kota atau Kabupaten Tidak Dikenal di Kalimantan Utara";  
        };    
        } else if (kodeProv.equals("61")) {
           return switch (kodeKota) {
               case "04" -> "Kabupaten Ketapang";
               case "71" -> "Kota Pontianak";
               case "72" -> "Kota Singkawang";    
               default -> "Kota atau Kabuputen Tidak Dikenal di Kalimantan Barat";
        };  
        } else if (kodeProv.equals("62")) {
            return switch (kodeKota) {
               case "03" -> "Kabupaten Kapuas";
               case "11" -> "Kabupaten Pulang Pisau";
               case "71" -> "Kota Palangkaraya";    
               default -> "Kota atau Kabupaten Tidak Dikenal di Kalimantan Tengah";
        };  
        }else {
            return "Kode Kota Tidak Valid untuk Provinsi Ini";
        }
    }
    
    //Seleksi kode kecamatan
    public String getKecamatan() {
    String kodeProv = getNk().substring(0, 2);
    String kodeKota = getNk().substring(2, 4);
    String kodeKecamatan = getNk().substring(4, 6);
    
     if (kodeProv.equals("63") && kodeKota.equals("01")) {
            return switch (kodeKecamatan) {
                case "06" -> "Kecamatan Gambut ";
                case "09" -> "Kecamatan Matapura Kota";
                default -> "Kecamatan Tidak Dikenal di Kota Martapura";
            };
        }else if (kodeProv.equals("63") && kodeKota.equals("71")) {
            return switch (kodeKecamatan) {
                case "02" -> "Kecamatan Banjarmasin Selatan";
                case "03" -> "Kecamatan Banjarmasin Tengah";
                default -> "Kecamatan Tidak Dikenal di Kota Banjarmasin";
            };
        } else if (kodeProv.equals("63") && kodeKota.equals("72")) {
            return switch (kodeKecamatan) {
                case "01" -> "Kecamatan Banjarbaru Selatan";
                case "02" -> "Kecamatan Banjarbaru Utara";
                default -> "Kecamatan Tidak Dikenal di Kota Banjarbaru";
            };
        } else {
            return "Kode Kecamatan Tidak Valid untuk Kota dan Provinsi Kalimantan Selatan";
        }
    }
    
    // Seleksi Kode lahir
    public String getLahir() {
    // Mendapatkan substring dari NK mulai dari indeks ke-6 hingga ke-12
    String kodeLahir = getNk().substring(6, 12);
    
    // Memisahkan tanggal, bulan, dan tahun dari kodeLahir
    String tanggal = kodeLahir.substring(0, 2);
    String bulan = kodeLahir.substring(2, 4);
    String tahun = kodeLahir.substring(4, 6);
    
    // Mengonversi kode bulan menjadi nama bulan
    String namaBulan = "";
    namaBulan = switch (bulan) {
            case "01" -> "Januari";
            case "02" -> "Februari";
            case "03" -> "Maret";
            case "04" -> "April";
            case "05" -> "Mei";
            case "06" -> "Juni";
            case "07" -> "Juli";
            case "08" -> "Agustus";
            case "09" -> "September";
            case "10" -> "Oktober";
            case "11" -> "November";
            case "12" -> "Desember";
            default -> "Bulan tidak valid";
        };
    // Mengonversi kode tahun menjadi tahun penuh dimulai dari 2000
    int tahunLahir = 2000 + Integer.parseInt(tahun);
    
    // Memformat hasil menjadi string tanggal lahir yang terbaca
    String tanggalLahir = tanggal + " " + namaBulan + " " + tahunLahir;
    
    return tanggalLahir;
   }
    
   //seleksi Kode Jenis kelamin
    public String getJenkel() {
        String kodeJenkel = getNk().substring(12, 14);
        return switch(kodeJenkel) {
            case "01" -> "Laki-Laki";
            case "02" -> "Perempuan";
            default -> "Jenis Kelamin TIDAK ADA!!!";
        };
    }

    @Override
    public String infoTampil(){
        return super.infoTampil()+
                "\nProvinsi : "+getProvinsi()+
                "\nKota/Kabupaten : "+getKota()+
                "\nKecamatan : "+getKecamatan()+
                "\nTanggal, Bulan, Tahun Lahir :"+getLahir()+
                "\nJenis Kelamin : "+getJenkel();
    }
     
}