package Ayrou.Apple_Friend.Placeholders;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;

public class Placeholder extends PlaceholderExpansion {

    @Override
    public String getIdentifier() {
        return "Apple_Friend";
    }

    @Override
    public String getAuthor() {
        return "Cyanide";
    }

    @Override
    public String getVersion() {
        return "0.0.1";
    }

    @Override
    public String onPlaceholderRequest(Player player, String identifier) {

        if (player == null) return identifier;

        switch(identifier) {
            case "":
                return "";
            default:
                return identifier;
        }

    }

}