package DaRubyMiner360.moddingschool.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ItemUnknownTextureArmor extends ItemArmor {

	public ItemUnknownTextureArmor(ArmorMaterial armorMaterial, int renderIndex, int armorType) {
		super(armorMaterial, renderIndex, armorType);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(this.armorType == 2)
		{
			return "moddingschool:textures/models/armor/unknowntexture_layer_2.png";
		}
		return "moddingschool:textures/models/armor/unknowntexture_layer_1.png";
	}
}
