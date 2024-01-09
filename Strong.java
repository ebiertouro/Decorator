package decorator;

public class Strong extends HtmlDecorator{
	
	public Strong(HtmlTag innerHtml) {
		super(innerHtml);
		this.tagName = "strong";
	}


}
