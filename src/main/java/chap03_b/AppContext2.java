package chap03_b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext2
{
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private MemberPrinter memberPrinter;
	
	@Bean
	public MemberRegisterService memberRegSvc()
	{
		return new MemberRegisterService(memberDao);
	}
	
	@Bean
	public ChangePasswordService changePwdSvc()
	{
		ChangePasswordService svc = new ChangePasswordService();
		svc.setMemberDao(memberDao);
		return svc;
	}
	
	@Bean
	public MemberListPrinter listPrinter()
	{
		return new MemberListPrinter(memberDao, memberPrinter);
	}
}
