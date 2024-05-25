import java.util.Scanner;

public class Problema2Estudiante {
    public String nombre;
    public int edad;
    public Problema2Materia materia;

    public Problema2Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void agregarMateria(Problema2Materia materia) {
        this.materia = materia;
    }

    public void calcuarPromedio(double ACD, double APE, double AA) {
        double promedio = (ACD + APE + AA)/3;

        if (promedio >= 7) {
            System.out.printf("El estudiante ha aprobado con un promedio de %.2f%n", promedio);
        } else {
            System.out.printf("El estudiante no ha aprobado. promedio %.2f%n", promedio);
            System.out.println("Debe rendir un examen de recuperación.");
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese la nota del examen de recuperacion");
            double examen = entrada.nextDouble();
            double nuevoTotal = (promedio * 0.6) + examen;

            if (nuevoTotal >= 7) {
                System.out.println("El estudiante ha aprobado después del examen de recuperación con un total de: " + nuevoTotal);
            } else {
                System.out.println("El estudiante no ha aprobado después del examen de recuperación. Total: " + nuevoTotal);
            }
        }
    }
    
    @Override
    public String toString() {
        return "\tEstudiante\n" + "Nombre: " + nombre + "\tEdad: " + edad;
    }
            
}
