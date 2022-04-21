// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Autopilot is the configuration for Autopilot settings on the cluster.
 * 
 */
public final class AutopilotResponse extends com.pulumi.resources.InvokeArgs {

    public static final AutopilotResponse Empty = new AutopilotResponse();

    /**
     * Enable Autopilot
     * 
     */
    @Import(name="enabled", required=true)
    private Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    private AutopilotResponse() {}

    private AutopilotResponse(AutopilotResponse $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutopilotResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutopilotResponse $;

        public Builder() {
            $ = new AutopilotResponse();
        }

        public Builder(AutopilotResponse defaults) {
            $ = new AutopilotResponse(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public AutopilotResponse build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
