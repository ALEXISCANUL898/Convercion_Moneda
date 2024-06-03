import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lectrura = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();




        int salir = 0;
        while (salir != 7) {


            System.out.printf("\nIngrese el numero de la opcion\n");
            System.out.printf("1) Dolar = Peso Argentino\n");
            System.out.printf("2) Peso Argentino = Dolar\n");
            System.out.printf("3) Dolar = Real Brasileño\n");
            System.out.printf("4) Real Brasileño = Dolar\n");
            System.out.printf("5) Dolar = Peso Colombiano\n");
            System.out.printf("6) Peso Colombiano = Dolar\n");

            salir = lectrura.nextInt();

            try {
                if (salir == 1) {
                    Moneda converionUsdArs = consultaMoneda.seleccionDemoneda("USD/ARS");
                    System.out.printf("Este es la convercion de Dolar a Pesos Argentinos:" +converionUsdArs);
                }
                if (salir == 2) {

                    Moneda conversionArsUsd = consultaMoneda.seleccionDemoneda("ARS/USD");
                    System.out.printf("Este es la convercion de la moneda Pesos Argentinod a Dolares:" + conversionArsUsd);
                }
                if (salir == 3) {
                    Moneda conversionUsdArs = consultaMoneda.seleccionDemoneda("USD/BRL");
                    System.out.printf("Este es la convercion:" + conversionUsdArs);
                }

                if (salir == 4) {

                    Moneda conversionBrlUsd = consultaMoneda.seleccionDemoneda("BRL/USD");
                    System.out.printf("Este es la convercion:" + conversionBrlUsd);
                }
                if (salir == 5) {
                    Moneda conversionUsdCop = consultaMoneda.seleccionDemoneda("USD/COP");
                    System.out.printf("ESte es la covercion:" + conversionUsdCop);
                }

                if (salir == 6) {
                    Moneda conversionCopUsd = consultaMoneda.seleccionDemoneda("COP/USD");
                    System.out.printf("ESte es la covercion:" + conversionCopUsd);
                }
            }catch (RuntimeException e){
                System.out.printf(e.getMessage());
            }

        }

        System.out.printf("Gracias por utilizar le conversor");

        }
    }