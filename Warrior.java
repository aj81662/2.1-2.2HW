public class Warrior{
    private String name;
    private int level;
    private int maxHealth;
    private int health;
    private int attack; 
    private int defense;
    private int magicAttack;
    private int magicDefense;
    private int agility;
    private int wisdom;
        //constructor for level 1 characters
        public Warrior(String n) {
            name = n;
            level = 1;
            maxHealth = 20;
            health = maxHealth;
            attack = 10;
            defense = 8;
            magicAttack = 0;
            magicDefense = 4;
            agility = 7;
            wisdom = 2;
            
        }
        //constructor for higher level characters
        public Warrior(String n, int lev) {
            name = n;
            level = lev;
            maxHealth = 20*lev;
            health = maxHealth;
            attack = 10*lev;
            defense = 8*lev;
            magicAttack = 0*lev;
            magicDefense = 4*lev;
            agility = 7*lev;
            wisdom = 2*lev;
            
        }
         public Healer(String n) {
            name = n;
            level = 1;
            maxHealth = 16;
            health = maxHealth;
            attack = 4;
            defense = 6;
            magicAttack = 5;
            magicDefense = 10;
            agility = 3;
            wisdom = 12;
            
        }
        //constructor for higher level characters
        public Healer(String n, int lev) {
            name = n;
            level = lev;
            maxHealth = 16*lev;
            health = maxHealth;
            attack = 4*lev;
            defense = 6*lev;
            magicAttack = 5*lev;
            magicDefense = 10*lev;
            agility = 3*lev;
            wisdom = 12*lev;
            
        }
}
