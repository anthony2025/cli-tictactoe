package Default;

public class Player {
    private String name;
    private int win;
    private int loss;
    private boolean turn;
    private int symbol;

    public void setName(String value) {name=value;}
    public String getName() {return name;}

    public void setWin(int value) {win=value;}
    public int getWin() {return win;}

    public void setLoss(int value) {loss=value;}
    public int getLoss() {return loss;}

    public void setTurn(boolean value) {turn=value;}
    public boolean getTurn() {return turn;}

    public void setSymbol(int value) {symbol=value;}
    public int getSymbol() {return symbol;}


    public String toString() {
        return name + " won " + win + " games, loss " + loss + " games,and his symbol is " + symbol + ".";
    }

}