import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Homework17 extends BaseTest{

    public void searchForSong(){
        WebElement searchbar = driver.findElement(By.cssSelector("input[type='search']"));
        searchbar.click();
        searchbar.clear();
        searchbar.sendKeys("if");
    }

    public void viewAll(){
        WebElement viewAllBtn = driver.findElement(By.cssSelector("button[data-test='view-all-songs-btn']"));
        viewAllBtn.click();
        WebElement firstSong = driver.findElement(By.cssSelector("article[data-test='song-card']"));
        firstSong.click();
    }
    public void addSongToPlaylist(){
        WebElement song = driver.findElement(By.cssSelector("button[type='add-to']"));
        song.click();
        song.getAttribute("favorites");
        Assert.assertEquals("assertify-logs top right","song added to playlist");
    }

    public void exitPage(){
        driver.quit();
    }

    public void addSongToPlaylistTest(){
        navigateToHomePage();
        enterEmail();
        enterPassword();
        submit();
        searchForSong();
        viewAll();
        addSongToPlaylist();
        exitPage();
    }

}
