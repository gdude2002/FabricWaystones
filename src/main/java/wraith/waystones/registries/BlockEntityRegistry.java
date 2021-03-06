package wraith.waystones.registries;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import wraith.waystones.Waystones;
import wraith.waystones.block.*;

public class BlockEntityRegistry {

    public static final BlockEntityType<WaystoneBlockEntity> WAYSTONE_BLOCK_ENTITY = BlockEntityType.Builder.create(WaystoneBlockEntity::new, BlockRegistry.WAYSTONE).build(null);

    public static  void registerBlockEntities() {
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Waystones.MOD_ID, "waystone"), WAYSTONE_BLOCK_ENTITY);
    }

}
