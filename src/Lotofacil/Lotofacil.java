package Lotofacil;

import java.util.Random;
import java.util.Scanner;

public class Lotofacil {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        CalculoLotofacil aposta = new CalculoLotofacil();
        int numero = new Random().nextInt(100);
        do{
            System.out.println("******** Jogo de Aposta *********");
            System.out.println(aposta.getMenu());
            System.out.printf("Digite sua opção:");
            aposta.opcao = dado.nextInt();
            aposta.SwithCaseNumero();
        }

        while (aposta.opcao != 0);
        dado.close();


    }
}
