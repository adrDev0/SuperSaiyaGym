// package Controller;

// import java.io.IOException;
// import java.io.PrintStream;
// import java.util.ArrayList;

// import Model.*;
// import View.ViewAsociacion;
// import View.ViewMenu;

// public class AsociacionController {
// private static final PrintStream out = System.out;

// private ViewMenu vista = new ViewMenu();
// private static ArrayList<Asociacion> asociacions = new ArrayList<>();
// UserController personaController = new UserController(vista);
// RolController rolController = new RolController(vista);

// public AsociacionController(ViewMenu vista) {
// this.vista = vista;
// }

// public void ejecutarAsociacion() throws IOException {
// int opcion;
// ViewAsociacion vistaAsociacion = new ViewAsociacion();
// opcion = vista.MenuAsociacion();
// do {
// switch (opcion) {
// case 1:
// // Agregar asociacion
// int id, personaId, rolId;

// id = vistaAsociacion.CreateId();
// personaId = vistaAsociacion.RetrivePersonaId();
// rolId = vistaAsociacion.RetriveRolId();
// Persona persona = personaController.MostrarPersonaId(personaId);
// Rol rol = rolController.MostrarRolId(rolId);

// if (persona != null || rol != null) {
// String personaNombre = persona.getNombre(), rolNombre = rol.getNombre();
// Asociacion asociacion = new Asociacion(id, personaNombre, rolNombre);
// asociacions.add(asociacion);
// } else {
// out.println("La persona o el rol no han podidio ser encontradas");
// }
// return;

// case 2:
// // Mostrar asociaciones
// if (asociacions.isEmpty()) {
// out.println("No hay asociaciones");
// return;
// } else {
// out.println("Lista de asociaciones:");
// for (Asociacion asociacion : asociacions) {
// vistaAsociacion.MostrarAsociaciones(asociacion);
// }
// }
// return;

// case 3:
// // Actualizar asociacion por id
// int nuevoId, searchId = vistaAsociacion.CreateId(), personaIdNuevo,
// rolIdNuevo;

// Asociacion asociacion = MostrarAsociacionId(searchId);
// if (asociacion != null) {
// nuevoId = vistaAsociacion.CreateId();
// personaIdNuevo = vistaAsociacion.RetrivePersonaId();
// rolIdNuevo = vistaAsociacion.RetriveRolId();
// Persona nuevaPersona = personaController.MostrarPersonaId(personaIdNuevo);
// Rol nuevoRol = rolController.MostrarRolId(rolIdNuevo);

// if (nuevaPersona != null || nuevoRol != null) {
// asociacion.setId(nuevoId);
// asociacion.setPersona(nuevaPersona.getNombre());
// asociacion.setRol(nuevoRol.getNombre());
// out.println("Asociacion actualizada");
// } else {
// out.println("La persona o el rol no han podidio ser encontradas");
// }
// }
// return;

// case 4:
// // Eliminar asociacion
// int idEliminar = vistaAsociacion.CreateId();
// Asociacion asociacionEliminar = MostrarAsociacionId(idEliminar);
// if (asociacionEliminar != null) {
// asociacions.remove(asociacionEliminar);
// out.println("Asociación eliminada correctamente");
// } else {
// out.println("Asociación no encontrada");
// }
// return;

// default:
// return;
// }
// } while (opcion != 5);
// }

// public Asociacion MostrarAsociacionId(int id) {
// for (Asociacion asociacion : asociacions) {
// if (asociacion.getId() == id) {
// return asociacion;
// }
// }
// return null;
// }
// }
