package decorator;

public abstract class HtmlTag {
	
	protected String tagName;
	protected String content;
	
	public HtmlTag() {
		tagName = "html";
	}
	
	public HtmlTag(String content) {
		tagName = "html";
		this.content = content;
	}
	
	public String display() {
		String startTag = "<" + tagName + ">";
		String endTag = "</" + tagName + ">";
			
		if (content != null) {
			return startTag + content + endTag;
		}
		else
			return startTag + endTag;
	}
	
}