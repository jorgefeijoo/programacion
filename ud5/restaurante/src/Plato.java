public class Plato {
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Plato(String id) {
    this.id = id;
  }

  @Override

  public String toString() {
    return id;
  }

}
