package chap03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext
{
	@Bean
	public MemberDao memberDao()
	{
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc()
	{
		return new MemberRegisterService(memberDao());
	}
	
	@Bean
	public ChangePasswordService changePwdSvc()
	{
		ChangePasswordService svc = new ChangePasswordService();
		svc.setMemberDao(memberDao());
		return svc;
	}
	
	@Bean
	public MemberPrinter memberPrinter()
	{
		return new MemberPrinter();
	}
	
	@Bean
	public MemberListPrinter listPrinter()
	{
		return new MemberListPrinter(memberDao(), memberPrinter());
	}
}
