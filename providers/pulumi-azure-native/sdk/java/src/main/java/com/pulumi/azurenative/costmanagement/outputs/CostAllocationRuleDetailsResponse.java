// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.outputs;

import com.pulumi.azurenative.costmanagement.outputs.SourceCostAllocationResourceResponse;
import com.pulumi.azurenative.costmanagement.outputs.TargetCostAllocationResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CostAllocationRuleDetailsResponse {
    /**
     * Source resources for cost allocation. At this time, this list can contain no more than one element.
     * 
     */
    private final @Nullable List<SourceCostAllocationResourceResponse> sourceResources;
    /**
     * Target resources for cost allocation. At this time, this list can contain no more than one element.
     * 
     */
    private final @Nullable List<TargetCostAllocationResourceResponse> targetResources;

    @CustomType.Constructor
    private CostAllocationRuleDetailsResponse(
        @CustomType.Parameter("sourceResources") @Nullable List<SourceCostAllocationResourceResponse> sourceResources,
        @CustomType.Parameter("targetResources") @Nullable List<TargetCostAllocationResourceResponse> targetResources) {
        this.sourceResources = sourceResources;
        this.targetResources = targetResources;
    }

    /**
     * Source resources for cost allocation. At this time, this list can contain no more than one element.
     * 
    */
    public List<SourceCostAllocationResourceResponse> sourceResources() {
        return this.sourceResources == null ? List.of() : this.sourceResources;
    }
    /**
     * Target resources for cost allocation. At this time, this list can contain no more than one element.
     * 
    */
    public List<TargetCostAllocationResourceResponse> targetResources() {
        return this.targetResources == null ? List.of() : this.targetResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CostAllocationRuleDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SourceCostAllocationResourceResponse> sourceResources;
        private @Nullable List<TargetCostAllocationResourceResponse> targetResources;

        public Builder() {
    	      // Empty
        }

        public Builder(CostAllocationRuleDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceResources = defaults.sourceResources;
    	      this.targetResources = defaults.targetResources;
        }

        public Builder sourceResources(@Nullable List<SourceCostAllocationResourceResponse> sourceResources) {
            this.sourceResources = sourceResources;
            return this;
        }
        public Builder sourceResources(SourceCostAllocationResourceResponse... sourceResources) {
            return sourceResources(List.of(sourceResources));
        }
        public Builder targetResources(@Nullable List<TargetCostAllocationResourceResponse> targetResources) {
            this.targetResources = targetResources;
            return this;
        }
        public Builder targetResources(TargetCostAllocationResourceResponse... targetResources) {
            return targetResources(List.of(targetResources));
        }        public CostAllocationRuleDetailsResponse build() {
            return new CostAllocationRuleDetailsResponse(sourceResources, targetResources);
        }
    }
}
