package decorator;

public abstract class InnerHtmlTag extends HtmlTag {

	//All should have the ability to specify a name and an id attribute.
	
	private String name;
	private String id;
	protected String content;
	
	public InnerHtmlTag() {
		super();
		this.name = null;
		this.id = null;
	}
	
	public InnerHtmlTag(String content) {
		super(content);
		this.content = content;
		this.name = null;
		this.id = null;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String display() {
		String startTag;
		String endTag = "</" + tagName + ">";
		
		String attributes = " ";
		
		if (name != null) {
			attributes += "name=\"" + name + "\" ";
		}
		
		if (id != null) {
			attributes += "id=\"" + id + "\" ";
		}
		
		startTag = "<" + tagName  + attributes + ">";
		
		if (content != null) {
			return startTag + content + endTag;
		}
		else
			return startTag + endTag;
	}

}
