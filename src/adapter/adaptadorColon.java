/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Usuario
 */
public class adaptadorColon extends bancoCR{
    cajaDolar dolarC = new cajaDolar();
    double dolar;
    @Override
    public void ingresarMoneda(double moneda) {
        dolar = moneda/617.68;
        dolarC.convertirDolar(dolar);
    }

    @Override
    public double saldoMoneda() {
        return dolarC.cantidadDolar(dolar);
        
    }
    
}
