package nico.barklib.api;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public record BarkWoodSet(Identifier id, Map<Identifier, ItemConvertible> map) {
    public static final Identifier PLANKS = Identifier.of(Identifier.DEFAULT_NAMESPACE, "planks");
    public static final Identifier SLAB = Identifier.of(Identifier.DEFAULT_NAMESPACE, "slab");
    public static final Identifier STAIRS = Identifier.of(Identifier.DEFAULT_NAMESPACE, "stairs");

    public static final Identifier FENCE = Identifier.of(Identifier.DEFAULT_NAMESPACE, "fence");
    public static final Identifier FENCE_GATE = Identifier.of(Identifier.DEFAULT_NAMESPACE, "planks");

    public static final Identifier DOOR = Identifier.of(Identifier.DEFAULT_NAMESPACE, "door");
    public static final Identifier TRAPDOOR = Identifier.of(Identifier.DEFAULT_NAMESPACE, "trapdoor");

    public static final Identifier BUTTON = Identifier.of(Identifier.DEFAULT_NAMESPACE, "button");
    public static final Identifier PRESSURE_PLATE = Identifier.of(Identifier.DEFAULT_NAMESPACE, "pressure_plate");

    public static final Identifier LOG = Identifier.of(Identifier.DEFAULT_NAMESPACE, "log");
    public static final Identifier STRIPPED_LOG = Identifier.of(Identifier.DEFAULT_NAMESPACE, "stripped_log");
    public static final Identifier WOOD = Identifier.of(Identifier.DEFAULT_NAMESPACE, "wood");
    public static final Identifier STRIPPED_WOOD = Identifier.of(Identifier.DEFAULT_NAMESPACE, "stripped_wood");

    public static final Identifier SIGN = Identifier.of(Identifier.DEFAULT_NAMESPACE, "sign");
    public static final Identifier WALL_SIGN = Identifier.of(Identifier.DEFAULT_NAMESPACE, "wall_sign");

    public static final Identifier HANGING_SIGN = Identifier.of(Identifier.DEFAULT_NAMESPACE, "hanging_sign");
    public static final Identifier WALL_HANGING_SIGN = Identifier.of(Identifier.DEFAULT_NAMESPACE, "wall_hanging_sign");

    public static final Identifier BOAT = Identifier.of(Identifier.DEFAULT_NAMESPACE, "boat");
    public static final Identifier CHEST_BOAT = Identifier.of(Identifier.DEFAULT_NAMESPACE, "chest_boat");

    public Identifier getId() {
        return this.id;
    }

    public Optional<ItemConvertible> getEntry(Identifier id) {
        return Optional.ofNullable(this.map.get(id));
    }

    public Block getPlanks() {
        return (Block)this.map.get(PLANKS);
    }

    public Block getSlab() {
        return (Block)this.map.get(SLAB);
    }

    public Block getStairs() {
        return (Block)this.map.get(STAIRS);
    }


    public Block getFence() {
        return (Block)this.map.get(FENCE);
    }

    public Block getFenceGate() {
        return (Block)this.map.get(FENCE_GATE);
    }


    public Block getDoor() {
        return (Block)this.map.get(DOOR);
    }

    public Block getTrapdoor() {
        return (Block)this.map.get(TRAPDOOR);
    }


    public Block getButton() {
        return (Block)this.map.get(BUTTON);
    }

    public Block getPressurePlate() {
        return (Block)this.map.get(PRESSURE_PLATE);
    }


    public Block getLog() {
        return (Block)this.map.get(LOG);
    }

    public Block getStrippedLog() {
        return (Block)this.map.get(STRIPPED_LOG);
    }

    public Block getWood() {
        return (Block)this.map.get(WOOD);
    }

    public Block getStrippedWood() {
        return (Block)this.map.get(STRIPPED_WOOD);
    }


    public Block getSign() {
        return (Block)this.map.get(SIGN);
    }

    public Block getWallSign() {
        return (Block)this.map.get(WALL_SIGN);
    }

    public Block getHangingSign() {
        return (Block)this.map.get(HANGING_SIGN);
    }

    public Block getWallHangingSign() {
        return (Block)this.map.get(WALL_HANGING_SIGN);
    }


    public Item getBoat() {
        return (Item)this.map.get(BOAT);
    }

    public Item getChestBoat() {
        return (Item)this.map.get(CHEST_BOAT);
    }


    public static class Helper {
        private final Identifier id;

        private HashMap<Identifier, ItemConvertible> map;

        public static Helper of(Identifier id) {
            return new Helper(id);
        }

        private Helper(Identifier id) {
            this.id = id;
            this.map = new HashMap<>();
        }

        public Helper setPlanks(Block plankBlock) {
            this.map.put(PLANKS, plankBlock);
            return this;
        }

        public Helper setSlab(Block slabBlock) {
            this.map.put(SLAB, slabBlock);
            return this;
        }

        public Helper setStairs(Block stairsBlock) {
            this.map.put(STAIRS, stairsBlock);
            return this;
        }

        
        public Helper setDoor(Block door) {
            this.map.put(DOOR, door);
            return this;
        }

        public Helper setTrapdoor(Block trapdoor) {
            this.map.put(TRAPDOOR, trapdoor);
            return this;
        }


        public Helper setFence(Block fence, Block fenceGate) {
            this.map.put(FENCE, fence);
            this.map.put(FENCE_GATE, fenceGate);
            return this;
        }

        public Helper setButton(Block button) {
            this.map.put(BUTTON, button);
            return this;
        }

        public Helper setPressurePlate(Block pressurePlate) {
            this.map.put(PRESSURE_PLATE, pressurePlate);
            return this;
        }


        public Helper setLog(Block logBlock, Block strippedLogBlock) {
            this.map.put(LOG, logBlock);
            this.map.put(STRIPPED_LOG, strippedLogBlock);
            return this;
        }

        public Helper setWood(Block woodBlock, Block strippedWoodBlock) {
            this.map.put(WOOD, woodBlock);
            this.map.put(STRIPPED_WOOD, strippedWoodBlock);
            return this;
        }

        
        public Helper setSign(Block sign, Block wallSign) {
            this.map.put(SIGN, sign);
            this.map.put(WALL_SIGN, wallSign);
            return this;
        }

        public Helper setHangingSign(Block hangingSign, Block wallHangingSign) {
            this.map.put(HANGING_SIGN, hangingSign);
            this.map.put(WALL_HANGING_SIGN, wallHangingSign);
            return this;
        }


        public Helper setBoat(Item boatItem, Item chestBoatItem) {
            this.map.put(BOAT, boatItem);
            this.map.put(CHEST_BOAT, chestBoatItem);
            return this;
        }

        public Helper set(Identifier id, ItemConvertible convertible) {
            this.map.put(id, convertible);
            return this;
        }

        public BarkWoodSet build() {
            return new BarkWoodSet(id, map);
        }
    }
}