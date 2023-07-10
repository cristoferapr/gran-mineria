
package com.mycompany.gran_mineria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Pais {
    private String nombre;
    private ArrayList<Region> listaRegiones;
    
    public Pais(){
        
    }
     
    public Pais(String nombre,ArrayList<Region> listaRegiones){
        this.nombre = nombre;
        this.listaRegiones=listaRegiones;
    }
  
    public String getPais() {
        return nombre;
    }

    public void setPais(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Region> getlistaRegiones() {
        return listaRegiones;
    }

    public void setlistaRegiones(ArrayList<Region> listaRegiones) {
        this.listaRegiones = listaRegiones;
    }
    
    public void agregarMina(Region region) {
        this.listaRegiones.add(region);
    }
    
    abstract public void agregarMina(String nombre, Region region , HashMap<String,Pais> mapaPais) throws IOException;

    /*Metodo encargado de mostrar todos los objetos de clase Minas del pais ingresado por el usuario*/
    public Object mostrarPais(HashMap<String,Pais> mapa, String key) throws IOException{
        Pais pais = mapa.get(key);
        if(pais== null){
            return null;
        }
        return (Object) pais;
    }
    
    public Minas mayorProduccion( String key){
        Pais aux = (Pais) ControladoraMinas.mapaPaises.get(key);
        Minas minAux=null;
        if(aux != null){
            ArrayList<Region> listaRegiones = aux.getlistaRegiones();
            minAux = listaRegiones.get(0).getlistaMinas().get(0);
            for (int i = 0; i < listaRegiones.size();i++){
                Region reg=listaRegiones.get(i);
                ArrayList<Minas> min=reg.getlistaMinas();
                for (int j = 0; j < min.size();j++){
                    if(minAux.getProduccion()<min.get(j).getProduccion()) minAux=min.get(j);
                }
            }
        }
        return minAux;
    }
    
    public Minas menorProduccion( String key){
        Pais aux = (Pais) ControladoraMinas.mapaPaises.get(key);
        Minas minAux=null;
        if(aux != null){
            ArrayList<Region> listaRegiones = aux.getlistaRegiones();
            minAux = listaRegiones.get(0).getlistaMinas().get(0);
            for (int i = 0; i < listaRegiones.size();i++){
                Region reg=listaRegiones.get(i);
                ArrayList<Minas> min=reg.getlistaMinas();
                for (int j = 0; j < min.size();j++){
                    if(minAux.getProduccion()>min.get(j).getProduccion()) minAux=min.get(j);
                }
            }
        }
        return minAux;
    }
}
