package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach // MemberService memberService = appConfig.memberSerevice(); 로 해도 되지만, 테스트의 신뢰성을 위해 BeforeEach 안에 감싸줌.. 이렇게 하면 왜 신뢰도가 오르는지 아직 잘 모르겟음
    public void BeforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();

    }

    @Test
    public void test() {

        long memberId = 1L;
        int a = OrderService.a;

        Member member = new Member(memberId, "Jaewon", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(member, "Game", 20000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }
}
