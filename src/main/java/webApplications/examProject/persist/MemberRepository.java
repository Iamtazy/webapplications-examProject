package webApplications.examProject.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import webApplications.examProject.model.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member, Integer> {

}
