package io.github.parwarislearningjava.parwarderbossmod.init;

import io.github.parwarislearningjava.parwarderbossmod.parwarderbossmod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Iteminit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, parwarderbossmod.MODID);

    public static final RegistryObject<Item> VISHI = ITEMS.register("vishi", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
