package com.company;

public class Cuenta {
    private String nombre;
    private String numero_cuenta;
    private double saldo;
    private double consumo_mensual;

    public Cuenta(String n, String nc){
        this.nombre = n;
        this.numero_cuenta = nc;
        this.saldo = 0.0;
        this.consumo_mensual = 0.0;
    }

    public String mostrar(){
        String mensaje = "INFORMACION DEL CLIENTE";
        mensaje += "\nNombre: " + this.nombre;
        mensaje += "\nCuenta: " + this.numero_cuenta;
        mensaje += "\nSaldo: " + this.saldo;
        mensaje += "\nConsumo: " + this.consumo_mensual;
        return mensaje;
    }

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

/*
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}*/
