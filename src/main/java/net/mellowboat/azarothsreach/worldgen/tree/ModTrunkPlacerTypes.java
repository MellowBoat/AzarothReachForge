package net.mellowboat.azarothsreach.worldgen.tree;

import net.mellowboat.azarothsreach.AzarothsReach;
import net.mellowboat.azarothsreach.worldgen.tree.custom.WeepingOakTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTrunkPlacerTypes {

    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, AzarothsReach.MOD_ID);

    public static final RegistryObject<TrunkPlacerType<WeepingOakTrunkPlacer>> WEEPING_OAK_TRUNK_PLACER =
            TRUNK_PLACER.register("weeping_oak_trunk_placer", () -> new TrunkPlacerType<>(WeepingOakTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACER.register(eventBus);
    }

}
