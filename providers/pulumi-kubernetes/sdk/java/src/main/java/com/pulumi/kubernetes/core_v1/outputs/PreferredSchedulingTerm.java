// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.NodeSelectorTerm;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class PreferredSchedulingTerm {
    /**
     * @return A node selector term, associated with the corresponding weight.
     * 
     */
    private final NodeSelectorTerm preference;
    /**
     * @return Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
     * 
     */
    private final Integer weight;

    @CustomType.Constructor
    private PreferredSchedulingTerm(
        @CustomType.Parameter("preference") NodeSelectorTerm preference,
        @CustomType.Parameter("weight") Integer weight) {
        this.preference = preference;
        this.weight = weight;
    }

    /**
     * @return A node selector term, associated with the corresponding weight.
     * 
     */
    public NodeSelectorTerm preference() {
        return this.preference;
    }
    /**
     * @return Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreferredSchedulingTerm defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeSelectorTerm preference;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(PreferredSchedulingTerm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preference = defaults.preference;
    	      this.weight = defaults.weight;
        }

        public Builder preference(NodeSelectorTerm preference) {
            this.preference = Objects.requireNonNull(preference);
            return this;
        }
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }        public PreferredSchedulingTerm build() {
            return new PreferredSchedulingTerm(preference, weight);
        }
    }
}
