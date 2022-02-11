package dev.nclark;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor(staticName = "of")
public class Bean {

    @Getter
    private int x;
    @Setter
    @Getter
    private int y;
    private String z;

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }
}