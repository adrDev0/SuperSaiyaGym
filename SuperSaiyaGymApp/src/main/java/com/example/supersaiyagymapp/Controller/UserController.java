package demo.src.Controller;

import demo.src.View.*;
import demo.src.Model.*;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class UserController {
    private static final PrintStream out = System.out;

    private ViewMenu vista = new ViewMenu();
    private static ArrayList<User> usuarios = new ArrayList<>();

    public UserController(ViewMenu vista) {
        this.vista = vista;
    }

    public void ejecutarPersona() throws IOException {
        int opcionPersona;
        ViewUser vistaPersona = new ViewUser();
        // Menú personas
        opcionPersona = vista.MenuPersonas();
        do {
            switch (opcionPersona) {
                case 1:
                    // Agregar persona
                    String nombre, apellidos, correo;
                    int id, cel;
                    nombre = vistaPersona.CreateNombre();
                    apellidos = vistaPersona.CreateApellidos();
                    correo = vistaPersona.CreateCorreo();
                    id = vistaPersona.CreateId();
                    cel = vistaPersona.CreateCel();

                    User persona = new User(nombre, apellidos, correo, id, cel);
                    usuarios.add(persona);
                    out.println("Persona creada correctamente");
                    return;
                case 2:
                    // Mostrar personas
                    if (usuarios.isEmpty()) {
                        out.println("No hay personas");
                        return;
                    } else {
                        out.println("Lista de personas:");
                        for (User personas : usuarios) {
                            vistaPersona.MostrarPersonas(personas);
                        }
                    }
                    return;
                case 3:
                    // Actualizar persona
                    String nombreNuevo, apellidosNuevos, correoNuevo;
                    int idNuevo, celNuevo, searchId = vistaPersona.CreateId();
                    User personaId = MostrarPersonaId(searchId);
                    if (personaId != null) {
                        nombreNuevo = vistaPersona.CreateNombre();
                        apellidosNuevos = vistaPersona.CreateApellidos();
                        correoNuevo = vistaPersona.CreateCorreo();
                        idNuevo = vistaPersona.CreateId();
                        celNuevo = vistaPersona.CreateCel();
                        personaId.setNombre(nombreNuevo);
                        personaId.setApellidos(apellidosNuevos);
                        personaId.setCorreo(correoNuevo);
                        personaId.setId(idNuevo);
                        personaId.setCel(celNuevo);
                        out.println("Persona actualizada");
                    } else {
                        out.println("Persona no encontrada");
                    }
                    return;
                case 4:
                    // Eliminar usuario
                    int idEliminar = vistaPersona.CreateId();
                    User personaEliminar = MostrarPersonaId(idEliminar);
                    if (personaEliminar != null) {
                        usuarios.remove(personaEliminar);
                        out.println("Persona eliminada correctamente");
                    } else {
                        out.println("Persona no encontrada");
                    }
                    return;
                default:
                    out.println("Opcion invalida");
                    return;
            }
        } while (opcionPersona != 5);
    }

    public User MostrarPersonaId(int id) {
        for (User persona : usuarios) {
            if (persona.getId() == id) {
                return persona;
            }
        }
        return null;
    }
}
