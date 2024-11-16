import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Homework17 extends BaseTest {

    @Test
    public void addSongToPlaylistTest() throws InterruptedException{
        String expectedMessage = "Added 1 song into \"Favorties\" ";

        navigateToHomePage();
        enterEmail();
        enterPassword();
        submit();
        searchForSong();
        viewAll();
        Thread.sleep(100);
        selectFirstSong();
        Thread.sleep(1000);
        clickAddToBtn();
        Thread.sleep(1000);
        choosePlaylist();
        Thread.sleep(1000);
        Assert.assertEquals(getAddToPlaylistMessage(),expectedMessage);
    }

    public void searchForSong() {
        WebElement searchbar = driver.findElement(By.cssSelector("input[type='search']"));
        searchbar.click();
        searchbar.clear();
        searchbar.sendKeys("if");
    }

    public void viewAll() {
        WebElement viewAllBtn = driver.findElement(By.cssSelector("button[data-test='view-all-songs-btn']"));
        viewAllBtn.click();
    }

    public void selectFirstSong (){
        WebElement firstSong = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//tr[@class='song-item'][1]"));
        firstSong.click();
    }

    public void clickAddToBtn() {
        WebElement song = driver.findElement(By.cssSelector("button[type='add-to']"));
        song.click();
    }

    public void choosePlaylist(){
        WebElement playlist = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//li[contains(text(),TestPro Playlist')]"));
        playlist.click();
    }

    public String getAddToPlaylistMessage () {
        WebElement notification = driver.findElement(By.cssSelector("div.success.show"));
        return notification.getText();
    }
}
