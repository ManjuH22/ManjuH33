package Testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Genaric_Script.Genaric_Exel;
import Genaric_Script.gennn;
import PomScript.POMM;

public class Testtt extends gennn
{
	
	@Test
	public  void test1() throws EncryptedDocumentException, IOException 
	{
		String username = Genaric_Exel.getdata("sheet1", 0, 0);
		String password = Genaric_Exel.getdata("sheet1", 1, 0);
		POMM p=new POMM(driver);
		p.emailadd(username);
		p.pwdadd(password);
		p.clickk();

}
	}
