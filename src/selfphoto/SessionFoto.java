package selfphoto;

//INHERITANCE
public class SessionFoto extends PaketFoto{

    //ATRIBUT
    private int biayaTambahanWaktu;
    private int biayaHewan;
    private int biayaHasilFoto;
    private int biayaJumlahOrang;

    //CONSTRUCTOR
    public SessionFoto(
            String tema,
            int hargaDasar,
            int durasi,
            int biayaTambahanWaktu,
            int biayaHewan,
            int biayaHasilFoto,
            int biayaJumlahOrang){

        super(
                tema,
                hargaDasar,
                durasi
        );

        this.biayaTambahanWaktu = biayaTambahanWaktu;
        this.biayaHewan = biayaHewan;
        this.biayaHasilFoto = biayaHasilFoto;
        this.biayaJumlahOrang = biayaJumlahOrang;

    }

    //POLYMORPHISM (OVERRIDE)

    @Override
    public int hitungTotal(){

        return getHargaDasar()
                + biayaTambahanWaktu
                + biayaHewan
                + biayaHasilFoto
                + biayaJumlahOrang;

    }

}