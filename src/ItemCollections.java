import java.util.*;

// ItemCollections 클래스
public class ItemCollections {
	
	// 멤버 변수
	private Vector<Item> ic = new Vector<Item>();

	// 생성자
	public ItemCollections(Vector<Item> ic) {
		super();
		this.ic = ic;
	}

	// 각각의 접근자, 설정자 메소드 정의
	public Vector<Item> getIc() {
		return ic;
	}
	public void setIc(Vector<Item> ic) {
		this.ic = ic;
	}
	
	// Item을 등록
	public void add(Item item) {
		ic.add(item);
	}

	// Item을 수정
	public void edit(int index, Item item) {
		if(index != -1)
			ic.set(index, item);
	}
	
	// Item을 삭제
	public void remove(int index) {
		if(index != -1)
			ic.remove(index);
	}
	
	// Item "제목" 검색
	public Vector<String> searchTitle(String search) {
		
		Vector<String> sv = new Vector<String>();
        Object []arrItem  = ic.toArray();
		for(int i=0; i<ic.size(); i++) {
			Item item = (Item)arrItem[i];
			String title = item.getTitle();
			if(title.contains(search)) {
				sv.add(title);
			}
		}
		return sv;
	}
		
	// Item "별점" 검색
	public Vector<String> searchScore(String search) {
		
		Vector<String> sv = new Vector<String>();
        Object []arrItem = ic.toArray();
		for(int i=0; i<ic.size(); i++) {
			Item item = (Item)arrItem[i];
			int score = item.getScore();
			if(score >= Integer.parseInt(search)) {
				sv.add(item.getTitle());
				}
		}
		return sv;	
	}
}
