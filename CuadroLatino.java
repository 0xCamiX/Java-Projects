package pk01;

public class CuadroLatino extends Cuadro {

    // Atributos
    public int[][] square;

    public CuadroLatino(int n) {
        super(n);
        square = new int[n][n];
        fillSquareInteger();
    }

    public int generateInteger() {
        int x = 0;
        x = (int) (Math.random() * 9) + 0;

        return x;
    }

    private void fillSquareRandomInteger() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                square[i][j] = generateInteger();
            }
        }
    }

    private void fillSquareInteger() {
        int x = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                square[i][j] = x++;
            }
            x = 1;
        }
    }

    public void printSquare() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public int[] getRow(int r) {
        int[] row = new int[n];

        for (int i = 0; i < n; i++) {
            int x = square[r][i];
            row[i] = x;
        }

        return row;
    }

    public int[] rotateRowRight(int r) {
        int[] row;
        int[] row2 = null;

        row = getRow(r);
        row2 = row.clone();

        for (int j = 0; j < n; j++) {
            while ((j + 1) < n) {
                row2[j + 1] = row[j];
                break;
            }

            if (j == (n - 1)) {
                row2[0] = row[j];
            }
        }
        return row2;
    }
    
    public void fillSquareRow(int r, int[] row){
        for (int i = 0; i < n; i++) {
            square[r][i] = row[i];
        }
    }
    
    public void rotateSquareLatin(){
        int row[];
        
        for (int i = 1; i < n; i++) {
            row = rotateRowRight(i-1);
            fillSquareRow(i, row);
        }
    }

}
