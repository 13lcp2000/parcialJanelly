package parcialDiego;

public class Estudiante {

    private double nota1 = 0.0;
    private double nota2 = 0.0;
    private double nota3 = 0.0;
    private double definitiva = 0.0;

    public Estudiante() {
    }

    public Estudiante(double nota1, double nota2, double nota3) {

        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.definitiva = calcularDefinitiva();
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calcularDefinitiva() {
        return ((nota1 + nota2 + nota3) / 3);
    }

    @Override
    public String toString() {
        return "Las notas del estudiante son: \n"
                + "nota1=" + nota1
                + ",\n nota2=" + nota2
                + ",\n nota3=" + nota3
                + ",\n definitiva=" + definitiva;
    }

}
