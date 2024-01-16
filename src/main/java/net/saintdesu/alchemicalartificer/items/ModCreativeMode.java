package net.saintdesu.alchemicalartificer.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.saintdesu.alchemicalartificer.AlchemicalArtificer;
import net.saintdesu.alchemicalartificer.block.ModBlocks;

public class ModCreativeMode
{

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AlchemicalArtificer.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALCHEMICAL_TAB = CREATIVE_MODE_TABS.register ("alchemical_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ELIXIR.get()))
                    .title(Component.translatable("creativetab.alchemical_tab"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(ModItems.ELIXIR.get());
                        output.accept(ModItems.OIL.get());
                        output.accept(ModItems.NETHER_MOSS.get());

                        output.accept(ModBlocks.NETHER_MOSSY_COBBLESTONE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
