package mtr;

import mtr.data.RailType;
import mtr.data.TransportMode;
import mtr.item.*;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.WaterLilyBlockItem;

public interface Items {

	Item APG_DOOR = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_DOOR, ItemPSDAPGBase.EnumPSDAPGType.APG);
	Item APG_GLASS = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS, ItemPSDAPGBase.EnumPSDAPGType.APG);
	Item APG_GLASS_END = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS_END, ItemPSDAPGBase.EnumPSDAPGType.APG);
	Item BRUSH = new Item(new Item.Properties().tab(ItemGroups.CORE).stacksTo(1));
	Item RAILWAY_DASHBOARD = new ItemDashboard(TransportMode.TRAIN);
	Item BOAT_DASHBOARD = new ItemDashboard(TransportMode.BOAT);
	Item BOAT_NODE = new WaterLilyBlockItem(Blocks.BOAT_NODE, new Item.Properties().tab(ItemGroups.CORE));
	Item ESCALATOR = new ItemEscalator(new Item.Properties().tab(ItemGroups.RAILWAY_FACILITIES));
	Item PSD_DOOR_1 = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_DOOR, ItemPSDAPGBase.EnumPSDAPGType.PSD_1);
	Item PSD_GLASS_1 = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS, ItemPSDAPGBase.EnumPSDAPGType.PSD_1);
	Item PSD_GLASS_END_1 = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS_END, ItemPSDAPGBase.EnumPSDAPGType.PSD_1);
	Item PSD_DOOR_2 = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_DOOR, ItemPSDAPGBase.EnumPSDAPGType.PSD_2);
	Item PSD_GLASS_2 = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS, ItemPSDAPGBase.EnumPSDAPGType.PSD_2);
	Item PSD_GLASS_END_2 = new ItemPSDAPGBase(ItemPSDAPGBase.EnumPSDAPGItem.PSD_APG_GLASS_END, ItemPSDAPGBase.EnumPSDAPGType.PSD_2);
	Item RAIL_CONNECTOR_20 = new ItemRailModifier(false, RailType.WOODEN);
	Item RAIL_CONNECTOR_20_ONE_WAY = new ItemRailModifier(true, RailType.WOODEN);
	Item RAIL_CONNECTOR_40 = new ItemRailModifier(false, RailType.STONE);
	Item RAIL_CONNECTOR_40_ONE_WAY = new ItemRailModifier(true, RailType.STONE);
	Item RAIL_CONNECTOR_60 = new ItemRailModifier(false, RailType.EMERALD);
	Item RAIL_CONNECTOR_60_ONE_WAY = new ItemRailModifier(true, RailType.EMERALD);
	Item RAIL_CONNECTOR_80 = new ItemRailModifier(false, RailType.IRON);
	Item RAIL_CONNECTOR_80_ONE_WAY = new ItemRailModifier(true, RailType.IRON);
	Item RAIL_CONNECTOR_120 = new ItemRailModifier(false, RailType.OBSIDIAN);
	Item RAIL_CONNECTOR_120_ONE_WAY = new ItemRailModifier(true, RailType.OBSIDIAN);
	Item RAIL_CONNECTOR_160 = new ItemRailModifier(false, RailType.BLAZE);
	Item RAIL_CONNECTOR_160_ONE_WAY = new ItemRailModifier(true, RailType.BLAZE);
	Item RAIL_CONNECTOR_200 = new ItemRailModifier(false, RailType.QUARTZ);
	Item RAIL_CONNECTOR_200_ONE_WAY = new ItemRailModifier(true, RailType.QUARTZ);
	Item RAIL_CONNECTOR_300 = new ItemRailModifier(false, RailType.DIAMOND);
	Item RAIL_CONNECTOR_300_ONE_WAY = new ItemRailModifier(true, RailType.DIAMOND);
	Item RAIL_CONNECTOR_PLATFORM = new ItemRailModifier(false, RailType.PLATFORM);
	Item RAIL_CONNECTOR_SIDING = new ItemRailModifier(false, RailType.SIDING);
	Item RAIL_CONNECTOR_TURN_BACK = new ItemRailModifier(false, RailType.TURN_BACK);
	Item RAIL_REMOVER = new ItemRailModifier();
	Item RESOURCE_PACK_CREATOR = new ItemResourcePackCreator(new Item.Properties().tab(ItemGroups.CORE));
	Item SIGNAL_CONNECTOR_WHITE = new ItemSignalModifier(true, DyeColor.WHITE);
	Item SIGNAL_CONNECTOR_ORANGE = new ItemSignalModifier(true, DyeColor.ORANGE);
	Item SIGNAL_CONNECTOR_MAGENTA = new ItemSignalModifier(true, DyeColor.MAGENTA);
	Item SIGNAL_CONNECTOR_LIGHT_BLUE = new ItemSignalModifier(true, DyeColor.LIGHT_BLUE);
	Item SIGNAL_CONNECTOR_YELLOW = new ItemSignalModifier(true, DyeColor.YELLOW);
	Item SIGNAL_CONNECTOR_LIME = new ItemSignalModifier(true, DyeColor.LIME);
	Item SIGNAL_CONNECTOR_PINK = new ItemSignalModifier(true, DyeColor.PINK);
	Item SIGNAL_CONNECTOR_GRAY = new ItemSignalModifier(true, DyeColor.GRAY);
	Item SIGNAL_CONNECTOR_LIGHT_GRAY = new ItemSignalModifier(true, DyeColor.LIGHT_GRAY);
	Item SIGNAL_CONNECTOR_CYAN = new ItemSignalModifier(true, DyeColor.CYAN);
	Item SIGNAL_CONNECTOR_PURPLE = new ItemSignalModifier(true, DyeColor.PURPLE);
	Item SIGNAL_CONNECTOR_BLUE = new ItemSignalModifier(true, DyeColor.BLUE);
	Item SIGNAL_CONNECTOR_BROWN = new ItemSignalModifier(true, DyeColor.BROWN);
	Item SIGNAL_CONNECTOR_GREEN = new ItemSignalModifier(true, DyeColor.GREEN);
	Item SIGNAL_CONNECTOR_RED = new ItemSignalModifier(true, DyeColor.RED);
	Item SIGNAL_CONNECTOR_BLACK = new ItemSignalModifier(true, DyeColor.BLACK);
	Item SIGNAL_REMOVER_WHITE = new ItemSignalModifier(false, DyeColor.WHITE);
	Item SIGNAL_REMOVER_ORANGE = new ItemSignalModifier(false, DyeColor.ORANGE);
	Item SIGNAL_REMOVER_MAGENTA = new ItemSignalModifier(false, DyeColor.MAGENTA);
	Item SIGNAL_REMOVER_LIGHT_BLUE = new ItemSignalModifier(false, DyeColor.LIGHT_BLUE);
	Item SIGNAL_REMOVER_YELLOW = new ItemSignalModifier(false, DyeColor.YELLOW);
	Item SIGNAL_REMOVER_LIME = new ItemSignalModifier(false, DyeColor.LIME);
	Item SIGNAL_REMOVER_PINK = new ItemSignalModifier(false, DyeColor.PINK);
	Item SIGNAL_REMOVER_GRAY = new ItemSignalModifier(false, DyeColor.GRAY);
	Item SIGNAL_REMOVER_LIGHT_GRAY = new ItemSignalModifier(false, DyeColor.LIGHT_GRAY);
	Item SIGNAL_REMOVER_CYAN = new ItemSignalModifier(false, DyeColor.CYAN);
	Item SIGNAL_REMOVER_PURPLE = new ItemSignalModifier(false, DyeColor.PURPLE);
	Item SIGNAL_REMOVER_BLUE = new ItemSignalModifier(false, DyeColor.BLUE);
	Item SIGNAL_REMOVER_BROWN = new ItemSignalModifier(false, DyeColor.BROWN);
	Item SIGNAL_REMOVER_GREEN = new ItemSignalModifier(false, DyeColor.GREEN);
	Item SIGNAL_REMOVER_RED = new ItemSignalModifier(false, DyeColor.RED);
	Item SIGNAL_REMOVER_BLACK = new ItemSignalModifier(false, DyeColor.BLACK);
	Item BRIDGE_CREATOR_3 = new ItemBridgeCreator(3);
	Item BRIDGE_CREATOR_5 = new ItemBridgeCreator(5);
	Item BRIDGE_CREATOR_7 = new ItemBridgeCreator(7);
	Item BRIDGE_CREATOR_9 = new ItemBridgeCreator(9);
	Item TUNNEL_CREATOR_4_3 = new ItemTunnelCreator(4, 3);
	Item TUNNEL_CREATOR_4_5 = new ItemTunnelCreator(4, 5);
	Item TUNNEL_CREATOR_4_7 = new ItemTunnelCreator(4, 7);
	Item TUNNEL_CREATOR_4_9 = new ItemTunnelCreator(4, 9);
	Item TUNNEL_CREATOR_5_3 = new ItemTunnelCreator(5, 3);
	Item TUNNEL_CREATOR_5_5 = new ItemTunnelCreator(5, 5);
	Item TUNNEL_CREATOR_5_7 = new ItemTunnelCreator(5, 7);
	Item TUNNEL_CREATOR_5_9 = new ItemTunnelCreator(5, 9);
	Item TUNNEL_CREATOR_6_3 = new ItemTunnelCreator(6, 3);
	Item TUNNEL_CREATOR_6_5 = new ItemTunnelCreator(6, 5);
	Item TUNNEL_CREATOR_6_7 = new ItemTunnelCreator(6, 7);
	Item TUNNEL_CREATOR_6_9 = new ItemTunnelCreator(6, 9);
	Item TUNNEL_WALL_CREATOR_4_3 = new ItemTunnelWallCreator(4, 3);
	Item TUNNEL_WALL_CREATOR_4_5 = new ItemTunnelWallCreator(4, 5);
	Item TUNNEL_WALL_CREATOR_4_7 = new ItemTunnelWallCreator(4, 7);
	Item TUNNEL_WALL_CREATOR_4_9 = new ItemTunnelWallCreator(4, 9);
	Item TUNNEL_WALL_CREATOR_5_3 = new ItemTunnelWallCreator(5, 3);
	Item TUNNEL_WALL_CREATOR_5_5 = new ItemTunnelWallCreator(5, 5);
	Item TUNNEL_WALL_CREATOR_5_7 = new ItemTunnelWallCreator(5, 7);
	Item TUNNEL_WALL_CREATOR_5_9 = new ItemTunnelWallCreator(5, 9);
	Item TUNNEL_WALL_CREATOR_6_3 = new ItemTunnelWallCreator(6, 3);
	Item TUNNEL_WALL_CREATOR_6_5 = new ItemTunnelWallCreator(6, 5);
	Item TUNNEL_WALL_CREATOR_6_7 = new ItemTunnelWallCreator(6, 7);
	Item TUNNEL_WALL_CREATOR_6_9 = new ItemTunnelWallCreator(6, 9);
}
