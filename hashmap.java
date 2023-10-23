import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        // Criando um HashMap de nomes e idades
        HashMap<String, Integer> mapaNomesIdades = new HashMap<>();

        // Adicionando pares chave-valor ao HashMap
        mapaNomesIdades.put("Alice", 25);
        mapaNomesIdades.put("Bob", 30);
        mapaNomesIdades.put("Carol", 28);

        // Recuperando a idade de "Bob"
        int idadeDoBob = mapaNomesIdades.get("Bob");
        System.out.println("A idade de Bob é " + idadeDoBob);

        int idadeDaCarol = mapaNomesIdades.get("Carol");
        System.out.println("A idade de Carol é:" + idadeDaCarol);

        // Verificando se o mapa contém uma chave
        boolean contemChave = mapaNomesIdades.containsKey("David");
        System.out.println("O mapa contém a chave 'David'? " + contemChave);
    }
}
