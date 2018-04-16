package bot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class Bot {

    public static void main(String[] args) {
        System.out.println("[..] Bot  porque me lo dijo ERLICH");

        try {
            URL laUrl = new URL("https://theguardian.com");
            System.out.println(" todo bien traje la pagina");
            InputStream entradaBinaria = laUrl.openConnection().getInputStream();
            System.out.println(" tardo en cargar, pero trajo!!");
            InputStreamReader entradaTexto = new InputStreamReader(entradaBinaria);
            BufferedReader entrada = new BufferedReader(entradaTexto);
            //System.out.println(entrada.readLine());
            while (entrada.ready()) {
                System.out.println(entrada.readLine());
            }
        } catch (MalformedURLException ex) {
            System.out.println("[ERROR] Bot : " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("[ERROR] Bot : " + ex.getMessage());
        }

        System.out.println("[OK] Bot  porque me lo dijo ERLICH");

    }

}

