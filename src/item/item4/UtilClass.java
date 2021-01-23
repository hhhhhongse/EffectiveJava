package item.item4;

/**
 *
 * 1. instance를 새로 생성하지 않고 사용하기 위해  static 함수를 사용한다.
 * 2. new 생성을 못하게 하기위해 class 에 abstract 을 붙여준다.
 * 3. but 해당 UtilClass 를 상속받은 다른 클래스에서는 new 생성 사용이 가능하다.(override 된 method 는 사용없음)-> 의미 없는 로직
 * 이 의미 없는 로직을 방지 하기 위해
 * 4. 방지하기 위해 private 생성자를 추가한다.
 * */

/**
 * + 생성자를 제공하지만 쓸수 없는것은 직관에 어긋나는 점이 있다. 그 때문에 위에 코드처럼 주석을 추가하는것이 좋다.
 * 상속한 경우에 명시적이든 암묵적이든 상위 클래스의 생성자를 호출 해야 하는데, 이 클래스의 생성자가 private 이라 호출이 막혔기 때문에 상속 불가
 * 사실 굳이 private 생성자까지 만들필요 없이 class 만 abstract 로 만들어도 된다. 예시 : StringUtil, 여러 Spring의 Util 에서 많이 쓰인다.
 * */

public abstract class UtilClass {
    public static String getNmae(){
        return "sejin";
    }
    // Noninstantable utility class
    private UtilClass(){
       // Optional : Suppress default constructor for noninsatiability
        throw new AssertionError();
    }
    static  class AnotherClass extends  UtilClass {

    }
}
