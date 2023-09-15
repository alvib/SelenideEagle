import main.BrowserManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    public BrowserManager browserManager = new BrowserManager();

    @BeforeEach
    private void precondition() {
        browserManager.initDesktopDriver();
        browserManager.browser.openPage("https://www.ae.com/us/en");
    }

    @AfterEach
    private void postcondition() {
        browserManager.browser.closeBrowser();
    }
}
