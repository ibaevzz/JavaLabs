package computer.memory;

import computer.memory.BrandMemory;

public class Memory {
    private BrandMemory brand;
    private final int[] reg = new int[128];
    public Memory(BrandMemory brand){
        this.brand = brand;
    }

    public BrandMemory getBrand() {
        return brand;
    }

    public void setBrand(BrandMemory brand) {
        this.brand = brand;
    }

    public ResultMemory put(int ch, byte index){
        if(index>=0){
            reg[index] = ch;
            return ResultMemory.Success;
        }
        return ResultMemory.Error;
    }

    public void delete(byte index){
        reg[index] = 0;
    }

    public int get(int index){
        return reg[index];
    }
}
