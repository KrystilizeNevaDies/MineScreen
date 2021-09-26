package nl.kiipdevelopment.minescreen.component;

import net.minestom.server.entity.Player;

public interface Interactable {
    void onHover(Player player, int x, int y);

    void onClick(Player player, int x, int y);
}
