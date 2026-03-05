package slaughter.ware.client.function.modules.api;

import lombok.Getter;
import slaughter.ware.client.function.modules.ModuleCategory;

@Getter
public class Module {

    private final String name;
    private final int key;
    private final ModuleCategory category;
    private boolean enabled;

    public Module(String name, int key, ModuleCategory category) {
        this.name = name;
        this.key = key;
        this.category = category;
    }

    public void toggle() {
        enabled = !enabled;
        if (enabled) {
            onEnable();
        } else {
            onDisable();
        }
    }

    protected void onEnable() {
    }

    protected void onDisable() {
    }
}
