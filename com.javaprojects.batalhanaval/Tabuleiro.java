import java.util.Random;

public class Tabuleiro {

  Random random = new Random();
  char[][] tabuleiroJogador = new char[3][3];
  char[][] tabuleiroMaquina = new char[3][3];
  int[][] posicaoNaviosJogador = new int[3][2];
  int[][] posicaoNaviosMaquina = new int[3][2];
  int quantidadeNavios = 3;
  int indiceUm;
  int indiceDois;
  int linhaJogo;
  int colunaJogo;

  public void geraTabuleiros() {
    for (int i = 0; i < tabuleiroJogador.length; i++) {
      for (int j = 0; j < tabuleiroJogador.length; j++) {
        tabuleiroJogador[i][j] = 'O';
        tabuleiroMaquina[i][j] = 'O';
      }
    }
  }

  public void popularNavios() {

    for (int i = 0; i < quantidadeNavios; i++) {

      posicaoNaviosJogador[i][0] = random.nextInt(tabuleiroJogador.length);
      posicaoNaviosJogador[i][1] = random.nextInt(tabuleiroJogador.length);

      for (int j = 0; j < i; j++) {
        if ((posicaoNaviosJogador[i][0] == posicaoNaviosJogador[j][0])
            && (posicaoNaviosJogador[i][1] == posicaoNaviosJogador[j][1]))
          do {
            posicaoNaviosJogador[i][0] = random.nextInt(tabuleiroJogador.length);
            posicaoNaviosJogador[i][1] = random.nextInt(tabuleiroJogador.length);
          } while ((posicaoNaviosJogador[i][0] == posicaoNaviosJogador[j][0])
              && (posicaoNaviosJogador[i][1] == posicaoNaviosJogador[j][1]));
      }

    }

    for (int i = 0; i < quantidadeNavios; i++) {

      posicaoNaviosMaquina[i][0] = random.nextInt(tabuleiroMaquina.length);
      posicaoNaviosMaquina[i][1] = random.nextInt(tabuleiroMaquina.length);

      for (int j = 0; j < i; j++) {
        if ((posicaoNaviosMaquina[i][0] == posicaoNaviosMaquina[j][0])
            && (posicaoNaviosMaquina[i][1] == posicaoNaviosMaquina[j][1]))
          do {
            posicaoNaviosMaquina[i][0] = random.nextInt(tabuleiroMaquina.length);
            posicaoNaviosMaquina[i][1] = random.nextInt(tabuleiroMaquina.length);
          } while ((posicaoNaviosMaquina[i][0] == posicaoNaviosMaquina[j][0])
              && (posicaoNaviosMaquina[i][1] == posicaoNaviosMaquina[j][1]));
      }

    }

    for (int i = 0; i < posicaoNaviosJogador.length; i++) {
      tabuleiroJogador[posicaoNaviosJogador[i][0]][posicaoNaviosJogador[i][1]] = 'N';
    }
  }

  public void printaTabuleiros() {
    System.out.println("Tabuleiro do Jogador: \n");
    for (int i = 0; i < tabuleiroJogador.length; i++) {
      for (int j = 0; j < tabuleiroJogador.length; j++) {
        System.out.print(tabuleiroJogador[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("\nTabuleiro da Máquina: \n");
    for (int i = 0; i < tabuleiroMaquina.length; i++) {
      for (int j = 0; j < tabuleiroMaquina.length; j++) {
        System.out.print(tabuleiroMaquina[i][j] + " ");
      }
      System.out.println();
    }
  }

}
