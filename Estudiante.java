import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yassir.bourjila
 */
public class Estudiante {

    final String nombre;
    final String apellido;
    private double expediente;
    private boolean Aprobado;
    ArrayList<Double> notas = new ArrayList<>();

    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getExpediente() {
        return expediente;
    }

    public boolean isAprobado() {
        return Aprobado;
    }

    public void setExpediente(double expediente) {
        this.expediente = expediente;
    }

    public void setAprobado(boolean Aprobado) {
        this.Aprobado = Aprobado;
    }

    /*Añade una nota al Array */
    public void setNota(double nota) {
        notas.add(nota);
    }
    /*Devuelve todo el array de notas de las tareas del estudiante*/
    
     
    public ArrayList<Double> getNotas() {
        return notas;
    }
    
    public double evalua(){
        double resultado = 0;
        int size = notas.size();
        for(int i = 0; i < size; ++i){
            resultado = resultado + notas.get(i);
        } 
        double n_tareas =(double)(size-1);
        resultado = resultado /n_tareas;
        if(resultado > 5) Aprobado = true;
        else Aprobado = false;
        return resultado;
    }

}
