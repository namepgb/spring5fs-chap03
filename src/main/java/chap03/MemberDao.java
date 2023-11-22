package chap03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDao
{
	private static long nextId = 0L;
	private Map<String, Member> mapMember = new HashMap<>();
	
	public Member selectByEmail(String email)
	{
		return mapMember.get(email);
	}
	
	public void insert(Member member)
	{
		member.setId(++nextId);
		mapMember.put(member.getEmail(), member);
	}
	
	public void update(Member member)
	{
		mapMember.replace(member.getEmail(), member);
	}
	
	public Collection<Member> selectAll()
	{
		return mapMember.values();
	}
}
