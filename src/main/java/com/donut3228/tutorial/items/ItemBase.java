package com.donut3228.tutorial.items;

import com.donut3228.tutorial.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(TutorialMod.TAB));
    }
}
