# Najwa-Norizat_2110010417_4C_PBO1

# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi penampil data nama costumer dan barang yang dia beli beserta nomer seri barangnya menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama costumer, jenis barang dan nomer seri barang dan memberikan output berupa informasi detail dari nomor seri tersebut seperti merk laptop dan tahun pembuatannya.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Laptop`, `LaptopDetail`, dan `LaptopBeraksi` adalah contoh dari class.

```bash
public class Laptop {
    ...
}

public class LaptopDetail extends Laptop {
    ...
}

public class LaptopBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = new MahasiswaDetail(nama, npm);` adalah contoh pembuatan object.

```bash
lptp[i] = new LaptopDetail (nama, jenis, seri);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `npm` adalah contoh atribut.

```bash
 private String nama;
 private String jenis ;
 private String seri;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
 public Laptop(String nama, String jenis, String seri) {
        this.nama = nama;
        this.jenis = jenis;
        this.seri = seri;
    }

public LaptopDetail(String nama, String jenis, String seri) {
        super(nama, jenis, seri);
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNpm` adalah contoh method mutator.

```bash
 public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNpm`, `getTahunMasuk`, `getFakultas`, `getProdi`, dan `getNoRegistrasi` adalah contoh method accessor.

```bash
 public String getNama() {
        return nama;
    }
    public String getJenis() {
        return jenis;
    }

    public String getSeri() {
        return seri;
    }
    
    public String displayInfo(){
       return  "Nama: "+getNama()+
               "\nJenis: "+getJenis()+
              "\nSeri: "+getSeri(); 
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String nama;
    private String jenis ;
    private String seri;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
    public class LaptopDetail extends Laptop {
    ...
    }
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
@Override
    public String displayInfo(){
        return super.displayInfo() +
                "\nMerk Leptop: "+getMerk()+
                "\nTahun Produksi: "+getTahunProduksi();
         
    }  
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
 public String getMerk(){
        String kodeLaptop = getSeri().substring(0, 1);
        switch (kodeLaptop){
            case "A":
                return "ACER";
            case "B":
                return "ASUS";
            case "C":
                return "LENOVO";
            default:
                return "Merk Tidak Tersedia";
        }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
  for(int i=0; i<lptp.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
                System.out.println("=========================================");
                System.out.println("            FOURTUNE COMPUTER            ");
                System.out.println("=========================================");
                System.out.print("Masukkan Nama Costumer "+(i+1)+" : ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Nama Barang "+(i+1)+" : ");
                String jenis = scanner.nextLine();
                System.out.print("Masukkan Nomor Seri "+(i+1)+" : ");
                String seri = scanner.nextLine();
 System.out.println(data.displayInfo());

```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
  LaptopDetail[] lptp = new LaptopDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
 } catch (NumberFormatException e){
        System.out.println("Kesalahan format Jenis: "+e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Kesalahan format Seri : "+e.getMessage());
    } catch (Exception e) {
        System.out.println("Kesalahan umum: "+e.getMessage());
    }
  } 
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

Nama: Najwa Norizat
NPM: 2110010417
