package lijingqian.example.lenovo.goodsshopp_dexv.model;


import java.util.Map;

import lijingqian.example.lenovo.goodsshopp_dexv.bean.GetCartBean;
import lijingqian.example.lenovo.goodsshopp_dexv.net.OnNetListener;



public interface GetCartService {
    void getCart(Map<String, String> params, OnNetListener<GetCartBean> onNetListener);
}
