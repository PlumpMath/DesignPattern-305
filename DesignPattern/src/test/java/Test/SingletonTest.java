package Test;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import Service.Singleton;

public class SingletonTest
{
    Singleton singleton; 
    
    public SingletonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        singleton = Singleton.getInstance();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testarSeSingletonEstaFuncionando()
    {
        Assert.assertEquals(Singleton.getInstance(), singleton);
    }
}
