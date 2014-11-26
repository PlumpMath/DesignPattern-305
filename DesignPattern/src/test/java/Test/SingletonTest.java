package Test;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import singleton.Caixa;

public class SingletonTest
{
    Caixa caixa; 
    
    public SingletonTest()
    {
        
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        
    }
    
    @AfterClass
    public static void tearDownClass()
    {
        
    }
    
    @Before
    public void setUp()
    {
        caixa = caixa.getInstance();
    }
    
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testarSeSingletonEstaFuncionando()
    {
        Assert.assertEquals(Caixa.getInstance(), caixa);
    }
}
