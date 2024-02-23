package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
    @Autowired
    MobileProcesor cpu;
    public MobileProcesor getCpu() {
        return cpu;
    }
    public void setCpu(MobileProcesor cpu) {
        this.cpu = cpu;
    }

    public void config()
    {
        System.out.println("Octa Core , 4GB Ram");
        cpu.process();
    }
}
