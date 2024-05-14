import java.util.Arrays;
import java.util.Scanner;

public class Empleado {
    private String nombre;
    private String lugar;
    private int documento;
    private int[] produccion;
    private int[] horas;

    public Empleado(String nombre, String lugar, int documento, int[] produccion, int[] horas) {
        this.nombre = nombre;
        this.lugar= lugar;
        this.documento = documento;
        this.produccion = produccion;
        this.horas = horas;
    }

    public int[] getProduccion() {
        return produccion;
    }

    public void setProduccion(int[] produccion) {
        this.produccion = produccion;
    }

    public int[] getHoras() {
        return horas;
    }

    public void setHoras(int[] horas) {
        this.horas = horas;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }


    
    @Override
    public String toString() {
        return "Empleado [produccion=" + Arrays.toString(produccion) + ", horas=" + Arrays.toString(horas)
             + ", documento=" + documento + ", nombre=" + nombre + ", lugar=" + lugar + "]";
    }

    public String calcularpremio(){
        return nombre;
    }
//El metodo ingresarProducción sera el que nos permitira llenar el vector para La producción de los meses.        
    public void ingresarProduccion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba la producción de los 12 meses:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Producción mes " + (i+1) + ": ");
            produccion[i] = scanner.nextInt();
        }
    }
    public void ingresarHoras(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba las horas de los 12 meses:");
        for (int i = 0; i < 12; i++) {
            System.out.print("horas del mes " + (i+1) + ": ");
            horas[i] = scanner.nextInt();
        }
    }
}
