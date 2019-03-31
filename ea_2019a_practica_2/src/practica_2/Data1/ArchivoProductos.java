package practica_2.Data1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import practica_2.Templates.Producto;


public class ArchivoProductos {
    public void guardarProductos(ArrayList<Producto> productos){
        try {
            FileWriter fileWriter = new FileWriter("productos.txt", true);
            for (int i = 0; i < productos.size(); i++) {
                fileWriter.write(
                        "{{ Nombre: " + productos.get(i).getNombre() + "}}" +
                        "{{ Precio: " + productos.get(i).getPrecio() + "}}" +
                        "{{Peso: " + productos.get(i).getPeso() + "}}" +
                        "{{Volumen: " + productos.get(i).getVolumen() + "}}"
                );
                System.out.println(
              "{{ Nombre: " + productos.get(i).getNombre() + "}}" +
                        "{{ Precio: " + productos.get(i).getPrecio() + "}}" +
                        "{{Peso: " + productos.get(i).getPeso() + "}}" +
                        "{{Volumen: " + productos.get(i).getVolumen() + "}}"
                );
            }
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(ArchivoProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
