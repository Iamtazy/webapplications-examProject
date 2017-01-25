package webApplications.examProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import webApplications.examProject.model.Member;

@Component
public class MemberConverter implements Converter<Integer, Member> {

	@Autowired
	private MemberManager memberManager;
	
	@Override
	public Member convert(Integer arg0) {
		Member member = memberManager.getMemberById(arg0);
		return member;
	}

}
