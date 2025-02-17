package net.mellowboat.azarothsreach.item;

import net.mellowboat.azarothsreach.AzarothsReach;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AzarothsReach.MOD_ID);

    public static final RegistryObject<Item> OPAL = ITEMS.register("opal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROUGH_OPAL = ITEMS.register("rough_opal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROUGH_OPAL_SHARD = ITEMS.register("rough_opal_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OPAL_SHARD = ITEMS.register("opal_shard",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
