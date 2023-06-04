package conta;

import java.util.Random;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    Random gerador = new Random();
    
    
    public ContaBanco(String dono, String tipo) {
        this.numConta = gerarConta();
        this.dono = dono;
        this.saldo = 0f;
        this.status = true;
        this.tipo = tipo;
    }

    public int gerarConta() {
        return gerador.nextInt(1000,100000);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    
    
}
