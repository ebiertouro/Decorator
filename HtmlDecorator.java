package decorator;

public abstract class HtmlDecorator extends HtmlTag{
	
	protected HtmlTag innerTag;
	
	public HtmlDecorator(HtmlTag innerTag) {
		this.innerTag = innerTag;
	}
	
	
	public String display() {
		return "<" + tagName + ">" + innerTag.display() + "</" + tagName + ">";
	}


}
