package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<hello.hello_spring.domain.Member> findById(Long id);
    Optional<hello.hello_spring.domain.Member> findByName(String name);
    List<hello.hello_spring.domain.Member> findAll();
}
