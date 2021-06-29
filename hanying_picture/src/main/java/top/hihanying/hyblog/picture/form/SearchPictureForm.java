package top.hihanying.hyblog.picture.form;

import top.hihanying.hyblog.base.vo.FileVO;
import lombok.Data;

@Data
public class SearchPictureForm extends FileVO {
    private String searchKey;
    private Integer count;
}
