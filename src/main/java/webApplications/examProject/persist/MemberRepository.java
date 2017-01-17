package webApplications.examProject.persist;

import org.springframework.data.repository.CrudRepository;

import webApplications.examProject.model.Member;

public interface MemberRepository extends CrudRepository<Member, Integer> {

}
