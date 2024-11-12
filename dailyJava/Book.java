package dailyJava;

public class Book {
	
	private String title;
	private String author;
	private Double price;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}

    public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		if(price<0) {
			price = 0.0;
		}
		this.price = price;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book();
		book.setTitle("How to Win and Influence People");
		book.setAuthor("Dale Carnegie");
		book.setPrice(120d);
		
		System.out.println(book.getTitle()+" "+book.getAuthor()+" "+book.getPrice());
		
		Book book2 = new Book();
		book2.setTitle("Godan");
		book2.setAuthor("Premchand");
		book2.setPrice(-5d);
		
		System.out.println(book2.getTitle()+" "+book2.getAuthor()+" "+book2.getPrice());
		

	}

}
