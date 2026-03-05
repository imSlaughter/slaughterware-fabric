package slaughter.ware.client.event.api;

import lombok.Getter;
import slaughter.ware.SlaughterWare;

@Getter
public class Event {

    private boolean cancelled;

    public void cancel() {
        cancelled = true;
    }

    public void resume() {
        cancelled = false;
    }

    public void call() {
        SlaughterWare main = SlaughterWare.getInstance();
        if (main != null && main.getEventBus() != null) {
            main.getEventBus().post(this);
        }
    }
}
