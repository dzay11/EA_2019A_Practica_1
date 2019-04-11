/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas1;
import data.Processing;
import java.io.File;
import java.io.IOException;
import templates.Persona;
import org.apache.commons.io.input.ReversedLinesFileReader;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practicas1 {

    public static void main(String[] args) throws IOException {

    ArrayList<Persona> personas = new ArrayList<>();
    ArrayList<Persona> outPersonas = new ArrayList<>();

        personas.add(new Persona(
                "Pedro Rodirguez",
                24,
                1.70,
                75
        ));
        personas.add(new Persona(
                "Juan Perez",
                44,
                1.60,
                80
        ));
        personas.add(new Persona(
                "Jose Jimenez",
                32,
                1.80,
                67
        ));

        Processing processing = new Processing();
//        processing.guardarPersonasEnArchivo(personas, "personas.txt");
        outPersonas = processing.leerPersonasDeArchivo("personas.txt");
        for (int i=0; i< outPersonas.size(); i++){
            System.out.println(
                    outPersonas.get(i).getNombre() + " | " +
                            outPersonas.get(i).getEdad() + " | " +
                            outPersonas.get(i).getEstatura() + " | " +
                            outPersonas.get(i).getPeso() + " | "
            );
        }
        
        File file = new File("personas.txt");
        ReversedLinesFileReader object = new ReversedLinesFileReader(file);
        String line = object.readLine();
        System.out.println(line);
        String pattern = "\\(([^)]+)\\)\\(([^)]+)\\)\\(([^)]+)\\)\\(([^)]+)\\)";
        Matcher matcher = Pattern.compile(pattern).matcher(line);
        Persona persUlt = null;
        if (matcher.find()) {
            persUlt = new Persona(
                                matcher.group(1),
                                Integer.parseInt( matcher.group(2) ),
                                Double.parseDouble( matcher.group(3) ),
                                Integer.parseInt( matcher.group(4) )
                        );
        }
        System.out.println("La última "+persUlt.toString());
        

    }
   
}
