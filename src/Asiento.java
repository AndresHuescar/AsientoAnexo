public class Asiento {
    int fila;
    int columna;
    boolean ocupado;
    double precio;

    public Asiento(int fila, int columna, double precio, boolean ocupado) {
        this.fila = fila;
        this.columna = columna;
        this.precio = precio;
        this.ocupado = ocupado;
    }

    // Info del asiento
    public void mostrarInfo() {
        String estado = ocupado ? "X" : "O";
        System.out.println("Fila: " + fila + " Columna: " + columna +
                " Precio: " + precio + " Estado: " + estado);
    }

    // Metodo para ocupar el asiento
    public void ocupar() {
        ocupado = true;
    }

    // Metodo main para crear la matriz de asientos y mostrar el estado
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 4;
        Asiento[][] sala = new Asiento[filas][columnas];

        // Se llena la matriz con asientos aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                double precio = 5 + Math.random() * 10; // Precio entre 5 y 15
                boolean ocupado = Math.random() < 0.5;   // 50% de probabilidad de estar ocupado
                sala[i][j] = new Asiento(i+1, j+1, precio, ocupado);
            }
        }

        // Muestro el estado completo de la sala en formato visual
        System.out.println("Estado de la sala:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                String estado = sala[i][j].ocupado ? "X" : "O";
                System.out.print(estado + " ");
            }
            System.out.println();
        }

        // Muestro información detallada de cada asiento
        System.out.println("\nInformación completa de cada asiento:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sala[i][j].mostrarInfo();
            }
        }
    }
}
