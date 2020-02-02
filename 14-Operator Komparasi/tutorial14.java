/**
 * tutorial14
 */
public class tutorial14 {

    public static void main(String[] args) {
        //Operator Komparasi ... ini akan menghasilkan nilai dalam bentuk boolean
        //Persamaan
        int a,b;
        boolean hasilKomparasi;
        System.out.println("======== PERSAMAAN========");
        a=11;
        b=10;
        hasilKomparasi= (a==b);
        System.out.printf("%d == %d ---> %s \n", a,b, hasilKomparasi);
        a=10;
        b=10;
        hasilKomparasi= (a==b);
        System.out.printf("%d == %d ---> %s \n", a,b, hasilKomparasi);
        //Pertidaksamaan
        System.out.println("======== PERTIDAKSAMAAN========");
        a=11;
        b=10;
        hasilKomparasi= (a!=b);
        System.out.printf("%d != %d ---> %s \n", a,b, hasilKomparasi);
        a=10;
        b=10;
        hasilKomparasi= (a!=b);
        System.out.printf("%d != %d ---> %s \n", a,b, hasilKomparasi);
        //Kurang dari
        System.out.println("======== LESS THAN ========");
        a=11;
        b=10;
        hasilKomparasi= (a<b);
        System.out.printf("%d < %d ---> %s \n", a,b, hasilKomparasi);
        a=10;
        b=10;
        hasilKomparasi= (a<b);
        System.out.printf("%d < %d ---> %s \n", a,b, hasilKomparasi);
        //lebih besar dari
        System.out.println("======== GREATER THAN ========");
        a=11;
        b=10;
        hasilKomparasi= (a>b);
        System.out.printf("%d > %d ---> %s \n", a,b, hasilKomparasi);
        a=10;
        b=10;
        hasilKomparasi= (a>b);
        System.out.printf("%d > %d ---> %s \n", a,b, hasilKomparasi);
        //Kurang dari sama dengan
        System.out.println("======== LESS THAN EQUAL ========");
        a=11;
        b=10;
        hasilKomparasi= (a<=b);
        System.out.printf("%d <= %d ---> %s \n", a,b, hasilKomparasi);
        a=10;
        b=10;
        hasilKomparasi= (a<=b);
        System.out.printf("%d <= %d ---> %s \n", a,b, hasilKomparasi);
        //lebih besar dari
        System.out.println("======== GREATER THAN EQUAL ========");
        a=11;
        b=10;
        hasilKomparasi= (a>=b);
        System.out.printf("%d >= %d ---> %s \n", a,b, hasilKomparasi);
        a=10;
        b=10;
        hasilKomparasi= (a>=b);
        System.out.printf("%d >= %d ---> %s \n", a,b, hasilKomparasi);
        
    }
}