package app.tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        Display display1 = new Display("Monitor");
        display1.show();
        Display display2 = new Display("Hanphone");
        display2.show();
        display1.type="Monitor";
        System.out.println("\nMenampilkan Static variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);
    }
}

class Display{
    static String type = "Display";
    private String name;

    Display(String name){
        this.name = name;
    }
    void show(){
        System.out.println("Display name = "+this.name);
    }
    void setType(String typeInput){
        // type = typeInput; //alternatif 1
        // this.type = typeInput; // alternatif 2
        Display.type = typeInput; //alternatif 3
    }
}