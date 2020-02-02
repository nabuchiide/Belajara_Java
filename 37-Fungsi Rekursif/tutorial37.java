import java.util.*;

/**
 * tutorial37
 */
public class tutorial37 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        int nilai = userInput.nextInt();
        System.out.println("anda memasukan nilai : "+nilai);
        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("Maka jumlah dari keseluruhan paramter adalah : "+jumlah);
        int Faktorial = Faktorial(nilai);
        System.out.println("Maka Nilai Faktorial dari input nilai adalah :"+Faktorial);

    }
    private static void printNilai(int parameter) {
        System.out.println("nilai = "+parameter);
        if (parameter == 0) {
            return;
        }
        parameter--;
        printNilai(parameter);
    }

    private static int jumlahNilai (int paramter) {
        System.out.println("Parameter = "+paramter);
        if (paramter == 0) {
            return paramter;
        }
        return paramter + jumlahNilai(paramter-1);
    }
    private static int Faktorial(int parameter) {
        System.out.println("nilai yang akan di faktorialkan : "+parameter);
        if (parameter == 1) {
            return parameter;
        }
        return parameter * Faktorial(parameter-1);
    }
}