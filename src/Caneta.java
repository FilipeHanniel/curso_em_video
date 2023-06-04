

public class Caneta {

    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    // Método Construtor:
    public Caneta(String modelo, String cor, float ponta) {
        this.tampar();
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;       
    }

        void status() {
        System.out.println("\nModelo: " + getModelo());
        System.out.println("Ponta: " + ponta);
        System.out.println("Cor: " + cor);
        System.out.println("Tampada: " + tampada);
        
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public void setPonta(float ponta) {
        this.ponta =  ponta;
    }

    public boolean getTampada() {
        return this.tampada;
    }
    
    public void tampar() {
        tampada = true;
    }

    public void rabiscar() {
        if (tampada == false) {
            System.out.println("Caneta " + modelo + " Rabiscando...");
        } else {
            System.out.println("Caneta " + modelo + " tampada, impossível rabiscar!");
        }
    }
}
