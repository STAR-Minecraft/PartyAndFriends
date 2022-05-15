package de.simonsator.partyandfriends.api.events;

import de.simonsator.partyandfriends.api.pafplayers.OnlinePAFPlayer;
import de.simonsator.partyandfriends.api.pafplayers.PAFPlayer;
import net.md_5.bungee.api.plugin.Event;

import java.util.List;

public final class PAFPlayerLoggedInEvent extends Event {

    private final OnlinePAFPlayer player;
    private final List<PAFPlayer> friends;
    private final List<PAFPlayer> friendRequests;

    public PAFPlayerLoggedInEvent(OnlinePAFPlayer player, List<PAFPlayer> friends, List<PAFPlayer> friendRequests) {
        this.player = player;
        this.friends = friends;
        this.friendRequests = friendRequests;
    }

    public OnlinePAFPlayer getPlayer() {
        return player;
    }

    public List<PAFPlayer> getFriends() {
        return friends;
    }

    public List<PAFPlayer> getFriendRequests() {
        return friendRequests;
    }

    @Override
    public String toString() {
        return "PAFPlayerLoggedInEvent{" +
                "player=" + player +
                ", friends=" + friends +
                ", friendRequests=" + friendRequests +
                '}';
    }

}
