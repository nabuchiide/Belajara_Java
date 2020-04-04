package app.tutorial;

public class App {
    public static void main(final String[] args) throws Exception {
        final Data object = new Data();

        // read and write data public
        object.intPublic = 1;// write
        System.out.println("Public -> " + object.intPublic);// read

        // read only ---> Menggunakan Getter
        final int angka = object.getIntPrivate();
        System.out.println("Getter -> " + angka);

        // write only ----> menggunakan Setter
        object.setDoublePrivate(0.05);
        object.show();

        //gabungkan read dan write dengan setter dan getter
        Lingkaran obj2 = new Lingkaran(5);
        System.out.println("Jari-jari => "+obj2.getJari2());
        obj2.setJari2(14);
        System.out.println("Jari-jari => "+obj2.getJari2());
        System.out.println("Luas => "+obj2.getLuas());

    }
}

class Data {
    public int intPublic;
    private final int intPrivate;
    private double doublePrivate;

    public Data() {
        this.intPrivate = 10;
        this.intPublic = 0;
    }

    // getter
    public int getIntPrivate() {
        return this.intPrivate;
    }

    // setter
    public void setDoublePrivate(final double value) {
        this.doublePrivate = value;
    }

    void show() {
        System.out.println("===============================================");
        System.out.println("Public intPublic->" + this.intPublic);
        System.out.println("Private intPrivate ->" + this.intPrivate);
        System.out.println("Private doublePrivate ->" + this.doublePrivate);
        System.out.println("===============================================");

    }
}

class Lingkaran {
    private double diameter;

    Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    // setter
    public void setJari2(double jari2) {
        this.diameter = jari2 * 2;
    }

    //setter
    public double getJari2(){
        return this.diameter/2;
    }
    public double getLuas(){
        return 3.14*diameter*diameter/4;
    }
}