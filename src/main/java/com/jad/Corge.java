package com.jad;

public class Corge implements ICorge {
    private IFoo foo;

    public Corge(IFoo foo) {
        this.foo = foo;
    }

    public IFoo getIFoo() {
        return foo;
    }

    public void setIFoo(IFoo foo) {
        this.foo = foo;
    }

}
