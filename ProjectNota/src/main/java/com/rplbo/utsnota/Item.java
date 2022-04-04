package com.rplbo.utsnota;

public class Item {
    private KertasHVS krhvs;
    private BukuTulis bktulis;
    private Pulpen pen;

    Item(KertasHVS krhvs){
        this.krhvs = krhvs;
    }
    Item(BukuTulis bktulis){
        this.bktulis = bktulis;
    }
    Item(Pulpen pen){
        this.pen = pen;
    }
    Item(BukuTulis bktulis, Pulpen pen){
        this.bktulis = bktulis;
        this.pen = pen;
    }
    Item(KertasHVS krhvs, Pulpen pen){
        this.krhvs = krhvs;
        this.pen = pen;
    }
    Item(BukuTulis bktulis, KertasHVS krhvs){
        this.bktulis = bktulis;
        this.krhvs = krhvs;
    }
    Item(BukuTulis bktulis, KertasHVS krhvs, Pulpen pen){
        this.bktulis = bktulis;
        this.krhvs = krhvs;
        this.pen = pen;
    }
    public int getJumlahBukuTulis(){

    }
    public int getJumlahPen(){

    }
    public Pulpen getPen(){
        return pen;
    }
    public int getJumlahKertasHVS(){

    }
    public BukuTulis getBktulis(){
        return bktulis;
    }
    public KertasHVS getKrhvs(){
        return krhvs;
    }
}
