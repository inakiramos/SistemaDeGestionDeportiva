import java.util.ArrayList;
import java.util.List;

public class PlayersActions {
    private List<Players> players;

    public PlayersActions() {
        players = new ArrayList<Players>();
    }

    public boolean existsPlayer(String name){
        boolean exists = false;
        Players currentPlayer = new Players(name);

        for (int index = 0; index < players.size(); index ++) {
            if (currentPlayer.getPlayerName().equals(players.get(index).getPlayerName()))
                exists = true;
        }

        if (!exists) {
            players.add(currentPlayer);
        }
        else {
            System.out.println("Existe un jugador ya registrado con ese nombre. ");
        }
        return exists;
    }

    public void deletePlayer(String name){
        if (existsPlayer(name)){
            players.remove(name);
            System.out.println("Jugador " + name + " ha sido eliminado correctamente. ");
        }
        else{
            System.out.println("No existe un jugador con ese nombre. ");
        }
    }

    public void showPlayers(){
        if (players.isEmpty()){
            System.out.println("No hay jugadores registrados para eventos. ");
        }
        else{
            System.out.println("Jugadores dentro del sistema: ");
            for (int index = 0; index < players.size(); index ++) {
                Players currentPlayer = players.get(index);
                System.out.println(index + ". " + currentPlayer.getPlayerName());
            }
        }
    }

    public void setPlayersScore(String playerName, double playerScore){
        if (!existsPlayer(playerName)){
            System.out.println("No existe un jugador con ese nombre. ");
        }
        else{
            Players currentPlayer = new Players(playerName);
            currentPlayer.setPlayerScore(playerScore);
        }
    }

    public void playersRanking(){
        if (players.isEmpty()){
            System.out.println("No hay jugadores registrados para eventos. ");
        }
        else{
            System.out.println("Ranking de jugadores: ");
            List<Players> organizedPlayersList = new ArrayList<>(players);

            //Players currentPlayer = players.get(index);
            //System.out.println(index + ". " + currentPlayer.getPlayerName() + ", puntuación = " + currentPlayer.getPlayerScore());

        }
    }

}