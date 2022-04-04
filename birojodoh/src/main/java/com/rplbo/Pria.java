package com.rplbo;

public class Pria {
    private String nama;
    private int usia;
    private String status;
    private Double jumlahCinta;
    private Perempuan jodoh;
    private Perempuan temanKencan;

    public Pria(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public void PDKT(Perempuan calon) {
        if (this.temanKencan == null){
            this.temanKencan = calon;
            calon.setTemanKencan(this);
        }
    }

    public void MengajakKencan(Perempuan perempuan) {
        if (perempuan != this.temanKencan) {
            System.out.println("JANGAN SELINGKUH MAS HEI TOLONG\nKAU JANGAN TIDAK SETIA, JANGAN KAU AJAK CEWEK LAIN JALAN!!");
        } else if (perempuan.getTemanKencan().equals(this)) {
            if (this.jumlahCinta != null){
                this.jumlahCinta += 1.0;
            } else {
                this.jumlahCinta = 1.0;
            } if (perempuan.getJumlahCinta() != null){
                perempuan.setJumlahCinta(temanKencan.getJumlahCinta() + 1.0);
            } else {
                perempuan.setJumlahCinta(1.0);
            }
        }
    }

    public void MenembakKekasih() {
        if (this.temanKencan == null){
            System.out.println("SIAPA YANG MAU KAU TEMBAK :') | JANGAN NGAYAL DEH " + this.nama);
        }else if (this.jumlahCinta > temanKencan.getStandarJumlahCinta()) {
            this.jodoh = temanKencan;
            System.out.println("SELAMAT KAMU DI TERIMA :D | SELAMAT MENJALANI HIDUP BARU " + this.nama);
        } else if (this.jumlahCinta <= temanKencan.getStandarJumlahCinta()) {
            System.out.println("MAAF KAMU BELUM CUKUP BAIK!!!");
        }
    }
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return this.usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getJumlahCinta() {
        return this.jumlahCinta;
    }

    public void setJumlahCinta(Double jumlahCinta) {
        this.jumlahCinta = jumlahCinta;
    }

    public Perempuan getJodoh() {
        return this.jodoh;
    }

    public void setJodoh(Perempuan jodoh) {
        this.jodoh = jodoh;
    }

    public Perempuan getTemanKencan() {
        return this.temanKencan;
    }

    public void setTemanKencan(Perempuan temanKencan) {
        this.temanKencan = temanKencan;
    }
}