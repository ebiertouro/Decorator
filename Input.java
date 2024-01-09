package decorator;

public class Input extends HtmlTag{
	
	// And the input should have the ability to specify the type attribute, an event attribute
	//(that is configurable to be any event such as “onclick” and “onblur”), and a value attribute.
	String type;
	String value;
	String eventType;
	String eventValue;
	
	public Input() {
		super();
		this.tagName = "input";
	}
	
	public Input(String content) {
		super(content);
		this.tagName = "p";
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public void setEvent(String eventType, String eventValue) {
		this.eventType = eventType;
		this.eventValue = eventValue;
	}
	
	@Override
	public String toString() {
		String startTag;
		String endTag = "</input>";
		
		String attributes = " ";
		
		if (type != null) {
			attributes += "type=\"" + type + "\" ";
		}
		
		if (value != null) {
			attributes += "value=\"" + value + "\" ";
		}
		
		if (eventType != null) {
			attributes += eventType + "=\"" + eventValue + "\" ";
		}

		startTag = "<input" + attributes + ">";
		
		return startTag + endTag;
	}

}
