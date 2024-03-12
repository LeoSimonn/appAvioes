public class Aviao {
    private String modelo;
    private int numeroAssentos;
    private double autonomia;

    public Aviao(String modelo, int numeroAssentos, double autonomia) {
        this.modelo = modelo;
        this.numeroAssentos = numeroAssentos;
        this.autonomia = autonomia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroAssentos() {
        return numeroAssentos;
    }

    public void setNumeroAssentos(int numeroAssentos) {
        this.numeroAssentos = numeroAssentos;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "modelo='" + modelo + '\'' +
                ", numeroAssentos=" + numeroAssentos +
                ", autonomia=" + autonomia +
                '}';
    }
}
