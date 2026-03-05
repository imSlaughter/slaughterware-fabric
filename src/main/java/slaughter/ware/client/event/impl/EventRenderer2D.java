package slaughter.ware.client.event.impl;

import lombok.Getter;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import slaughter.ware.client.event.api.Event;

@Getter
public class EventRenderer2D extends Event {

    public DrawContext context;
    public RenderTickCounter counter;

    public EventRenderer2D(DrawContext context, RenderTickCounter counter) {
        this.context = context;
        this.counter = counter;
    }

    public DrawContext getContext() {
        return context;
    }
}
