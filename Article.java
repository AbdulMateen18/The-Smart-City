
public class Article {
	private String nameOfArticle;
	private String writerOfArticle;
	private String dataOfArticle;
	public Article(String nameOfArticle, String writerOfArticle, String dataOfArticle) {
		super();
		this.nameOfArticle = nameOfArticle;
		this.writerOfArticle = writerOfArticle;
		this.dataOfArticle = dataOfArticle;
	}
	@Override
	public String toString() {
		return "Article Name: " + nameOfArticle+
		"\nWriter's Name: "+writerOfArticle+
		"\nContents: \n\t"+dataOfArticle
				;
	}
	
	
	
}
