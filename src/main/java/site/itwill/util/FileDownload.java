package site.itwill.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

//���� �ٿ�ε� ����� �����ϴ� Ŭ���� - Spring Bean���� ���
//BeanNameViewResolver�� ���� ����Ǵ� Ŭ������ �ݵ�� AbstractView Ŭ������ ��ӹ޾� �ۼ�
// => renderMergedOutputModel() �޼ҵ� �������̵� ����
public class FileDownload extends AbstractView {
	//Ŭ���̾�Ʈ�� ������ ��������(MimeType) ���� - ���� �ٿ�ε� ����
	public FileDownload() {
		//AbstractView.setContentType(String mimeType) : ���� ���������� �����ϴ� �޼ҵ�
		setContentType("application/download; utf-8"); 
	}
	
	//BeanNameViewResolver�� ���� �ڵ� ȣ��Ǵ� �޼ҵ�
	// => Map �ڷ����� �Ű��������� ��û ó�� �޼ҵ忡�� Model�� ���� �����Ǵ� ���� ����
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//��Ű�� �̿��Ͽ� �ʰ��� ��ȯ�޾� ���� - �ٿ�ε� ��������
		// => Object Ÿ������ ��ȯ�ǹǷ� ����� ��ü ����ȯ
		String uploadDir=(String)model.get("uploadDir");
		String uploadFilename=(String)model.get("uploadFilename");
		String originFilename=(String)model.get("originFilename");
		
		//�ٿ�ε� ���������� �̿��Ͽ� File ��ü ����
		File downloadFile=new File(uploadDir, uploadFilename);
		
		//Ŭ���̾�Ʈ�� ������ �����ϱ� ���� �������� ����
		response.setContentType(getContentType());
		response.setContentLength((int)downloadFile.length());
		
		//Ŭ���̾�Ʈ���� �ٿ�ε� ���ϸ� ����
		originFilename=URLEncoder.encode(originFilename,"utf-8");
		response.setHeader("Content-Disposition", "attachement;filename=\""+originFilename+"\";");
		
		//Ŭ���̾�Ʈ���� ���õ���Ÿ�� �����ϱ� ���� ��½�Ʈ���� ��ȯ�޾� ����
		OutputStream out=response.getOutputStream();
		
		FileInputStream in=null;
		try {
			//�ٿ�ε� ������ ���õ���Ÿ�� �б� ���� �Է½�Ʈ���� �����Ͽ� ����
			in=new FileInputStream(downloadFile);
			
			/*
			//�Է½�Ʈ������ ���õ���Ÿ�� �о� ��½�Ʈ������ ���� - �ٿ�ε�
			while(true) {
				int readByte=in.read();
				if(readByte==-1) break;
				out.write(readByte);
			}
			*/
			
			//Spring Framework���� �����Ǵ� FileCopyUtils Ŭ������ copy() �޼ҵ带 ȣ���Ͽ� ���� ���� - �ٿ�ε�
			FileCopyUtils.copy(in, out);	
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				in.close();
			} catch (Exception e) {}
		}
	}

}
