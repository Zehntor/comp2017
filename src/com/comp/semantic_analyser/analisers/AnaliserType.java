package com.comp.semantic_analyser.analisers;

/**
 * @author Ricardo Wragg Freitas <ei95036@fe.up.pt> 199502870
 */
public enum AnaliserType {

    MODULE("module"),
    FUNCTION("function"),
    ASSIGN("assign");

    private final String value;

    AnaliserType(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
