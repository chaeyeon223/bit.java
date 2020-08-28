/*
 Today Point
 [상속관계]에서 override : 상속관계에서 자식이 부모의 함수를 "재정의"
 [상속]관계에서  [자식클래스]가 [부모클래스]의 메소드(함수)를 재정의(내용바꾸기)
 재정의 : 틀의 변화가 없고 (함수의 이름, 타입) 하는 것이 아니라 내용만 { 내용 }바꾸기
 
 문법)
 1. 부모함수 이름 동일
 2. 부모함수 parameter 동일
 3. 부모함수 return type 형식 동일
 4. 결국, {실행블록 안의 코드만 변경 가능 }
 
 오버로딩 : 하나의 이름으로 여러가지 기능 (parameter type과 개수 달리)
 오버라이딩 : 상속관계에서 재정의
 
 
 */
class Point2{ //한점을 가지는 클래스
	int x=4;
	int y=5;
	
	String getPosition() {
		return this.x+"/"+this.y;
	}
}
class Point3D extends Point2{
	int z=6;
	//출력 .. 
	
	//Annotation >> java code만으로 전달할 수 없는 '부가적인 정보(검증/확인)'를 컴파일러, 개발 tool에게 전달
	//맞지 않으면, Error ...
	//@Override >> 지금 이 함수가 정말 재정의된 것 맞는지 확인해라 ...
	@Override
	String getPosition() { //
		return this.x+"/"+this.y+"/"+this.z;
	}
}
public class Ex04_Inherit_Override {

	public static void main(String[] args) {
		Point3D p3=new Point3D();
		String aa=p3.getPosition(); //호출되는 함수는 항상 '재정의된 함수'를 호출
		System.out.println(aa);

	}

}
