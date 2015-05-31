import Categories.Nightly;
import Categories.Smoke;
import org.junit.*;
import org.junit.experimental.categories.Category;

public class AdditionTests {

    private Calc calc;
    public static boolean rapierRestarted = false;

    public AdditionTests()
    {
        calc = new Calc();
    }

    @Category(Smoke.class)
    @Test
    public void SmallNums()
    {
        int x = calc.Add(3, 2);
        System.out.println(x);
        Assert.assertFalse("Testing a fail assertion", true);
    }

    @Category(Nightly.class)
    @Test
     public void LargeNums()
    {
        int y = calc.Subtract(52, 34);
        System.out.println(y);
        Assert.assertTrue("Incorrect calc", y == 17);
    }

    @Category(Nightly.class)
    @Test
    public void FooNums()
    {
        int y = calc.Subtract(5, 8);
        System.out.println(y);
    }

    @Ignore("Im ignoring this test")
    public void IgnoreMe()
    {
        System.out.println("I should not print as i am an ignored test");
        //fail("@Ignore method will not run by JUnit4");
    }

    @BeforeClass
    public static void AdditionClassSetup()
    {
        System.out.println("@BeforeClass: AdditionTests");
    }

    @Before
    public void AdditionSetup()
    {
        if(!rapierRestarted)
        {
            System.out.println("@Before: AdditionTests");
            rapierRestarted = true;
        }
    }

    @After
    public void TestCleanup()
    {
        System.out.println("@After: AdditionTests");
    }

    @AfterClass
    public static void ClassCleanup()
    {
        System.out.println("@AfterClass: AdditionTests");
    }
}
