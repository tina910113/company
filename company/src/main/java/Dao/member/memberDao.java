package Dao.member;

import java.util.List;

import Model.member;
//�Q�׭n�ϥΪ���k�ƶq�B�W�r
public interface memberDao {
	//create
	void add(member m);
	
	
	//Read-->query
	List<member> selectAll();//����
	member selectUser(String username,String password);//�P�_�b���P�K�X-->�n�J��
	boolean selectUser(String username);//�b������
	
	//update
	
	
	//delete

}