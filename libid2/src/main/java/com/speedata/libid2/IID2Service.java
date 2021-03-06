package com.speedata.libid2;

import android.content.Context;
import android.serialport.DeviceControlSpd;

import java.io.IOException;

/**
 * Created by brxu on 2016/12/15.
 */

public interface IID2Service {


    /**
     * @param callBack
     * @param serialport 串口
     * @param braut      波特率
     * @param power_type 上电类型
     * @param gpio       上电GPIO
     */
    public boolean initDev(Context mContext, IDReadCallBack callBack, String serialport, int braut,
                           DeviceControlSpd.PowerType power_type,
                           int... gpio) throws IOException;


    boolean initDev(Context context, IDReadCallBack callBack) throws IOException;
//    boolean initDev(Context context, IDReadCallBack callBack,int delay) throws IOException;

    public void releaseDev() throws IOException;

    public int searchCard();

    public int selectCard();

    /**
     * @param isNeedFingerprinter 是否需要指纹
     * @return 返回身份信息实体
     */
    public IDInfor readCard(boolean isNeedFingerprinter);

    public void getIDInfor(boolean isNeedFingerprinter, boolean isLoop);

//    public void getIDInfor(boolean isNeedFingerprinter);

    //    public void startCirculationRead(int interval);
    public String parseReturnState(int state);
}
