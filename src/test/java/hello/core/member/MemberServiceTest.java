package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest{





    MemberService memberService;

    @BeforeEach
    void BeforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join(){
        Member member = new Member(1L,"Jaewon",Grade.VIP);
        Member member2 = new Member(2L,"Jaewon",Grade.VIP);

        memberService.join(member);
        Member FindedMember = memberService.findById(1L);

        Assertions.assertThat(member).isEqualTo(FindedMember);


    }

}
