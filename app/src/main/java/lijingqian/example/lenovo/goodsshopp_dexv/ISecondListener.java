package lijingqian.example.lenovo.goodsshopp_dexv;

import java.util.List;

import lijingqian.example.lenovo.goodsshopp_dexv.bean.GetCartBean;



/**
 * Created by peng on 2017/12/14.
 */

public interface ISecondListener {
    void show(List<GetCartBean.DataBean> group, List<List<GetCartBean.DataBean.ListBean>> child);
}
