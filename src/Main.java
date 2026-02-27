public class Main {

    //EJERCICIO 3
    public static int calcularPrecioFinal(int precioBase, int descuento) {

        if (precioBase < 0) {
            System.out.println("El precio base no puede ser negativo.");
            return -1;
        }

        if (descuento < 0 || descuento > 100) {
            System.out.println("El descuento debe estar entre 0 y 100.");
            return -1;
        }

        return precioBase - (precioBase * descuento / 100);
    }

    //EJERCICIO 5
    public static int maximo(int[] datos) {

        if (datos == null || datos.length == 0) {
            System.out.println("El array está vacío o es null.");
            return -1; // valor de error
        }

        int max = datos[0];  // Se inicializa correctamente

        for (int i = 1; i < datos.length; i++) {
            if (datos[i] > max) {
                max = datos[i];
            }
        }

        return max;
    }
}