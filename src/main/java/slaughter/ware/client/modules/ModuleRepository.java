package slaughter.ware.client.function.modules;

import com.google.common.eventbus.Subscribe;
import slaughter.ware.client.event.impl.EventKey;
import slaughter.ware.client.function.modules.api.Module;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ModuleRepository {

    private final List<Module> modules = new ArrayList<>();

    public void register(Module module) {
        modules.add(module);
    }

    public List<Module> getModules() {
        return Collections.unmodifiableList(modules);
    }

    @Subscribe
    public void onKey(EventKey event) {
        for (Module module : modules) {
            if (module.getKey() == event.getKey()) {
                module.toggle();
            }
        }
    }
}
