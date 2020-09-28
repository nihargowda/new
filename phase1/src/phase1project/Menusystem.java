package phase1project;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Menusystem {
	public void deletefile(String deletefile) {
		File f1=new File("root1"+"/"+deletefile) ;
		  if(f1.delete()) 
		  {
			System.out.println("deleted from root directory");
			} 
		  else {
			System.out.println("not found");
		}}
	public void add(String addfile)   {
		
		File f2= new File("root1"+"/"+addfile);
				if(f2.exists()) 
				{
			System.out.println("already exists");
				}
				else {
			try {	
			f2.createNewFile();
			}
			catch(IOException e) 
			{
				System.out.println(e.getMessage());
			}
			System.out.println("file created of file name"+" "+addfile);
	}}
	public void search(String searchfile) {
		File f3=new File("root1"+"/"+searchfile);
				if(f3.exists())
				{
					
	         System.out.println("results :"+" "+searchfile);
			 System.out.println("file found");
					}
					else {System.out.println("search failed,pls enter correct file name");
		}}
	public void ascend() {
		File f4=new File("root1");
		String[] rs= f4.list();
			if(rs.length>0) {
				Arrays.sort(rs);
			       for(String x:rs) {
			       System.out.println(x);}}
			else {
			System.out.println("empty folder, please add files to list");
					
			}}

}