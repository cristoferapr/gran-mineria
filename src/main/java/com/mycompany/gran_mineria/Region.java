
package com.mycompany.gran_mineria;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Region extends Pais{
    private String nombre;
    private ArrayList<Minas> listaMinas;
    
    public Region(){
    }
     
    public Region(String nombre,ArrayList<Minas> listaMinas){
        this.nombre = nombre;
        this.listaMinas=listaMinas;
    }
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Minas> getlistaMinas() {
        return listaMinas;
    }

    public void setlistaMinas(ArrayList<Minas> listaMinas) {
        this.listaMinas = listaMinas;
    }
    
    public void addMina(Minas mina) {
        this.listaMinas.add(mina);
    }
    
    //METODOS

    
    /*addMina es un metodo que se encargara de Crear un objeto de clase region en caso de ser necesario, agregar un nuevo objeto
    de clase Minas en el ArrayList correspondiente a la Region y tambien de llamar al metodo Pais para hacer el mismo proceso para
    cada pais. Siempre es llamado desde los metodos de la clase Minas, nunca solo.*/
    public void agregarMina(String nombre, Minas mina, HashMap<String,Region> mapaRegion, HashMap<String,Pais> mapaPaises) throws IOException{
        if(mapaRegion.get(nombre)==null){
            Region reg = new Region();
            ArrayList<Minas> lista= new ArrayList<>();
            reg.setNombre(nombre);
            reg.setlistaMinas(lista);
            reg.addMina(mina);
            mapaRegion.put(nombre, reg);
            reg.agregarMina(mina.getPais(), reg, mapaPaises);
        }else{
            mapaRegion.get(nombre).addMina(mina);
        }
    }
    
    public void agregarMina(String nombre, Region region , HashMap<String,Pais> mapaPais) throws IOException{
        if(mapaPais.get(nombre)==null){
            Pais pa = new Pais() {
                @Override
                public void agregarMina(String nombre, Region region, HashMap<String, Pais> mapaPais) throws IOException {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
            ArrayList<Region> lista= new ArrayList<>();
            pa.setPais(nombre);
            pa.setlistaRegiones(lista);
            pa.agregarMina(region);
            mapaPais.put(nombre, pa);
        }else{
            mapaPais.get(nombre).agregarMina(region);
        }
    }
    

    /*Metodo encargado de mostrar la informacion incluida en todos los objetos de clase Minas correspondientes a la region 
    ingresada por el ususario*/
    public Region verificarRegion(HashMap<String,Region> mapaRegiones, String key) throws IOException{
        Region reg = mapaRegiones.get(key);
        if(reg== null){
            return null;
        }
        return reg;
    }
    
    
    public Object mostrarPais(HashMap<String,Pais> mapa, String key) throws IOException{
        Pais pais = mapa.get(key);
        if(pais== null){
            return null;
        }
        ArrayList<Region> lista = pais.getlistaRegiones();
        return (Object)lista;
    }

    //MUETRA LA MINA QUE TIENE MAYOR PRODUCCION DE UNA REGION Y SUS DATOS
   public Minas mayorProduccion( String key){
        Region reg = (Region) ControladoraMinas.mapaRegiones.get(key);
        if(reg== null){
            return null;
        }
        Minas aux=reg.getlistaMinas().get(0);
        ArrayList<Minas> listaMinas=reg.getlistaMinas();
        for(int i = 1; i < listaMinas.size(); i++){
            if(aux.getProduccion()<listaMinas.get(i).getProduccion()){
                aux=listaMinas.get(i);
            }
        }
        return aux;
    }    
   
    public Minas menorProduccion( String key){
        Region reg = (Region) ControladoraMinas.mapaRegiones.get(key);
        if(reg== null){
            return null;
        }
        Minas aux=reg.getlistaMinas().get(0);
        ArrayList<Minas> listaMinas=reg.getlistaMinas();
        for(int i = 1; i < listaMinas.size(); i++){
            if(aux.getProduccion()>listaMinas.get(i).getProduccion()){
                aux=listaMinas.get(i);
            }
        }
        return aux;
    } 
}
