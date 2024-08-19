package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    int discountedPrice(Member member, int itemPrice);
}
