package demo.src.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import demo.src.Model.*;

public class ViewAsociacion {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintStream out = System.out;

    public int CreateId() throws IOException {
        out.println("Ingrese ID");
        return Integer.parseInt(in.readLine());
    }

    public int RetrivePersonaId() throws IOException {
        out.println("Ingrese el Id de la persona");
        return Integer.parseInt(in.readLine());
    }

    public int RetriveRolId() throws IOException {
        out.println("Ingrese el Id del rol");
        return Integer.parseInt(in.readLine());
    }

    public void MostrarAsociaciones(Asociacion asociacion) {
        out.println("Id de asociación: " + asociacion.getId() + " Persona: " + asociacion.getPersona() + " Rol: "
                + asociacion.getRol());
    }
}
