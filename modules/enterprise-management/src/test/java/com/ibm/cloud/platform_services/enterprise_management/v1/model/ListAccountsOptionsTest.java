/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.platform_services.enterprise_management.v1.model;

import com.ibm.cloud.platform_services.enterprise_management.v1.model.ListAccountsOptions;
import com.ibm.cloud.platform_services.enterprise_management.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListAccountsOptions model.
 */
public class ListAccountsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListAccountsOptions() throws Throwable {
    ListAccountsOptions listAccountsOptionsModel = new ListAccountsOptions.Builder()
      .enterpriseId("testString")
      .accountGroupId("testString")
      .nextDocid("testString")
      .parent("testString")
      .limit(Long.valueOf("100"))
      .build();
    assertEquals(listAccountsOptionsModel.enterpriseId(), "testString");
    assertEquals(listAccountsOptionsModel.accountGroupId(), "testString");
    assertEquals(listAccountsOptionsModel.nextDocid(), "testString");
    assertEquals(listAccountsOptionsModel.parent(), "testString");
    assertEquals(listAccountsOptionsModel.limit(), Long.valueOf("100"));
  }
}