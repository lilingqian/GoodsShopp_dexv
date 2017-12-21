package lijingqian.example.lenovo.goodsshopp_dexv.model;


import java.util.Map;

import lijingqian.example.lenovo.goodsshopp_dexv.bean.DetailsBean;
import lijingqian.example.lenovo.goodsshopp_dexv.net.OnNetListener;



public interface DetailsService {
    void getProductDetail(Map<String, String> params, OnNetListener<DetailsBean> onNetListener);
}
