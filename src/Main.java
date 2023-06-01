import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio");
        Scanner entrada = new Scanner(System.in);
        bicicleta mibicicleta = new bicicleta();
        bicicleta tubicicleta = new bicicleta();
        bicicleta nuestrabicicleta = new bicicleta();
        System.out.println("Ingresar las marchas:");
        int temporal = entrada.nextInt();
        mibicicleta.setMarchas(temporal);
        int temporal2 = entrada.nextInt();
        tubicicleta.setMarchas(temporal2);
        int temporal3 = entrada.nextInt();
        nuestrabicicleta.setMarchas(temporal3);
        System.out.println(mibicicleta.getMarchas());
        System.out.println(tubicicleta.getMarchas());
        System.out.println(nuestrabicicleta.getMarchas());
    }
}