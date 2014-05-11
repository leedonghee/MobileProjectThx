/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-02-14 18:40:25 UTC)
 * on 2014-02-27 at 19:22:52 UTC 
 * Modify at your own risk.
 */

package com.ssm.quadrah.diymarket.entity.workpkginfoendpoint.model;

/**
 * Model definition for WorkPkgInfo.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the workpkginfoendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkPkgInfo extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer designerId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thumbnailUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer workPkgDown;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float workPkgGrade;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float workPkgPrice;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workPkgTitle;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workPkgType;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDesignerId() {
    return designerId;
  }

  /**
   * @param designerId designerId or {@code null} for none
   */
  public WorkPkgInfo setDesignerId(java.lang.Integer designerId) {
    this.designerId = designerId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Key getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public WorkPkgInfo setId(Key id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getThumbnailUrl() {
    return thumbnailUrl;
  }

  /**
   * @param thumbnailUrl thumbnailUrl or {@code null} for none
   */
  public WorkPkgInfo setThumbnailUrl(java.lang.String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWorkPkgDown() {
    return workPkgDown;
  }

  /**
   * @param workPkgDown workPkgDown or {@code null} for none
   */
  public WorkPkgInfo setWorkPkgDown(java.lang.Integer workPkgDown) {
    this.workPkgDown = workPkgDown;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getWorkPkgGrade() {
    return workPkgGrade;
  }

  /**
   * @param workPkgGrade workPkgGrade or {@code null} for none
   */
  public WorkPkgInfo setWorkPkgGrade(java.lang.Float workPkgGrade) {
    this.workPkgGrade = workPkgGrade;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getWorkPkgPrice() {
    return workPkgPrice;
  }

  /**
   * @param workPkgPrice workPkgPrice or {@code null} for none
   */
  public WorkPkgInfo setWorkPkgPrice(java.lang.Float workPkgPrice) {
    this.workPkgPrice = workPkgPrice;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkPkgTitle() {
    return workPkgTitle;
  }

  /**
   * @param workPkgTitle workPkgTitle or {@code null} for none
   */
  public WorkPkgInfo setWorkPkgTitle(java.lang.String workPkgTitle) {
    this.workPkgTitle = workPkgTitle;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkPkgType() {
    return workPkgType;
  }

  /**
   * @param workPkgType workPkgType or {@code null} for none
   */
  public WorkPkgInfo setWorkPkgType(java.lang.String workPkgType) {
    this.workPkgType = workPkgType;
    return this;
  }

  @Override
  public WorkPkgInfo set(String fieldName, Object value) {
    return (WorkPkgInfo) super.set(fieldName, value);
  }

  @Override
  public WorkPkgInfo clone() {
    return (WorkPkgInfo) super.clone();
  }

}