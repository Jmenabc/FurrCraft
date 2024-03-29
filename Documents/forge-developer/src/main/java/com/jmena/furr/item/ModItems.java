package com.jmena.furr.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/*
    Clase que contendra todos los items de mi mod
    @author Jmenabc
 */
public class ModItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "furrcraft");
    //FURRO LINGOTE
    public static final RegistryObject<Item> furr_ingot = ITEMS.register("furr_ingot",()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    //FURRO LINGOTE PLUS
    public static final RegistryObject<Item> furr_ingot_plus = ITEMS.register("furr_ingot_plus",()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    //ESPADA FURRO
    public static final RegistryObject<Item> furr_word = ITEMS.register("furr_sword",
            ()-> new SwordItem(ModTiers.FURR,2,3f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
