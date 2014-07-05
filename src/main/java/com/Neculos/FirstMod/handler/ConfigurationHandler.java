package com.Neculos.FirstMod.handler;

import com.Neculos.FirstMod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;
    public static void init(File configFile) {
        //create config object from config file
        if (configuration == null)
        {
            Configuration configuration = new Configuration(configFile);
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            //Resync Configs
        }
    }

    public void loadConfiguration()
    {
        testValue = configuration.getBoolean()
    }
}
