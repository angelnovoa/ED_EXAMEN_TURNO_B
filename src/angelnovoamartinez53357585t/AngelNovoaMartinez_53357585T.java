/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package angelnovoamartinez53357585t;

/**
 *La clase calcula el salario
 * @author USUARIO
 * @version final
 */

public class AngelNovoaMartinez_53357585T {
    static final double FACTOR_HORA_EXTRA = 1.2; 
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;

/**
 * Datos personales
 * @param nombreCompleto Nombre del alumno
 * @param dni Dni del alumno
 */    
public AngelNovoaMartinez_53357585T(String nombreCompleto, String dni) {
    this.nombreCompleto = nombreCompleto; 
    this.dni = dni;
}

/**
 * Genera salario
 * @param horasExtra Calcula las horas extra
 * @return Devuelve el salario final
 */
public double getSalarioEsteMes(int horasExtra) {
    double cantidadExtra, salarioFinal; 
    cantidadExtra = horasExtra * this.salarioBasePorHora * FACTOR_HORA_EXTRA; 
    salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra; 
    salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d; 
    return salarioFinal;
}
  
/**
 * Escribe frase con salario
 * @param args frase con salario
 */
      public static void main(String[] args){
    AngelNovoaMartinez_53357585T emp = new AngelNovoaMartinez_53357585T("Angel Novoa","53357585T");
    int horasExtra = 2; 
    System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra) + " euros, al hacer " + horasExtra + " horas extra.");
      }
}
    

