public class Formatando {

    public static void main (String args []){
        try {
            String cepFormatado = formata("2376506");
            System.out.println(cepFormatado);
        } catch (IdadeInvalida e) {
            System.out.println("Deve possuir 8 numeros"); // Tratando a exceção
        }

    }

    static String formata(String cep) throws IdadeInvalida{
        if (cep.length()!=8)
            throw new IdadeInvalida();
            return "23.765-064";


    }
}
