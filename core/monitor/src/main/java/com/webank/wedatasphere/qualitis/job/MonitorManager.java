/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webank.wedatasphere.qualitis.job;

import com.webank.wedatasphere.qualitis.bean.LogResult;
import com.webank.wedatasphere.qualitis.exception.ClusterInfoNotConfigException;
import com.webank.wedatasphere.qualitis.exception.TaskNotExistException;
import com.webank.wedatasphere.qualitis.exception.LogPartialException;
import com.webank.wedatasphere.qualitis.bean.LogResult;
import com.webank.wedatasphere.qualitis.exception.ClusterInfoNotConfigException;
import com.webank.wedatasphere.qualitis.exception.LogPartialException;
import com.webank.wedatasphere.qualitis.exception.TaskNotExistException;

/**
 * @author howeye
 */
public interface MonitorManager {


    /**
     * Get task status
     * @param taskId
     * @param user
     * @param remoteAddress
     * @param clusterName
     * @return
     * @throws TaskNotExistException
     * @throws ClusterInfoNotConfigException
     */
    String getTaskStatus(Integer taskId, String user, String remoteAddress, String clusterName) throws TaskNotExistException, ClusterInfoNotConfigException;


    /**
     * Get task log
     * @param taskId
     * @param begin
     * @param user
     * @param remoteAddress
     * @param clusterName
     * @return
     * @throws LogPartialException
     * @throws ClusterInfoNotConfigException
     */
    LogResult getTaskPartialLog(Integer taskId, Integer begin, String user, String remoteAddress, String clusterName) throws LogPartialException, ClusterInfoNotConfigException;

}
