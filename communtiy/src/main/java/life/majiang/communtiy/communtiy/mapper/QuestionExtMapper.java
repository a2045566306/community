package life.majiang.communtiy.communtiy.mapper;

import life.majiang.communtiy.communtiy.model.Question;
import life.majiang.communtiy.communtiy.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface QuestionExtMapper {
    int incView(Question record);

}