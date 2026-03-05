package slaughter.ware.client.event.impl;

import lombok.Getter;
import slaughter.ware.client.event.api.Event;

@Getter
public class EventKey extends Event {

    private final int key;

    public EventKey(int key) {
        this.key = key;
    }
}
