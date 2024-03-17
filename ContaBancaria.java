// Classe para representar conta bancária

// Nome do pacote
package dsa;

// Classe
public class ContaBancaria {

    public ContaBancaria() {
       saldo = 5;
    }

    public ContaBancaria(String titular) {
        this();
        this.titular = titular;
    }

    public String titular;
    private float saldo;

    // getter
    public float getSaldo() {
        return saldo;
    }

    public void saca(float valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para saque: " + valor);
        }
        else if(saldo - valor < 0) {
            throw new IllegalArgumentException("Saldo insuficiente: " + valor);
        }
        else {
            saldo -= valor;
        }
    }

    public void deposita(float valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para depósito: " + valor);
        }
        else {
            saldo += valor;
        }
    }

    // Cliente recebe um bônus pelo depósito
    public void deposita(float valor, float bonus) {
        deposita(valor + bonus);
    }
}
