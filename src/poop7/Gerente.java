/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 * @author erics
 */
/** 
* La clase Gerente extiende la clase Empleado, agregando el atributo  
* presupuesto, que define el monto que el gerente puede manejar. 
* Un gerente también tiene todos los atributos y métodos de la clase Empleado. 
*/ 
public class Gerente extends Empleado{
    private float presupuesto;
/** 
     * Constructor vacío que inicializa un gerente sin atributos. 
     */ 
    public Gerente() {
    }
 /** 
     * Constructor que inicializa un gerente con un presupuesto, nombre,  
     * número de empleado y sueldo. 
     * @param presupuesto El presupuesto que maneja el gerente. 
     * @param nombre El nombre del gerente. 
     * @param numEmpleado El número de empleado del gerente. 
     * @param sueldo El sueldo del gerente. 
     */ 
    public Gerente(float presupuesto, String nombre, int numEmpleado, float sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
    
     /** 
     * Obtiene el presupuesto del gerente. 
     * @return El presupuesto asignado al gerente. 
     */ 
    public float getPresupuesto() {
        return presupuesto;
    }
 /** 
     * Establece un nuevo presupuesto para el gerente. 
     * @param presupuesto El nuevo presupuesto que se asignará. 
     */ 
    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }
    /** 
     * Asigna un presupuesto al gerente 
     * @param presupuesto El presupuesto que se asignará al gerente. 
     * @return El presupuesto asignado. 
     */ 
    public float asignarPresupuesto(float presupuesto){
        this.presupuesto=presupuesto;
        return presupuesto;
        
    }
 /** 
     * Devuelve una representación en cadena del objeto Gerente, incluyendo 
     * los atributos heredados de Empleado y el presupuesto. 
     * @return Una cadena que representa el estado del objeto Gerente. 
     */ 
    @Override
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';
    }
}
