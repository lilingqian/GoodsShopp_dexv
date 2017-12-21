package lijingqian.example.lenovo.goodsshopp_dexv.model;


import java.util.Map;

import lijingqian.example.lenovo.goodsshopp_dexv.bean.AddCartBean;
import lijingqian.example.lenovo.goodsshopp_dexv.net.OnNetListener;

/**
 * Created by peng on 2017/12/14.
 */

public interface AddCartService {
    void addCart(Map<String, String> params, OnNetListener<AddCartBean> onNetListener);
}
