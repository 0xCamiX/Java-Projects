package pk01;

public class Cuadro {

    public char[][] letras;
    public int n;

    public Cuadro(int n) {
        this.n = n;
        letras = new char[n][n];
        llenar();
    }

    public char genereLetraMinuscula() {
        char r = ' ';
        char letmin[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int nrol = letmin.length;
        int cual = (int) (Math.random() * nrol);
        r = letmin[cual];
        return r;
    }

    public char genereLetraMayuscula() {
        char r = ' ';
        char letmay[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        int nrol = letmay.length;
        int cual = (int) (Math.random() * nrol);
        r = letmay[cual];
        return r;
    }

    public void llenar() {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                letras[i][k] = genereLetraMayuscula();
            }

        }
    }

    public void imprimirDiag() {
        for (int i = 0; i < n; i++) {
            System.out.println(letras[i][i]);
        }
    }

    public void intercambiarFilas() {
        for (int i = 0; i < n / 2; i++) {
            intercambiarFila(i, n - i - 1);
        }
    }

    public void intercambiarColumnas() {
        for (int i = 0; i < n / 2; i++) {
            intercambiarColumna(n - i - 1, i);
        }
    }

    public void imprimir() {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(letras[i][k] + "  ");
            }
            System.out.println("");
        }
    }

    public void intercambiar(int f1, int c1, int f2, int c2) {
        char temp = letras[f1][c1];
        letras[f1][c1] = letras[f2][c2];
        letras[f2][c2] = temp;
    }

    public void intercambiarFila(int fila1, int fila2) {
        for (int i = 0; i < n; i++) {
            intercambiar(fila1, i, fila2, i);
        }
    }

    public void intercambiarColumna(int col1, int col2) {
        for (int i = 0; i < n; i++) {
            intercambiar(i, col1, i, col2);
        }
    }

    public void trasladar(int f1, int c1) {
        for (int i = 0; i < n; i++) {
            intercambiar(f1, i, i, c1);
        }
    }

    public void transponer(int f1, int c1) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                intercambiar(i, k, k, i);

            }

        }
    }

    public String[] getDataFilaS(int nfila) {
        String r[] = new String[n];
        for (int i = 0; i < n; i++) {
            r[i] = letras[nfila][i] + "";

        }
        return r;
    }

    public String[] getTituloCols() {
        String r[] = new String[n];
        for (int i = 0; i < n; i++) {
            r[i] = " ";

        }
        return r;
    }
}
