package net.scorpy18.scorpysdumbmod.item;

// necessary imports
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.scorpy18.scorpysdumbmod.ScorpysDumbMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ScorpysDumbMod.MOD_ID);

    // creates an item called chaos orb
    public static final RegistryObject<Item> CHAOS_ORB = ITEMS.register("chaos_orb", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CHAOS = ITEMS.register("raw_chaos", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAOS_SLURRY = ITEMS.register("chaos_slurry", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EYE_OF_THE_ORB = ITEMS.register("eye_of_the_orb", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOUTH_OF_GREED = ITEMS.register("mouth_of_greed", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
