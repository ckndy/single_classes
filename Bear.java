class Bear {
  private String name; 
  private int age;
  private double weight;
  private double height;

  public Bear(String name, int age, double weight, double height) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public double getWeight() {
    return this.weight;
  }

  public boolean readyToHibernate() {
    // return this.weight >= 80.00;
    double bmi = (this.weight / this.height) / this.height;
    return bmi >=30;
  }

  public double getHeight() {
    return this.height;
  }
}