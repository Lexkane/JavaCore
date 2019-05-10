class Application {
    String name="Simple Application";
  // write a constructor here
public Application( String Name){
  this.name =Name;
}
    // write a field here

  // write a constructor here

  public void run(String[] args) {
    // implement a method
       
    System.out.println(name);
    for (int i=0;i<args.length;i++ )
    {System.out.println(args[i]);}
 
  }
}