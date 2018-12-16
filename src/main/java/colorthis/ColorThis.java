package colorthis;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ColorThis extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("ColorThis has been invoked!");
    }

    @Override
    public void onDisable() {
        getLogger().info("ColorThis has been disabled");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        String color = "§r";
        //if the first argument is equal to one of the below, set color appropriately
        switch(args[0]) {
            case "dark_red" :
                color = "§4";
                break;
            case "red" :
                color = "§c";
                break;
            case "gold" :
                color = "§6";
                break;
            case "yellow" :
                color = "§e";
                break;
            case "dark_green" :
                color = "§2";
                break;
            case "green" :
                color = "§a";
                break;
            case "aqua" :
                color = "§b";
                break;
            case "dark_aqua" :
                color = "§3";
                break;
            case "dark_blue" :
                color = "§1";
                break;
            case "blue" :
                color = "§9";
                break;
            case "light_purple" :
                color = "§d";
                break;
            case "white" :
                color = "§f";
                break;
            case "gray" :
                color = "§7";
                break;
            case "dark_gray" :
                color = "§8";
                break;
            case "black" :
                color = "§0";
                break;
            case "reset" :
                color = "§r";
                break;
            case "bold" :
                color = "§l";
                break;
            case "italic" :
                color = "§o";
                break;
            case "underline" :
                color = "§n";
                break;
            case "strike" :
                color = "§m";
                break;
            case "gobble" :
                color="§k";
                break;
            default:
                color="NULL";
                break;
        }
        if (cmd.getName().equalsIgnoreCase("colorthis")) {
                if (color == "NULL") {
                    sender.sendMessage("§4Color does not exist, please try again§4");
                    return false;
                } else if (color != "§k" ) {
                    sender.sendMessage(color + "You changed the color of your name" + "§r");
                } else {
                    sender.sendMessage("§oYour name is now unreadable. Congratz§o");
                }
                //String playername = player.getDisplayName();
                String playername = player.getPlayerListName();
                player.setDisplayName(color + playername + "§r");
            return true;
        }
        return false;
    }


}

