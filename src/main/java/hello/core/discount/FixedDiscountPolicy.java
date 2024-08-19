package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixedDiscountPolicy implements DiscountPolicy {

    private int fixedDiscountAmount = 1000;


    @Override
    public int discountedPrice(Member member, int itemPrice) {
        if(member.getGrade() == Grade.VIP){
            return fixedDiscountAmount;
        } else {
            return 0;
        }

    }
}
