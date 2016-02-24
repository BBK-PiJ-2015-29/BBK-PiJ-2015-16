package setexample;

abstract class Colours {
    @Override
    public String toString() {
        return getClass().getSimpleName();

    }

    @Override
    public int hashCode() {
        return (int) getClass().getSimpleName().charAt(0);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Colours)) return false;
        return hashCode() == o.hashCode();
    }
}

class Blue extends Colours {
}

class Red extends Colours {
}

class Green extends Colours {
}

class Orange extends Colours {
}