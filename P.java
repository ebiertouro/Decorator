package decorator;

public class P extends InnerHtmlTag{
	
	public P() {
		super();
		this.tagName = "p";
	}
	
	public P(String content) {
		super(content);
		this.tagName = "p";
	}
}
