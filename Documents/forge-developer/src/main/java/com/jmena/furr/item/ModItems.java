package com.jmena.furr.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/*
    Clase que contendra todos los items de mi mod
    @author Jmenabc
 */
public class ModItems {
    //FURRO SWORD
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,"forge");
    public static final RegistryObject<Item> Furro_Sword = ITEMS.register("furro word",()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
