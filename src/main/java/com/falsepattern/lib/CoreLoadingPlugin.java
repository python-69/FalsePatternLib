package com.falsepattern.lib;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.Name;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.SortingIndex;

import java.io.File;
import java.util.Map;

@MCVersion("1.7.10")
@Name(ModInfo.MODID)
@SortingIndex(500)
public class CoreLoadingPlugin implements IFMLLoadingPlugin {
    public static File mcDir;

    @Override
    public String[] getASMTransformerClass() {
        return null;
    }

    @Override
    public String getModContainerClass() {
        return ModInfo.GROUPNAME + ".lib.FalsePatternLib";
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
        mcDir = (File)data.get("mcLocation");
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}