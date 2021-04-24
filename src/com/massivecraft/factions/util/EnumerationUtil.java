package com.massivecraft.factions.util;

import com.massivecraft.factions.entity.MConf;
import com.massivecraft.massivecore.collections.BackstringSet;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;

public class EnumerationUtil
{
	// -------------------------------------------- //
	// MATERIAL EDIT ON INTERACT
	// -------------------------------------------- //
	
	public static final BackstringSet<Material> MATERIALS_EDIT_ON_INTERACT = new BackstringSet<>(Material.class,
		"REPEATER", // Minecraft 1.?
		"NOTE_BLOCK", // Minecraft 1.?
		"CAULDRON", // Minecraft 1.?
		"FARMLAND", // Minecraft 1.?
		"DAYLIGHT_DETECTOR", // Minecraft 1.5
		"COMPARATOR", // Minecraft 1.?
		"COMPOSTER", // Minecraft 1.14
		"LECTERN", // Minecraft 1.14
		"BEEHIVE", // Minecraft 1.15
		"BEE_NEST", // Minecraft 1.5
		"FLOWER_POT" // Minecraft 1.?
	);
	
	public static boolean isMaterialEditOnInteract(Material material)
	{
		return MATERIALS_EDIT_ON_INTERACT.contains(material) || MConf.get().materialsEditOnInteract.contains(material);
	}
	
	// -------------------------------------------- //
	// MATERIAL EDIT TOOLS
	// -------------------------------------------- //
	
	public static final BackstringSet<Material> MATERIALS_EDIT_TOOL = new BackstringSet<>(Material.class,
		"FIRE_CHARGE", // Minecraft 1.?
		"FLINT_AND_STEEL", // Minecraft 1.?
		"BUCKET",
		"WATER_BUCKET", // Minecraft 1.?
		"LAVA_BUCKET",// Minecraft 1.?
		"COD_BUCKET",// Minecraft 1.13
		"PUFFERFISH_BUCKET", // Minecraft 1.13
		"SALMON_BUCKET", // Minecraft 1.13
		"TROPICAL_FISH_BUCKET", // Minecraft 1.13
		"ARMOR_STAND", // Minecraft 1.8
		"END_CRYSTAL", // Minecraft 1.10
		
		// The duplication bug found in Spigot 1.8 protocol patch
		// https://github.com/MassiveCraft/Factions/issues/693
		"CHEST", // Minecraft 1.? // TODO why chest?
		"SIGN_POST", // Minecraft 1.?
		"TRAPPED_CHEST", // Minecraft 1.?
		"SIGN", // Minecraft 1.?
		"WOOD_DOOR", // Minecraft 1.?
		"IRON_DOOR" // Minecraft 1.?
	);
	
	public static boolean isMaterialEditTool(Material material)
	{
		return MATERIALS_EDIT_TOOL.contains(material) || MConf.get().materialsEditTools.contains(material);
	}
	
	// -------------------------------------------- //
	// MATERIAL DOOR
	// -------------------------------------------- //
	
	// Interacting with these materials placed in the terrain results in door toggling.
	public static final BackstringSet<Material> MATERIALS_DOOR = new BackstringSet<>(Material.class,
		"ACACIA_DOOR",
		"ACACIA_FENCE_GATE",
		"ACACIA_TRAPDOOR",
		"BIRCH_DOOR",
		"BIRCH_FENCE_GATE",
		"BIRCH_TRAPDOOR",
		"CRIMSON_DOOR",
		"CRIMSON_FENCE_GATE",
		"CRIMSON_TRAPDOOR",
		"DARK_OAK_DOOR",
		"DARK_OAK_FENCE_GATE",
		"DARK_OAK_TRAPDOOR",
		"IRON_DOOR",
		"IRON_TRAPDOOR",
		"JUNGLE_DOOR",
		"JUNGLE_FENCE_GATE",
		"JUNGLE_TRAPDOOR",
		"OAK_DOOR",
		"OAK_FENCE_GATE",
		"OAK_TRAPDOOR",
		"SPRUCE_DOOR",
		"SPRUCE_FENCE_GATE",
		"SPRUCE_TRAPDOOR",
		"WARPED_DOOR",
		"WARPED_FENCE_GATE",
		"WARPED_TRAPDOOR"
	);
	
