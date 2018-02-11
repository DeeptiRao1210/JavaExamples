
//Base Class
class Animal
{
    private String AnimalType;
    private String EatingHabits;
    private int MaxLifeSpan;
    private String SoundMade;

    //Overriding Default Constructor
    public Animal()
    {
        this.AnimalType = "Homo Sapien";
        this.EatingHabits = "Omnivore";
        this.MaxLifeSpan = 100;
        this.SoundMade= "Coherent Languages";
    }

    //Parameterized constructor
    public Animal(String name, String eats, int aliveFor, String sound)
    {
        this.AnimalType = name;
        this.EatingHabits = eats;
        this.MaxLifeSpan = aliveFor;
        this.SoundMade = sound;
    }

   public void ShowAnimalDetails()
    {
        System.out.println("The animal considered is called " + this.AnimalType);
        System.out.println(this.AnimalType + " is " + this.EatingHabits +" having an average lifespan of : " + this.MaxLifeSpan );
        System.out.println("The sound made by this animal is  :" +this.SoundMade);
    }

}
//Subclass or Derived class inherits only public and protected members of base class
class Cat extends Animal
{
    //instance variables specific to derived class
    private boolean isDomesticated;
    private String FurColor;

    //Derived Class Default Constructor
    public Cat()
    {
       // Derived class constructor expicitly calling Base Class Constructor
        super("Feline","Carnivore",15,"Meoww");
        this.FurColor="White";
        this.isDomesticated = false;
    }

    //Mutator methods
    public void SetDomesticated( boolean d)
    {
        this.isDomesticated = d;
    }

    public void SetFurColor(String color)
    {
        this.FurColor = color;
    }

    public void GetCatDetails()
    {
        //Using super keyword we can access public and protected members of the base class
        super.ShowAnimalDetails();
        //Ternary Conditional Operator
        String result = (this.isDomesticated)?"Domesticated":"Wild";
        System.out.println("This cat has fur of the color: "+ this.FurColor + " and seems to be: "+ result);
    }
}


public class InheritanceDemo
{
   public static void main( String [] args)
   {
       Cat myKitty = new Cat();
       myKitty.SetDomesticated(true);
       myKitty.SetFurColor("Orange");
       myKitty.GetCatDetails();

       Animal whatAnimal = new Animal("Tiger","Carnivore",18,"Roar");
       whatAnimal.ShowAnimalDetails();

       Animal human = new Animal();
       human.ShowAnimalDetails();
   }
}














