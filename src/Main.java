public class Main {

    public static void main(String[] args) {
                
        Caneta c1 = new Caneta("BIC", "Azul", 0.5f);
        
        c1.status();

        c1.setModelo("BIC");
        c1.setCor("Azul");
        c1.setPonta(0.5f);

        

       
        Caneta c2 = new Caneta("Pilot", "Vermelha", 1.75f);
        
        c2.setModelo("Pilot");
        c2.setCor("Preta");
        c2.setPonta(0.75f);

        System.out.println("------------------ Status de c1 e c2 ------------");

        c1.status();
        c2.status();

        System.out.println("_________________\n");

        c2.tampar();
        c1.status();
        c2.status();

        System.out.println("--------------- Teste Rabiscar ------------");
        c1.rabiscar();
        c2.rabiscar();
        System.out.println(c2.getTampada());

        System.out.println("________________ USANDO CANETA2_____________");

        Caneta2 c3 = new Caneta2("nova caneta", 1.00f, "vermelha", false);
        c3.status();
        c3.rabiscar();


        
        

        
    }
    
}
