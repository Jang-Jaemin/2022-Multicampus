package upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DownloadController {
	@RequestMapping("/filedownloadlist")
	public ModelAndView downloadlist() {
		File f = new File("/Users/tkdalsgks/dev_tools/upload/");
		String[] filearray = f.list();
		ModelAndView mv = new ModelAndView();
		mv.addObject("filearray", filearray);
		mv.setViewName("download/downloadlist");
		
		return mv;
	}
	
	@RequestMapping("/filedownloadresult")
	public void downloadresult(String filename, HttpServletResponse response) throws IOException {
		// 파일 총 길이
		File f = new File("/Users/tkdalsgks/dev_tools/upload/", filename);
		int len = (int)f.length();
		
		// 파일 다운로드
		response.setContentType("application/download");
		response.setContentLength(len);
		response.setHeader("Content-Disposition", "attachment;filename=\"" + filename + "\"");
		
		// 파일 전송
		OutputStream out = response.getOutputStream();	// 브라우저 응답 출력 객체
		FileInputStream fin = new FileInputStream(f);	// 파일 입력 객체 생성
		FileCopyUtils.copy(fin, out);	// 서버파일 입력 객체 -> 브라우저 응답 출력 객체로 복사
		fin.close();
		out.close();
	}
	
}
