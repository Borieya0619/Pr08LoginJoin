package org.example.pr08loginjoin;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ApiController {
    public static List<Member> memberList = new ArrayList<>();
    @PostMapping("/check")
    public CheckResDTO check(@RequestBody CheckReqDTO checkReqDTO) {
        System.out.println(memberList);
        CheckResDTO checkResDTO = new CheckResDTO();
        checkResDTO.setMessage("로그인 실패!");
        for (Member member : memberList) {
            if (member.getUsername().equals(checkReqDTO.getUsername()) && member.getPassword().equals(checkReqDTO.getPassword())) {
                checkResDTO.setMessage("로그인 성공!");
                break;
            }
        }
        return checkResDTO;
    }

    @PostMapping("/dupl")
    public CheckResDTO dupl(@RequestBody CheckReqDTO checkReqDTO) {
        CheckResDTO checkResDTO = new CheckResDTO();
        checkResDTO.setMessage("사용 가능한 아이디에요:)");
        for (Member member : memberList) {
            if (member.getUsername().equals(checkReqDTO.getUsername())) {
                checkResDTO.setMessage("중복된 아이디가 있어요..");
                break;
            }
        }
        return checkResDTO;
    }

    @PostMapping("/sign_up")
    public CheckResDTO sign_up(@RequestBody JoinReqDTO joinDTO) {
        Member newMember = Member.builder().username(joinDTO.getUsername()).email(joinDTO.getEmail()).password(joinDTO.getPassword()).joindate(LocalDate.now()).build();
        memberList.add(newMember);
        CheckResDTO checkResDTO = new CheckResDTO();
        checkResDTO.setMessage("회원가입 성공!");
        return checkResDTO;
    }
}

