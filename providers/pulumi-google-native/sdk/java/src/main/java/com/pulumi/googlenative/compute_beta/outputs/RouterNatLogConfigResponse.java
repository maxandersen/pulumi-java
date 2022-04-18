// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RouterNatLogConfigResponse {
    /**
     * Indicates whether or not to export logs. This is false by default.
     * 
     */
    private final Boolean enable;
    /**
     * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values: - ERRORS_ONLY: Export logs only for connection failures. - TRANSLATIONS_ONLY: Export logs only for successful connections. - ALL: Export logs for all connections, successful and unsuccessful.
     * 
     */
    private final String filter;

    @CustomType.Constructor
    private RouterNatLogConfigResponse(
        @CustomType.Parameter("enable") Boolean enable,
        @CustomType.Parameter("filter") String filter) {
        this.enable = enable;
        this.filter = filter;
    }

    /**
     * Indicates whether or not to export logs. This is false by default.
     * 
    */
    public Boolean enable() {
        return this.enable;
    }
    /**
     * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values: - ERRORS_ONLY: Export logs only for connection failures. - TRANSLATIONS_ONLY: Export logs only for successful connections. - ALL: Export logs for all connections, successful and unsuccessful.
     * 
    */
    public String filter() {
        return this.filter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;
        private String filter;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.filter = defaults.filter;
        }

        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }        public RouterNatLogConfigResponse build() {
            return new RouterNatLogConfigResponse(enable, filter);
        }
    }
}
