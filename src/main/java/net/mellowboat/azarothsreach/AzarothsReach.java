package net.mellowboat.azarothsreach;

import com.mojang.logging.LogUtils;
import net.mellowboat.azarothsreach.block.ModBlocks;
import net.mellowboat.azarothsreach.item.ModCreativeModeTabs;
import net.mellowboat.azarothsreach.item.ModItems;
import net.mellowboat.azarothsreach.worldgen.tree.ModTrunkPlacerTypes;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AzarothsReach.MOD_ID)
public class AzarothsReach
{

    public static final String MOD_ID = "azaroths_reach";

    private static final Logger LOGGER = LogUtils.getLogger();

    public AzarothsReach(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);


        modEventBus.addListener(this::commonSetup);

        ModTrunkPlacerTypes.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }


    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {


        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DESERT_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SHATTERED_DESERT_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPIRALING_SOD.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPIRALING_SOD_PATH.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PALE_PETALS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GOLDEN_DANDELION.get(), RenderType.cutout());
        }

        @SubscribeEvent
        public static void registerBlockColors(RegisterColorHandlersEvent.Block event){
            event.register(
                    (pState, pLevel, pPos, pTintIndex)
                            ->  BiomeColors.getAverageGrassColor(pLevel, pPos),
                    ModBlocks.SPIRALING_SOD.get(),ModBlocks.PALE_PETALS.get(),
                    ModBlocks.GOLDEN_DANDELION.get()
            );

            event.register(
                    (pState, pLevel, pPos, pTintIndex)
                            ->  BiomeColors.getAverageFoliageColor(pLevel, pPos),
                    ModBlocks.WEEPING_OAK_LEAVES.get(), ModBlocks.SPIRALING_SOD_PATH.get()
            );

        }

        @SubscribeEvent
        public static void registerItemColors(RegisterColorHandlersEvent.Item event){
            event.register(
                    (pStack, pTintIndex) -> 15513968,
                    ModBlocks.SPIRALING_SOD.get().asItem(), ModBlocks.WEEPING_OAK_LEAVES.get().asItem()
            );

        }

    }
}
