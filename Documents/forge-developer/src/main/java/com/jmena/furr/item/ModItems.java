package com.jmena.furr.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/*
    Clase que contendra todos los items de mi mod
    @author Jmenabc
 */
public class ModItems {
    //FURRO Lingote
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "furrcraft");
    public static final RegistryObject<Item> furr_ingot = ITEMS.register("furr_ingot",()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
