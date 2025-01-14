package com.falsepattern.lib.config;

import com.falsepattern.lib.StableAPI;
import cpw.mods.fml.client.IModGuiFactory;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;

import java.util.Set;

@SideOnly(Side.CLIENT)
@StableAPI(since = "0.9.0")
public interface SimpleGuiFactory extends IModGuiFactory {
    @Override
    default void initialize(Minecraft minecraftInstance) {

    }

    @Override
    default Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return null;
    }

    @Override
    default RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
        return null;
    }
}
