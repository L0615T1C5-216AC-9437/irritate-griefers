package D;

import arc.Events;
import arc.util.CommandHandler;
import arc.util.Log;
import arc.util.Strings;
import arc.util.Time;
import mindustry.entities.type.Player;
import mindustry.game.EventType;
import mindustry.net.Administration;
import mindustry.plugin.Plugin;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.json.JSONObject;

import java.util.HashMap;

public class Main extends Plugin {
    //Var
    public static Thread cycle;
    public static HashMap<String, Long> kick = new HashMap<>();
    public static HashMap<String, Long> kickedIP = new HashMap<>();
    ///Var
    //on start
    public Main() {
        Events.on(EventType.PlayerJoin.class, event -> {
            Player player = event.player;
            if (kick.containsKey(byteCode.noColors(player.name.toLowerCase())) || kickedIP.containsKey(player.con.address) || kickedIP.containsKey(player.getInfo().lastIP)) {
                kick.put(byteCode.noColors(player.name.toLowerCase()), Time.millis() + (15 * 60 * 1000));
                kickedIP.put(player.getInfo().lastIP , Time.millis() + (15 * 60 * 1000));
                kickedIP.put(player.con.address, Time.millis() + (15 * 60 * 1000));

                player.con.kick("Griefer");
            }
        });
        Events.on(EventType.PlayerLeave.class, event -> {
            Player player = event.player;
            if (player.getInfo().lastKicked > Time.millis() || player.getInfo().banned) {
                kick.put(byteCode.noColors(player.name.toLowerCase()), Time.millis() + (15 * 60 * 1000));
                kickedIP.put(player.getInfo().lastIP , Time.millis() + (15 * 60 * 1000));
                kickedIP.put(player.con.address, Time.millis() + (15 * 60 * 1000));
            }
        });
        Events.on(EventType.ServerLoadEvent.class, event -> {
            cycle c = new cycle(Thread.currentThread());
            c.setDaemon(false);
            c.start();
        });
        Events.on(EventType.WaveEvent.class, event -> {
            if (!cycle.isAlive()) {
                cycle c = new cycle(Thread.currentThread());
                c.setDaemon(false);
                c.start();
                Log.err("cycle crashed. cycle is being started again... ");
            }
        });
    }

    public void registerServerCommands(CommandHandler handler) {

    }
}