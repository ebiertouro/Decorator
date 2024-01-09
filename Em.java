package decorator;

public class Em extends HtmlDecorator{
	
	public Em(HtmlTag innerHtml) {
		super(innerHtml);
		this.tagName = "em";
	}
}
