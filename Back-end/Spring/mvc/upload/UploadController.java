package upload;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	@GetMapping("/fileupload")
	public String uploadform() {
		return "upload/uploadform";
	}
	
	@PostMapping("/fileupload")
	public String uploadresult(@ModelAttribute("dto") UploadDTO dto) throws IOException {
		MultipartFile mf1 = dto.getFile1();
		MultipartFile mf2 = dto.getFile2();
		System.out.println(dto.getName());
		System.out.println(dto.getDescription());
		System.out.println(mf1.getOriginalFilename());	// 이름
		System.out.println(mf2.getOriginalFilename());
		System.out.println(mf1.getSize());	// 길이
		System.out.println(mf2.getSize());
		System.out.println(mf1.isEmpty());	// 파일선택 여부
		System.out.println(mf2.isEmpty());
		
		// 파일내용 + 파일명 -> 서버 ../upload/ 폴더 영구 저장
		String savePath = "/Users/tkdalsgks/dev_tools/upload/";
		
		if(! mf1.isEmpty()) {
			// 기존 파일명
			String originname1 = mf1.getOriginalFilename();
			
			// 확장자 이전 파일명
			String beforeext1 = originname1.substring(0, originname1.indexOf("."));
						
			// 확장자 이후 파일명
			String ext1 = originname1.substring(originname1.indexOf("."));
			
			// 랜덤한 이름으로 파일 저장
			File serverfile1 = new File(savePath + beforeext1 + "(" + UUID.randomUUID().toString().substring(0, 5) + ")" + ext1);
			dto.getFile1().transferTo(serverfile1);
		}
		if(! mf2.isEmpty()) {
			String originname2 = mf2.getOriginalFilename();
			String beforeext2 = originname2.substring(0, originname2.indexOf("."));
			String ext2 = originname2.substring(originname2.indexOf("."));
			File serverfile2 = new File(savePath + beforeext2 + "(" + UUID.randomUUID().toString().substring(0, 5) + ")" + ext2);
			dto.getFile2().transferTo(serverfile2);
		}
		
		return "upload/uploadresult";
	}
}
