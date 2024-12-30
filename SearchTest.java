package InheritanceTypes;

interface Searchable{
	
	void search(String keyword);
}
class Document implements Searchable{
	String string;
	Document(String str){
		string=str;
	}
	@Override
	public void search(String keyword) {
		// TODO Auto-generated method stub
		if(string.contains(keyword)) {
			System.out.println("Keyword was found in Document");
		}
		else
			System.out.println("Keyword was not found in Document");
	}
}

class WebPage implements Searchable{
	String string;
	WebPage(String str){
		string=str;
	}
	@Override
	public void search(String keyword) {
		// TODO Auto-generated method stub
		if(string.contains(keyword)) {
			System.out.println("Keyword was found in Web page");
		}
		else
			System.out.println("Keyword was not found in web page");
	}
}
public class SearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document d= new Document("Hi Everyone. How are you ? I am fine.");
		d.search("How");
		
		WebPage w = new WebPage("Hi guys. I hope you all are well.");
		w.search("hope");

	}

}
