/**
 * Created by User on 5/12/2015.
 */
public class kendaraan {
    public int KecepatanMax;
    public int Berat;
    public int Kapasitas;

    public kendaraan() {
        KecepatanMax = 20;
        System.out.println("Kecepatan Maka Kendaraan:"+KecepatanMax);
    }
}

class Mobil extends kendaraan {
    public int JumblahRoda;
    public Mobil(int h, int i, int j, int k){
        KecepatanMax = h;
        Berat = i;
        Kapasitas = j;
        JumblahRoda = k;
    }
    public void CetakSpesifikasi(){
        System.out.println("Kecepatan Max Mobil: "+ KecepatanMax);
        System.out.println("Berat Mobil :"+ Berat);
        System.out.println("Kapasitas Power :"+ Kapasitas);
        System.out.println("Jumblah Kamera :"+ JumblahRoda);
        System.out.println();

    }

    public void jalankan(int j){
        KecepatanMax = j;
        System.out.println("mobil dijalankan dengan kecepatan : "+KecepatanMax);
    }
}
