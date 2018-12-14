package com.speedata.libid2;

/**
 * @author xuyan
 */
public class HFManager {
    private static IHFService ihfService;

    public static IHFService getInstance() {
        if (ihfService == null) {
            ihfService = new CpuCardApi();
        }
        return ihfService;
    }
}
