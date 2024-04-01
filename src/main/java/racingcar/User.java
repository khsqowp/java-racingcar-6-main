package racingcar;

public class User { //클래스
    
    String name; //인스턴스 변수
    int count; //인스턴스 변수

    String dash = "-";

    public User (String name, int count) { //생성자
        this.name = name;
        this.count = count;
    }

    public void incrementNumber() {
        count++;
    }
    public String getName() {
        return name;
    }
    public int getCount(){
        return count;
    }
    public void setCount(int cnt){
        this.count = cnt;
    }
}

//객체는 최대한 getter setter를 사용하지 않기