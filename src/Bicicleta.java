public class Bicicleta extends Vehiculo {
    private int Rodada;
    private String Tipo;
    public Bicicleta(String Marca, String Color, int NueroDeLlantas, int NumeroDePersonas,int Rodada,String Tipo) {
        super(Marca,Color,NueroDeLlantas,NumeroDePersonas);
        this.Rodada=Rodada;
        this.Tipo=Tipo;
    }
    public void Info(){
        System.out.println("Marca: "+getMarca()+"\nColor: "+getColor()+"\nNumero de llantas: "+getNueroDeLlantas()+"\nNumero de personas: "+getNumeroDePersonas()+"\nRodada: "+Rodada+"\nTipo: "+Tipo);
    }
}
