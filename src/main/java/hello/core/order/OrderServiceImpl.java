    package hello.core.order;

    import hello.core.AppConfig;
    import hello.core.discount.DiscountPolicy;
    import hello.core.discount.FixedDiscountPolicy;
    import hello.core.member.*;

    public class OrderServiceImpl implements OrderService {

        AppConfig appConfig = new AppConfig();
        private final MemberRepository memberRepository; // = new MemoryMemberRepository();
        private final DiscountPolicy discountPolicy; // = new FixedDiscountPolicy();

        public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
            this.memberRepository = memberRepository;
            this.discountPolicy = discountPolicy;
        }

        @Override
        public Order createOrder(Member member, String itemName, int itemPrice) {
            int discountPrice = discountPolicy.discountedPrice(member, itemPrice);
            return new Order(member.getId(), itemName, itemPrice, discountPrice);
        }
    }
