package nico.barklib.api;

public class BarkWoodSet {
    private final Identifier id;

    private final Block plankBlock;
    private final Block slabBlock;
    private final Block stairsBlock;

    private final Block door;
    private final Block trapdoor;

    private final Block fence;
    private final Block fenceGate;

    private final Block button;
    private final Block pressurePlate;

    private final Block logBlock;
    private final Block strippedLogBlock;
    private final Block woodBlock;
    private final Block strippedWoodBlock;
    private final Block signBlock;

    private final Item boatItem;
    private final Item chestBoatItem;
    private final List<BarkWoodSetExtension> extensions;

    public BarkWoodSet(Identifier id) {
        this.id = id;
    }

    public static class Helper {
        private Identifier id;

        private Block plankBlock;
        private Block slabBlock;
        private Block stairsBlock;

        private Block door;
        private Block trapdoor;

        private Block fence;
        private Block fenceGate;

        private Block button;
        private Block pressurePlate;

        private Block logBlock;
        private Block strippedLogBlock;
        private Block woodBlock;
        private Block strippedWoodBlock;

        private Pair<Block, Block> signBlock;
        //private Block hangingSignBlock;

        private Item boatItem;
        private Item chestBoatItem;
        private List<BarkWoodSetExtension> extensions;

        public static Helper of(Identifier id) {
            return new Helper(id);
        }

        private Helper(Identifier id) {
            this.id = id;
            this.extensions = new ArrayList<>();
        }


        public Helper setPlank(Block plankBlock) {
            this.plankBlock = plankBlock;
            return this;
        }

        public Helper setSlab(Block slabBlock) {
            this.slabBlock = slabBlock;
            return this;
        }

        public Helper setStairs(Block stairsBlock) {
            this.stairsBlock = stairsBlock;
            return this;
        }

        
        public Helper setDoor(Block door) {
            this.door = door;
            return this;
        }

        public Helper setTrapdoor(Block trapdoor) {
            this.trapdoor = trapdoor;
            return this;
        }


        public Helper setFence(Block fence) {
            this.fence = fence;
            return this;
        }

        public Helper setFenceGate(Block fenceGate) {
            this.fenceGate = fenceGate;
            return this;
        }


        public Helper setButton(Block button) {
            this.button = button;
            return this;
        }

        public Helper setPressurePlate(Block pressurePlate) {
            this.pressurePlate = pressurePlate;
            return this;
        }


        public Helper setLog(Block logBlock) {
            this.logBlock = logBlock;
            return this;
        }

        public Helper setStrippedLog(Block strippedLogBlock) {
            this.strippedLogBlock = strippedLogBlock;
            return this;
        }

        public Helper setWood(Block woodBlock) {
            this.woodBlock = woodBlock;
            return this;
        }

        public Helper setStrippedWood(Block strippedWoodBlock) {
            this.strippedWoodBlock = strippedWoodBlock;
            return this;
        }

        
        public Helper setSign(Block sign, Block wallSign) {
            this.sign = new Pair<>(sign, wallSign);
            return this;
        }


        public Helper setBoat(Item boatItem, Item chestBoatItem) {
            this.boatItem = boatItem;
            this.chestBoatItem = chestBoatItem;
            return this;
        }

        public Helper addExtension(BarkWoodSetExtension extension) {
            this.extensions.add(extension);
            return this;
        }
    }
}