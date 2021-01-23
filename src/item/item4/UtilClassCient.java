package item.item4;

/** Item4: private 생성자로 Noninstantiability를 강제할것
 *
 *
 * */
public class UtilClassCient {
    public static void main(String[] args) {

        /**
         * 1. instance를 새로 생성하지 않고 사용하기 위해  static 함수를 사용한다.
         * 2. new 생성을 못하게 하기위해 class 에 abstract 을 붙여준다.
         * */
        UtilClass.getNmae();

        /** 3. but 해당 UtilClass 를 상속받은 다른 클래스에서는 new 생성 사용이 가능하다.(override 된 method 는 사용없음)-> 의미 없는 로직
         * 이 의미 없는 로직을 방지 하기 위해 */
        UtilClass.AnotherClass anotherClass = new UtilClass.AnotherClass();


    }
}
