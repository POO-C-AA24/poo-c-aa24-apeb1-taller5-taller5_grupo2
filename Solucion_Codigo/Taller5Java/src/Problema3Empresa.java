import java.util.ArrayList;

public class Problema3Empresa {
    public static void main(String[] args) {
        String nombreE = "UFC";
        int ruc = 487246300;
        String direccion = "Miami, Florida";

        ArrayList<Problema3Departamento> departamento = new ArrayList<>();
        departamento.add(new Problema3Departamento("UFC Fight Pass", 50, 2000000));
        departamento.add(new Problema3Departamento("UFC Gym", 18, 999999));
        departamento.add(new Problema3Departamento("The Ultimate Fighter", 20, 1000000));
        departamento.add(new Problema3Departamento("UFC Apex", 10, 500000));

        System.out.printf("%s\nRuc: %d\tDirección: %s\n", nombreE, ruc, direccion);

        for (Problema3Departamento dept : departamento) {
            System.out.println(dept);
        }
    }
}
