package decorator;

public class A extends HtmlDecorator{
	
	// Note that the <a> tag should have the ability to specify an href attribute
	String href;
	
	public A(HtmlTag innerHtml) {
		super(innerHtml);
		this.tagName = "a";
	}
	
	public A(HtmlTag innerHtml, String href) {
		super(innerHtml);
		this.tagName = "a";
		this.href = href;
	}

	public String toString() {
		String startTag;
		String innerHtml = innerTag.toString();
		String endTag = "</" + tagName + ">";
		
		if (href != null) {
			startTag = "<" + tagName + " href=\"" + href + "\">";
		} else {
			startTag = "<" + tagName + ">";
		}
		
		return startTag + innerHtml + endTag;
	}
}
