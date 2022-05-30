/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.client.okhttp;

import io.fabric8.kubernetes.client.http.AbstractInterceptorTest;
import io.fabric8.kubernetes.client.http.HttpClient;
import org.junit.jupiter.api.Disabled;

@SuppressWarnings("java:S2187")
public class OkHttpInterceptorTest extends AbstractInterceptorTest {
  @Override
  protected HttpClient.Factory getHttpClientFactory() {
    return new OkHttpClientFactory();
  }

  // TODO: Check implementation
  @Disabled("TODO: Check implementation")
  @Override
  public void afterHttpFailureReplacesResponseInConsumeLines() {
  }

  // TODO: Check implementation
  @Disabled("TODO: Check implementation")
  @Override
  public void afterHttpFailureReplacesResponseInConsumeBytes() {
  }
}