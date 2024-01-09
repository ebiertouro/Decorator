package decorator;

public class H extends HtmlTag{
	
	//The <h> tag should have the ability to specify a number between 1 – 6 (inclusive) 
	//so that it will be rendered as an <h1>, <h2> etc.
	
	int headingNum;
	
	public H(int headingNum) {
		super();

		if (headingNum < 1 || headingNum > 6) {
			throw new IllegalArgumentException("Heading levels 1-6 allowed only.");
		}
		
		tagName = "h" + headingNum;
	}
	
	public H(String content, int headingNum) {
		super(content);

		if (headingNum < 1 || headingNum > 6) {
			throw new IllegalArgumentException("Heading levels 1-6 allowed only.");
		}
		
		tagName = "h" + headingNum;
	}
	
}
