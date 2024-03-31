class Mamifero extends Animal {
    private String locomocao;

    public Mamifero(String classe, String locomocao) {
        super(classe);
        this.locomocao = locomocao;
    }

    public String getLocomocao() {
        return locomocao;
    }
}