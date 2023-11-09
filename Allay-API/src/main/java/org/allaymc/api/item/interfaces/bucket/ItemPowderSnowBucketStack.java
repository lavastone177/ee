package org.allaymc.api.item.interfaces.bucket;

import org.allaymc.api.data.VanillaItemId;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.type.ItemType;
import org.allaymc.api.item.type.ItemTypeBuilder;

/**
 * @author daoge_cmd <br>
 * Allay Project <br>
 */
public interface ItemPowderSnowBucketStack extends ItemStack {
  ItemType<ItemPowderSnowBucketStack> POWDER_SNOW_BUCKET_TYPE = ItemTypeBuilder
          .builder(ItemPowderSnowBucketStack.class)
          .vanillaItem(VanillaItemId.POWDER_SNOW_BUCKET)
          .build();
}