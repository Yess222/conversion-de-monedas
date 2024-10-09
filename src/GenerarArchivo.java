import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GenerarArchivo {
    public void guardarJson(List<Monedas> monedas) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter("conversiones.json");
        escritura.write(gson.toJson(monedas));
        escritura.close();
    }
}
