package demo.src.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDate;

import demo.src.Model.Machine;

public class ViewMachine {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintStream out = System.out;

    public int CreateId() throws IOException {
        out.println("Ingrese id");
        return Integer.parseInt(in.readLine());
    }

    public String CreateName() throws IOException {
        out.println("Ingrese nombre de la maquina");
        return in.readLine();
    }

    public String CreateMuscle() throws IOException {
        out.println("Ingrese el o los musculos que se trabajan con la maquina");
        return in.readLine();
    }

    public LocalDate CreateAdmissionDate() throws IOException {
        int dia, mes, annio;
        out.println("Ingrese la fecha de entrada de la maquina");
        out.println("Ingrese año");
        annio = Integer.parseInt(in.readLine());
        out.println("Ingrese mes");
        mes = Integer.parseInt(in.readLine());
        out.println("Ingrese día");
        dia = Integer.parseInt(in.readLine());
        LocalDate localdate = LocalDate.of(annio, mes, dia);
        return localdate;
    }

    public void MostrarMachine(Machine maquine) {
        out.println("Id: " + maquine.getId());
        out.println("Musculo o musculos trabajados: " + maquine.getMuscle());
        out.println("Fecha de entrada: " + maquine.getAdmissionDate().getDayOfMonth() + "/"
                + maquine.getAdmissionDate().getMonthValue() + "/" + maquine.getAdmissionDate().getYear());
    }
}
