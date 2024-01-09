package decorator;

public class Div extends InnerHtmlTag {
	
	public Div() {
		super();
		this.tagName = "div";
	}
	
	public Div(String content) {
		super(content);
		this.tagName = "div";
	}
}
