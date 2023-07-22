
package pbo;


public class LaptopDetail extends Laptop {
     //    overriding
    public LaptopDetail(String nama, String jenis, String seri) {
        super(nama, jenis, seri);
    }
    
    public String getMerk(){
        String kodeLaptop = getSeri().substring(0, 1);
//        seleksi switch
        switch (kodeLaptop){
            case "A":
                return "ACER";
            case "B":
                return "ASUS";
            case "C":
                return "LENOVO";
            default:
                return "Merk Tidak Tersedia";
        }
    }
    
    public int getTahunProduksi() {
        return Integer.parseInt(getSeri().substring(2, 4)) + 2000;
    }
    

//    polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo() +
                "\nMerk Leptop: "+getMerk()+
                "\nTahun Produksi: "+getTahunProduksi();
         
    }  
}
