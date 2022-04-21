// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.tpu_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Sets the scheduling options for this node.
 * 
 */
public final class SchedulingConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final SchedulingConfigResponse Empty = new SchedulingConfigResponse();

    /**
     * Defines whether the node is preemptible.
     * 
     */
    @Import(name="preemptible", required=true)
    private Boolean preemptible;

    public Boolean preemptible() {
        return this.preemptible;
    }

    /**
     * Whether the node is created under a reservation.
     * 
     */
    @Import(name="reserved", required=true)
    private Boolean reserved;

    public Boolean reserved() {
        return this.reserved;
    }

    private SchedulingConfigResponse() {}

    private SchedulingConfigResponse(SchedulingConfigResponse $) {
        this.preemptible = $.preemptible;
        this.reserved = $.reserved;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchedulingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulingConfigResponse $;

        public Builder() {
            $ = new SchedulingConfigResponse();
        }

        public Builder(SchedulingConfigResponse defaults) {
            $ = new SchedulingConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder preemptible(Boolean preemptible) {
            $.preemptible = preemptible;
            return this;
        }

        public Builder reserved(Boolean reserved) {
            $.reserved = reserved;
            return this;
        }

        public SchedulingConfigResponse build() {
            $.preemptible = Objects.requireNonNull($.preemptible, "expected parameter 'preemptible' to be non-null");
            $.reserved = Objects.requireNonNull($.reserved, "expected parameter 'reserved' to be non-null");
            return $;
        }
    }

}
