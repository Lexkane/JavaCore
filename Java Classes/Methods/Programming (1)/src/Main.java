class Cat {
       String name;
       int age;
    static int numberOfCats;
  // write static and instance variables

  public Cat(String name, int age) {
    this.name=name;
    this.age=age;
    numberOfCats++;
   
    if (numberOfCats>5) 
    {System.out.println("You have too many cats");}
      // implement the constructor
    // do not forgot to check the number of cats
  }

  public static int getNumberOfCats() {
    return numberOfCats;
      // implement the static method
  }
}