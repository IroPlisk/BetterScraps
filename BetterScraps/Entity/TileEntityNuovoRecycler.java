package BetterScraps.Entity;

import ic2.api.Direction;
import ic2.api.energy.tile.IEnergySink;
import net.minecraft.tileentity.TileEntity;

public class TileEntityNuovoRecycler extends TileEntity implements IEnergySink {


    @Override
    public boolean acceptsEnergyFrom(TileEntity emitter, Direction direction) {
        return false;
    }

    @Override
    public int demandsEnergy() {
        return 0;
    }

    @Override
    public int injectEnergy(Direction directionFrom, int amount) {
        return 32;
    }

    @Override
    public int getMaxSafeInput() {
        return 32;
    }

    @Override
    public boolean isAddedToEnergyNet() {
        return false;
    }
}
