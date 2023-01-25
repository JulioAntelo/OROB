import org.junit.jupiter.api.Test;

public class Main {
    public static int Numero_elevado(int x, int z) {
        int resultado = 1;
        for (int i = 1; i <= z; i++) {
            resultado = resultado * z;
        }
        System.out.println("resultado: "+ resultado);
    }
}

