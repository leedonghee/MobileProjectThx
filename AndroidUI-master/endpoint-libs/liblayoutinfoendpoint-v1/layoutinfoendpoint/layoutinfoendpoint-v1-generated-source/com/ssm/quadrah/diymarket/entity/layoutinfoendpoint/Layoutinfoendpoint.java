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
 * on 2014-02-27 at 19:23:00 UTC 
 * Modify at your own risk.
 */

package com.ssm.quadrah.diymarket.entity.layoutinfoendpoint;

/**
 * Service definition for Layoutinfoendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link LayoutinfoendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Layoutinfoendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.16.0-rc of the layoutinfoendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://quadrah-diy-market.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "layoutinfoendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Layoutinfoendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Layoutinfoendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getlayoutInfo".
   *
   * This request holds the parameters needed by the the layoutinfoendpoint server.  After setting any
   * optional parameters, call the {@link GetlayoutInfo#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public GetlayoutInfo getlayoutInfo(java.lang.Long id) throws java.io.IOException {
    GetlayoutInfo result = new GetlayoutInfo(id);
    initialize(result);
    return result;
  }

  public class GetlayoutInfo extends LayoutinfoendpointRequest<com.ssm.quadrah.diymarket.entity.layoutinfoendpoint.model.LayoutInfo> {

    private static final String REST_PATH = "layoutinfo/{id}";

    /**
     * Create a request for the method "getlayoutInfo".
     *
     * This request holds the parameters needed by the the layoutinfoendpoint server.  After setting
     * any optional parameters, call the {@link GetlayoutInfo#execute()} method to invoke the remote
     * operation. <p> {@link GetlayoutInfo#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetlayoutInfo(java.lang.Long id) {
      super(Layoutinfoendpoint.this, "GET", REST_PATH, null, com.ssm.quadrah.diymarket.entity.layoutinfoendpoint.model.LayoutInfo.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetlayoutInfo setAlt(java.lang.String alt) {
      return (GetlayoutInfo) super.setAlt(alt);
    }

    @Override
    public GetlayoutInfo setFields(java.lang.String fields) {
      return (GetlayoutInfo) super.setFields(fields);
    }

    @Override
    public GetlayoutInfo setKey(java.lang.String key) {
      return (GetlayoutInfo) super.setKey(key);
    }

    @Override
    public GetlayoutInfo setOauthToken(java.lang.String oauthToken) {
      return (GetlayoutInfo) super.setOauthToken(oauthToken);
    }

    @Override
    public GetlayoutInfo setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetlayoutInfo) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetlayoutInfo setQuotaUser(java.lang.String quotaUser) {
      return (GetlayoutInfo) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetlayoutInfo setUserIp(java.lang.String userIp) {
      return (GetlayoutInfo) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetlayoutInfo setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetlayoutInfo set(String parameterName, Object value) {
      return (GetlayoutInfo) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertlayoutInfo".
   *
   * This request holds the parameters needed by the the layoutinfoendpoint server.  After setting any
   * optional parameters, call the {@link InsertlayoutInfo#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.ssm.quadrah.diymarket.entity.layoutinfoendpoint.model.LayoutInfo}
   * @return the request
   */
  public InsertlayoutInfo insertlayoutInfo(com.ssm.quadrah.diymarket.entity.layoutinfoendpoint.model.LayoutInfo content) throws java.io.IOException {
    InsertlayoutInfo result = new InsertlayoutInfo(content);
    initialize(result);
    return result;
  }

  public class InsertlayoutInfo extends LayoutinfoendpointRequest<com.ssm.quadrah.diymarket.entity.layoutinfoendpoint.model.LayoutInfo> {

    private static final String REST_PATH = "layoutinfo";

    /**
     * Create a request for the method "insertlayoutInfo".
     *
     * This request holds the parameters needed by the the layoutinfoendpoint server.  After setting
     * any optional parameters, call the {@link InsertlayoutInfo#execute()} method to invoke the
     * remote operation. <p> {@link InsertlayoutInfo#initialize(com.google.api.client.googleapis.servi
     * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.ssm.quadrah.diymarket.entity.layoutinfoendpoint.model.LayoutInfo}
     * @since 1.13
     */
    protected InsertlayoutInfo(com.ssm.quadrah.diymarket.entity.layoutinfoendpoint.model.LayoutInfo content) {
      super(Layoutinfoendpoint.this, "POST", REST_PATH, content, com.ssm.quadrah.diymarket.entity.layoutinfoendpoint.model.LayoutInfo.class);
    }

    @Override
    public InsertlayoutInfo setAlt(java.lang.String alt) {
      return (InsertlayoutInfo) super.setAlt(alt);
    }

    @Override
    public InsertlayoutInfo setFields(java.lang.String fields) {
      return (InsertlayoutInfo) super.setFields(fields);
    }

    @Override
    public InsertlayoutInfo setKey(java.lang.String key) {
      return (InsertlayoutInfo) super.setKey(key);
    }

    @Override
    public InsertlayoutInfo setOauthToken(java.lang.String oauthToken) {
      return (InsertlayoutInfo) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertlayoutInfo setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertlayoutInfo) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertlayoutInfo setQuotaUser(java.lang.String quotaUser) {
      return (InsertlayoutInfo) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertlayoutInfo setUserIp(java.lang.String userIp) {
      return (InsertlayoutInfo) super.setUserIp(userIp);
    }

    @Override
    public InsertlayoutInfo set(String parameterName, Object value) {
      return (InsertlayoutInfo) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listlayoutInfo".
   *
   * This request holds the parameters needed by the the layoutinfoendpoint server.  After setting any
   * optional parameters, call the {@link ListlayoutInfo#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListlayoutInfo listlayoutInfo() throws java.io.IOException {
    ListlayoutInfo result = new ListlayoutInfo();
    initialize(result);
    return result;
  }

  public class ListlayoutInfo extends LayoutinfoendpointRequest<com.ssm.quadrah.diymarket.entity.layoutinfoendpoint.model.CollectionResponseLayoutInfo> {

    private static final String REST_PATH = "layoutinfo";

    /**
     * Create a request for the method "listlayoutInfo".
     *
     * This request holds the parameters needed by the the layoutinfoendpoint server.  After setting
     * any optional parameters, call the {@link ListlayoutInfo#execute()} method to invoke the remote
     * operation. <p> {@link ListlayoutInfo#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @since 1.13
     */
    protected ListlayoutInfo() {
      super(Layoutinfoendpoint.this, "GET", REST_PATH, null, com.ssm.quadrah.diymarket.entity.layoutinfoendpoint.model.CollectionResponseLayoutInfo.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListlayoutInfo setAlt(java.lang.String alt) {
      return (ListlayoutInfo) super.setAlt(alt);
    }

    @Override
    public ListlayoutInfo setFields(java.lang.String fields) {
      return (ListlayoutInfo) super.setFields(fields);
    }

    @Override
    public ListlayoutInfo setKey(java.lang.String key) {
      return (ListlayoutInfo) super.setKey(key);
    }

    @Override
    public ListlayoutInfo setOauthToken(java.lang.String oauthToken) {
      return (ListlayoutInfo) super.setOauthToken(oauthToken);
    }

    @Override
    public ListlayoutInfo setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListlayoutInfo) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListlayoutInfo setQuotaUser(java.lang.String quotaUser) {
      return (ListlayoutInfo) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListlayoutInfo setUserIp(java.lang.String userIp) {
      return (ListlayoutInfo) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListlayoutInfo setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListlayoutInfo setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListlayoutInfo set(String parameterName, Object value) {
      return (ListlayoutInfo) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removelayoutInfo".
   *
   * This request holds the parameters needed by the the layoutinfoendpoint server.  After setting any
   * optional parameters, call the {@link RemovelayoutInfo#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemovelayoutInfo removelayoutInfo(java.lang.Long id) throws java.io.IOException {
    RemovelayoutInfo result = new RemovelayoutInfo(id);
    initialize(result);
    return result;
  }

  public class RemovelayoutInfo extends LayoutinfoendpointRequest<Void> {

    private static final String REST_PATH = "layoutinfo/{id}";

    /**
     * Create a request for the method "removelayoutInfo".
     *
     * This request holds the parameters needed by the the layoutinfoendpoint server.  After setting
     * any optional parameters, call the {@link RemovelayoutInfo#execute()} method to invoke the
     * remote operation. <p> {@link RemovelayoutInfo#initialize(com.google.api.client.googleapis.servi
     * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemovelayoutInfo(java.lang.Long id) {
      super(Layoutinfoendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemovelayoutInfo setAlt(java.lang.String alt) {
      return (RemovelayoutInfo) super.setAlt(alt);
    }

    @Override
    public RemovelayoutInfo setFields(java.lang.String fields) {
      return (RemovelayoutInfo) super.setFields(fields);
    }

    @Override
    public RemovelayoutInfo setKey(java.lang.String key) {
      return (RemovelayoutInfo) super.setKey(key);
    }

    @Override
    public RemovelayoutInfo setOauthToken(java.lang.String oauthToken) {
      return (RemovelayoutInfo) super.setOauthToken(oauthToken);
    }

    @Override
    public RemovelayoutInfo setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemovelayoutInfo) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemovelayoutInfo setQuotaUser(java.lang.String quotaUser) {
      return (RemovelayoutInfo) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemovelayoutInfo setUserIp(java.lang.String userIp) {
      return (RemovelayoutInfo) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemovelayoutInfo setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemovelayoutInfo set(String parameterName, Object value) {
      return (RemovelayoutInfo) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updatelayoutInfo".
   *
   * This request holds the parameters needed by the the layoutinfoendpoint server.  After setting any
   * optional parameters, call the {@link UpdatelayoutInfo#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.ssm.quadrah.diymarket.entity.layoutinfoendpoint.model.LayoutInfo}
   * @return the request
   */
  public UpdatelayoutInfo updatelayoutInfo(com.ssm.quadrah.diymarket.entity.layoutinfoendpoint.model.LayoutInfo content) throws java.io.IOException {
    UpdatelayoutInfo result = new UpdatelayoutInfo(content);
    initialize(result);
    return result;
  }

  public class UpdatelayoutInfo extends LayoutinfoendpointRequest<com.ssm.quadrah.diymarket.entity.layoutinfoendpoint.model.LayoutInfo> {

    private static final String REST_PATH = "layoutinfo";

    /**
     * Create a request for the method "updatelayoutInfo".
     *
     * This request holds the parameters needed by the the layoutinfoendpoint server.  After setting
     * any optional parameters, call the {@link UpdatelayoutInfo#execute()} method to invoke the
     * remote operation. <p> {@link UpdatelayoutInfo#initialize(com.google.api.client.googleapis.servi
     * ces.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.ssm.quadrah.diymarket.entity.layoutinfoendpoint.model.LayoutInfo}
     * @since 1.13
     */
    protected UpdatelayoutInfo(com.ssm.quadrah.diymarket.entity.layoutinfoendpoint.model.LayoutInfo content) {
      super(Layoutinfoendpoint.this, "PUT", REST_PATH, content, com.ssm.quadrah.diymarket.entity.layoutinfoendpoint.model.LayoutInfo.class);
    }

    @Override
    public UpdatelayoutInfo setAlt(java.lang.String alt) {
      return (UpdatelayoutInfo) super.setAlt(alt);
    }

    @Override
    public UpdatelayoutInfo setFields(java.lang.String fields) {
      return (UpdatelayoutInfo) super.setFields(fields);
    }

    @Override
    public UpdatelayoutInfo setKey(java.lang.String key) {
      return (UpdatelayoutInfo) super.setKey(key);
    }

    @Override
    public UpdatelayoutInfo setOauthToken(java.lang.String oauthToken) {
      return (UpdatelayoutInfo) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdatelayoutInfo setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdatelayoutInfo) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdatelayoutInfo setQuotaUser(java.lang.String quotaUser) {
      return (UpdatelayoutInfo) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdatelayoutInfo setUserIp(java.lang.String userIp) {
      return (UpdatelayoutInfo) super.setUserIp(userIp);
    }

    @Override
    public UpdatelayoutInfo set(String parameterName, Object value) {
      return (UpdatelayoutInfo) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Layoutinfoendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Layoutinfoendpoint}. */
    @Override
    public Layoutinfoendpoint build() {
      return new Layoutinfoendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link LayoutinfoendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setLayoutinfoendpointRequestInitializer(
        LayoutinfoendpointRequestInitializer layoutinfoendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(layoutinfoendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
