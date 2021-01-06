package com.soebes.itf.jupiter.extension;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * @author Karl Heinz Marbaise
 */
enum Storage {

  /*
   * <pre>
   *   target/                                   <-- TARGET_DIRECTORY
   *      +-- itf-repo/                          <-- targetItfRepoDirectory
   *      +-- test-classes/                      <-- targetTestClassesDirectory
   *            +--- FirstIT/
   *                    +--- test_case_one       <-- sourceMavenProject
   *
   *      +-- maven-it/                          <-- TARGET_MAVEN_IT_DIRECTORY
   *           +-- FirstIT/                      <-- mavenItTestCaseBaseDirectory
   *                 +--- test_case_one/         <-- integrationTestCaseDirectory
   *                       +--- .m2/repository   <-- cacheDirectory
   *                       +--- project          <-- projectDirectory
   *                               +--- src/
   *                               +--- pom.xml
   * </pre>
   */
  /**
   * The {@code target/maven-it} directory.
   */
  TARGET_MAVEN_IT_DIRECTORY,
  /**
   * The directory for the single test cases which is being built of the
   * {@code package+testClassName+(Optional:NestedClassNames)+MethodName}.
   */
  MAVEN_IT_TESTCASE_BASEDIRECTORY,
  TARGET_DIRECTORY
}
