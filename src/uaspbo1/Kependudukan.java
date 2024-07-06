package uaspbo1;

public class Kependudukan {
    
    //attribut dan encapsulation
    private String nama;
    private String nk;
    private String alamat;
    private String status;
    private String kewarganegaraan;
   
    //constructor
    public Kependudukan(String nama, String nk, String alamat, String status, String kewarganegaraan) {
        this.nama = nama;
        this.nk = nk;
        this.alamat= alamat;
        this.status=status;
        this.kewarganegaraan=kewarganegaraan;
    }
    
    //constructor
    public Kependudukan() {
        System.out.println("Kosong");   
    }

    //mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    //mutator (setter)
    public void setNk(String nk) {
        this.nk = nk;
    }
    
    //mutator (setter)
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    //mutator (setter)
    public void setStatus(String status) {
        this.status = status;
    }
    
    //mutator (setter)
    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }
    
    //accessor (getter)
    public String getNama() {
        return nama;
    }
    
    //accessor (getter)
    public String getNk() {
        return nk;
    }
    
    //accessor (getter)
    public String getAlamat() {
        return alamat;
    }
    
    //accessor (getter)
    public String getStatus() {
        return status;
    }
    
    //accessor (getter)
    public String getKewarganegaraan() {
        return kewarganegaraan;
    }
    
    //Method tampil
    public String infoTampil(){
        return "Nama : "+getNama()+
                "\nNomor Kependudukan : "+getNk()+
                "\nAlamat : "+getAlamat()+
                "\nStatus : "+getStatus()+
                "\nKewarganegaraan :"+getKewarganegaraan();
    }
    
    //Overloading Method 
    public String infoTampil(String pekerjaan){
        return infoTampil() + "\nPekerjaan :" +pekerjaan;
    }
    
}
