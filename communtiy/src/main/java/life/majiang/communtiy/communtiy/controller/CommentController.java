package life.majiang.communtiy.communtiy.controller;

import life.majiang.communtiy.communtiy.dto.CommentDTO;
import life.majiang.communtiy.communtiy.mapper.CommentMapper;
import life.majiang.communtiy.communtiy.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommentController {

    @Autowired
    private CommentMapper commentMapper;

    @RequestMapping(value = "/comment",method = RequestMethod.POST)
    public  Object post(@RequestBody CommentDTO commentDTO) {
        Comment comment = new Comment();
        comment.setParentId(commentDTO.getParentId());
        comment.setContent(commentDTO.getContent());
        comment.setType(commentDTO.getType());
        comment.setGmtModified(System.currentTimeMillis());
        comment.setGmtCreate(System.currentTimeMillis());
        comment.setCommentator(1);
        commentMapper.insert( comment);
        return null;
    }
}
