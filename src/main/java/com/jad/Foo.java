package com.jad;

public abstract class Foo implements IFoo{
    private IBaz baz;
    private IBar[] bars;
    private IQux qux;
    private ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
        this.bars = bars;
        this.qux = qux;
        this.corge = corge;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + getName() + '\'' +
                '}';
    }

    public Bar getBar() {
        return this.bar;
    }

    public void addBar(IBar bar) {
        this.bar+= IBar.bar;
    }

}
