package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoMachine {

	public static void main(String[] args) {
		WebDriverUtility webDriverUtility = new WebDriverUtility();
		WebDriver driver = new ChromeDriver();
		webDriverUtility.navigateApp("http://Www.wynk.in", driver);
		webDriverUtility.maximizeBrowser(driver);
		webDriverUtility.getSourceCode(driver);

		WnykMusic wynkMusic = new WnykMusic(driver);
		webDriverUtility.explicitlyWait(driver);
		webDriverUtility.waitUntilElementClikable(wynkMusic.getSearchButton());
		wynkMusic.searchTheSong("Thamnnam Thamnam");

		webDriverUtility.waitUntilElementClikable(wynkMusic.getSearchResultFirstSong());
		wynkMusic.playTheFirstSongInTheSeacrhResult();
		Thread.sleep(10000);
		webDriverUtility.waitUntilElementClikable(wynkMusic.getPauseSongBtn());
		wynkMusic.pauseTheSong();

		webDriverUtility.waitUntilElementClikable(wynkMusic.getWynkMusicHomeBtn());
		wynkMusic.goToHomePage();
		webDriverUtility.waitUntilElementClikable(wynkMusic.getSearchButton());
		wynkMusic.searchTheSong("Yare Koogadali Oore Horaadali");

		webDriverUtility.waitUntilElementClikable(wynkMusic.getSearchResultFirstSong());
		wynkMusic.playTheFirstSongInTheSeacrhResult();
		Thread.sleep(10000);
		webDriverUtility.waitUntilElementClikable(wynkMusic.getPauseSongBtn());
		wynkMusic.pauseTheSong();

		driver.close();
	}

}
 