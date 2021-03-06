package life.majiang.communtiy.communtiy.dto;



import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalCount, Integer page, Integer size) {
        if (totalCount % size == 0) {
            totalPage = totalCount / size;
        }else {
            totalPage = totalCount / size + 1;
        }

        if (page < 1) {
            page = 1;
        }

        if (page > totalPage) {
            page = totalPage;
        }

        this.page = page;

        pages.add(page);
        for (int i = 1; i <= 3; i++) {
            if (page - i > 0) {
                pages.add(0,page - i);
            }

            if (page + i <= totalPage) {
                pages.add(page + i);
            }
        }


        //是否展示"<"上一页的标识
        if (page == 1) {
            showPrevious = false;
        }else {
            showPrevious = true;
        }

        //是否展示">"下一页的标识
        if (Objects.equals(page, totalPage)) {
            showNext = false;
        }else {
            showNext = true;
        }

        //是否展示"《"第一页的标识
        if (pages.contains(1)) {
            showFirstPage = false;
        }else {
            showFirstPage = true;
        }

        //是否展示"》"最后一页的标识
        if (pages.contains(totalPage)) {
            showEndPage = false;
        }else {
            showEndPage = true;
        }


    }
}
