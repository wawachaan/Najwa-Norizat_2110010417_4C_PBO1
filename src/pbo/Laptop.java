
package pbo;

public class Laptop {
//atribut dan enkapsulasi
    private String nama;
    private String jenis ;
    private String seri;
   
    
//construktor
    public Laptop(String nama, String jenis, String seri) {
        this.nama = nama;
        this.jenis = jenis;
        this.seri = seri;
    }
    
//mutator (setter)
     public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

//accesor (getter)
    public String getNama() {
        return nama;
    }
    public String getJenis() {
        return jenis;
    }

    public String getSeri() {
        return seri;
    }
    
    public String displayInfo(){
       return  "Nama: "+getNama()+
               "\nJenis: "+getJenis()+
              "\nSeri: "+getSeri(); 
    }
    
//polymorphism (overloading)
    public String displayInfo(String kelas){
        return displayInfo() + "\nKelas: "+kelas;
    }
}
