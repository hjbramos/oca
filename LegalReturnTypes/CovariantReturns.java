class Aplha {
    Alpha doStuff(char c) {
        return new Alpha();
    }
}

class Beta extends Alpha {
    Beta doStuff(char c) { // legal override since Java 1.5
        return new Beta();
    }
}