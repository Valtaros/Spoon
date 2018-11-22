//Basic Class for entities

package entity;

import java.util.Random;

/* abstract ? */ public class Entity {
    
	private String 		name;			// 	name of entity
    private double		weight;			//	weight of entity
    private double[]	size;			//	size of entity (height + breadth + width)
	private int[]		attributes;		// 	[0] constitution [1] strength [2] dexterity [3] intelligence [4] wisdom [5] charisma
//	private int[] 		resistances;	//	(p)hysical (e)lemental [0] p-blunt [1] p-piercing [2] p-slashing [3] e-fire [4] e-frost [5] e-shock [6] e-poison [7] e-light [8] e-dark 
    private int			hp_max;			// 	maximum health points
    private int			hp_cur;			// 	current health points
    private int			mp_max;			// 	maximum magic points
    private int			mp_cur;			// 	current magic points
    private int			st_max;			//	maximum stamina
    private int			st_cur;			//	current stamina
    

//	Constructors

    //	Sets: Name, Attributes, max and current Health, max and current Magic
    Entity(String s , int[] a , int hm , int hc , int mm , int mc)
    {
    	name = s;
    	attributes = new int[6];
    	
    	for(int i = 0 ; i < 6 ; i++) 
    	{
    	attributes[i] = a[i];
    	}
    	hp_max = hm;
    	hp_cur = hc;
    	mp_max = mm;
    	mp_cur = mc;
    	
    };
    
    //	Sets: Name, Attributes, Max Health, Max Magic
    Entity(String s , int[] a , int hm , int mm)
    {
    	name = s;
    	attributes = new int[6];
    	
    	for(int i = 0 ; i < 6 ; i++) 
    	{
    	attributes[i] = a[i];
    	}
    	hp_max = hm;
    	hp_cur = hm;
    	mp_max = mm;
    	mp_cur = mm;
    	
    }
    
//	getMethods
    	
    //	Name
    public String 	getName() 
    {	
    	return name;
    }
    	
    //	Attribute (all)
    public int[] 	getAttributes()
    {
    	return attributes;
    }
    	
    //	Attribute Constitution
    public int 		getConstitution() 
    {
    	return attributes[0];
    }
	
	//	Attribute Strength
    public int 		getStrength() 
    {
    	return attributes[1];
    }
    
	//	Attribute Dexterity
    public int 		getDexterity() 
    {
    	return attributes[2];
    }

	//	Attribute Intelligence
    public int 		getIntelligence() 
    {
    	return attributes[3];
    }

	//	Attribute Wisdom
    public int 		getWisdom() 
    {
    	return attributes[4];
    }

	//	Attribute Charisma
    public int 		getCharisma() 
    {
    	return attributes[5];
    }

    //	Maximum Health
    public int 		getHealthMax() 
    {
    	return hp_max;
    }

    // Current Health
    public int 		getHealthCurrent() 
    {
    	return hp_cur;
    }

    //	Maximum Magic
    public int 		getMagicMax() 
    {
    	return mp_max;
    }

    // Current Magic
    public int 		getMagicCurrent() 
    {
    	return mp_cur;
    }

    //	Maximum Stamina
    public int 		getStaminaMax() 
    {
    	return st_max;
    }

    // Current Stamina
    public int 		getStaminaCurrent() 
    {
    	return st_cur;
    }

        
//	setMethods
    
    //	Name
    public void		setName(String s)
    {
    	name = s;
    }
    
    //	All Attributes
    public void		setAttributes(int[] a)
    {
    	for(int i = 0 ; i < 6 ; i++) 
    	{
    		attributes[i] = a[i];
    	}
    }
    
    //	Attribute Constitution
    public void		setConstitution(int i) 
    {
    	attributes[0] = i;
    }

    //	Attribute Strength
    public void		setStrength(int i) 
    {
    	attributes[1] = i;
    }

    //	Attribute Dexterity
    public void		setDexterity(int i) 
    {
    	attributes[2] = i;
    }

    //	Attribute Intelligence
    public void		setIntelligence(int i) 
    {
    	attributes[3] = i;
    }

    //	Attribute Wisdom
    public void		setWisdom(int i) 
    {
    	attributes[4] = i;
    }

    //	Attribute Charisma
    public void		setCharisma(int i) 
    {
    	attributes[5] = i;
    }

    //	Maximum Health
    public void		setHealthMax(int i) 
    {
    	hp_max = i;
    }
    
    //	Current Health
    public void		setHealthCurrent(int i) 
    {
    	hp_cur = i;
    }
    
    //	Maximum Magic
    public void		setMagicMax(int i) 
    {
    	mp_max = i;
    }
    
    //	Current Magic
    public void		setMagicCurrent(int i) 
    {
    	mp_cur = i;
    }
    
    //	Maximum Stamina
    public void		setStaminaMax(int i) 
    {
    	st_max = i;
    }
    
    //	Current Stamina
    public void		setStaminaCurrent(int i) 
    {
    	st_cur = i;
    }
    
    
    //	TESTING AREA 1
    
    public static void main(String[] args)
    {
    	Random dice = new Random();
    	int[] list = new int[10];
    	for(int i = 0 ; i < 10 ; i++)
    	{
    		list[i] = dice.nextInt(20);
    	}
    	for(int i = 0 ; i < 10 ; i++)
    	{
    		System.out.println( (i+1) + ". : " + list[i]);
    	}
    	
    	Entity e = new Entity("testee", list, 1 , 1 , 1 ,1);
    	for(int i = 0 ; i < 10 ; i++)
    	{
    		System.out.println( e.name + " " + (i+1) + ". : " + e.attributes[i]);
    	}
    	for(int i = 0 ; i < 10 ; i++)
    	{
    		list[i] = dice.nextInt(20);
    	}
    	for(int i = 0 ; i < 10 ; i++)
    	{
    		System.out.println( (i+1) + ". : " + list[i]);
    	}
    	for(int i = 0 ; i < 10 ; i++)
    	{
    		System.out.println( e.name + " " + (i+1) + ". : " + e.attributes[i]);
    	}
        return;
    }
    
    
    // TODO
    /* 
    abstract void talk();
    abstract void showStats();
    abstract void attack();
     */
}
