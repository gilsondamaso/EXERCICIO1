import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        Locale lacale = new Locale("en", "US");
      
        String produto1 = "Computador";
        String produto2 = "Mesa de Trabalho";
        byte idade = 30;
        int codigo = 5290;
        char genero = 'F';
        double preco1 = 2100.0;
        double preco2 = 650.50;
        double preco4 = 5.1987;
        double medida = 53.234567;


        System.out.println("Exemplos de Casting");
        float preco3 = (float) preco1;        
        int testeCasting = (int)preco4;
        System.out.println("Casting Double para Inteiro: " + testeCasting);
        float testeCasting2 = testeCasting;
        System.out.println("Casting Inteiro para Float: " + testeCasting2);
        int testeCasting3 = 'F';

        System.out.println("Casting Char para Inteiro: " + testeCasting3);
        
        System.out.println("PRODUTOS:");
        System.out.printf("Computador custa R$ %.2f%n", preco1);
        System.out.printf("Computador custa R$ %.2f%n", preco2);
        System.out.println("Registro: " + idade + ", Código: " + codigo + " e sexo: " + genero);
        //System.out.println();
        System.out.printf("%nMedida com 8 Casas decimais %.8f%n", medida );
        System.out.printf("Arredondado(Três casas decimais) %.3f%n", medida );
        //Resultado com o o padrão americano.
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto Decimal do EUA %.3f%n", medida );  

    }
}