import java.util.Formatter;

/**
 * tutorial51
 */
public class tutorial51 {

    public static void main(String[] args) {
        String nama = "Udin"; 
        int umur = 17;

        //output : Namas Saya Udin, Umur saya adalah 17
        System.out.println("Nama Saya  "+nama+", Umur saya adalah "+umur);

        System.out.printf("Nama saya %s, Umur saya adalah %d %%",nama,umur);

        //Convert : floatring point, d = integer, c = character, s=String, b = boolean
        
        //Struktur format = %[argumen_index][flags][width][.precision]conversion
        /** 
         * [argument_index$]
        */
        System.out.println("\n[argument_index$]");

        //udin. wahai udin, kemana saja kamu udin
        System.out.printf("%1$s, wahai %1$s, kemana saja kamu %1$s",nama);
        //umur udin berapa?, udin menjawab 17, wah masih muda ya umurnya 17
        System.out.printf("\numur %1$s berapa ?, \n%1$s menjawab : %2$d \nWah masih Muda ya umurnya %2$d", nama, umur);
        
        /**
         * [flags]
         */
        System.out.println("\n[flags]");
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 - int2;
        System.out.printf("%d-%d = %+d", int1, int2, hasil);

        /**
         * [width]
         */
        System.out.println("\n[width]");
        int int3 = 1000;
        System.out.println("INTEGER");
        System.out.printf("%d\n", int3);
        System.out.printf("%5d\n", int3);
        System.out.printf("%-5d\n", int3); // flags = "-", artinya rata kiri
        System.out.printf("%+5d\n", int3); // flags akan mengambil slot di dalam format
        System.out.printf("%+-6d\n", int3); // flags bisa digabungkan
        System.out.printf("%10d\n", int3);
        System.out.printf("% 10d\n", int3);
        System.out.printf("%010d\n", int3); // flags = "0", kita tambahkan leading "0" didepan
        System.out.printf("%+010d\n", int3);
        System.out.printf("%,10d\n", int3); // flags = ","  , menandakan delimeter per seribu
        int int4 = 1000000000;
        System.out.printf("%,10d\n", int4);


        System.out.println("\nFLOATING POINT");
        float float1 = 1.543f;
        System.out.printf("%f\n", float1);
        System.out.printf("%+9f\n", float1); //floating point akan mengambil width dengan 6 decimal
        
        /**
         * [.precision]
         */
        System.out.println("\n[.precision]");
        float float2 = 15.648f;
        System.out.printf("%f\n", float2);
        System.out.printf("%.1f\n", float2);
        System.out.printf("%.2f\n", float2);
        System.out.printf("%8.2f\n", float2);// digabungkan dengan width
        System.out.printf("%+08.2f\n", float2);// gabungkan dengan witdh dan flag

        //contoh
        String nama2 = "ucup";
        float IPK = 3.7854685413215f;

        System.out.printf("\nIPK %1$s berapa \n%1$s : saya dapet %2$+5.2f", nama2, IPK);
        /**
         * KESIMPULAN
         */
        //Save format ini kedalam variabel String
        String info = "nama : "+nama2+ ", IPK = "+IPK;
        System.out.println("info biasa -> "+info);

        String info_format = String.format("nama : %s, IPK = %2$+5.2f", nama2,IPK);
        System.out.println("info String -> "+info_format);

        //saver format ini kedalam String builder 
        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder=  new Formatter(builder_info);

        formatBuilder.format("nama : %s, IPK = %2$+5.2f", nama2,IPK);
        System.out.println("String builder -> "+builder_info);
    }
}