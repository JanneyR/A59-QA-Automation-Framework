import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest{
    @Test
    public void playSong() throws InterruptedException {
        navigateToHomePage();
        enterEmail();
        enterPassword();
        submit();
        clickPlayNextSongBtn();
        clickPlayBtn();

    }

    public void clickPlayNextSongBtn(){
        WebElement nextSongBtn = driver.findElement(By.cssSelector("button[title='Play next song']"));
        nextSongBtn.click();
    }

    public void clickPlayBtn (){
        WebElement playBtn = driver.findElement(By.cssSelector("button[title='Play or resume']"));
        playBtn.click();

    }

}
