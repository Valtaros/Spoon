//Basic Class for entities

package entity;

import java.util.Random;

/* abstract ? */ public class Entity {
    
//	Variables
	
  //	Basic Info
	private String 		name;				// 	name of entity
    private double		weight;				//	weight of entity
    private double[]	size;				//	size of entity (height + breadth + width)
  
  //	Attributes
    private int			attr_constitution;	// 	constitution 
    private int			attr_strength;		// 	strength 
    private int			attr_dexterity;		// 	dexterity
    private int			attr_intelligence;	// 	intelligence
    private int			attr_wisdom;		// 	wisdom
    private int			attr_charisma;		// 	charisma
    
  //	Resistances
    private int			res_blunt;			//	Blunt 		(physical)
    private int			res_piercing;		// 	Piercing 	(physical)
    private int			res_slashing;		//	Slashing 	(physical)
    private int			res_fire;			//	Fire		(elemental)
    private int			res_frost;			//	Frost		(elemental)
    private int			res_shock;			//	Shock		(elemental)
    private int			res_poison;			//	Poison		(elemental)
    private int			res_light;			//	Light		(elemental)
    private int			res_dark;			//	Dark		(elemental)
    
  //	Status
    private int			hp_max;				// 	maximum health points
    private int			hp_cur;				// 	current health points
    private int			mp_max;				// 	maximum magic points
    private int			mp_cur;				// 	current magic points
    private int			st_max;				//	maximum stamina
    private int			st_cur;				//	current stamina
    

//	Constructors

    //	Sets: Basic Info, Attributes, Resistances, specific Status 
    Entity(String name_n , double weight_n, double[] size_n , int[] attributes_n , int[] resistances_n , int hp_max_n , int hp_cur_n , int mp_max_n , int mp_cur_n, int st_max_n, int st_cur_n)
    {
      //	Basic Info
    	name = name_n;
    	weight = weight_n;
    	size = new double[3];
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
    Entity(String name_n , double weight_n, double[] size_n , int[] attributes_n , int[] resistances_n , int hp_max_n , int mp_max_n , int st_max_n)
    {
        //	Basic Info
      	name = name_n;
      	weight = weight_n;
      	size = new double[3];
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
    Entity(){
        //	Basic Info
      	name = "";
      	weight = 0;
      	size = new double[3];
      	for(int i = 0 ; i < 3 ; i++) 
      	{
      		size[i] = 0;
      	}
      	
        //	Attributes
      	
      	int[]	attributes_n = new int[6];
        
      	for(int i = 0 ; i < 6 ; i++) 
      	{
      	attributes_n[i] = 0;
      	}
      	
      	setAttributes(attributes_n);
        
      	//   	Resistances
      	
      	int[]	resistances_n = new int[9];
          
      	for(int i = 0 ; i < 9 ; i++) 
      	{
      		resistances_n[i] = 0;
      	}
      	
      	setResistances(resistances_n);
        //	Status
      	
      	hp_max = 0;
      	hp_cur = 0;
      	mp_max = 0;
      	mp_cur = 0;
      	st_max = 0;
      	st_cur = 0;
      	
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
    public int[] 	getResistances()
    {
    	int[] 	resistances = new int[9];
    	
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
    public int 		getResBlunt() 
    {
    	return 	res_blunt;
    }
	
    //	Piercing
    public int 		getResPiercing() 
    {
    	return 	res_piercing;
    }
	
    //	Slashing
    public int 		getResSlashing() 
    {
    	return 	res_slashing;
    }
	
    //	Fire
    public int 		getResFire() 
    {
    	return 	res_fire;
    }
	
    //	Frost
    public int 		getResFrost() 
    {
    	return 	res_frost;
    }
	
    //	Shock
    public int 		getResShock() 
    {
    	return 	res_shock;
    }
	
    //	Poison
    public int 		getResPoison() 
    {
    	return 	res_poison;
    }
	
    //	Light
    public int 		getResLight() 
    {
    	return 	res_light;
    }
	
    //	Dark
    public int 		getResDark() 
    {
    	return 	res_dark;
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
    public void		setResistances(int[] resistances_n)
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
    public void		setResBlunt(int res_blunt_n) 
    {
    	res_blunt = res_blunt_n;
    	return;
    }

    //	Piercing
    public void		setResPiercing(int res_piercing_n) 
    {
    	res_piercing = res_piercing_n;
    }

    //	Slashing
    public void		setResSlashing(int res_slashing_n) 
    {
    	res_slashing = res_slashing_n;
    }

    //	Fire
    public void		setResFire(int res_fire_n) 
    {
    	res_fire = res_fire_n;
    }

    //	Frost
    public void		setResFrost(int res_frost_n) 
    {
    	res_frost = res_frost_n;
    }

    //	Shock
    public void		setResShock(int res_shock_n) 
    {
    	res_shock = res_shock_n;
    }

    //	Poison
    public void		setResPoison(int res_poison_n) 
    {
    	res_poison = res_poison_n;
    }

    //	Light
    public void		setResLight(int res_light_n) 
    {
    	res_light = res_light_n;
    }

    //	Dark
    public void		setResDark(int res_dark_n) 
    {
    	res_dark = res_dark_n;
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
    public void 	receiveDamage	( int type , int amount )
    {
    	int 	damage = amount  - getResistances()[type];
    	if	( damage > 0 )
    	{
    		if	( hp_cur > damage )
    		{
    			hp_cur = hp_cur - damage;
    		}
    		else
    		{
    			hp_cur = 0; //DEATH
    		}
    	}
    	
    }
    
    //	Deal Damage
    public int 	dealDamage	( int type ) 
    {
    	int 	damage = getAttrStrength();
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
