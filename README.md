# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data penduduk menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi
Aplikasi ini menerima input berupa data penduduk seperti nama, nomor kependudukan (NK), alamat, status, dan kewarganegaraan. Aplikasi memberikan output berupa informasi detail dari NK tersebut seperti provinsi, kota, kecamatan, tanggal lahir, dan jenis kelamin.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kependudukan`, `KependudukanDetail`, dan `KependudukanHasil` adalah contoh dari class.

```bash
public class Kependudukan {
    ...
}

public class KependudukanDetail extends Kependudukan {
    ...
}

public class KependudukanHasil {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini,  `warga[i] = new KependudukanDetail(nama, nk, alamat, status, kewarganegaraan);` adalah contoh pembuatan object.

```bash
warga[i] = new KependudukanDetail(nama, nk, alamat, status, kewarganegaraan);

```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `nk`, `alamat`, `status`, dan `kewarganegaraan` adalah contoh atribut.

```bash
private String nama;
private String nk;
private String alamat;
private String status;
private String kewarganegaraan;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kependudukan` dan `KependudukanDetail`.

```bash
public Kependudukan(String nama, String nk, String alamat, String status, String kewarganegaraan) {
    this.nama = nama;
    this.nk = nk;
    this.alamat = alamat;
    this.status = status;
    this.kewarganegaraan = kewarganegaraan;
}

public KependudukanDetail(String nama, String nk, String alamat, String status, String kewarganegaraan) {
    super(nama, nk, alamat, status, kewarganegaraan);
}
```

5. **Mutator** Mutator atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setNk`, `setAlamat`, `setStatus`, dan `setKewarganegaraan` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setNk(String nk) {
    this.nk = nk;
}

public void setAlamat(String alamat) {
    this.alamat = alamat;
}

public void setStatus(String status) {
    this.status = status;
}

public void setKewarganegaraan(String kewarganegaraan) {
    this.kewarganegaraan = kewarganegaraan;
}

```

6. **Accessor** getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini,  `getNama`, `getNk`, `getAlamat`, `getStatus`, dan `getKewarganegaraan` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getNk() {
    return nk;
}

public String getAlamat() {
    return alamat;
}

public String getStatus() {
    return status;
}

public String getKewarganegaraan() {
    return kewarganegaraan;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut  `nama`, `nk`, `alamat`, `status`, dan `kewarganegaraan` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String nk;
private String alamat;
private String status;
private String kewarganegaraan;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KependudukanDetail` mewarisi `Kependudukan` dengan sintaks `extends`.

```bash
public class KependudukanDetail extends Kependudukan {
    ...
}
```

9. **Polymorphism** adalah adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `infoTampil(String)` di `Kependudukan` merupakan overloading method `infoTampil` dan `infoTampil` di `KependudukanDetail` merupakan override dari method `infoTampil` di `Kependudukan`.
```bash
public String infoTampil(String pekerjaan) {
    return infoTampil() + "\nPekerjaan: " + pekerjaan;
}

@Override
public String infoTampil() {
    return super.infoTampil() +
           "\nProvinsi : " + getProvinsi() +
           "\nKota/Kabupaten : " + getKota() +
           "\nKecamatan : " + getKecamatan() +
           "\nTanggal, Bulan, Tahun Lahir : " + getLahir() +
           "\nJenis Kelamin : " + getJenkel();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi switch dan if-else dalam method `getProvinsi`, `getKota`, `getKecamatan`, `getLahir`, dan `getJenkel`.

```bash
public String getProvinsi() {
    String kodeProv = getNk().substring(0, 2);
    return switch (kodeProv) {
        case "61" -> "Provinsi Kalimantan Barat";
        case "62" -> "Provinsi Kalimantan Tengah";
        case "63" -> "Provinsi Kalimantan Selatan";
        case "64" -> "Provinsi Kalimantan Timur";
        case "65" -> "Provinsi Kalimantan Utara";
        default -> "Diluar Pulau Kalimantan";
    };
}

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
            default -> "Kota atau Kabupaten Tidak Dikenal di Kalimantan Barat";
        };
    } else if (kodeProv.equals("62")) {
        return switch (kodeKota) {
            case "03" -> "Kabupaten Kapuas";
            case "11" -> "Kabupaten Pulang Pisau";
            case "71" -> "Kota Palangkaraya";
            default -> "Kota atau Kabupaten Tidak Dikenal di Kalimantan Tengah";
        };
    } else {
        return "Kode Kota Tidak Valid untuk Provinsi Ini";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop  `for` untuk meminta input dan menampilkan data.
```bash
for(int i = 0; i < warga.length; i++) {
    ...
}
```

12. **Input Output Sederhana**  digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.
```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Penduduk " + (i+1) + ": ");
String nama = scanner.nextLine();

System.out.println("---------Hasil Data Penduduk---------");
System.out.println(hasildata.infoTampil());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `KependudukanDetail[] warga = new KependudukanDetail[1];` adalah contoh penggunaan array.

```bash
KependudukanDetail[] warga = new KependudukanDetail[1];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    ...
} catch (InputMismatchException e) {
    System.out.println("Kesalahan input: Pastikan memasukkan data dengan format yang benar.");
} catch (StringIndexOutOfBoundsException e) {
    System.out.println("Kesalahan Format Nomor Kependudukan: " + e.getMessage());
} catch (Exception e) {
    System.out.println("Kesalahan Umum: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Gusti Muhammad El Royan
NPM: 2210010544
Kelas: 4C TI BJB Reg Pagi
