package View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import Model.Exercise;

public class ViewExercise {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintStream out = System.out;

    public int CreateId() throws IOException {
        out.println("Ingrese id");
        return Integer.parseInt(in.readLine());
    }

    public String CreateName() throws IOException {
        out.println("Ingrese el nombre del ejercicio");
        return in.readLine();
    }

    public String CreateMuscle() throws IOException {
        out.println("Ingrese el nombre del musculo o musculos trabajados");
        return in.readLine();
    }

    public void MostrarExercise(Exercise exercise) {
        out.println("Id: " + exercise.getId());
        out.println("Nombre del ejercicio: " + exercise.getName());
        out.println("Musculo o musculos trabajados: " + exercise.getMuscle());
    }

}
