//Basic Class for entities

package entity;

//import entity.*;

/* abstract ? */ public class Entity {
    
//	Variables
	
  //	Basic Info
	private String 		name = "unknown";				// 	name of entity
    private double		weight = 0;						//	weight of entity
    private double[]	size = new double[] {0, 0, 0};	//	size of entity (height + breadth + width)
  
  //	Attributes
    private	Attributes 	attributes = new Attributes();
    //	[0]	constitution	[2]	dexterity		{4]	wisdom
    //	[1]	strength		{3]	intelligence	[5]	charisma
    
  //	Resistances (defensive modifiers)
    private Resistances	resistances = new Resistances();
    //	[0] blunt		[3]	fire	[6]	poison
    //	[1] piercing	[4]	frost	[7]	light
    //	[2]	slashing	[5]	shock	[8]	dark    
  
    //	Attack Bonus (offensive modifiers)
    private double		bon_blunt = 0;					//	Blunt 		(physical)
    private double		bon_piercing = 0;				// 	Piercing 	(physical)
    private double		bon_slashing = 0;				//	Slashing 	(physical)
    private double		bon_fire = 0;					//	Fire		(elemental)
    private double		bon_frost = 0;					//	Frost		(elemental)
    private double		bon_shock = 0;					//	Shock		(elemental)
    private double		bon_poison = 0;					//	Poison		(elemental)
    private double		bon_light = 0;					//	Light		(elemental)
    private double		bon_dark = 0;					//	Dark		(elemental)
    
  //	Status
    private int			hp_max = 1;						// 	maximum health points
    private int			hp_cur = 1;						// 	current health points
    private int			mp_max = 0;						// 	maximum magic points
    private int			mp_cur = 0;						// 	current magic points
    private int			st_max = 0;						//	maximum stamina
    private int			st_cur = 0;						//	current stamina
    

//	Constructors

    //	Sets: Basic Info, Attributes, Resistances, specific Status 
    Entity(String name_n , double weight_n, double[] size_n , int[] attributes_n , double[] resistances_n , int hp_max_n , int hp_cur_n , int mp_max_n , int mp_cur_n, int st_max_n, int st_cur_n)
    {
      //	Basic Info
    	name = name_n;
    	weight = weight_n;
    	for(int i = 0 ; i < 3 ; i++) 
    	{
    		size[i] = size_n[i];
    	}
    	
      //	Attributes
    	attributes = new Attributes(attributes_n);
    	
      //   	Resistances
    	
    	resistances = new Resistances(resistances_n);
    	
      //	Status
    	
    	hp_max = hp_max_n;
    	hp_cur = hp_cur_n;
    	mp_max = mp_max_n;
    	mp_cur = mp_cur_n;
    	st_max = st_max_n;
    	st_cur = st_cur_n;
    	
    };
    
    //	Sets: Basic Info, Attributes, Resistances, specific Status (Currents = Max)
    Entity(String name_n , double weight_n, double[] size_n , int[] attributes_n , double[] resistances_n , int hp_max_n , int mp_max_n , int st_max_n)
    {
        //	Basic Info
      	name = name_n;
      	weight = weight_n;
      	for(int i = 0 ; i < 3 ; i++) 
      	{
      		size[i] = size_n[i];
      	}
      	
        //	Attributes
    	attributes = new Attributes(attributes_n);
    	
        //   	Resistances
      	
    	resistances = new Resistances(resistances_n);
      	
        //	Status
      	
      	hp_max = hp_max_n;
      	hp_cur = hp_max_n;
      	mp_max = mp_max_n;
      	mp_cur = mp_max_n;
      	st_max = st_max_n;
      	st_cur = st_max_n;
      	
    }
    
    //	Blank Slate, all values 0 or empty;
    Entity()
    {
    	
    }

    
    
//	getMethods
    
  //	Basic Info
    	
    //	Name
    public String 	getName() 
    {	
    	return 	name;
    }
    	
    //	Weight
    public double 	getWeight() 
    {	
    	return 	weight;
    }
    
    //Size
    public double[]	getSize() 
    {	
    	return 	size;
    }
    	
  //	Attack Bonus
    
    //	All
    public double[] 	getBonus()
    {
    	double[] 	bonus = new double[9];
    	
    	bonus[0] = getBonBlunt();
    	bonus[1] = getBonPiercing();
    	bonus[2] = getBonSlashing();
    	bonus[3] = getBonFire();
    	bonus[4] = getBonFrost();
    	bonus[5] = getBonShock();
    	bonus[6] = getBonPoison();
    	bonus[7] = getBonLight();
    	bonus[8] = getBonDark();
    	
    	return	bonus;
    }
    	
    //	Blunt
    public double 		getBonBlunt() 
    {
    	return 	bon_blunt;
    }
	
    //	Piercing
    public double 		getBonPiercing() 
    {
    	return 	bon_piercing;
    }
	
    //	Slashing
    public double 		getBonSlashing() 
    {
    	return 	bon_slashing;
    }
	
    //	Fire
    public double 		getBonFire() 
    {
    	return 	bon_fire;
    }
	
    //	Frost
    public double 		getBonFrost() 
    {
    	return 	bon_frost;
    }
	
    //	Shock
    public double 		getBonShock() 
    {
    	return 	bon_shock;
    }
	
    //	Poison
    public double 		getBonPoison() 
    {
    	return 	bon_poison;
    }
	
    //	Light
    public double 		getBonLight() 
    {
    	return 	bon_light;
    }
	
    //	Dark
    public double 		getBonDark() 
    {
    	return 	bon_dark;
    }
	
  //	Status
    
    //	Maximum Health
    public int 		getHealthMax() 
    {
    	return 	hp_max;
    }

    //	Current Health
    public int 		getHealthCurrent() 
    {
    	return	hp_cur;
    }

    //	Maximum Magic
    public int 		getMagicMax() 
    {
    	return	mp_max;
    }

    // 	Current Magic
    public int 		getMagicCurrent() 
    {
    	return 	mp_cur;
    }

    //	Maximum Stamina
    public int 		getStaminaMax() 
    {
    	return 	st_max;
    }

    // 	Current Stamina
    public int 		getStaminaCurrent() 
    {
    	return 	st_cur;
    }

        
//	setMethods
    
  //	Basic Info
    
    //	Name
    public void		setName(String name_n)
    {
    	name = name_n;
    }
    
    //	Weight
    public void		setWeight(double weight_n)
    {
    	weight = weight_n;
    }
    
    //	Size
    public void		setSize(double[] size_n)
    {
    	size = size_n;
    }
    
  //	Attack Bonus
    
    //	All
    public void		setBonus(double[] bonus_n)
    {
    	setBonBlunt		(bonus_n[0]);
    	setBonPiercing	(bonus_n[1]);
    	setBonSlashing	(bonus_n[2]);
    	setBonFire		(bonus_n[3]);
    	setBonFrost		(bonus_n[4]);
    	setBonShock		(bonus_n[5]);
    	setBonPoison	(bonus_n[6]);
    	setBonLight		(bonus_n[7]);
    	setBonDark		(bonus_n[8]);
    	
    	return;
    }
    
    //	Blunt
    public void		setBonBlunt(double bon_blunt_n) 
    {
    	bon_blunt = bon_blunt_n;
    	return;
    }

    //	Piercing
    public void		setBonPiercing(double bon_piercing_n) 
    {
    	bon_piercing = bon_piercing_n;
    }

    //	Slashing
    public void		setBonSlashing(double bon_slashing_n) 
    {
    	bon_slashing = bon_slashing_n;
    }

    //	Fire
    public void		setBonFire(double bon_fire_n) 
    {
    	bon_fire = bon_fire_n;
    }

    //	Frost
    public void		setBonFrost(double bon_frost_n) 
    {
    	bon_frost = bon_frost_n;
    }

    //	Shock
    public void		setBonShock(double bon_shock_n) 
    {
    	bon_shock = bon_shock_n;
    }

    //	Poison
    public void		setBonPoison(double bon_poison_n) 
    {
    	bon_poison = bon_poison_n;
    }

    //	Light
    public void		setBonLight(double bon_light_n) 
    {
    	bon_light = bon_light_n;
    }

    //	Dark
    public void		setBonDark(double bon_dark_n) 
    {
    	bon_dark = bon_dark_n;
    }
    
    
  //	Status
    
    //	Health, Max
    public void		setHealthMax(int hp_max_n) 
    {
    	hp_max = hp_max_n;
    }
    
    //	Health, Current
    public void		setHealthCurrent(int hp_cur_n) 
    {
    	hp_cur = hp_cur_n;
    }
    
    //	Magic, Max
    public void		setMagicMax(int mp_max_n) 
    {
    	mp_max = mp_max_n;
    }
    
    //	Magic, Current
    public void		setMagicCurrent(int mp_cur_n) 
    {
    	mp_cur = mp_cur_n;
    }
    
    //	Stamina, Max
    public void		setStaminaMax(int st_max_n) 
    {
    	st_max = st_max_n;
    }
    
    //	Stamina, Current
    public void		setStaminaCurrent(int st_cur_n) 
    {
    	st_cur = st_cur_n;
    }
    
    
//	Actions
  
  //	Fighting
    
    //	Receive Damage
    public void 	receiveDamage	( int type , double amount )
    {
    	double 	damage = amount  - resistances.getResistances()[type];
    	if	( damage > 0 )
    	{
    		if	( hp_cur > damage )
    		{
    			hp_cur = hp_cur - (int)damage;
    		}
    		else
    		{
    			hp_cur = 0; //DEATH
    		}
    	}
    	
    }
    
    //	Deal Damage
    public double	dealDamage	( int type ) 
    {
    	double 	damage = attributes.getStrength() * (1 + getBonus()[type]);
    	return	damage;
    }
    
    
    
    
    
//	TESTING AREA 1
    
    public static void main	( String[] args )
    {
    	Entity a = new Entity();
    	a.attributes.setAll(2, 4, 6, 8, 10, 1);
    	System.out.println("Strength: " + a.attributes.getStrength());
    	
    	return;
    }
    
    
    // TODO
    /* 
    abstract void talk();
    abstract void showStats();
    abstract void attack();
     */
}
