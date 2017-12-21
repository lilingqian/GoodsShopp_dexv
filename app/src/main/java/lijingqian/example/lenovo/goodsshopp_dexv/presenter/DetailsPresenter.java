package lijingqian.example.lenovo.goodsshopp_dexv.presenter;


import java.util.HashMap;
import java.util.Map;

import lijingqian.example.lenovo.goodsshopp_dexv.IMainListener;
import lijingqian.example.lenovo.goodsshopp_dexv.bean.DetailsBean;
import lijingqian.example.lenovo.goodsshopp_dexv.model.DetailsModel;
import lijingqian.example.lenovo.goodsshopp_dexv.model.DetailsService;
import lijingqian.example.lenovo.goodsshopp_dexv.net.OnNetListener;


public class DetailsPresenter {
    private IMainListener iMainListener;
    private DetailsService detailsService;

    public DetailsPresenter(IMainListener iMainListener) {
        this.iMainListener = iMainListener;
        detailsService = new DetailsModel();
    }

    public void dettach() {
        iMainListener = null;
    }

    public void getProductDetail() {
        Map<String, String> params = new HashMap<>();
        params.put("pid", "71");
        detailsService.getProductDetail(params, new OnNetListener<DetailsBean>() {
            @Override
            public void onSuccess(DetailsBean detailsBean) {
                if (iMainListener != null) {
                    iMainListener.show(detailsBean);
                }
            }

            @Override
            public void onFailure(Exception e) {

            }
        });
    }
}
