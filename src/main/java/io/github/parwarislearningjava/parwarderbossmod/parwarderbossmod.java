package io.github.parwarislearningjava.parwarderbossmod;

import io.github.parwarislearningjava.parwarderbossmod.init.Iteminit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(parwarderbossmod.MODID)
public class parwarderbossmod {
    public static final String MODID = "parwarderbossmod";

    public parwarderbossmod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        Iteminit.ITEMS.register(bus);
    }
}
