public class Problema2Materia {
    public String nombreV;
    public double ACD;
    public double APE;
    public double AA;

    public Problema2Materia(String nombreV, double ACD, double APE, double AA) {
        this.nombreV = nombreV;
        this.ACD = ACD;
        this.APE = APE;
        this.AA = AA;
    }
    
    public String getNombre() {
        return nombreV;
    }

    public double getACD() {
        return ACD;
    }

    public double getAPE() {
        return APE;
    }

    public double getAA() {
        return AA;
    }

    @Override
    public String toString() {
        return "\t\tMateria\n" + "Nombre de la materia: " + nombreV + "\t ACD: " + ACD +
               "\tAPE: " + APE + "\tAA: " + AA;
    }
}
