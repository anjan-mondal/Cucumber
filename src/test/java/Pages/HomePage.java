package Pages;

import base.BaseUtils;

public class HomePage extends BaseUtils {

	private BaseUtils base;
	public HomePage(BaseUtils base) {
		this.base=base;
	}
	public void OpenUrl(String url) {
		base.driver.navigate().to(url);
	}
}
