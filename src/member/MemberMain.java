package member;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alix Gawon Lee on 2017-04-07.
 */
public class MemberMain {

    public static void main(String[]args) {

        Member one = new Member();//차트를 만든 것 Member에서 name, age, hpNum, email,만든 것 참조하여 만드는 것.
        one.setName("이가원"); //setter형식으로 바꿔줘야 함. private 처리 하였기 때문에 바로 쓸 수 없음 메서드 통해야 함.
        one.setAge(25);
        one.setHpNum("010-6439-5943");
        one.setEmail("dlrkdnjs1211@gmail.com");

        Member two = new Member();
        two.setName("류관이");
        two.setAge(25);
        two.setHpNum("010-6439-5943");
        two.setEmail("dlrkdnjs1211@gmail.com");

        Member three = new Member();
        three.setName("이진석");
        three.setAge(26);
        three.setHpNum("010-6439-5943");
        three.setEmail("dlrkdnjs1211@gmail.com");

        Member four = new Member();
        four.setName("김태준");
        four.setAge(27);
        four.setHpNum("010-6439-5943");
        four.setEmail("dlrkdnjs1211@gmail.com");

        Member five = new Member();
        five.setName("임준성");
        five.setAge(20);
        five.setHpNum("010-6439-5943");
        five.setEmail("dlrkdnjs1211@gmail.com");

        Member six = new Member();
        six.setName("류승아");
        six.setAge(25);
        six.setHpNum("010-6439-5943");
        six.setEmail("dlrkdnjs1211@gmail.com");

        Member seven = new Member();
        seven.setName("김세원");
        seven.setAge(27);
        seven.setHpNum("010-6439-5943");
        seven.setEmail("dlrkdnjs1211@gmail.com");

        Member eight = new Member();
        eight.setName("진하영");
        eight.setAge(24);
        eight.setHpNum("010-6439-5943");
        eight.setEmail("dlrkdnjs1211@gmail.com");

        Member nine = new Member();
        nine.setName("이기봉");
        nine.setAge(26);
        nine.setHpNum("010-6439-5943");
        nine.setEmail("dlrkdnjs1211@gmail.com");

        Member ten = new Member();
        ten.setName("허민");
        ten.setAge(30);
        ten.setHpNum("010-6439-5943");
        ten.setEmail("dlrkdnjs1211@gmail.com");

        Member eleven = new Member("황순성", 27, "010-1111-1111", "dlrkdnjs1211@gmail.com"); //Member에 파라미터가 네 개 있는 생성자를 만들면 됨.

        List<Member> list = new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        list.add(six);
        list.add(seven);
        list.add(eight);
        list.add(nine);
        list.add(ten);
        list.add(eleven);

        MemberReview zzz = new MemberReview();
        System.out.println(zzz.calcAverageAge(list)); //calcAverageAge가 list를 참조하였기 때문에 적는 것.
        System.out.println(zzz.howManyMembersWithLastName(list));
        System.out.println(zzz.calcAverageIdChar(list));


    }

}
