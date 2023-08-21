package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExemplo {
    public static void main(String[] args) {

        Map< String, Integer >  idadePorNome = new HashMap<>();
        //primary key
        //key, string "FAEISFJJ#R*YH*RH$A#HRUIHA#"
        idadePorNome.put("Alice", 25);
        idadePorNome.put("Bob", 30);
        idadePorNome.put("Charlie ", 28);
        idadePorNome.put("Charlie ", 28);

        System.out.println("Idade do Bob: " + idadePorNome.get("Bob"));

        System.out.println("Contém a chave Alice? "  + idadePorNome.containsKey("Alice"));

        System.out.println("Contém o valor 30 " + idadePorNome.containsValue(130));
    }
}
