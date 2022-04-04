package com.rplbo.utsnota;

public class Nota {
    private String nonota;
    private String notelppembeli;
    private Item items;
    private String namapembeli;

    public Nota (String nonota, String namapembeli, String notelppembeli, Item items){
        this.nonota = nonota;
        this.namapembeli = namapembeli;
        this.notelppembeli = notelppembeli;
        this.items = items;
    }
    public String getNonota() {
        return nonota;
    }

    public void setNonota(String nonota) {
        this.nonota = nonota;
    }

    public String getNotelppembeli() {
        return notelppembeli;
    }

    public void setNotelppembeli(String notelppembeli) {
        this.notelppembeli = notelppembeli;
    }

    public Item getItems() {
        return items;
    }

    public void setItems(Item items) {
        this.items = items;
    }

    public String getNamapembeli() {
        return namapembeli;
    }

    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }

    public void tampilNota() {
        System.out.println("No Nota : " + getNonota());
        System.out.println("Nama Pembeli : " + getNamapembeli());
        System.out.println("Telp pembeli : " + getNotelppembeli());
        System.out.println("Tgl : ");
    }

    public String hitungTotalBayar() {

    }
}
