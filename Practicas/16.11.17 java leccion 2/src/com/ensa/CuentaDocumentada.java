/**
 * Provee las clases necesarias para
 * crear una cuenta de cnsumo de electricidad
 * en la empresa Ensa.
 */

package com.ensa;

/**
 * Esta es la clase para la creacion de cuentas de en ENSA
 *
 * @author L. Adrian Medina
 * @version 1.0
 */
public class CuentaDocumentada {
    /**
     * Esra {@link String} es el nombre del duenio de la cuenta
     */
    private String nombre;
    private String numero_cuenta;
    private double saldo;
    private double consumo_mensual;

    /**
     * Este constructor inicializa la cuenta recien creada.
     * @param n Este parametro indica el nombre del duenio de la cuenta
     * @param nc Hola parametro indica el numero de la cuenta
     */
    public CuentaDocumentada(String n, String nc){
        /**
         * Este es el nombre del dueño de la cuenta.
         */
        this.nombre = n;
        this.numero_cuenta = nc;
        this.saldo = 0.0;
        this.consumo_mensual = 0.0;
    }

    /**
     * Este metodo se encarga de cargar la informacion del cliente en una variable.
     * @return Esta cadena representa la informacion del cliente.
     */
    public String mostrar(){
        String mensaje = "INFORMACION DEL CLIENTE";
        mensaje += "\nNombre: " + this.nombre;
        mensaje += "\nCuenta: " + this.numero_cuenta;
        mensaje += "\nSaldo: " + this.saldo;
        mensaje += "\nConsumo: " + this.consumo_mensual;
        return mensaje;
    }

    /**
     *
     * @deprecated Esto se va a dejar de usar.
     * @param pago Esta metodo efctua el pago.
     * @return Esta variable retorna el saldo despues del pago.
     */
    public double pagar(double pago){
        this.saldo -= pago;
        return this.saldo;
    }

    public double calcular(double consumo){
        this.consumo_mensual = consumo;
        this.saldo = this.consumo_mensual * 0.057;
        return  this.saldo;
    }
}
