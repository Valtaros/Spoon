package entity;

import entity.*;

public class Attributes 
{
//	Variables
    private int			constitution = 0;			// 	constitution 
    private int			strength = 0;				// 	strength 
    private int			dexterity = 0;				// 	dexterity
    private int			intelligence = 0;			// 	intelligence
    private int			wisdom = 0;					// 	wisdom
    private int			charisma = 0;				// 	charisma

//	Constructors
    
    //	empty (all 0)
    Attributes	() {}
    
    //	set all with array
    Attributes	( int[] attributes_n )
    {
    	setAll	( attributes_n );
    	return;
    }
    
    //	set all with single variables
    Attributes	( int constitution_n , int strength_n , int dexterity_n , int intelligence_n , int wisdom_n , int charisma_n)
    {
    	setAll	( constitution_n , strength_n , dexterity_n , intelligence_n , wisdom_n , charisma_n);
    	return;
    }
//	getMethods
    
    //	All
    public int[] 	getAttributes()
    {
    	int[]	attributes = new int[6];
    	
    	attributes[0] = getConstitution();
    	attributes[1] = getStrength();
    	attributes[2] = getDexterity();
    	attributes[3] = getIntelligence();
    	attributes[4] = getWisdom();
    	attributes[5] = getCharisma();
    	
    	return 	attributes;
    }
    	
    //	Constitution
    public int 		getConstitution() 
    {
    	return 	constitution;
    }
	
	//	Strength
    public int 		getStrength() 
    {
    	return 	strength;
    }
    
	//	Dexterity
    public int 		getDexterity() 
    {
    	return 	dexterity;
    }

	//	Intelligence
    public int 		getIntelligence() 
    {
    	return 	intelligence;
    }

	//	Wisdom
    public int 		getWisdom() 
    {
    	return 	wisdom;
    }

	//	Charisma
    public int 		getCharisma() 
    {
    	return 	charisma;
    }
//	setMethods
    
    //	All with array
    public void		setAll(int[] attributes_n)
    {
    	setConstitution	(attributes_n[0]);
    	setStrength		(attributes_n[1]);
    	setDexterity	(attributes_n[2]);
    	setIntelligence	(attributes_n[3]);
    	setWisdom		(attributes_n[4]);
    	setCharisma		(attributes_n[5]);
    	
    	return;
    }
    
    //	All with single variable
    public void		setAll	( int constitution_n , int strength_n , int dexterity_n , int intelligence_n , int wisdom_n , int charisma_n)
    {
    	setConstitution	(constitution_n);
    	setStrength		(strength_n);
    	setDexterity	(dexterity_n);
    	setIntelligence	(intelligence_n);
    	setWisdom		(wisdom_n);
    	setCharisma		(charisma_n);
    	
    	return;
    }
    
    //	Constitution
    public void		setConstitution(int constitution_n) 
    {
    	constitution = constitution_n;
    	return;
    }

    //	Strength
    public void		setStrength(int strength_n) 
    {
    	strength = strength_n;
    	return;
    }

    //	Dexterity
    public void		setDexterity(int dexterity_n) 
    {
    	dexterity = dexterity_n;
    	return;
    }

    //	Intelligence
    public void		setIntelligence(int intelligence_n) 
    {
    	intelligence = intelligence_n;
    	return;
    }

    //	Wisdom
    public void		setWisdom(int wisdom_n) 
    {
    	wisdom = wisdom_n;
    	return;
    }

    //	Charisma
    public void		setCharisma(int charisma_n) 
    {
    	charisma = charisma_n;
    	return;
    }



}
