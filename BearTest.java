import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class BearTest {
  Bear bear;

  @Before
  public void before() {
    bear = new Bear("Baloo", 25, 95.62, 1.2);
  }


  @Test
  public void hasName() {
    assertEquals("Baloo", bear.getName());
  }


  @Test
  public void hasAge() {
    assertEquals(25, bear.getAge());
  }


  @Test
  public void hasWeight() {
    assertEquals(95.62, bear.getWeight(), 0.01);
  }

  @Test
  public void readyToHibernateIfGreaterThan80() {
    assertEquals(true, bear.readyToHibernate());
  }

  @Test
  public void notReadyToHibernateIfLessThan80() {
    Bear thinBear = Bear("Baloo", 25, 65.44, 2);
    assertEquals(false, thinBear.readyToHibernate());
  } 
}
