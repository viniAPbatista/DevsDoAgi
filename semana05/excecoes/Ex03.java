package semana05.excecoes;

public class Ex03 {
    public static void main(String[] args) throws Exception{
        try {
            double[][] riscos = new double[][] {
                    {0.0, 0.1, 0.2, 0.3, 0.4},
                    {0.5, 0.6, 0.7, 0.8, 0.9},
                    {1.0, 0.9, 0.8, 0.7, 0.6},
                    {0.5, 0.4, 0.3, 0.2, 0.1},
                    {0.0, 0.25, 0.5, 0.75, -0.2}
            };
            int i;
            int j;

            for(i = 0; i < riscos.length; i++) {
                for(j = 0; j < riscos[0].length; j++) {
                    if(riscos[i][j] < 0 || riscos[i][j] > 1) {
                        throw new Exception("ERRO! Valor invalido!");
                    }
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Matriz incompleta!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
