// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceGroupManagerAutoHealingPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerAutoHealingPolicyResponse Empty = new InstanceGroupManagerAutoHealingPolicyResponse();

    /**
     * The URL for the health check that signals autohealing.
     * 
     */
    @Import(name="healthCheck", required=true)
    private String healthCheck;

    public String healthCheck() {
        return this.healthCheck;
    }

    /**
     * The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. This initial delay allows instances to initialize and run their startup scripts before the instance group determines that they are UNHEALTHY. This prevents the managed instance group from recreating its instances prematurely. This value must be from range [0, 3600].
     * 
     */
    @Import(name="initialDelaySec", required=true)
    private Integer initialDelaySec;

    public Integer initialDelaySec() {
        return this.initialDelaySec;
    }

    private InstanceGroupManagerAutoHealingPolicyResponse() {}

    private InstanceGroupManagerAutoHealingPolicyResponse(InstanceGroupManagerAutoHealingPolicyResponse $) {
        this.healthCheck = $.healthCheck;
        this.initialDelaySec = $.initialDelaySec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerAutoHealingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerAutoHealingPolicyResponse $;

        public Builder() {
            $ = new InstanceGroupManagerAutoHealingPolicyResponse();
        }

        public Builder(InstanceGroupManagerAutoHealingPolicyResponse defaults) {
            $ = new InstanceGroupManagerAutoHealingPolicyResponse(Objects.requireNonNull(defaults));
        }

        public Builder healthCheck(String healthCheck) {
            $.healthCheck = healthCheck;
            return this;
        }

        public Builder initialDelaySec(Integer initialDelaySec) {
            $.initialDelaySec = initialDelaySec;
            return this;
        }

        public InstanceGroupManagerAutoHealingPolicyResponse build() {
            $.healthCheck = Objects.requireNonNull($.healthCheck, "expected parameter 'healthCheck' to be non-null");
            $.initialDelaySec = Objects.requireNonNull($.initialDelaySec, "expected parameter 'initialDelaySec' to be non-null");
            return $;
        }
    }

}
