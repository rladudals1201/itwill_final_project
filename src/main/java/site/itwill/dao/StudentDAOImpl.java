package site.itwill.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import site.itwill.dto.Student;
import site.itwill.mapper.StudentMapper;

//DAO Ŭ���� : ����Ű��� �࿡ ���� ����,����,����,�˻� ����� �����ϴ� Ŭ����
// => DBMS ������ SQL ����� �����Ͽ� ����� ����� Java Ÿ������ ��ȯ�ϴ� ����� �޼ҵ� �ۼ�

//Mybatis Framework�� �̿��� DAO Ŭ���� �ۼ�
//1.Mybatis ���� ���̺귯�� ���� ó�� - pom.xml
//2.mybatis ȯ�漳������ �ۼ�
//3.SqlSessionFactory ���� Ŭ������ SqlSession ���� Ŭ������ Spring Bean���� ���
// => Bean Configuration File(root-context.xml)���� bean ������Ʈ ���
//4.Mapper �ۼ� - XML ���� ���ϰ� Interface ���� ������ ���ε��Ͽ� �ۼ�
//5.DAO Ŭ������ �޼ҵ忡�� Mapper�� ��ϵ� SQL ����� �����Ͽ� �����ϰ� ����� �����޾� ��ȯ

//Spring-Mybatis���� �����ϴ� �α׸� Spring �α� ����ü�� ��ϵǵ��� �����ϴ� ���
//1.log4jdbc-log4j2-jdbc4 ���̺귯�� ���� ó�� - pom.xml
//2.DataSource ���� Spring Bean ��Ͻ� driverClassName �ʵ�� url �ʵ带 �����Ͽ� ������ ó�� - root-context.xml
//3.resources ��Ű�� ������ log4jdbc.log4j2.properties ���� �ۼ�
//4.log4j.xml ���Ͽ��� �α� �̺�Ʈ�� ���� ��� ����

//@Repository : DAO Ŭ������ Spring Bean���� ����ϱ� ���� ������̼�
// => Ʈ������ ���� ����� �����޾� ���
//Spring Container���� ������̼��� ó���ϱ� ���� Bean Configuration File(servlet-context.xml)���� 
//component-scan ������Ʈ�� DAO Ŭ������ �ۼ��� ��Ű���� ���� 
@Repository
public class StudentDAOImpl implements StudentDAO {
	//SqlSession ���� Ŭ������ ��ϵ� Spring Bean�� �ʵ忡 ������ ó��
	// => DAO Ŭ������ �޼ҵ忡�� SqlSession ��ü�� �޼ҵ� ȣ��
	//@Autowired ������̼ǰ� @Qualifier ������̼��� �̿��Ͽ� �ڵ� ������ ó��
	// => �ʵ帶�� ������̼��� �̿��Ͽ� ������ ó��
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertStudent(Student student) {
		return sqlSession.getMapper(StudentMapper.class).insertStudent(student);
	}

	@Override
	public List<Student> selectStudentList() {
		return sqlSession.getMapper(StudentMapper.class).selectStudentList();
	}
}








