package com.pwc.core.framework.util;

public class ObjectUtils {

    /**
     * Simple utility method to check if an Object is Empty
     *
     * @param object object to check for nulls
     * @return is object null
     */
    protected boolean isEmpty(Object object) {

        boolean emptyObject;
        try {
            emptyObject = null == object;
        } catch (Exception e) {
            emptyObject = true;
        }
        return emptyObject;
    }

    /**
     * Simple utility method to check if an Object is Not Empty
     *
     * @param object object to check for not null
     * @return is object null
     */
    protected boolean isNotEmpty(Object object) {

        boolean notEmptyObject;
        try {
            notEmptyObject = null != object;
        } catch (Exception e) {
            notEmptyObject = false;
        }
        return notEmptyObject;
    }

}
