/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class ConversioneService {
    
    /**
     * Esegue l'operazione matematica richiesta
     * 
     * @param operando1 Il primo operando
     * @param operando2 Il secondo operando
     * @param operatore L'operatore (SOMMA, SOTTRAZIONE, MOLTIPLICAZIONE, DIVISIONE)
     * @return Il risultato dell'operazione
     * @throws IllegalArgumentException se l'operatore non è valido o divisione per zero
     */
    public static double calcola( String unitaMisura1, String unitaMisura2, double operando) 
            throws IllegalArgumentException {
        
        if (unitaMisura1 == null || unitaMisura1.trim().isEmpty()||unitaMisura2 == null || unitaMisura2.trim().isEmpty()) {
            throw new IllegalArgumentException("Unità di misura non può essere vuoto");
        }
        
        // Convertiamo l'operatore in maiuscolo per gestire input case-insensitive
        String op = unitaMisura1.toUpperCase().trim();
        
        switch (op) {
            case "MT":
                return operando*1.09361;
                
            case "YD":
                return operando*0.9144;

                
            default:
                throw new IllegalArgumentException(
                    "unita di Misura non valido: " + unitaMisura1 + 
                    ". unita di Misura consentite: MT,YD"
                );
        }
    }
}
