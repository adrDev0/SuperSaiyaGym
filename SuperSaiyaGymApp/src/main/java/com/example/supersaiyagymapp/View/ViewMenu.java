package View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ViewMenu {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintStream out = System.out;

    public int Menu() throws IOException {
        out.println("Menú SuperSaiyaGym.");
        out.println("1.Gestionar usuarios.");
        out.println("2.Gestionar entrenadores.");
        out.println("3.Gestionar maquinas.");
        out.println("4.Gestionar pesos libres.");
        out.println("5.Gestionar ejercicios.");
        out.println("6.Gestionar planes.");
        out.println("7.Gestionar clases.");
        out.println("8.Gestionar productos.");
        out.println("9.Salir.");
        return Integer.parseInt(in.readLine());
    }

    public int MenuPersonas() throws IOException {
        out.println("Menú usuarios.");
        out.println("1.Agregar usuarios.");
        out.println("2.Mostrar usuarios.");
        out.println("3.Actualizar usuarios por ID.");
        out.println("4.Eliminar usuarios.");
        out.println("5.Salir.");
        return Integer.parseInt(in.readLine());
    }

    public int MenuTrainer() throws IOException {
        out.println("Menú entrenadores.");
        out.println("1.Agregar entrenador.");
        out.println("2.Mostrar entrenadores.");
        out.println("3.Actualizar entrenador por ID.");
        out.println("4.Eliminar entrenador.");
        out.println("5.Salir.");
        return Integer.parseInt(in.readLine());
    }

    public int MenuMachine() throws IOException {
        out.println("Menú maquinas.");
        out.println("1.Agregar maquina.");
        out.println("2.Mostrar maquinas.");
        out.println("3.Actualizar maquina por ID.");
        out.println("4.Eliminar maquina.");
        out.println("5.Salir.");
        return Integer.parseInt(in.readLine());
    }

    public int MenuFreeWeights() throws IOException {
        out.println("Menú pesos libres.");
        out.println("1.Agregar peso libre.");
        out.println("2.Mostrar pesos libres.");
        out.println("3.Actualizar peso libre por ID.");
        out.println("4.Eliminar peso libre.");
        out.println("5.Salir.");
        return Integer.parseInt(in.readLine());
    }

    public int MenuExercise() throws IOException {
        out.println("Menú ejercicio.");
        out.println("1.Agregar ejercicio.");
        out.println("2.Mostrar ejercicios.");
        out.println("3.Actualizar ejercicio por ID.");
        out.println("4.Eliminar ejercicio.");
        out.println("5.Salir.");
        return Integer.parseInt(in.readLine());
    }

    public int MenuPlan() throws IOException {
        out.println("Menú planes.");
        out.println("1.Agregar plan.");
        out.println("2.Mostrar planes.");
        out.println("3.Actualizar plan por ID.");
        out.println("4.Eliminar plan.");
        out.println("5.Salir.");
        return Integer.parseInt(in.readLine());
    }

    public int MenuClases() throws IOException {
        out.println("Menú clases.");
        out.println("1.Agregar clase.");
        out.println("2.Mostrar clases.");
        out.println("3.Actualizar clase por ID.");
        out.println("4.Eliminar clase.");
        out.println("5.Salir.");
        return Integer.parseInt(in.readLine());
    }

    public int MenuProducts() throws IOException {
        out.println("Menú productos.");
        out.println("1.Agregar producto.");
        out.println("2.Mostrar productos.");
        out.println("3.Actualizar producto por ID.");
        out.println("4.Eliminar producto.");
        out.println("5.Salir.");
        return Integer.parseInt(in.readLine());
    }

    // public int MenuAsociacion() throws IOException {
    // out.println("Menú asociación.");
    // out.println("1.Agregar asociación.");
    // out.println("2.Mostrar asociaciones.");
    // out.println("3.Actualizar asociación por ID.");
    // out.println("4.Eliminar asociación.");
    // out.println("5.Salir.");
    // return Integer.parseInt(in.readLine());
    // }
}
