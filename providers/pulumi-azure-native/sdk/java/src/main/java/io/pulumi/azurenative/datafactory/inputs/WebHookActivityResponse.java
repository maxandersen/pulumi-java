// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.azurenative.datafactory.inputs.WebActivityAuthenticationResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * WebHook activity.
 * 
 */
public final class WebHookActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebHookActivityResponse Empty = new WebHookActivityResponse();

    /**
     * Authentication method used for calling the endpoint.
     * 
     */
    @Import(name="authentication")
      private final @Nullable WebActivityAuthenticationResponse authentication;

    public Optional<WebActivityAuthenticationResponse> authentication() {
        return this.authentication == null ? Optional.empty() : Optional.ofNullable(this.authentication);
    }

    /**
     * Represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET method Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="body")
      private final @Nullable Object body;

    public Optional<Object> body() {
        return this.body == null ? Optional.empty() : Optional.ofNullable(this.body);
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> dependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="headers")
      private final @Nullable Object headers;

    public Optional<Object> headers() {
        return this.headers == null ? Optional.empty() : Optional.ofNullable(this.headers);
    }

    /**
     * Rest API method for target endpoint.
     * 
     */
    @Import(name="method", required=true)
      private final String method;

    public String method() {
        return this.method;
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * When set to true, statusCode, output and error in callback request body will be consumed by activity. The activity can be marked as failed by setting statusCode >= 400 in callback request. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="reportStatusOnCallBack")
      private final @Nullable Object reportStatusOnCallBack;

    public Optional<Object> reportStatusOnCallBack() {
        return this.reportStatusOnCallBack == null ? Optional.empty() : Optional.ofNullable(this.reportStatusOnCallBack);
    }

    /**
     * The timeout within which the webhook should be called back. If there is no value specified, it defaults to 10 minutes. Type: string. Pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="timeout")
      private final @Nullable String timeout;

    public Optional<String> timeout() {
        return this.timeout == null ? Optional.empty() : Optional.ofNullable(this.timeout);
    }

    /**
     * Type of activity.
     * Expected value is 'WebHook'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * WebHook activity target endpoint and path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="url", required=true)
      private final Object url;

    public Object url() {
        return this.url;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
      private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> userProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public WebHookActivityResponse(
        @Nullable WebActivityAuthenticationResponse authentication,
        @Nullable Object body,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable Object headers,
        String method,
        String name,
        @Nullable Object reportStatusOnCallBack,
        @Nullable String timeout,
        String type,
        Object url,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.authentication = authentication;
        this.body = body;
        this.dependsOn = dependsOn;
        this.description = description;
        this.headers = headers;
        this.method = Objects.requireNonNull(method, "expected parameter 'method' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.reportStatusOnCallBack = reportStatusOnCallBack;
        this.timeout = timeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.userProperties = userProperties;
    }

    private WebHookActivityResponse() {
        this.authentication = null;
        this.body = null;
        this.dependsOn = List.of();
        this.description = null;
        this.headers = null;
        this.method = null;
        this.name = null;
        this.reportStatusOnCallBack = null;
        this.timeout = null;
        this.type = null;
        this.url = null;
        this.userProperties = List.of();
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
