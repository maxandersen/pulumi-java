// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import com.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import com.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureFunctionActivityResponse {
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
     * Name of the Function that the Azure Function Activity will call. Type: string (or Expression with resultType string)
     * 
     */
    private final Object functionName;
    /**
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object headers;
    /**
     * Linked service reference.
     * 
     */
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
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
     * Activity policy.
     * 
     */
    private final @Nullable ActivityPolicyResponse policy;
    /**
     * Type of activity.
     * Expected value is 'AzureFunctionActivity'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @CustomType.Constructor
    private AzureFunctionActivityResponse(
        @CustomType.Parameter("body") @Nullable Object body,
        @CustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("functionName") Object functionName,
        @CustomType.Parameter("headers") @Nullable Object headers,
        @CustomType.Parameter("linkedServiceName") @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @CustomType.Parameter("method") String method,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policy") @Nullable ActivityPolicyResponse policy,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties) {
        this.body = body;
        this.dependsOn = dependsOn;
        this.description = description;
        this.functionName = functionName;
        this.headers = headers;
        this.linkedServiceName = linkedServiceName;
        this.method = method;
        this.name = name;
        this.policy = policy;
        this.type = type;
        this.userProperties = userProperties;
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
     * Name of the Function that the Azure Function Activity will call. Type: string (or Expression with resultType string)
     * 
    */
    public Object functionName() {
        return this.functionName;
    }
    /**
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> headers() {
        return Optional.ofNullable(this.headers);
    }
    /**
     * Linked service reference.
     * 
    */
    public Optional<LinkedServiceReferenceResponse> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
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
     * Activity policy.
     * 
    */
    public Optional<ActivityPolicyResponse> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * Type of activity.
     * Expected value is 'AzureFunctionActivity'.
     * 
    */
    public String type() {
        return this.type;
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

    public static Builder builder(AzureFunctionActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object body;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private Object functionName;
        private @Nullable Object headers;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String method;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFunctionActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.functionName = defaults.functionName;
    	      this.headers = defaults.headers;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.method = defaults.method;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
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
        public Builder functionName(Object functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }
        public Builder headers(@Nullable Object headers) {
            this.headers = headers;
            return this;
        }
        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
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
        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }        public AzureFunctionActivityResponse build() {
            return new AzureFunctionActivityResponse(body, dependsOn, description, functionName, headers, linkedServiceName, method, name, policy, type, userProperties);
        }
    }
}
