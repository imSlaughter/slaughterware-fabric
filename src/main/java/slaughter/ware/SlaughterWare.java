package slaughter.ware;

import com.google.common.eventbus.EventBus;
import lombok.Getter;
import net.fabricmc.api.ModInitializer;
import slaughter.ware.client.event.api.Event;
import slaughter.ware.client.function.modules.api.Module;
import slaughter.ware.client.function.modules.ModuleRepository;

@Getter
public class SlaughterWare implements ModInitializer {

    @Getter
    public static SlaughterWare instance;
    private EventBus eventBus;
    private ModuleRepository moduleRepository;

    @Override
    public void onInitialize() {
        instance = this;
        eventBus = new EventBus();
        moduleRepository = new ModuleRepository();
        eventBus.register(moduleRepository);
    }

    public void registerModule(Module module) {
        moduleRepository.register(module);
    }

    public void postEvent(Event event) {
        if (eventBus != null) {
            eventBus.post(event);
        }
    }
}
