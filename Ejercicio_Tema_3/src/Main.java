public class Main {
    public static void main(String[] args) {
        var retorno = miFuncion(10,5,15);
        System.out.println("Suma de miFuncion: " +retorno);

        Auto miAuto = new Auto();
        miAuto.agregarPuertas();

        System.out.println("Cantidad de puertas: " + miAuto.cantidadPuertas);
    }
    public static int miFuncion(int a, int b, int c){
        return a + b + c;
    }
}
class Auto{
    public int cantidadPuertas = 0;

    public void agregarPuertas(){
        this.cantidadPuertas++;
    }
}