package selfphoto;

//CLASS
public class PaketFoto {

    //ATRIBUT + ENCAPSULATION
    private String tema;
    private int hargaDasar;
    private int durasi;

    //CONSTRUCTOR
    public PaketFoto(String tema, int hargaDasar, int durasi){

        this.tema = tema;
        this.hargaDasar = hargaDasar;
        this.durasi = durasi;

    }

    //ACCESSOR (GETTER)
    public String getTema(){

        return tema;

    }

    public int getHargaDasar(){

        return hargaDasar;

    }

    public int getDurasi(){

        return durasi;

    }

    //MUTATOR (SETTER)
    public void setTema(String tema){

        this.tema = tema;

    }

    //METHOD
    public int hitungTotal(){

        return hargaDasar;

    }

}