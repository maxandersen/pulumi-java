// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the horizontal auto scaling mechanism that adds or removes replicas (containers or container groups).
 * 
 */
public final class AddRemoveReplicaScalingMechanismResponse extends com.pulumi.resources.InvokeArgs {

    public static final AddRemoveReplicaScalingMechanismResponse Empty = new AddRemoveReplicaScalingMechanismResponse();

    /**
     * Enumerates the mechanisms for auto scaling.
     * Expected value is &#39;AddRemoveReplica&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * Maximum number of containers (scale up won&#39;t be performed above this number).
     * 
     */
    @Import(name="maxCount", required=true)
    private Integer maxCount;

    public Integer maxCount() {
        return this.maxCount;
    }

    /**
     * Minimum number of containers (scale down won&#39;t be performed below this number).
     * 
     */
    @Import(name="minCount", required=true)
    private Integer minCount;

    public Integer minCount() {
        return this.minCount;
    }

    /**
     * Each time auto scaling is performed, this number of containers will be added or removed.
     * 
     */
    @Import(name="scaleIncrement", required=true)
    private Integer scaleIncrement;

    public Integer scaleIncrement() {
        return this.scaleIncrement;
    }

    private AddRemoveReplicaScalingMechanismResponse() {}

    private AddRemoveReplicaScalingMechanismResponse(AddRemoveReplicaScalingMechanismResponse $) {
        this.kind = $.kind;
        this.maxCount = $.maxCount;
        this.minCount = $.minCount;
        this.scaleIncrement = $.scaleIncrement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddRemoveReplicaScalingMechanismResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddRemoveReplicaScalingMechanismResponse $;

        public Builder() {
            $ = new AddRemoveReplicaScalingMechanismResponse();
        }

        public Builder(AddRemoveReplicaScalingMechanismResponse defaults) {
            $ = new AddRemoveReplicaScalingMechanismResponse(Objects.requireNonNull(defaults));
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public Builder maxCount(Integer maxCount) {
            $.maxCount = maxCount;
            return this;
        }

        public Builder minCount(Integer minCount) {
            $.minCount = minCount;
            return this;
        }

        public Builder scaleIncrement(Integer scaleIncrement) {
            $.scaleIncrement = scaleIncrement;
            return this;
        }

        public AddRemoveReplicaScalingMechanismResponse build() {
            $.kind = Codegen.stringProp("kind").arg($.kind).require();
            $.maxCount = Objects.requireNonNull($.maxCount, "expected parameter 'maxCount' to be non-null");
            $.minCount = Objects.requireNonNull($.minCount, "expected parameter 'minCount' to be non-null");
            $.scaleIncrement = Objects.requireNonNull($.scaleIncrement, "expected parameter 'scaleIncrement' to be non-null");
            return $;
        }
    }

}
