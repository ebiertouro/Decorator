package decorator;

public class U extends HtmlDecorator{
	
	public U(HtmlTag innerHtml) {
		super(innerHtml);
		this.tagName = "u";
	}

}
