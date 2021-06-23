
// Book 객체
public class Book extends Item {
	
	// 멤버 변수
	private String editor;

	// 생성자 
	public Book(String title, String creator, String editor, String year, String image, int score, String story, String review
			) {
		super(title, creator, year, image, score, story, review);
		this.editor = editor;
	}

	// 각각의 접근자, 설정자 메소드 정의
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}

}
