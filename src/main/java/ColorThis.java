package net.neodusk.minecraft.colorthis;
        import org.bukkit.ChatColor;
        import org.bukkit.command.Command;
        import org.bukkit.command.CommandSender;
        import org.bukkit.entity.Player;
        import org.bukkit.plugin.java.JavaPlugin;

        public class ColorThis extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("ColorThis has been enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("ColorThis has been disabled");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("colorthis")) {
            if (sender instanceof Player) {
                sender.sendMessage(ChatColor.RED + "You changed the color of your name");
                String playername = player.getDisplayName();
                player.setDisplayName("§1" + playername);
            }
            return true;
        } //If this has happened the function will return true.
        // If this hasn't happened the value of false will be returned.
        return false;
    }

    public void setDisplayName(String name) {

    }
}
