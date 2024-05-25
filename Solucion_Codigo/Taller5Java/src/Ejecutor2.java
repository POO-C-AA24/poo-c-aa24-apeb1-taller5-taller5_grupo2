import java.util.Scanner;
import java.util.ArrayList;
import java.util.Locale;

public class Ejecutor2 {
    public static void main(String[] args) {
        ArrayList<Problema2Estudiante> estudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese el nombre del estudiante ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad ");
        int edad = scanner.nextInt();
        scanner.nextLine();  

        Problema2Estudiante estudiante = new Problema2Estudiante(nombre, edad);
        estudiantes.add(estudiante);

        System.out.print("Ingrese el nombre de la materia ");
        String nombreM = scanner.nextLine();
        System.out.print("Digite la calificación ACD ");
        double ACD = scanner.nextDouble();
        System.out.print("Digite la calificación APE ");
        double APE = scanner.nextDouble();
        System.out.print("Digite la calificación AA ");
        double AA = scanner.nextDouble();

        Problema2Materia materia = new Problema2Materia(nombreM, ACD, APE, AA);

        estudiante.agregarMateria(materia);

        estudiante.calcuarPromedio(ACD, APE, AA);

        System.out.println(estudiante);
        System.out.println(materia);
    }
}
