//Basic Class for entities

package entity;

import java.util.Random;

/* abstract ? */ public class Entity {
    
//	Variables
	
  //	Basic Info
	private String 		name = "unknown";				// 	name of entity
    private double		weight = 0;						//	weight of entity
    private double[]	size = new double[] {0, 0, 0};	//	size of entity (height + breadth + width)
  
  //	Attributes
    private int			attr_constitution = 0;			// 	constitution 
    private int			attr_strength = 0;				// 	strength 
    private int			attr_dexterity = 0;				// 	dexterity
    private int			attr_intelligence = 0;			// 	intelligence
    private int			attr_wisdom = 0;				// 	wisdom
    private int			attr_charisma = 0;				// 	charisma
    
  //	Resistances (defensive modifiers)
    private double		res_blunt = 0;					//	Blunt 		(physical)
    private double		res_piercing = 0;				// 	Piercing 	(physical)
    private double		res_slashing = 0;				//	Slashing 	(physical)
    private double		res_fire = 0;					//	Fire		(elemental)
    private double		res_frost = 0;					//	Frost		(elemental)
    private double		res_shock = 0;					//	Shock		(elemental)
    private double		res_poison = 0;					//	Poison		(elemental)
    private double		res_light = 0;					//	Light		(elemental)
    private double		res_dark = 0;					//	Dark		(elemental)
    
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
    	setAttributes(attributes_n);
    	
      //   	Resistances
    	
    	setResistances(resistances_n);
    	
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
      	setAttributes(attributes_n);
      	
        //   	Resistances
      	
      	setResistances(resistances_n);
      	
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
    	
  //	Attributes
    
    //	All
    public int[] 	getAttributes()
    {
    	int[]	attributes = new int[6];
    	
    	attributes[0] = getAttrConstitution();
    	attributes[1] = getAttrStrength();
    	attributes[2] = getAttrDexterity();
    	attributes[3] = getAttrIntelligence();
    	attributes[4] = getAttrWisdom();
    	attributes[5] = getAttrCharisma();
    	
    	return 	attributes;
    }
    	
    //	Constitution
    public int 		getAttrConstitution() 
    {
    	return 	attr_constitution;
    }
	
	//	Strength
    public int 		getAttrStrength() 
    {
    	return 	attr_strength;
    }
    
	//	Dexterity
    public int 		getAttrDexterity() 
    {
    	return 	attr_dexterity;
    }

	//	Intelligence
    public int 		getAttrIntelligence() 
    {
    	return 	attr_intelligence;
    }

	//	Wisdom
    public int 		getAttrWisdom() 
    {
    	return 	attr_wisdom;
    }

	//	Charisma
    public int 		getAttrCharisma() 
    {
    	return 	attr_charisma;
    }
   
  //	Resistances
    
    //	All
    public double[] 	getResistances()
    {
    	double[] 	resistances = new double[9];
    	
    	resistances[0] = getResBlunt();
    	resistances[1] = getResPiercing();
    	resistances[2] = getResSlashing();
    	resistances[3] = getResFire();
    	resistances[4] = getResFrost();
    	resistances[5] = getResShock();
    	resistances[6] = getResPoison();
    	resistances[7] = getResLight();
    	resistances[8] = getResDark();
    	
    	return	resistances;
    }
    	
    //	Blunt
    public double 		getResBlunt() 
    {
    	return 	res_blunt;
    }
	
    //	Piercing
    public double 		getResPiercing() 
    {
    	return 	res_piercing;
    }
	
    //	Slashing
    public double 		getResSlashing() 
    {
    	return 	res_slashing;
    }
	
    //	Fire
    public double 		getResFire() 
    {
    	return 	res_fire;
    }
	
    //	Frost
    public double 		getResFrost() 
    {
    	return 	res_frost;
    }
	
    //	Shock
    public double 		getResShock() 
    {
    	return 	res_shock;
    }
	
    //	Poison
    public double 		getResPoison() 
    {
    	return 	res_poison;
    }
	
    //	Light
    public double 		getResLight() 
    {
    	return 	res_light;
    }
	
    //	Dark
    public double 		getResDark() 
    {
    	return 	res_dark;
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
    
  //	Attributes
    
    //	All
    public void		setAttributes(int[] attributes_n)
    {
    	setAttrConstitution	(attributes_n[0]);
    	setAttrStrength		(attributes_n[1]);
    	setAttrDexterity	(attributes_n[2]);
    	setAttrIntelligence	(attributes_n[3]);
    	setAttrWisdom		(attributes_n[4]);
    	setAttrCharisma		(attributes_n[5]);
    	
    	return;
    }
    
    //	Constitution
    public void		setAttrConstitution(int attr_con_n) 
    {
    	attr_constitution = attr_con_n;
    	return;
    }

    //	Strength
    public void		setAttrStrength(int attr_str_n) 
    {
    	attr_strength = attr_str_n;
    	return;
    }

    //	Dexterity
    public void		setAttrDexterity(int attr_dex_n) 
    {
    	attr_dexterity = attr_dex_n;
    	return;
    }

    //	Intelligence
    public void		setAttrIntelligence(int attr_int_n) 
    {
    	attr_intelligence = attr_int_n;
    	return;
    }

    //	Wisdom
    public void		setAttrWisdom(int attr_wis_n) 
    {
    	attr_wisdom = attr_wis_n;
    	return;
    }

    //	Charisma
    public void		setAttrCharisma(int attr_cha_n) 
    {
    	attr_charisma = attr_cha_n;
    	return;
    }

  //	Resistances
    
    //	All
    public void		setResistances(double[] resistances_n)
    {
    	setResBlunt		(resistances_n[0]);
    	setResPiercing	(resistances_n[1]);
    	setResSlashing	(resistances_n[2]);
    	setResFire		(resistances_n[3]);
    	setResFrost		(resistances_n[4]);
    	setResShock		(resistances_n[5]);
    	setResPoison	(resistances_n[6]);
    	setResLight		(resistances_n[7]);
    	setResDark		(resistances_n[8]);
    	
    	return;
    }
    
    //	Blunt
    public void		setResBlunt(double res_blunt_n) 
    {
    	res_blunt = res_blunt_n;
    	return;
    }

    //	Piercing
    public void		setResPiercing(double res_piercing_n) 
    {
    	res_piercing = res_piercing_n;
    }

    //	Slashing
    public void		setResSlashing(double res_slashing_n) 
    {
    	res_slashing = res_slashing_n;
    }

    //	Fire
    public void		setResFire(double res_fire_n) 
    {
    	res_fire = res_fire_n;
    }

    //	Frost
    public void		setResFrost(double res_frost_n) 
    {
    	res_frost = res_frost_n;
    }

    //	Shock
    public void		setResShock(double res_shock_n) 
    {
    	res_shock = res_shock_n;
    }

    //	Poison
    public void		setResPoison(double res_poison_n) 
    {
    	res_poison = res_poison_n;
    }

    //	Light
    public void		setResLight(double res_light_n) 
    {
    	res_light = res_light_n;
    }

    //	Dark
    public void		setResDark(double res_dark_n) 
    {
    	res_dark = res_dark_n;
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
    	double 	damage = amount  - getResistances()[type];
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
    	int 	damage = getAttrStrength() * (1 + getBon()[type]);
    	return	damage;
    }
    
    
    
    
    
//	TESTING AREA 1
    
    public static void main	( String[] args )
    {
    	Entity a = new Entity();
    	a.setHealthMax(100);
    	a.setHealthCurrent(100);
    	a.setAttrStrength(10);
    	a.setResBlunt(6);
    	a.setResPiercing(4);
    	System.out.println("Health: " + a.getHealthCurrent() + "/" + a.getHealthMax());
    	a.receiveDamage(0, 20);
    	System.out.println("Health: " + a.getHealthCurrent() + "/" + a.getHealthMax());
    	a.receiveDamage(1, 20);
    	System.out.println("Health: " + a.getHealthCurrent() + "/" + a.getHealthMax());
    	a.receiveDamage(1, a.dealDamage(0));
    	System.out.println("Health: " + a.getHealthCurrent() + "/" + a.getHealthMax());
    	a.receiveDamage(0, a.dealDamage(0));
    	System.out.println("Health: " + a.getHealthCurrent() + "/" + a.getHealthMax());
    	
    }
    
    
    // TODO
    /* 
    abstract void talk();
    abstract void showStats();
    abstract void attack();
     */
}
