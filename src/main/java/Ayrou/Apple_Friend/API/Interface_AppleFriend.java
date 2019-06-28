package Ayrou.Apple_Friend.API;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.UUID;

public interface Interface_AppleFriend {

    /**
     * 判斷 player 與 target 是否為好友
     * @param player 目標一
     * @param target 目標二
     * @return 是否為好友
     */
    boolean isFriend(@NotNull UUID player, @NotNull UUID target);

    ArrayList<UUID> getFriends(@NotNull UUID player);

    void addFriend(@NotNull UUID player, @NotNull UUID target);

    void removeFriend(@NotNull UUID player, @NotNull UUID target);
}