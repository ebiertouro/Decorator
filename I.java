package decorator;

public class I extends HtmlDecorator{
	
	public I(HtmlTag innerHtml) {
		super(innerHtml);
		this.tagName = "i";
	}
}