	public static boolean isMaterialDoor(Material material)
	{
		return MATERIALS_DOOR.contains(material) || MConf.get().materialsDoor.contains(material);
	}
	
	// -------------------------------------------- //
	// MATERIAL CONTAINER
	// -------------------------------------------- //
	
	public static final BackstringSet<Material> MATERIALS_CONTAINER = new BackstringSet<>(Material.class,
		"DISPENSER",
		"CHEST",
		"TRAPPED_CHEST",
		"FURNACE",
		"JUKEBOX",
		"BREWING_STAND",
		"ENCHANTING_TABLE",
		"ANVIL",
		"CHIPPED_ANVIL",
		"DAMAGED_ANVIL",
		"BEACON",
		"HOPPER",
		"DROPPER",
		"BARREL", // Minecraft 1.14
		"BLAST_FURNACE", // Minecraft 1.14
		
		// The various shulker boxes, they had to make each one a different material -.-
		"SHULKER_BOX",
		"BLACK_SHULKER_BOX",
		"BLUE_SHULKER_BOX",
		"BROWN_SHULKER_BOX",
		"CYAN_SHULKER_BOX",
		"GRAY_SHULKER_BOX",
		"GREEN_SHULKER_BOX",
		"LIGHT_BLUE_SHULKER_BOX",
		"LIGHT_GRAY_SHULKER_BOX",
		"LIME_SHULKER_BOX",
		"MAGENTA_SHULKER_BOX",
		"ORANGE_SHULKER_BOX",
		"PINK_SHULKER_BOX",
		"PURPLE_SHULKER_BOX",
		"RED_SHULKER_BOX",
		"SILVER_SHULKER_BOX", // Changed name to light gray, I think. Kept for backwards compatibility
		"WHITE_SHULKER_BOX",
		"YELLOW_SHULKER_BOX"
	);
	
	public static boolean isMaterialContainer(Material material)
	{
		return MATERIALS_CONTAINER.contains(material) || MConf.get().materialsContainer.contains(material);
	}
	
	// -------------------------------------------- //
	// ENTITY TYPE EDIT ON INTERACT
	// -------------------------------------------- //
	
	// Interacting with these entities results in an edit.
	public static final BackstringSet<EntityType> ENTITY_TYPES_EDIT_ON_INTERACT = new BackstringSet<>(EntityType.class,
		"ITEM_FRAME", // Minecraft 1.?
		"ARMOR_STAND" // Minecraft 1.8
	);
	
	public static boolean isEntityTypeEditOnInteract(EntityType entityType)
	{
		return ENTITY_TYPES_EDIT_ON_INTERACT.contains(entityType) || MConf.get().entityTypesEditOnInteract.contains(entityType);
	}
	
	// -------------------------------------------- //
	// ENTITY TYPE EDIT ON DAMAGE
	// -------------------------------------------- //
	
	// Damaging these entities results in an edit.
	public static final BackstringSet<EntityType> ENTITY_TYPES_EDIT_ON_DAMAGE = new BackstringSet<>(EntityType.class,
		"ITEM_FRAME", // Minecraft 1.?
		"ARMOR_STAND", // Minecraft 1.8
		"ENDER_CRYSTAL" // Minecraft 1.10
	);
	
	public static boolean isEntityTypeEditOnDamage(EntityType entityType)
	{
		return ENTITY_TYPES_EDIT_ON_DAMAGE.contains(entityType) || MConf.get().entityTypesEditOnDamage.contains(entityType);
	}
	
	// -------------------------------------------- //
	// ENTITY TYPE CONTAINER
	// -------------------------------------------- //
	
	public static final BackstringSet<EntityType> ENTITY_TYPES_CONTAINER = new BackstringSet<>(EntityType.class,
		"MINECART_CHEST", // Minecraft 1.?
		"MINECART_HOPPER" // Minecraft 1.?
	);
	
	public static boolean isEntityTypeContainer(EntityType entityType)
	{
		return ENTITY_TYPES_CONTAINER.contains(entityType) || MConf.get().entityTypesContainer.contains(entityType);
	}
	
