# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi sederhana Sistem Manajemen Self Photo Studio menggunakan Java sebagai tugas akhir mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini digunakan untuk membantu pengelolaan reservasi studio foto mandiri (Self Photo Studio). Sistem menerima input berupa data pelanggan, tema studio, jumlah orang, tambahan waktu, pilihan hewan peliharaan, dan hasil foto.

Output yang dihasilkan berupa detail reservasi pelanggan serta total biaya yang harus dibayarkan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP:

### 1. Class

Class adalah blueprint atau rancangan object.

Pada proyek ini class yang digunakan:

```java
public class PaketFoto{
    ...
}

public class SessionFoto extends PaketFoto{
    ...
}

public class PelangganStudio{
    ...
}
```

---

### 2. Object

Object merupakan instance dari class.

Contoh:

```java
PelangganStudio pelanggan =
new PelangganStudio(
nama,
nomorHp
);

SessionFoto session =
new SessionFoto(
tema,
50000,
30,
biayaTambahanWaktu,
biayaHewan,
biayaHasilFoto,
biayaJumlahOrang
);
```

---

### 3. Atribut

Atribut merupakan variabel yang berada dalam class.

Contoh:

```java
private String tema;
private int hargaDasar;
private int durasi;

private String nama;
private String nomorHp;
```

---

### 4. Constructor

Constructor adalah method yang dijalankan saat object dibuat.

Contoh:

```java
public PaketFoto(
String tema,
int hargaDasar,
int durasi){

this.tema=tema;
this.hargaDasar=hargaDasar;
this.durasi=durasi;

}

public PelangganStudio(
String nama,
String nomorHp){

this.nama=nama;
this.nomorHp=nomorHp;

}
```

---

### 5. Mutator

Mutator atau setter digunakan untuk mengubah nilai atribut.

Contoh:

```java
public void setTema(String tema){

this.tema=tema;

}

public void setNama(String nama){

this.nama=nama;

}
```

---

### 6. Accessor

Accessor atau getter digunakan untuk mengambil nilai atribut.

Contoh:

```java
public String getTema(){

return tema;

}

public String getNama(){

return nama;

}
```

---

### 7. Encapsulation

Encapsulation digunakan untuk menyembunyikan data agar hanya dapat diakses melalui method tertentu.

Contoh:

```java
private String tema;
private int hargaDasar;
private int durasi;

private String nama;
private String nomorHp;
```

---

### 8. Inheritance

Inheritance adalah pewarisan class.

Pada proyek ini:

```java
public class SessionFoto extends PaketFoto{
    ...
}
```

Artinya class SessionFoto mewarisi atribut dan method dari PaketFoto.

---

### 9. Polymorphism

Polymorphism memungkinkan method memiliki perilaku berbeda.

Contoh Override:

```java
@Override
public int hitungTotal(){

return getHargaDasar()
        +biayaTambahanWaktu
        +biayaHewan
        +biayaHasilFoto
        +biayaJumlahOrang;

}
```

---

### 10. Seleksi

Seleksi digunakan untuk menentukan keputusan berdasarkan kondisi.

Contoh:

```java
if(jumlahOrang==1){

biayaJumlahOrang=0;

}
else if(jumlahOrang==2){

biayaJumlahOrang=10000;

}
else{

biayaJumlahOrang=20000;

}
```

Dan:

```java
switch(pilihTema){

case 1:
tema="Galaxy Adventure";
break;

case 2:
tema="Sweet Candy Room";
break;

default:
tema="Tema Tidak Tersedia";

}
```

---

### 11. Perulangan

Perulangan digunakan untuk menjalankan program berulang.

Contoh:

```java
for(int i=0;i<jumlah;i++){

...

}
```

---

### 12. Input Output Sederhana

Menggunakan Scanner dan System.out.println().

Contoh:

```java
Scanner input=new Scanner(System.in);

System.out.print("Nama : ");
String nama=input.nextLine();

System.out.println(
"Total Bayar : Rp"
+session.hitungTotal()
);
```

---

### 13. Array

Array digunakan untuk menyimpan beberapa data.

Contoh:

```java
PelangganStudio pelanggan[]=
new PelangganStudio[10];
```

---

### 14. Error Handling

Error Handling digunakan untuk menangani kesalahan saat program dijalankan.

Contoh:

```java
try{

...

}

catch(Exception e){

System.out.println(
"Terjadi kesalahan : "
+e.getMessage()
);

}
```

---

## Usulan Nilai

| No | Materi | Nilai |
|----|---------|--------|
|1|Class|5|
|2|Object|5|
|3|Atribut|5|
|4|Constructor|5|
|5|Mutator|5|
|6|Accessor|5|
|7|Encapsulation|5|
|8|Inheritance|5|
|9|Polymorphism|10|
|10|Seleksi|5|
|11|Perulangan|5|
|12|IO Sederhana|10|
|13|Array|15|
|14|Error Handling|15|
||**TOTAL**|**100**|

## Pembuat

Nama : Marchella Diva Gantari
NPM : 2410010642  
Judul : Sistem Manajemen Self Photo Studio
