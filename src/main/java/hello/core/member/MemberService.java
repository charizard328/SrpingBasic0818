package hello.core.member;

public interface MemberService {

    public void join(Member member);

    public Member findById(Long memberId);
}
