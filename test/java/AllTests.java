import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


 // permet de lancer tous les test 
@RunWith(Suite.class)
@SuiteClasses({model.AllTests.class})
public class AllTests {

}
