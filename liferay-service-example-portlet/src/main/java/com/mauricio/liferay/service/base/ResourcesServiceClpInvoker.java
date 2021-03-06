package com.mauricio.liferay.service.base;

import com.mauricio.liferay.service.ResourcesServiceUtil;

import java.util.Arrays;

/**
 * @author luismalamoc
 * @generated
 */
public class ResourcesServiceClpInvoker {
    private String _methodName16;
    private String[] _methodParameterTypes16;
    private String _methodName17;
    private String[] _methodParameterTypes17;
    private String _methodName20;
    private String[] _methodParameterTypes20;

    public ResourcesServiceClpInvoker() {
        _methodName16 = "getBeanIdentifier";

        _methodParameterTypes16 = new String[] {  };

        _methodName17 = "setBeanIdentifier";

        _methodParameterTypes17 = new String[] { "java.lang.String" };

        _methodName20 = "getCategories";

        _methodParameterTypes20 = new String[] {  };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName16.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
            return ResourcesServiceUtil.getBeanIdentifier();
        }

        if (_methodName17.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
            ResourcesServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName20.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes20, parameterTypes)) {
            return ResourcesServiceUtil.getCategories();
        }

        throw new UnsupportedOperationException();
    }
}
