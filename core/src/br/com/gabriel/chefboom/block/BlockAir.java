package br.com.gabriel.chefboom.block;

public class BlockAir extends Block {

    public BlockAir() {
        super(null);
    }

    @Override
    public boolean isSolid() {
        return false;
    }
}
