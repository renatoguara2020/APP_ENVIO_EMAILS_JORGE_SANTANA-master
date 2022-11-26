@Entity
public class City implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String state;

  // ... additional members, often include @OneToMany mappings

  protected City() {
    // no-args constructor required by JPA spec
    // this one is protected since it should not be used directly
  }

  public City(String name, String state) {
    this.name = name;
    this.state = state;
  }

  public String getName() {
    return this.name;
  }

  public String getState() {
    return this.state;
  }
}
