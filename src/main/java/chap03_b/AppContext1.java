package chap03_b;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext1
{
	@Bean
	public MemberDao memberDao()
	{
		return new MemberDao();
	}
	
	@Bean
	public MemberPrinter memberPrinter()
	{
		return new MemberPrinter();
	}
}
