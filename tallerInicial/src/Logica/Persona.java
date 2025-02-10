package Logica;


import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author Juan Roa
 */

public class Persona {
    private String codigo;
    private String sexoAcortado;
    private String sexo;
    private String nombre;
    private Integer edad;
    private Integer codigoCiudad;
    private String ciudad;

    public Persona(String codigo, String sexoAcortado, String nombre, Integer edad, Integer codigoCiudad) {
        this.codigo = codigo;
        this.sexoAcortado = sexoAcortado;
        
        if (sexoAcortado.equalsIgnoreCase("F")) {
            this.sexo = "Femenino";
        } else if (sexoAcortado.equalsIgnoreCase("M")) {
            this.sexo = "Masculino";
        } else {
            this.sexo = "Desconocido";
        }
       
        this.nombre = nombre;
        this.edad = edad;
        this.codigoCiudad = codigoCiudad;
        this.ciudad = this.traducirCiudad(codigoCiudad, this.crearDiccionario());
    }
    
    public Hashtable crearDiccionario() {
        Dictionary ciudades = new Hashtable();
        ciudades.put(1, "Bucaramanga"); 
        ciudades.put(2, "Girón");
        ciudades.put(3, "Florida");
        ciudades.put(4, "Piedecuesta");
        
        return (Hashtable) ciudades;
    }
    
    public String traducirCiudad(Integer codigoCiudad, Hashtable diccionarioCiudades){
        if(diccionarioCiudades.containsKey(codigoCiudad)) {
            return (String) diccionarioCiudades.get(codigoCiudad);
        } else {
            return "N.A";
        }
    }
            
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexoAcortado() {
        return sexoAcortado;
    }

    public void setSexoAcortado(String sexoAcortado) {
        this.sexoAcortado = sexoAcortado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getCodigoCiudad() {
        return codigoCiudad;
    }

    public void setCodigoCiudad(Integer codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
