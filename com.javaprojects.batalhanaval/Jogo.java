import java.util.Random;
import java.util.Scanner;

public class Jogo {
  Random random = new Random();
  int indiceUm;
  int indiceDois;
  int linhaJogo;
  int colunaJogo;
  boolean fimDeJogo = false;
  int jogadorAtual = 1;
  int acertosJogador = 0;
  int acertosMaquina = 0;
  Scanner scan = new Scanner(System.in);

  Tabuleiro tabuleiro = new Tabuleiro();

  public void iniciaJogo() {

    System.out.println("Bem vindo ao jogo Batalha Naval!");
    System.out.println();
    System.out.println("Siga a legenda abaixo:");
    System.out.println("O - casa vazia (água) que ainda não foi jogada");
    System.out.println("N - casa onde os navios estão posicionados");
    System.out.println("* - casa onde havia um navio mas foi acertado por um tiro");
    System.out.println("X - casa onde foi dado um tiro na água");
    System.out.println();

    tabuleiro.geraTabuleiros();
    tabuleiro.popularNavios();
    tabuleiro.printaTabuleiros();

    do {
      jogadaJogador();
      jogadaMaquina();
      verificaFimDeJogo();
      tabuleiro.printaTabuleiros();
    } while (!fimDeJogo);
  }

  public void jogadaJogador() {
    do {
      System.out.printf("\nDigite a linha da jogada (0-%d): \n", tabuleiro.tabuleiroJogador.length - 1);
      linhaJogo = scan.nextInt();
    } while (linhaJogo < 0 || linhaJogo > tabuleiro.tabuleiroJogador.length - 1);

    do {
      System.out.printf("\nDigite a coluna da jogada (0-%d): \n", tabuleiro.tabuleiroJogador.length - 1);
      colunaJogo = scan.nextInt();
    } while (colunaJogo < 0 || colunaJogo > tabuleiro.tabuleiroJogador.length - 1);

    if (tabuleiro.tabuleiroMaquina[linhaJogo][colunaJogo] == '*'
        || tabuleiro.tabuleiroMaquina[linhaJogo][colunaJogo] == 'X') {
      System.out.println("Posição já jogada, tente novamente!");
      jogadaJogador();
    }

    for (int i = 0; i < tabuleiro.posicaoNaviosMaquina.length; i++) {
      if (linhaJogo == tabuleiro.posicaoNaviosMaquina[i][0]
          && colunaJogo == tabuleiro.posicaoNaviosMaquina[i][1]) {
        tabuleiro.tabuleiroMaquina[linhaJogo][colunaJogo] = '*';
        acertosJogador += 1;
      }
    }

    if (tabuleiro.tabuleiroMaquina[linhaJogo][colunaJogo] != '*') {
      tabuleiro.tabuleiroMaquina[linhaJogo][colunaJogo] = 'X';
    }
  }

  public void jogadaMaquina() {
    indiceUm = random.nextInt(tabuleiro.tabuleiroJogador.length);
    indiceDois = random.nextInt(tabuleiro.tabuleiroJogador.length);

    if (tabuleiro.tabuleiroJogador[indiceUm][indiceDois] == 'O') {
      tabuleiro.tabuleiroJogador[indiceUm][indiceDois] = 'X';
    } else if (tabuleiro.tabuleiroJogador[indiceUm][indiceDois] == 'N') {
      tabuleiro.tabuleiroJogador[indiceUm][indiceDois] = '*';
      acertosMaquina += 1;
    } else {
      jogadaMaquina();
    }

  }

  public void verificaFimDeJogo() {
    if (acertosJogador == tabuleiro.posicaoNaviosJogador.length) {
      System.out.println("O jogo terminou, o jogador venceu!");
      fimDeJogo = true;
    }
    if (acertosMaquina == tabuleiro.posicaoNaviosMaquina.length) {
      System.out.println("O jogo terminou, a máquina venceu!");
      fimDeJogo = true;
    }
  }
}