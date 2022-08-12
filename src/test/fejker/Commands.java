package test.fejker;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.ArrayList;

public class Commands implements Listener {

    static ArrayList<Location> deathLocation = new ArrayList<>();
    static ArrayList<String> playerName = new ArrayList<>();

    @EventHandler
    public static void onPlayerDeath(PlayerDeathEvent event){
        Location death = event.getEntity().getLocation();
        String player = event.getEntity().getName();
        event.getEntity().getPlayer().sendMessage("Zalogowano smierc gracza " + player + " w lokalizacji " + death);
        if (!playerName.contains(player)){
            event.getEntity().getPlayer().sendMessage("Zapis miejsca smieci.");
            deathLocation.add(death);
            playerName.add(player);
        } else {
            event.getEntity().getPlayer().sendMessage("Nadpis miejsca smierci.");
            int index = playerName.indexOf(player);
            deathLocation.remove(index);
            deathLocation.add(index, death);
        }
    }

}
