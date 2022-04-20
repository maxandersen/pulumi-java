// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import com.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import com.pulumi.azurenative.datafactory.outputs.WebActivityAuthenticationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebHookActivityResponse {
    /**
     * Authentication method used for calling the endpoint.
     * 
     */
    private final @Nullable WebActivityAuthenticationResponse authentication;
    /**
     * Represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET method Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object body;
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request: &#34;headers&#34; : { &#34;Accept-Language&#34;: &#34;en-us&#34;, &#34;Content-Type&#34;: &#34;application/json&#34; }. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object headers;
    /**
     * Rest API method for target endpoint.
     * 
     */
    private final String method;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * When set to true, statusCode, output and error in callback request body will be consumed by activity. The activity can be marked as failed by setting statusCode &gt;= 400 in callback request. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object reportStatusOnCallBack;
    /**
     * The timeout within which the webhook should be called back. If there is no value specified, it defaults to 10 minutes. Type: string. Pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable String timeout;
    /**
     * Type of activity.
     * Expected value is &#39;WebHook&#39;.
     * 
     */
    private final String type;
    /**
     * WebHook activity target endpoint and path. Type: string (or Expression with resultType string).
     * 
     */
    private final Object url;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @CustomType.Constructor
    private WebHookActivityResponse(
        @CustomType.Parameter("authentication") @Nullable WebActivityAuthenticationResponse authentication,
        @CustomType.Parameter("body") @Nullable Object body,
        @CustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("headers") @Nullable Object headers,
        @CustomType.Parameter("method") String method,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("reportStatusOnCallBack") @Nullable Object reportStatusOnCallBack,
        @CustomType.Parameter("timeout") @Nullable String timeout,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("url") Object url,
        @CustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties) {
        this.authentication = authentication;
        this.body = body;
        this.dependsOn = dependsOn;
        this.description = description;
        this.headers = headers;
        this.method = method;
        this.name = name;
        this.reportStatusOnCallBack = reportStatusOnCallBack;
        this.timeout = timeout;
        this.type = type;
        this.url = url;
        this.userProperties = userProperties;
    }

    /**
     * Authentication method used for calling the endpoint.
     * 
    */
    public Optional<WebActivityAuthenticationResponse> authentication() {
        return Optional.ofNullable(this.authentication);
    }
    /**
     * Represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET method Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> dependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request: &#34;headers&#34; : { &#34;Accept-Language&#34;: &#34;en-us&#34;, &#34;Content-Type&#34;: &#34;application/json&#34; }. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> headers() {
        return Optional.ofNullable(this.headers);
    }
    /**
     * Rest API method for target endpoint.
     * 
    */
    public String method() {
        return this.method;
    }
    /**
     * Activity name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * When set to true, statusCode, output and error in callback request body will be consumed by activity. The activity can be marked as failed by setting statusCode &gt;= 400 in callback request. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> reportStatusOnCallBack() {
        return Optional.ofNullable(this.reportStatusOnCallBack);
    }
    /**
     * The timeout within which the webhook should be called back. If there is no value specified, it defaults to 10 minutes. Type: string. Pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * Type of activity.
     * Expected value is &#39;WebHook&#39;.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * WebHook activity target endpoint and path. Type: string (or Expression with resultType string).
     * 
    */
    public Object url() {
        return this.url;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> userProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebHookActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebActivityAuthenticationResponse authentication;
        private @Nullable Object body;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Object headers;
        private String method;
        private String name;
        private @Nullable Object reportStatusOnCallBack;
        private @Nullable String timeout;
        private String type;
        private Object url;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(WebHookActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.body = defaults.body;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.headers = defaults.headers;
    	      this.method = defaults.method;
    	      this.name = defaults.name;
    	      this.reportStatusOnCallBack = defaults.reportStatusOnCallBack;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder authentication(@Nullable WebActivityAuthenticationResponse authentication) {
            this.authentication = authentication;
            return this;
        }
        public Builder body(@Nullable Object body) {
            this.body = body;
            return this;
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder headers(@Nullable Object headers) {
            this.headers = headers;
            return this;
        }
        public Builder method(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder reportStatusOnCallBack(@Nullable Object reportStatusOnCallBack) {
            this.reportStatusOnCallBack = reportStatusOnCallBack;
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder url(Object url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }        public WebHookActivityResponse build() {
            return new WebHookActivityResponse(authentication, body, dependsOn, description, headers, method, name, reportStatusOnCallBack, timeout, type, url, userProperties);
        }
    }
}