	// -------------------------------------------- //
	// ENTITY TYPE MONSTER
	// -------------------------------------------- //
	
	public static final BackstringSet<EntityType> ENTITY_TYPES_MONSTER = new BackstringSet<>(EntityType.class,
		"BLAZE", // Minecraft 1.?
		"CAVE_SPIDER", // Minecraft 1.?
		"CREEPER", // Minecraft 1.?
		"ELDER_GUARDIAN",
		"ENDERMAN", // Minecraft 1.?
		"ENDERMITE", // Minecraft 1.8
		"ENDER_DRAGON", // Minecraft 1.?
		"EVOKER",
		"EVOKER_FANGS",
		"GUARDIAN", // Minecraft 1.8
		"GHAST", // Minecraft 1.?
		"GIANT", // Minecraft 1.?
		"HUSK",
		"MAGMA_CUBE", // Minecraft 1.?
		"POLAR_BEAR", // Minecraft 1.10
		"SILVERFISH", // Minecraft 1.?
		"SHULKER", // Minecraft 1.10
		"SKELETON", // Minecraft 1.?
		"SLIME", // Minecraft 1.?
		"SPIDER", // Minecraft 1.?
		"STRAY",
		"VINDICATOR",
		"VEX",
		"WITCH", // Minecraft 1.?
		"WITHER", // Minecraft 1.?
		"WITHER_SKELETON",
		"STRAY", // Minecraft 1.?
		"ZOMBIE", // Minecraft 1.?
		"ZOMBIE_VILLAGER",
		"ILLUSIONER", // Minecraft 1.12
		"PHANTOM", // Minecraft 1.13
		"DOLPHIN", // Minecraft 1.13
		"DROWNED", // Minecraft 1.13
		"PILLAGER", // Minecraft 1.14
		"RAVAGER", // Minercraft 1.14
		"ZOMBIFIED_PIGLIN", // Minecraft 1.16 (rename of PIG_ZOMBIE)
		"PIG_ZOMBIE", // Minecraft 1.? . Changed name to ZOMBIFIED_PIGLIN, kept for backwards compatibility
		"HOGLIN",
		"ZOGLIN",
		"PIGLIN_BRUTE"
	);
	
	public static boolean isEntityTypeMonster(EntityType entityType)
	{
		return ENTITY_TYPES_MONSTER.contains(entityType) || MConf.get().entityTypesMonsters.contains(entityType);
	}
	
	// -------------------------------------------- //
	// ENTITY TYPE ANIMAL
	// -------------------------------------------- //
	
	public static final BackstringSet<EntityType> ENTITY_TYPES_ANIMAL = new BackstringSet<>(EntityType.class,
		"BAT", // Minecraft 1.?
		"CHICKEN", // Minecraft 1.?
		"COW", // Minecraft 1.?
		"DONKEY",
		"HORSE", // Minecraft 1.?
		"LLAMA",
		"MULE",
		"MUSHROOM_COW", // Minecraft 1.?
		"OCELOT", // Minecraft 1.?
		"PIG", // Minecraft 1.?
		"RABBIT", // Minecraft 1.?
		"SHEEP", // Minecraft 1.?
		"SKELETON_HORSE",
		"SQUID", // Minecraft 1.?
		"WOLF", // Minecraft 1.?
		"ZOMBIE_HORSE",
		"PARROT", // Minecraft 1.12
		"COD", // Minecraft 1.13
    	"SALMON", // Minecraft 1.13
    	"PUFFERFISH", // Minecraft 1.13
    	"TROPICAL_FISH", // Minecraft 1.13
		"TURTLE", // Minecraft 1.13
		"CAT", // Minecraft 1.14
		"FOX", // Minecraft 1.14
		"PANDA", // Minecraft 1.14
		"LLAMA", // Minecraft 1.14
		"LLAMA_SPIT", // Minecraft 1.14
		"BEE",
		"STRIDER"
	);
	
	public static boolean isEntityTypeAnimal(EntityType entityType)
	{
		return ENTITY_TYPES_ANIMAL.contains(entityType) || MConf.get().entityTypesAnimals.contains(entityType);
	}
	
}
