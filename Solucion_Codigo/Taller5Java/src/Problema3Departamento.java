class Problema3Departamento {
    public String nombre;
    public int empleados;
    public double produccion;
    public String categoria;

    public Problema3Departamento(String nombre, int empleados, double produccion) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.produccion = produccion;
        clasificar();  
    }

    public void clasificar() {
        if (empleados <= 10 && produccion <= 500000) {
            categoria = "C";
        } else if (empleados <= 20 && produccion <= 1000000) {
            categoria = "B";
        } else if (empleados > 20 && produccion > 1000000) {
            categoria = "A";
        }
    }

    @Override
    public String toString() {
        return "Nombre del departamento= " + nombre + "\nEmpleados=" + empleados +
               "\tProduccion="  + produccion + "\tCategoria= " + categoria;
    }
}
