import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 1;
        int numeroWhile = 0;
        int numeroDoWhile = 3;
        String estacion = "verano";

        /*if, else if, else*/
        System.out.println(miFuncion(num));

        /* While*/
        miFuncionWhile(numeroWhile);

        /*Do While*/
        miFuncionDoWhile(numeroDoWhile);

        /*For*/
        miFuncionFor();

        /*Switch*/
        miFuncionSwitch(estacion);

    }
    public static String miFuncion (int numeroIf){
        String retorno;
        if(numeroIf > 0){
            retorno = "El numero " +numeroIf+ " es positivo";
        } else if (numeroIf < 0) {
            retorno = "El numero " +numeroIf+ " es negativo";
        }
        else{
            retorno ="El numero es 0";
        }
        return retorno;
    }
    public static void miFuncionWhile(int numeroWhile ){

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("Valor actual: " + numeroWhile);
        }
        System.out.println("Fin del bucle while");
    }
    public static void miFuncionDoWhile(int numeroDoWhile) {
        do {
            numeroDoWhile++;
            System.out.println("Valor actual: " + numeroDoWhile);
        } while (numeroDoWhile < 3);
        System.out.println("Fin del bucle do while");
    }
    public static void miFuncionFor(){
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Valor actual: " + numeroFor);
        }
        System.out.println("Fin del bucle For");
    }
    public static void miFuncionSwitch(String estacion){

        switch (estacion){
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en verano");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("El valor no corresponde a ninguna estacion");
        }
    }
}