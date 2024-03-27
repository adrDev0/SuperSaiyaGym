package View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import Model.FreeWeights;

public class ViewFreeWeights {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintStream out = System.out;

    public int CreateId() throws IOException {
        out.println("Ingrese ID");
        return Integer.parseInt(in.readLine());
    }

    public String CreateBarType() throws IOException {
        out.println("Ingrese el tipo de barra (mancuerna, barra olimpica, barra z...)");
        return in.readLine();
    }

    public int CreateWeigth() throws IOException {
        out.println("Ingrese el peso que viene con la barra en libras");
        return Integer.parseInt(in.readLine());
    }

    public int CreateCant() throws IOException {
        out.println("Ingrese la cantidad de pesos libres");
        return Integer.parseInt(in.readLine());
    }

    public void MostrarFreeWeigths(FreeWeights freeWeights) {
        out.println("Id: " + freeWeights.getId());
        out.println("Tipo de barra: " + freeWeights.getBarType());
        out.println("Peso: " + freeWeights.getWeight() + "Lb");
        out.println("Cantidad: " + freeWeights.getCant());
    }
}
