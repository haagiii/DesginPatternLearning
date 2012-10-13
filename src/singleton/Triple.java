package singleton;

public class Triple {
	private int tripleNumber = 0;
	private static Triple[] tripleArr = {new Triple(1), new Triple(2), new Triple(3)};

	private Triple() {
	}
	private Triple(int i) {
		// TODO 自動生成されたコンストラクター・スタブ
		tripleNumber = i;
	}
	public static Triple getInstance(int num){
		return tripleArr[num - 1];
		
	}
	public int getTripleNumber(){
		return this.tripleNumber;
	}
}
