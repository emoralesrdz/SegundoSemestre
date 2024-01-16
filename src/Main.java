import java.util.Arrays;
import java.util.Scanner;
public class Main {
    private static final String[] Attrs={"la Marca:","el Color:","el numero de llantas:","el numero de personas:","la Rodada:","el Tipo:"};
    private static final Object[] Datos = new Object[Attrs.length];
    public static void main(String[] args) {
        System.out.println("Ingresar los datos:");
        Object[] Res= (Object[]) inputdata(0);
        System.out.println(Arrays.toString(Res));
        Bicicleta obj= new Bicicleta((String) Res[0],(String)Res[1], (Integer) Res[2],(Integer) Res[3],(Integer) Res[4],(String) Res[5]);
        obj.Info();
    }
    public static Object inputdata(int idx) {
        System.out.println("Ingrese " + Attrs[idx]);
        Scanner dato = new Scanner(System.in);
        if (dato.hasNextInt()) {
            Datos[idx] = dato.nextInt();
        } else {
            Datos[idx] = dato.nextLine();
        }
        idx++;
        if (idx < Attrs.length) {
            return inputdata(idx);
        } else {
            return Datos;
        }
    }
}