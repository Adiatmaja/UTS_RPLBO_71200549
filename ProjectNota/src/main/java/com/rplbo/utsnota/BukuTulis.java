package com.rplbo.utsnota;

public class BukuTulis extends Barang {
    private String merk;

    public BukuTulis(String kodebarang, int harga, int berat, String deskripsi, String merk){
        super(kodebarang, harga, berat, deskripsi);
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void getInformasi() {

    }
}
