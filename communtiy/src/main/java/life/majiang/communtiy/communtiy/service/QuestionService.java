package life.majiang.communtiy.communtiy.service;

import life.majiang.communtiy.communtiy.dto.QuestionDTO;
import life.majiang.communtiy.communtiy.mapper.QuestionMapper;
import life.majiang.communtiy.communtiy.mapper.UserMapper;
import life.majiang.communtiy.communtiy.model.Question;
import life.majiang.communtiy.communtiy.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;

    public List<QuestionDTO> list() {
        List<Question> questions = questionMapper.list();
        List<QuestionDTO> questionDTOList = new ArrayList<>();
        for (Question question : questions) {
            User user = userMapper.findByID(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question,questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        return questionDTOList;
    }
}
