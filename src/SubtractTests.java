import org.junit.*;

public class SubtractTests {

    private Calc calc2;

    public SubtractTests()
    {
        calc2 = new Calc();
    }

    @Test
    public void SmallOnes()
    {
        int p = calc2.Subtract(7, 3);
        System.out.println(p);
    }

    @Test
    public void BigOnes()
    {
        int q = calc2.Subtract(36, 11);
        System.out.println(q);
    }

    @Before
    public void TestSetup()
    {
        System.out.println("@Before: SubtractTests");
    }

    @BeforeClass
    public static void SuiteSetup()
    {
        System.out.println("@BeforeClass: SubtractTests");
    }

        @After
    public void AfterCleanup()
    {
        System.out.println("@After: SubtractTests");
    }

    @AfterClass
    public static void AfterClassCleanup()
    {
        System.out.println("@AfterClass: SubtractTests");
    }
}
