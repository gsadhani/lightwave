﻿/*
 * Copyright © 2012-2016 VMware, Inc.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the “License”); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an “AS IS” BASIS, without
 * warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

using System;
namespace VMDir.Common.DTO
{
	public class UserDTO
	{
		public string FirstName { get; set; }
		public string LastName { get; set; }
		public string Cn { get; set; }
		public string UPN { get; set; }
		public string SAMAccountName { get; set; }
        public string objectClass { get; set; }
	}
}

