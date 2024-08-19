package hello.core.order;

import hello.core.member.Member;

public interface OrderService {
    int a =10;
    Order createOrder(Member member, String itemName, int itemPrice);
}
