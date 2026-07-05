package selfphoto;

//CLASS
public class PelangganStudio {

    //ATRIBUT + ENCAPSULATION
    private String nama;
    private String nomorHp;

    //CONSTRUCTOR
    public PelangganStudio(
            String nama,
            String nomorHp){

        this.nama = nama;
        this.nomorHp = nomorHp;

    }

    //ACCESSOR (GETTER)
    public String getNama(){

        return nama;

    }

    public String getNomorHp(){

        return nomorHp;

    }

    //MUTATOR (SETTER)
    public void setNama(String nama){

        this.nama = nama;

    }

    public void setNomorHp(String nomorHp){

        this.nomorHp = nomorHp;

    }

}