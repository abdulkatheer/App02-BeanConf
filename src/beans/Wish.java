package beans;

public class Wish {
    private String name;
    private String wish;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public String getWish() {
        return wish;
    }

    public void wishUser(){
        System.out.println("Hello " + this.getName() + ", " + this.getWish() + "!");
    }
}
