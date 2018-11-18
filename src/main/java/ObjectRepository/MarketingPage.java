package ObjectRepository;

public class MarketingPage {
	/*****************************CREATE LEAD****************************************************/
	public String leadmenu = "//a[@id='moduleTab_0_Leads']";
	public String createLead = "//a[@id='create_link']";

	public String firstName = "//*[@id='first_name']";
	public String lastName = "//*[@id='last_name']";
	public String phoneNo = "//*[@id='phone_work']";
	public String Account = "//*[@id='EditView_account_name']";
	public String Status = "//select[@id='status']";

	public String saveButton = "// *[@id='SAVE']";
		
	/*****************************verify LEAD****************************************************/
	
	
	
	public String noOfRows = "//table[@class='list view']/tbody/tr";
	public String nextbutton ="//table[@class='list view']/tbody/tr[1]/td[1]/table[1]/tbody/tr/td[2]/button[@id='listViewNextButton']";
	public String searchTextBox = "//input[@id='search_name_basic']";
	public String searchbutton = "//input[@id='search_form_submit']";
	
	
	
	
	
	
}
