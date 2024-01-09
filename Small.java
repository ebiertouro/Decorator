package decorator;

public class Small extends HtmlDecorator{
	
	public Small(HtmlTag innerHtml) {
		super(innerHtml);
		this.tagName = "small";
	}
}
