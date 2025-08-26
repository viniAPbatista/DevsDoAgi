package semana05.excecoes;

public class Ex05 {
    public static void main(String[] args) {
        int i, j;
        double somaAtivos = 0;
        double[] mediaAtivos = new double[3];

        String[][] investimentosStr = new String[][] {
                {"1.0", "1.0", "1.0"},
                {"2.0", "2.0", "a"},
                {"3.0", "3.0", "3.0"}
        };

        try {
            double[][] investimentos = new double[investimentosStr.length][investimentosStr[0].length];

            for (i = 0; i < investimentosStr.length; i++) {
                for (j = 0; j < investimentosStr[0].length; j++) {
                    investimentos[i][j] = Double.parseDouble(investimentosStr[i][j]);
                    somaAtivos += investimentos[i][j];
                }
                mediaAtivos[i] = somaAtivos / investimentosStr[0].length;
                somaAtivos = 0;
            }

            for(i = 0; i < mediaAtivos.length; i++) {
                System.out.printf("Media portifolio %d: %.2f \n", i + 1, mediaAtivos[i]);
            }

        } catch (NumberFormatException e) {
            System.out.println("ERRO! Foi digitado um valor inválido, não é número!");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERRO! A matriz está incompleta!");
        }
    }
}
