package View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import Model.Trainer;

public class ViewTrainer {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintStream out = System.out;

    public String CreateNombre() throws IOException {
        out.println("Ingrese nombre");
        return in.readLine();
    }

    public String CreateApellidos() throws IOException {
        out.println("Ingrese apellidos");
        return in.readLine();
    }

    public String CreateCorreo() throws IOException {
        out.println("Ingrese correo");
        return in.readLine();
    }

    public int CreateId() throws IOException {
        out.println("Ingrese id");
        return Integer.parseInt(in.readLine());
    }

    public int CreateCel() throws IOException {
        out.println("Ingrese numero telefonico");
        return Integer.parseInt(in.readLine());
    }

    public int CreateAnniosExp() throws IOException {
        out.println("Ingrese años de experiencia");
        return Integer.parseInt(in.readLine());
    }

    public void MostrarPersonas(Trainer trainer) {
        out.println("Nombre: " + trainer.getNombre() + " Apellidos: " + trainer.getApellidos() + " Correo: "
                + trainer.getCorreo() + " id: " + trainer.getId() + " Telefono: " + trainer.getCel()
                + " Años de experiencia: " + trainer.getAnniosExperiencia());
    }
}
