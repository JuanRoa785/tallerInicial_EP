package Logica;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Juan Roa
 */
public class Gestionador {
    private String rutaArchivo;
    private ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
    private Hashtable totalPorCiudad = new Hashtable();
    private Hashtable grupoEdad = new Hashtable();
    private Hashtable totalPorSexo = new Hashtable();
    
    
    public Gestionador(String rutaArchivo) throws IOException {
        this.rutaArchivo = rutaArchivo;
        Scanner csvReader = new Scanner(new File(rutaArchivo));
        while (csvReader.hasNextLine()) {
            String[] rawData = csvReader.nextLine().split(",");
            Persona aux = new Persona(rawData[0], rawData[1], rawData[2], Integer.parseInt(rawData[3]), Integer.parseInt(rawData[4]));
            this.listaPersonas.add(aux);
        }
        this.actualizarTotalPorCiudad();
        this.actualizarGruposEdad();
        this.actualizarTotalSexo();
    }
   
    public void actualizarTotalPorCiudad() {
        this.totalPorCiudad = crearDiccionarioCiudades();
        for (Persona persona : this.listaPersonas) {
            if (this.totalPorCiudad.containsKey(persona.getCiudad())) {
                //Accedemos al contador para esa ciudad en especifico:
                Integer aux = Integer.parseInt(this.totalPorCiudad.get(persona.getCiudad()).toString()) + 1;
                this.totalPorCiudad.put(persona.getCiudad(), aux);
            }
        }
    }
   
    public void actualizarGruposEdad() {
        this.grupoEdad = this.crearGruposEdad();
        for (Persona persona : this.listaPersonas) {
            if (persona.getEdad() <= 5) {
                Integer aux = Integer.parseInt(this.grupoEdad.get("Grupo 1").toString()) + 1;
                this.grupoEdad.put("Grupo 1", aux);

            } else if (persona.getEdad() > 5 && persona.getEdad() <= 10) {
                Integer aux = Integer.parseInt(this.grupoEdad.get("Grupo 2").toString()) + 1;
                this.grupoEdad.put("Grupo 2", aux);

            } else if (persona.getEdad() > 10) {
                Integer aux = Integer.parseInt(this.grupoEdad.get("Grupo 3").toString()) + 1;
                this.grupoEdad.put("Grupo 3", aux);
            }
        }
    }
    
    public void actualizarTotalSexo() {
        this.totalPorSexo = this.crearDiccionarioGenero();
        for (Persona persona : this.listaPersonas) {
            if (this.totalPorSexo.containsKey(persona.getSexo())) {
                Integer aux = Integer.parseInt(this.totalPorSexo.get(persona.getSexo()).toString()) + 1;
                this.totalPorSexo.put(persona.getSexo(), aux);
            } 
        }
    }
   
   public Hashtable crearDiccionarioCiudades() {
        Dictionary totalCiudades = new Hashtable();
        totalCiudades.put("Bucaramanga", 0); 
        totalCiudades.put("Girón", 0);
        totalCiudades.put("Florida", 0);
        totalCiudades.put("Piedecuesta", 0);
        
        return (Hashtable) totalCiudades;
    }
   
   public Hashtable crearGruposEdad() {
        Dictionary diccionarioGrupoEdad = new Hashtable();
        diccionarioGrupoEdad.put("Grupo 1", 0); 
        diccionarioGrupoEdad.put("Grupo 2", 0);
        diccionarioGrupoEdad.put("Grupo 3", 0);
        
        return (Hashtable) diccionarioGrupoEdad;
    }
   
   public Hashtable crearDiccionarioGenero() {
        Dictionary totalGenero = new Hashtable();
        totalGenero.put("Masculino", 0); 
        totalGenero.put("Femenino", 0);
        
        return (Hashtable) totalGenero;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
        this.actualizarTotalPorCiudad();
        this.actualizarGruposEdad();
        this.actualizarTotalSexo();
    }

    public Hashtable getTotalPorCiudad() {
        return totalPorCiudad;
    }

    public void setTotalPorCiudad(Hashtable totalPorCiudad) {
        this.totalPorCiudad = totalPorCiudad;
    }

    public Hashtable getGrupoEdad() {
        return grupoEdad;
    }

    public void setGrupoEdad(Hashtable grupoEdad) {
        this.grupoEdad = grupoEdad;
    }

    public Hashtable getTotalPorSexo() {
        return totalPorSexo;
    }

    public void setTotalPorSexo(Hashtable totalPorSexo) {
        this.totalPorSexo = totalPorSexo;
    }
}
