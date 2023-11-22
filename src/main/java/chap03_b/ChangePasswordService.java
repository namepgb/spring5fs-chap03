package chap03_b;

public class ChangePasswordService
{
	private MemberDao memberDao;
	
	public void changePassword(String email,
	                           String oldPassword,
	                           String newPassword)
	{
		Member member = memberDao.selectByEmail(email);
		if (null == member)
			throw new RuntimeException();
		member.changePassword(oldPassword, newPassword);
		memberDao.update(member);
	}
	
	public void setMemberDao(MemberDao memberDao)
	{
		this.memberDao = memberDao;
	}
}
