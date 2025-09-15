package com.suphawinee.ku.KuSoftwareConstruction.AfterMid.Interface.first;

public class StatUtil {
	public static int countNegative(NegativeCheckable[] arr) {
        
		int count = 0;
        for (NegativeCheckable item : arr) {
            if (item.getValue() < 0) {
                count++;
            }
        }
        return count;
    }
}
