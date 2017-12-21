package lijingqian.example.lenovo.goodsshopp_dexv.net;



public interface OnNetListener<T> {
    public void onSuccess(T t);

    public void onFailure(Exception e);
}
