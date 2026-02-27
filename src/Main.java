public class Main {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int resultado, precio, descuento;
        try {
            System.out.println("Introduce el precio: ");
            precio = lector.nextInt();
            System.out.println("Introduce el descuento: ");
            descuento = lector.nextInt();
            resultado = calcularPrecioFinal(precio,descuento);
            System.out.println(resultado);
        } catch (IllegalArgumentException e){
            System.out.println("Error" + e.getMessage());
        }
    }
    //EJERCICIO 3
     public static int calcularPrecioFinal(int precioBase, int descuento) {

        if (precioBase < 0) {
            throw new IllegalArgumentException("el precio base no puede ser menor que 0");
        }

        if (descuento < 0 || descuento > 100) {
            throw new IllegalArgumentException("el precio base no puede ser menor que 0 o mayor que 100");
        }

        return precioBase - (precioBase * descuento / 100);
    }

    //EJERCICIO 5
    public static int maximo(int[] datos) {
    if (datos == null || datos.length == 0) {
        throw new IllegalArgumentException("El arreglo no puede estar vacío");
    }

    int max = datos[0]; 
    for (int i = 1; i < datos.length; i++) {
        if (datos[i] > max) {
            max = datos[i];
        }
    }
    return max;
}
}
