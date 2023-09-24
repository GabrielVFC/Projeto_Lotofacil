# PROJETO LOTOFÁCIL

• JDK: ECLIPSE TEMURIN VERSION 17.0.8

• BIBLIOTECAS UTILIZADAS: 

import java.util.Random;

import java.util.Scanner;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

**************************
Regras de negócio/requisitos:

• Crie um menu para a loteria utilizando as estruturas switch case e do while. Enquanto
o usuário não digitar 0, para sair, novas apostas serão permitidas.

**************************
Menu LOTOFÁCIL:
1) Apostar de 0 a 100
2) Apostar de A à Z
3) Apostar em par ou ímpar
0) Sair
**************************
### Regras para a aposta de 0 a 100:

• Quando o usuário escolher essa aposta, o programa vai ler um número inteiro 
via teclado, de 0 a 100, caso o número seja maior que 100 ou menor que 0, 
imprima a mensagem: “Aposta inválida.”.

• Documentação:
• https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html

• Utilize a biblioteca Random para sortear aleatoriamente um número de 0 a 100.

• Compare o número escolhido pelo usuário apostador com o número sorteado pelo
sistema.

• Documentação:
• https://docs.oracle.com/javase/8/docs/api/java/util/Random.html

• Quando o usuário iniciar o programa, irá aparecer uma janela onde o usuário,
poderá escolher qual vai a aposta que ele vai fazer.

• Caso o usuário acerte a aposta, imprima a mensagem “Você ganhou R$ 1.000,00
reais.”. Caso o usuário erre, imprima a mensagem: “Que pena! O número sorteado
foi: X.”.

### Regras para a aposta de A à Z: 

• Quando o usuário escolher essa aposta, ele vai ter que digitar uma letra para 
saber se ele consegue ganhar a aposta. Caso não seja uma letra, imprima a
mensagem: “Aposta inválida.”. Você poderá utilizar o método Character.isLetter()
para verificar se a entrada digitada é uma letra válida.

• Documentação:
• https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html

• Converta a entrada do usuário apostador para maiúsculo, utilizando o método
Character.toUpperCase().

• Escolha a letra com a inicial do seu nome para ser a letra premiada.

• Exemplo: char letraPremiada = 'G'.

• Compare a letra lida via teclado, e convertida para maiúsculo, com a letra premiada.

• Caso o usuário acerte a aposta, imprima a mensagem “Você ganhou R$ 500,00
reais.”. Caso o usuário erre, imprima a mensagem: “Que pena! A letra sorteada foi:
X.”.

### Regras para a aposta de número par ou ímpar:

• Quando o usuário escolher a opção de aposta um numero par ou impar, o programa 
vai ler um número inteiro via teclado. Exemplo: 600.

• Utilize o operador de módulo (%) para verificar se o número é par ou ímpar.

Lembrando que, caso o resto da divisão do número por 2 seja 0, o número é par.

• O prêmio será dado caso o usuário digite um número par. O sistema não irá
premiar jogadores que digitarem um número ímpar.

• Se o número digitado for par, imprima a mensagem: “Você ganhou R$ 100,00
reais.”. Caso o usuário digite um número ímpar, imprima a mensagem: “Que pena!
O número digitado é ímpar e a premiação foi para números pares.”.


• Documentação:
• https://docs.oracle.com/javase/8/docs/api/javax/swing/JButton.html

• A classe JButton ela cria um botão onde o usuário vai poder clicar para escolher a opção que deseja na aposta,
nele se usa a ação addActionlistener para fazer o clique.

• Documentação:
• https://docs.oracle.com/javase/8/docs/api/javax/swing/JTextField.html

• Essa classe serve para realizar a leitura de dados em cada aposta.

• Documentação:
• https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html

• Essa classe pode ser usada também para a leitura de dados e mostrar na tela o que foi escolhido para o usuário, alem de imprimir uma mensagem ao usuario.
