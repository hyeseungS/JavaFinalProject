
// Movie 객체
public class Movie extends Item {
	
	// 멤버 변수
	String actor, genre, grade;
	
	// 생성자
	public Movie(String title, String creator, String actor, String genre, String grade, String year, String image, int score, 
			String story, String review) {
		super(title, creator, year, image, score, story, review);
		this.actor = actor;
		this.genre = genre;
		this.grade = grade;
	}

	// 각각의 접근자, 설정자 메소드 정의
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String jenre) {
		this.genre = genre;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
