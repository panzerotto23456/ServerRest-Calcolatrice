/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class ConversioneRequest {
    private double operando;
    private String unitaMisura1;
    private String unitaMisura2;
    
    // Costruttore vuoto necessario per GSON
    public ConversioneRequest() {
    }
    
    // Costruttore con parametri

    public ConversioneRequest(double operando, String unitaMisura1, String unitaMisura2) {
        this.operando = operando;
        this.unitaMisura1 = unitaMisura1;
        this.unitaMisura2 = unitaMisura2;
    }

    public double getOperando() {
        return operando;
    }

    public void setOperando(double operando) {
        this.operando = operando;
    }

    public String getUnitaMisura1() {
        return unitaMisura1;
    }

    public void setUnitaMisura1(String unitaMisura1) {
        this.unitaMisura1 = unitaMisura1;
    }

    public String getUnitaMisura2() {
        return unitaMisura2;
    }

    // Getter
    public void setUnitaMisura2(String unitaMisura2) {
        this.unitaMisura2 = unitaMisura2;
    }

    @Override
    public String toString() {
        return "OperazioneRequest{" +
                "unita1=" + unitaMisura1+
                ",  unita2='" + unitaMisura2 +
                ", operando= " + operando + "\n" +
                '}';
    }
}