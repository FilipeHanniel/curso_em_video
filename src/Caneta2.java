

public class Caneta2 {

    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    
    

    public Caneta2(String modelo, float ponta, String cor, boolean tampada) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = tampada;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    void status() {
        System.out.println("\nModelo: " + getModelo());
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
        
    }

    public void rabiscar() {
        if (this.tampada == false) {
            System.out.println("Caneta " + this.modelo + " Rabiscando...");
        } else {
            System.out.println("Caneta " + this.modelo + " tampada, impossível rabiscar!");
        }
    }
}
