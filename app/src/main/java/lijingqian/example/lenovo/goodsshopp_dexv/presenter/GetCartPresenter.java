package lijingqian.example.lenovo.goodsshopp_dexv.presenter;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lijingqian.example.lenovo.goodsshopp_dexv.ISecondListener;
import lijingqian.example.lenovo.goodsshopp_dexv.bean.GetCartBean;
import lijingqian.example.lenovo.goodsshopp_dexv.model.GetCartModel;
import lijingqian.example.lenovo.goodsshopp_dexv.model.GetCartService;
import lijingqian.example.lenovo.goodsshopp_dexv.net.OnNetListener;



public class GetCartPresenter {
    private ISecondListener iSecondListener;
    private final GetCartService getCartService;

    public GetCartPresenter(ISecondListener iSecondListener) {
        this.iSecondListener = iSecondListener;
        getCartService = new GetCartModel();
    }

    public void dettach() {
        iSecondListener = null;
    }

    public void getCart() {
        Map<String, String> params = new HashMap<>();
        params.put("uid", "1234");
        params.put("pid", "71");
        getCartService.getCart(params, new OnNetListener<GetCartBean>() {
            @Override
            public void onSuccess(GetCartBean getCartBean) {
                if (iSecondListener != null) {
                    List<GetCartBean.DataBean> group = getCartBean.getData();
                    List<List<GetCartBean.DataBean.ListBean>> child = new ArrayList<>();
                    for (int i = 0; i < group.size(); i++) {
                        child.add(group.get(i).getList());
                    }
                    iSecondListener.show(group, child);
                }
            }

            @Override
            public void onFailure(Exception e) {

            }
        });
    }
}
