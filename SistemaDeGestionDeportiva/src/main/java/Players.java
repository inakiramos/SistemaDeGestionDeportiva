public class Players {
    private String playerName;
    private double playerScore;

    public Players(String playerName) {
        this.playerName = playerName;
        this.playerScore = 0.0;
    }

    public String getPlayerName() {
        return playerName;
    }

    public double getPlayerScore() {
        return playerScore;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerScore(double playerScore) {
        if(playerScore >= -999999.0)
            this.playerScore = playerScore;
        else
            System.out.println("La puntuación no es válida. Debe de ser mayor o igual a -999999.0");
    }

    public String toString(){
        return "Jugador{" +  "nombre: " + playerName + "," + "puntuación: " + playerScore + "}";
    }

}