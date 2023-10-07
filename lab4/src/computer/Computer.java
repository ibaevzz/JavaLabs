package computer;

import computer.memory.BrandMemory;
import computer.memory.Memory;
import computer.monitor.BrandMonitor;
import computer.monitor.Monitor;
import computer.processor.BrandProcessor;
import computer.processor.Processor;

public class Computer {
    private Monitor monitor;
    private Processor processor;
    private Memory memory;

    Computer(Monitor monitor, Processor processor, Memory memory){
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
    }
    public Computer(BrandMonitor brandMonitor, BrandProcessor brandProcessor, BrandMemory brandMemory){
        this.memory = new Memory(brandMemory);
        this.monitor = new Monitor(brandMonitor);
        this.processor = new Processor(brandProcessor, memory);
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
        processor.setMemory(memory);
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
    public Memory getMemory() {
        return memory;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    public Processor getProcessor() {
        return processor;
    }

    public void start() {
        processor.run();
    }
}
