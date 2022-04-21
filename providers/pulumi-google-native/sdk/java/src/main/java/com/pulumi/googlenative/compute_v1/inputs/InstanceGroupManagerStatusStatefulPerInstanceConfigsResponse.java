// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse extends com.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse Empty = new InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse();

    /**
     * A bit indicating if all of the group&#39;s per-instance configs (listed in the output of a listPerInstanceConfigs API call) have status EFFECTIVE or there are no per-instance-configs.
     * 
     */
    @Import(name="allEffective", required=true)
    private Boolean allEffective;

    public Boolean allEffective() {
        return this.allEffective;
    }

    private InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse() {}

    private InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse(InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse $) {
        this.allEffective = $.allEffective;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse $;

        public Builder() {
            $ = new InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse();
        }

        public Builder(InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse defaults) {
            $ = new InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse(Objects.requireNonNull(defaults));
        }

        public Builder allEffective(Boolean allEffective) {
            $.allEffective = allEffective;
            return this;
        }

        public InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse build() {
            $.allEffective = Objects.requireNonNull($.allEffective, "expected parameter 'allEffective' to be non-null");
            return $;
        }
    }

}
