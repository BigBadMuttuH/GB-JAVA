package a_lectures.GeekBrains.oop.lecture2.Ex002;
 
public class Priest extends BaseHero {

    private final int elixir;
    private final int maxElixir;

    public Priest() {
        super(String.format("Hero_Priest #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));
        this.maxElixir = Magician.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }
    
    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
    
    public void attack(BaseHero target) {
        int damage = r.nextInt(10, 20);
        target.getDamage(damage);
    }
}