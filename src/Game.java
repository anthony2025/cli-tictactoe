package Default;

public class Game {
    public int[][] tablero = new int[3][3];
    public Player jugador1 = new Player();
    public Player jugador2 = new Player();

    public void Initialize() {
        //0=o's
        //1=x's
        //-1=vacio
        for (int i=0; i<3; i++) {
             for(int j=0; j<3; j++){
                 tablero[i][j]=-1;
             }
        }
        jugador1.setName("Anthony");
        jugador1.setWin(0);
        jugador1.setLoss(0);
        jugador1.setTurn(true);
        jugador1.setSymbol(0);

        jugador2.setName("Sandro");
        jugador2.setWin(0);
        jugador2.setLoss(0);
        jugador2.setTurn(false);
        jugador2.setSymbol(1);
    }

    public void Play(int x, int y, Player jugador) {
        if (tablero[x][y] ==-1) {
            tablero[x][y] = jugador.getSymbol();
        }
    }
    
    public boolean Check(Player jugador, int x, int y) {
        if ((x==0)&&(y==0)) {
           if (tablero[0][1]==jugador.getSymbol()&&(tablero[0][2]==jugador.getSymbol())) {
                return true;
           }
           if (tablero[1][0]==jugador.getSymbol()&&(tablero[2][0]==jugador.getSymbol())) {
                return true;
           }
           if (tablero[1][1]==jugador.getSymbol()&&(tablero[2][2]==jugador.getSymbol())) {
                return true;
           }
           return false;
        }


        if ((x==0)&&(y==1)) {
            if (tablero[1][1]==jugador.getSymbol()&&(tablero[2][1]==jugador.getSymbol())) {
                return true;
            }
            if (tablero[0][0]==jugador.getSymbol()&&(tablero[0][2]==jugador.getSymbol())) {
                return true;
            }
            return false;
        }


        if ((x==0)&&(y==2)) {
            if (tablero[0][0]==jugador.getSymbol()&&(tablero[0][1]==jugador.getSymbol())) {
                return true;
            }
            if (tablero[1][2]==jugador.getSymbol()&&(tablero[2][2]==jugador.getSymbol())) {
                return true;
            }
            if (tablero[1][1]==jugador.getSymbol()&&(tablero[2][0]==jugador.getSymbol())) {
                return true;
            }
            return false;
        }

        if ((x==1)&&(y==0)) {
            if (tablero[1][1]==jugador.getSymbol()&&(tablero[1][2]==jugador.getSymbol())) {
                return true;
            }
            if (tablero[0][0]==jugador.getSymbol()&&(tablero[2][0]==jugador.getSymbol())) {
                return true;
            }
            return false;
        }

        if ((x==1)&&(y==1)) {
            if (tablero[0][1]==jugador.getSymbol()&&(tablero[2][1]==jugador.getSymbol())) {
                return true;
            }
            if (tablero[1][0]==jugador.getSymbol()&&(tablero[1][2]==jugador.getSymbol())) {
                return true;
            }
            if (tablero[0][0]==jugador.getSymbol()&&(tablero[2][2]==jugador.getSymbol())) {
                return true;
            }
            if (tablero[2][0]==jugador.getSymbol()&&(tablero[0][2]==jugador.getSymbol())) {
                return true;
            }
            return false;
        }


        if ((x==1)&&(y==2)) {
            if (tablero[0][2]==jugador.getSymbol()&&(tablero[2][2]==jugador.getSymbol())) {
                return true;
            }
            if (tablero[1][0]==jugador.getSymbol()&&(tablero[1][1]==jugador.getSymbol())) {
                return true;
            }
            return false;
        }


        if ((x==2)&&(y==0)) {
            if (tablero[0][0]==jugador.getSymbol()&&(tablero[1][0]==jugador.getSymbol())) {
                return true;
            }
            if (tablero[1][1]==jugador.getSymbol()&&(tablero[0][2]==jugador.getSymbol())) {
                return true;
            }
            if (tablero[2][1]==jugador.getSymbol()&&(tablero[2][2]==jugador.getSymbol())) {
                return true;
            }
            return false;
        }


        if ((x==2)&&(y==1)) {
            if (tablero[0][1]==jugador.getSymbol()&&(tablero[1][1]==jugador.getSymbol())) {
                return true;
            }
            if (tablero[2][0]==jugador.getSymbol()&&(tablero[2][2]==jugador.getSymbol())) {
                return true;
            }
            return false;
        }

        if ((x==2)&&(y==2)) {
            if (tablero[0][0]==jugador.getSymbol()&&(tablero[1][1]==jugador.getSymbol())) {
                return true;
            }
            if (tablero[2][0]==jugador.getSymbol()&&(tablero[2][1]==jugador.getSymbol())) {
                return true;
            }
            if (tablero[0][2]==jugador.getSymbol()&&(tablero[1][2]==jugador.getSymbol())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
