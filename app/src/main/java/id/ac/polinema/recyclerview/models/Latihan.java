package id.ac.polinema.recyclerview.models;

public class Latihan {
    public String logo;
    public String nama;
    public String nama1;

    public Latihan(String logo, String nama, String nama1) {
        this.logo = logo;
        this.nama = nama;
        this.nama1 = nama1;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama1() {
        return nama1;
    }

    public void setNama1(String nama1) {
        this.nama1 = nama1;
    }
}
