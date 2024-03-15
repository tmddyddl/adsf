package rpggame;
////캐릭터를 만들기위헤ㅐ 기본클래스정의
//캐릭터가 가져야할 필수요소 포함
//상속을주기위해서접근제한자는 protected(상속관계 같은패키지 접근가능)
abstract public class Unit {
    protected String name; // 캐릭터 이름 설정
    protected int pPower; // 피지컬 Power (물리적인 힘)
    protected int mPower; // 매지컬 Power (마법의 힘)
    protected double pHit; // 물리 적중률
    protected double mHit; // 마법 적중률
    protected int ultraPower; // 궁극기 (해당 캐릭터가 가진 특수 능력)
    protected int hp; // 체력
}
interface GameAction {
    double pAttack(); // 구현부가 없고 선언만 있음, 상속 받은 클래스 구현해줘야 함
    double mAttack(); // 마법 공격력
    int ultimate(); // 궁극의 기술로 입히는 공격량(?)
    // 반환 타입이 boolean 이유는 캐릭터의 아직살아 있는지 판별하기 위해서
    // 남아 있는 hp보다 damage가 크면 true를 반환(즉 죽었다는 의미)
    boolean setDamage(double damage); // 피해를 받는량
}
