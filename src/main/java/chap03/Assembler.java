package chap03;

public class Assembler
{
	private MemberDao memberDao;
	private MemberRegisterService registerService;
	private ChangePasswordService changePasswordService;
	
	public Assembler()
	{
		memberDao = new MemberDao();
		registerService = new MemberRegisterService(memberDao);
		changePasswordService = new ChangePasswordService();
		changePasswordService.setMemberDao(memberDao);
	}
	
	public MemberDao getMemberDao()
	{
		return memberDao;
	}
	
	public MemberRegisterService getRegisterService()
	{
		return registerService;
	}
	
	public ChangePasswordService getChangePasswordService()
	{
		return changePasswordService;
	}
}
