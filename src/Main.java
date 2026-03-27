import java.util.Scanner;

public class Main {
    // Converte CamelCase para o padrão RESTful exigido
    public static String padronizarRota(String endpointCamelCase) {
        StringBuilder rota = new StringBuilder("/api/v1/");
        // TODO: Para cada letra maiúscula (exceto a primeira), adicione um hífen antes e converta para minúscula
        // Dica: Use um loop para percorrer cada caractere da string e construa a rota conforme as regras
        for (int i = 0; i < endpointCamelCase.length(); i++) {
            char c = endpointCamelCase.charAt(i);
            if (Character.isUpperCase(c)) {
                rota.append('-');
                rota.append(Character.toLowerCase(c));
            } else {
                rota.append(c);
            }
        }
        return rota.toString().replaceFirst("-", ""); // Substitua pelo retorno correto após implementar o TODO
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String endpoint = scanner.nextLine();
        System.out.println(padronizarRota(endpoint));
    }
}