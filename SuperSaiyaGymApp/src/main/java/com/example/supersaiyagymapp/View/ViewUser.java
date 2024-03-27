package demo.src.View;

import java.io.*;

import demo.src.Model.User;

public class ViewUser {
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

    public void MostrarPersonas(User user) {
        out.println("Nombre: " + user.getNombre() + " Apellidos: " + user.getApellidos() + " Correo: "
                + user.getCorreo() + " id: " + user.getId() + " Telefono: " + user.getCel());
    }
}
