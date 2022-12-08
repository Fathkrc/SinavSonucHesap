package generickonusu;

public class Ogrenci {
    public Ogrenci(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " İsim : "+name;
    }
}
