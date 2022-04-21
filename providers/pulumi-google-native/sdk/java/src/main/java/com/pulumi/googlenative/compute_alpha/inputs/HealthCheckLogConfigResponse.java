// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration of logging on a health check. If logging is enabled, logs will be exported to Stackdriver.
 * 
 */
public final class HealthCheckLogConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final HealthCheckLogConfigResponse Empty = new HealthCheckLogConfigResponse();

    /**
     * Indicates whether or not to export logs. This is false by default, which means no health check logging will be done.
     * 
     */
    @Import(name="enable", required=true)
    private Boolean enable;

    public Boolean enable() {
        return this.enable;
    }

    private HealthCheckLogConfigResponse() {}

    private HealthCheckLogConfigResponse(HealthCheckLogConfigResponse $) {
        this.enable = $.enable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HealthCheckLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HealthCheckLogConfigResponse $;

        public Builder() {
            $ = new HealthCheckLogConfigResponse();
        }

        public Builder(HealthCheckLogConfigResponse defaults) {
            $ = new HealthCheckLogConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder enable(Boolean enable) {
            $.enable = enable;
            return this;
        }

        public HealthCheckLogConfigResponse build() {
            $.enable = Objects.requireNonNull($.enable, "expected parameter 'enable' to be non-null");
            return $;
        }
    }

}
