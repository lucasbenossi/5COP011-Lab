package lista8ex1;

public class Teste<T> {
	private T obj;
	
	public Teste( T obj ){
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
}
