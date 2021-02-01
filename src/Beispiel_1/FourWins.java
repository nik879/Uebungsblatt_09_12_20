package Beispiel_1;

public class FourWins {
    private int sizeX;
    private int sizeY;
    private char[][]charArray;

    public FourWins(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        charArray=new char[sizeX][sizeY];
        for (int i = 0; i < charArray.length; ++i) {
            for (int j = 0; j < charArray[i].length; ++j) {
                charArray[i][j] = ' ';
            }
        }
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void print() {
        for (int i = 0; i < this.charArray.length; ++i) {
            for (int j = 0; j < this.charArray[i].length; ++j) {
                System.out.println("Spielfeld "+i+j+":"+this.charArray[i][j]);
            }
        }
    }

    public boolean playerA(int x, int y) {
        if (charArray[x][y] == ' ') {
            charArray[x][y]='A';
        }
        else return false;
        return true;
    }
    public boolean playerB(int x, int y) {
        if (charArray[x][y] == ' ') {
            charArray[x][y]='B';
        }
        else return false;
        return true;
    }

    private char fourInRow() {

        for (int i = 0; i < charArray.length; i++) {
            // Schleife für Zeilen
            int counter = 0;
            char player = ' ';
            for (int j = 0; j < charArray[i].length; j++) {
                if (charArray[i][j] == ' '){
                    counter = 0;
                    player = ' ';
                }
                else{
                    // in dem Feld steht ein 'A' oder 'B'
                    if (player == charArray[i][j]){
                        counter++;
                    }
                    else {
                        player = charArray[i][j];
                        counter = 1;
                    }
                }
                if (counter == 4){
                    return player;
                }
            }
        }

        return 'X';
    }

    private char fourInRow2(){
        for (int i = 0; i < charArray.length; i++) {
            // Schleife für Zeilen
            for (int j = 0; j < charArray[i].length - 3; j++) {
                if (charArray[i][j] != ' '){
                    char player = charArray[i][j];
                    if (charArray[i][j+1] == player
                            && charArray[i][j+2] == player
                            && charArray[i][j+3] == player){
                        return player;
                    }
                }
            }
        }

        return 'X';
    }

    private char fourInColumn(){
        for (int i = 0; i < sizeX; i++) {
            // Schleife für Zeilen
            for (int j = 0; j < sizeY - 3; j++) {
                if (charArray[j][i] != ' '){
                    char player = charArray[j][i];
                    if (charArray[j + 1][i] == player
                            && charArray[j + 2][i] == player
                            && charArray[j + 2][i] == player){
                        return player;
                    }
                }
            }
        }

        return 'X';
    }

    public char winner() {
        char player = fourInRow2();
        if (player != 'X')
            return player;

        player = fourInColumn();
        return player;
    }
}

