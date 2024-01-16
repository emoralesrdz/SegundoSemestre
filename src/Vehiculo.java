
public class Vehiculo {
    private String Marca;
   private String Color;
    private int NueroDeLlantas;
    private int NumeroDePersonas;
    public Vehiculo(String Marca,String Color,int NueroDeLlantas,int NumeroDePersonas){
        this.Marca=Marca;
        this.Color=Color;
        this.NueroDeLlantas=NueroDeLlantas;
        this.NumeroDePersonas=NumeroDePersonas;
    }

    public int getNueroDeLlantas() {
        return NueroDeLlantas;
    }

    public void setNueroDeLlantas(int nueroDeLlantas) {
        NueroDeLlantas = nueroDeLlantas;
    }

    public int getNumeroDePersonas() {
        return NumeroDePersonas;
    }

    public void setNumeroDePersonas(int numeroDePersonas) {
        NumeroDePersonas = numeroDePersonas;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}

