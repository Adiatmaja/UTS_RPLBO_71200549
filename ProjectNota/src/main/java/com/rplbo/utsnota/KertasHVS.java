package com.rplbo.utsnota;

public class KertasHVS extends Barang {
    private int gram;

    public KertasHVS(String kodebarang, int harga, int berat, String deskripsi, int gram){
        super(kodebarang, harga, berat, deskripsi);
        this.gram = gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }
    public int getGram(){
        return gram;
    }
    public void getInformasi(){

    }
}
