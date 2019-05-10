class Movie {
  private String title;
  private String desc;
  private int year;

    Movie (String Title, String Desc, int Year){
    this.title=Title;
    this.desc=Desc;
    this.year=Year;
    }
    Movie (String Title,int Year){
    this.title=Title;
    this.year=Year;
    this.desc="empty";
    }
  // write two constructors here

  public String getTitle() {
    return title;
  }

  public String getDesc() {
    return desc;
  }

  public int getYear() {
    return year;
  }
}