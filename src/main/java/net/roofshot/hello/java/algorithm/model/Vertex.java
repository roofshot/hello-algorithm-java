package net.roofshot.hello.java.algorithm.model;

public class Vertex {

    private Long id;
    private String name;

    public Vertex(Long id) {
        this.id = id;
    }

    public Vertex(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public String toString() {
        return String.format("Vertex(%d, %s)", id, name);
    }
}
