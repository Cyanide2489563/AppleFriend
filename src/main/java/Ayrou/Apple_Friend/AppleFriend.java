package Ayrou.Apple_Friend;

import org.bukkit.plugin.java.JavaPlugin;

public final class AppleFriend extends JavaPlugin {

    private AppleFriend instance;

    @Override
    public void onEnable() {
        initialization();
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    // 初始化插件
    private void initialization() {
        setInstance(this);
    }

    // 取得插件實例
    public AppleFriend getInstance() {
        return instance;
    }

    // 設置插件實例
    private void setInstance(AppleFriend instance) {
        this.instance = instance;
    }

}