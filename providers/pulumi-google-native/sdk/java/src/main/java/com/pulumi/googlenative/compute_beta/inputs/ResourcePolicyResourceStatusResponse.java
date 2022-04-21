// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse;
import java.util.Objects;


/**
 * Contains output only fields. Use this sub-message for all output fields set on ResourcePolicy. The internal structure of this &#34;status&#34; field should mimic the structure of ResourcePolicy proto specification.
 * 
 */
public final class ResourcePolicyResourceStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyResourceStatusResponse Empty = new ResourcePolicyResourceStatusResponse();

    /**
     * Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
     * 
     */
    @Import(name="instanceSchedulePolicy", required=true)
    private ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy;

    public ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy() {
        return this.instanceSchedulePolicy;
    }

    private ResourcePolicyResourceStatusResponse() {}

    private ResourcePolicyResourceStatusResponse(ResourcePolicyResourceStatusResponse $) {
        this.instanceSchedulePolicy = $.instanceSchedulePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyResourceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyResourceStatusResponse $;

        public Builder() {
            $ = new ResourcePolicyResourceStatusResponse();
        }

        public Builder(ResourcePolicyResourceStatusResponse defaults) {
            $ = new ResourcePolicyResourceStatusResponse(Objects.requireNonNull(defaults));
        }

        public Builder instanceSchedulePolicy(ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy) {
            $.instanceSchedulePolicy = instanceSchedulePolicy;
            return this;
        }

        public ResourcePolicyResourceStatusResponse build() {
            $.instanceSchedulePolicy = Objects.requireNonNull($.instanceSchedulePolicy, "expected parameter 'instanceSchedulePolicy' to be non-null");
            return $;
        }
    }

}
