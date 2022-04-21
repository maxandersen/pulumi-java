// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deploymentmanager.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * ApiKey authentication gives a name and a value that can be included in either the request header or query parameters.
 * 
 */
public final class ApiKeyAuthenticationResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApiKeyAuthenticationResponse Empty = new ApiKeyAuthenticationResponse();

    /**
     * The location of the authentication key/value pair in the request.
     * 
     */
    @Import(name="in", required=true)
    private String in;

    public String in() {
        return this.in;
    }

    /**
     * The key name of the authentication key/value pair.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The authentication type.
     * Expected value is &#39;ApiKey&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * The value of the authentication key/value pair.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private ApiKeyAuthenticationResponse() {}

    private ApiKeyAuthenticationResponse(ApiKeyAuthenticationResponse $) {
        this.in = $.in;
        this.name = $.name;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiKeyAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiKeyAuthenticationResponse $;

        public Builder() {
            $ = new ApiKeyAuthenticationResponse();
        }

        public Builder(ApiKeyAuthenticationResponse defaults) {
            $ = new ApiKeyAuthenticationResponse(Objects.requireNonNull(defaults));
        }

        public Builder in(String in) {
            $.in = in;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public ApiKeyAuthenticationResponse build() {
            $.in = Objects.requireNonNull($.in, "expected parameter 'in' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
