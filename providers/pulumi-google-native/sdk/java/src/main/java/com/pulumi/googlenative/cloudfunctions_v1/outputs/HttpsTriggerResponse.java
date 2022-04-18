// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HttpsTriggerResponse {
    /**
     * The security level for the function.
     * 
     */
    private final String securityLevel;
    /**
     * The deployed url for the function.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private HttpsTriggerResponse(
        @CustomType.Parameter("securityLevel") String securityLevel,
        @CustomType.Parameter("url") String url) {
        this.securityLevel = securityLevel;
        this.url = url;
    }

    /**
     * The security level for the function.
     * 
    */
    public String securityLevel() {
        return this.securityLevel;
    }
    /**
     * The deployed url for the function.
     * 
    */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpsTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String securityLevel;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpsTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityLevel = defaults.securityLevel;
    	      this.url = defaults.url;
        }

        public Builder securityLevel(String securityLevel) {
            this.securityLevel = Objects.requireNonNull(securityLevel);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public HttpsTriggerResponse build() {
            return new HttpsTriggerResponse(securityLevel, url);
        }
    }
}
