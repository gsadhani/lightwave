/*
 * Copyright (c) 2012-2015 VMware, Inc.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, without
 * warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.vmware.identity.interop.ldap;

import org.apache.commons.lang.SystemUtils;

/**
 * Created by IntelliJ IDEA.
 * User: krishnag
 * Date: 12/19/11
 * Time: 2:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class LdapException extends RuntimeException
{
	private static final long serialVersionUID = -3520007437025313295L;

	private int    _errCode = -1;

    public LdapException (int errCode, String errMsg)
    {
        super(errMsg);
    	_errCode = errCode;
    }

    @Override
    public String toString()
    {
        return super.toString() +
            SystemUtils.LINE_SEPARATOR +
            String.format("LDAP error [code: %d]", this._errCode
        );
    }
    
    public int getErrorCode()
    {
        return this._errCode;
    }
}
