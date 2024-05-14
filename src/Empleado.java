public class Empleado {
    private int [] produccion,horas;
    private int salario;
    private String nombre,lugar;
    public Empleado(int[] produccion, int[] horas, int salario, String nombre, String lugar) {
        this.produccion = produccion;
        this.horas = horas;
        this.salario = salario;
        this.nombre = nombre;
        this.lugar = lugar;
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
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
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



    
}
