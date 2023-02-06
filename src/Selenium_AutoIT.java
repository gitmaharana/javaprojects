
public class Selenium_AutoIT {

	public static void main(String[] args) {
		
		// you need to download AutoIT finder and AutoIT editor  -- launch these from program files
		//in editor you will write down codes and post save & compile an exe. file will get generate which will be used in Sel codes
		
		//Perform action in file upload operation using file path
		
		//1st step - click on "finder tool button" AutoIT finder and release in window based open file text box 
		//2nd step -  you will get all the details like title/class/instance
		//3rd step - write code in autoIT editor
		//Method syntax - controlFocus ("title","text",controlID)
		//you can leave text as blank & controlID will be Class +Instance (here class is Basic control info category)
		//so method will be written as - controlFocus("Open","","Edit1")
		
		//file path syntx - method - controlSetText (("title","text",controlID,"new text" []flag=0))//
		//new text refers to file path.U can hardcode it or you can refer to runtime to share the path in sel code
		//method will be  -  controlSetText ("Open","","Edit1",$CmdLine[1])
		
		//Click on open button action
		//click on finder tool in AutoIT finder and release in Open button of window
		//syntax - controlClick(("title","text",controlID)
		//so method will be written as - controlClick("Open","","button1")
		
		//save and compile = you will get a exe file path
		
		//steps - Launch web browser - maximize - openURL - locate web element file upload button
		// action class to be used to click open button -- move to element method
		
		//Runtime.getRuntime().exec("Auto IT app path" +""+" autoIT exe path"
		
	} 
	
}