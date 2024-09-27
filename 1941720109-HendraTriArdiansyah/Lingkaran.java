package pbojs2;
public class Lingkaran {
    double jarijari,luas,phi,diameter,keliling;
    Lingkaran(){
        
    }
    void Lingkaran(int r,double phI){
        phi=phI;
        jarijari=r;
    }
    double luasHitung(){
        luas = jarijari*jarijari*3.14;
        return luas;
    }
    double kelilingHitung(){
        keliling = 2*3.14*jarijari;
        return keliling;
    }
}
