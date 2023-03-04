package be.ifg.lib;

import lombok.Builder;

public class Log {

    private final String value;

    @Builder
    public Log(String value) {
        this.value = value;
    }
}
