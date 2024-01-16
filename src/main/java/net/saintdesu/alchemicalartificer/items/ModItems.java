package net.saintdesu.alchemicalartificer.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.saintdesu.alchemicalartificer.AlchemicalArtificer;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AlchemicalArtificer.MOD_ID);

    public static final RegistryObject<Item> ELIXIR = ITEMS.register("elixir",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OIL = ITEMS.register("oil",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NETHER_MOSS = ITEMS.register("nether_moss",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
