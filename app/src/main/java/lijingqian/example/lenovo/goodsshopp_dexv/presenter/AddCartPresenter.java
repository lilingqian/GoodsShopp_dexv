package lijingqian.example.lenovo.goodsshopp_dexv.presenter;


import java.util.HashMap;
import java.util.Map;

import lijingqian.example.lenovo.goodsshopp_dexv.IMainListener;
import lijingqian.example.lenovo.goodsshopp_dexv.bean.AddCartBean;
import lijingqian.example.lenovo.goodsshopp_dexv.model.AddCartModel;
import lijingqian.example.lenovo.goodsshopp_dexv.model.AddCartService;
import lijingqian.example.lenovo.goodsshopp_dexv.net.OnNetListener;



public class AddCartPresenter {
    private IMainListener iMainListener;
    private AddCartService addCartService;

    public AddCartPresenter(IMainListener iMainListener) {
        this.iMainListener = iMainListener;
        addCartService = new AddCartModel();
    }

    public void dettach() {
        iMainListener = null;
    }

    public void addCart() {
        Map<String, String> params = new HashMap<>();
        params.put("pid", "71");
        params.put("uid", "39");
        addCartService.addCart(params, new OnNetListener<AddCartBean>() {
            @Override
            public void onSuccess(AddCartBean addCartBean) {
                if (iMainListener != null) {
                    iMainListener.show(addCartBean.getCode().equals("0") ? "添加成功了" : "添加失败了");
                }
            }

            @Override
            public void onFailure(Exception e) {

            }
        });
    }
}
