import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class TestAccount {
    private final String checkedName;
    private final boolean expectedIs;

    public TestAccount(String checkedName, boolean expectedIs) {
        this.checkedName = checkedName;
        this.expectedIs = expectedIs;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Иван Иванов", true},
                {"Александр Попандопуло", false},
                {"Ая", false},
                {"Иван Иванович Цой", false},
                {" ИванИванов", false},
                {"ИванИванов ", false}
        };
    }

    @Test
    public void TestMethodCheckNameToEmboss() {
        Account account = new Account(checkedName);
        assertEquals(expectedIs, account.checkNameToEmboss());
    }
}
