package Dao.porder;

import java.util.List;

import Model.porder;

public interface porderDao {
	//�s�W
	void add(porder p);
	
	//�d��
	List<porder> queryAll();//����
	List<porder> querySum(int start,int end);//���B����-->sum
	porder queryId(int id);
	
	
	//�ק�
	void update(porder p);
	
	//�R��
	void delete(int id);

}