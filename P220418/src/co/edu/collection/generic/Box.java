package co.edu.collection.generic;

public class Box<T> { // <T> -> 타입을 파라미터로 지정
	T field; // 클래스의 부모 클래스
	public void setField(T field) {
		this.field = field;
	}
	
	public T getField() {
		return field;
	}
}
