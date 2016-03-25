/*
 * Copyright 1999-2012 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package validation.impl;

import com.alibaba.fastjson.JSON;

import validation.api.ValidationParameter;
import validation.api.ValidationService;

/**
 * ValidationServiceImpl
 * 
 * @author william.liangf
 */
public class ValidationServiceImpl implements ValidationService {

    public void save(ValidationParameter parameter) {
    	System.out.println("保存数据成功");
    	System.out.println("name-->"+parameter.getName());
    	
    }

    public void update(ValidationParameter parameter) {
    }

    public void delete(long id, String operator) {
    	System.out.println("删除成功");
    }

}
