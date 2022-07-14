package TestCase;

import BaseMaster.Unit;
import Common.LaunchBrowser;

public class UnitTestCase {

	
	
	public static void main(String[] args) {
		
		LaunchBrowser.launchBrowser();
		
		LaunchBrowser.login();
		
		Unit.unitAdd();
		
		Unit.unitEdit();
		
		Unit.unitDelete();
	}
}
