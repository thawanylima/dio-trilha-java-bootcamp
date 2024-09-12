public class operadores {

    public static void main (String [] args){ 

        String nomeUm = "THAWANY";
        String nomeDois = new String ("THAWANY");

        System.out.println(nomeUm.equals(nomeDois));
    
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1<numero2){
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("numero 1 é igual numero 2? " +simNao);

        simNao = numero1 != numero2;
        System.out.println("numero 1 é diferente numero 2? " +simNao);

        simNao = numero1 > numero2;
        System.out.println("numero 1 é maior numero 2? " +simNao);


    }
}
