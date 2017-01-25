package webApplications.examProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webApplications.examProject.model.Member;
import webApplications.examProject.persist.MemberRepository;

@Service
public class MemberManager {
	
	@Autowired
	private MemberRepository memberRepository;
	
	public Member saveMember(Member member){
		return this.memberRepository.save(member);
	}
	
	public Member getMemberById(int id){
		Member foundMember = memberRepository.findOne(id);
		return foundMember;
	}
	
	public List<Member> getAllMember() {
		Iterable<Member> it = this.memberRepository.findAll();
		List<Member> memberList = new ArrayList<>();
		for(Member m : it) {
			memberList.add(m);
		}
		return memberList;
	}
	
	public void deleteMemberById(int id){
		memberRepository.delete(id);
	}

}
