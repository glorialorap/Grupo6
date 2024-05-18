import java.util.LinkedList;
import java.util.Scanner;
public class App {
    LinkedList <Empleado> empleados = new LinkedList();
    
    //Se crea la lista para los empleados haciendo uso de colecciones
    Scanner scanner = new Scanner(System.in);
    public void menu(){
        int op = 0;
        do {
            System.out.println("----MENU----");
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Dar de alta a un trabajador");
            System.out.println("2. Dar de baja a un trabajador");
            System.out.println("3. Revisar el rendimiento de un trabajador");
            System.out.println("4. Decidir al ganador del premio por ser el mayor productor");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    Alta();
                    break;
                case 2:
                    Baja();
                    break;
                case 3:
                    Mostrar();
                    break;  
                case 4:
                    Ganador();
                default:
                System.out.println("Escoja una opción valida.");
            }
            
        } while (op != 0);
    }//FIn del menu
    public void Alta(){
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Escriba el nombre del trabajador");
        String nom = scanner.next();
        String nomPattern = "^[a-zA-Z\\s]+$";
        if (nom.matches(nomPattern)) {
            System.out.println("Nombre válido: " + nom);
        } else {
            System.out.println("Nombre inválido. Por favor, ingrese solo letras y espacios.");
        }
       
        System.out.println("Escriba el lugar donde trabajo");
        String lug = scanner.next();
        try {
            System.out.println("Escriba el documento del trabajador");
            String doc= Teclado.nextLine();     
            String docPattern = "^\\+(?:[0-9] ?){10,10}[0-9]$";
            if (doc.matches(docPattern)) {
                System.out.println("Número de teléfono válido");
            } else {
                System.out.println("Número de teléfono no válido");
            }
        }catch (Exception e) {//exepciones
                System.out.println("Se produjo un error al leer el número de teléfono: " + e.getMessage());
            }
            
        System.out.println("Escriba el documento del trabajador (10#ros)");
        int doc = scanner.nextInt();
        Empleado nuevoEmpleado = new Empleado(nom, lug, doc, new int[12], new int[12]);
        nuevoEmpleado.ingresarProduccion(); // Llamamos al método para ingresar la producción
        nuevoEmpleado.ingresarHoras();//Llamamos el método para ingresar las Horas
        empleados.add(nuevoEmpleado);
    }//Fin del Alta
    public void Baja(){
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }else{
            System.out.println("Ingrese el documento que desea eliminar:");
            int doc = scanner.nextInt();
            boolean encontrado = false;
            for (Empleado empleado : empleados){
                if (empleado.getDocumento()==doc){
                    empleados.remove(empleado);
                    encontrado = true;
                    System.out.println("El empleado ha sido dado de baja");
                    break;
                }if (!encontrado){
                    System.out.println("Documento no encontrado");
                }
            } 
        }
        
    }//Fin del baja
    public void Mostrar(){
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }else{
            System.out.println("Ingrese el documento que desea buscar:");
            int doc = scanner.nextInt();
            for (Empleado empleado : empleados){
                if (empleado.getDocumento()==doc){
                    System.out.println(empleado.toString());
                }else{
                    System.out.println("Documento no encontrado");
                }
            }
        }
        
    }//fin del mostrar
    public void Ganador(){
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }
    
        Empleado mayorProductor = null;
        int diferenciaMaxima = Integer.MIN_VALUE;
    
        for (Empleado empleado : empleados) {
            int maxProduccion = Integer.MIN_VALUE;
            int minProduccion = Integer.MAX_VALUE;
    
            for (int produccion : empleado.getProduccion()) {
                if (produccion > maxProduccion) {
                    maxProduccion = produccion;
                }
                if (produccion < minProduccion) {
                    minProduccion = produccion;
                }
            }
    
            int diferencia = (maxProduccion - minProduccion) * 10;
            if (diferencia > diferenciaMaxima) {
                diferenciaMaxima = diferencia;
                mayorProductor = empleado;
            }
        }
    
        if (mayorProductor != null) {
            System.out.println("El mayor productor es: " + mayorProductor.getNombre());
            System.out.println("Diferencia de producción: " + diferenciaMaxima);
        } else {
            System.out.println("No se encontró ningún empleado.");
        }
    }
    
}

