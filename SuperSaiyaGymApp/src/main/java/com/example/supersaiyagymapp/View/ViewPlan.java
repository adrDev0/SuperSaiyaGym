package View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDate;

import Model.Plan;

public class ViewPlan {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintStream out = System.out;

    public int CreateId() throws IOException {
        out.println("Ingrese id");
        return Integer.parseInt(in.readLine());
    }

    public int CreateCost() throws IOException {
        out.println("Ingrese costo del plan");
        return Integer.parseInt(in.readLine());
    }

    public int CreateMonths() throws IOException {
        out.println("Ingrese la cantidad de meses");
        return Integer.parseInt(in.readLine());
    }

    public LocalDate CreateExpired(Plan plan) throws IOException {
        LocalDate expired;
        int months = plan.getMonths();
        expired = LocalDate.now();
        expired.plusMonths(months);

        return expired;
    }
}
