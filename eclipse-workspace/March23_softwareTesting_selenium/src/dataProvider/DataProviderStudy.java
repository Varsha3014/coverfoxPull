package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderStudy 
{
  @DataProvider(name="Friends")
  public String[][] mydata()
  {
	  String  data[][] = {{"Pankaja","Choudhari","6363636363"},
			               {"Swapna","Bedse","9696969696"},
			               {"Sujata","Baste","7878787878"}};
	  return data;
  }
  @DataProvider(name="Sisters")
  public String[][] mydata1()
  {
	  String  data[][] = {{"Usha","Bhavle","7979797979"},
			               {"Archna","Patil","9898989898"},
			               {"Sarla","Daware","8181818181"}};
	  return data;
  }
  
  
	
	
}
