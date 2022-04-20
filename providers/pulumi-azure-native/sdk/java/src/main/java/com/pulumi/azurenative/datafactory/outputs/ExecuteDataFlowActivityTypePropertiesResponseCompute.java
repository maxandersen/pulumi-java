// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExecuteDataFlowActivityTypePropertiesResponseCompute {
    /**
     * Compute type of the cluster which will execute data flow job. Possible values include: &#39;General&#39;, &#39;MemoryOptimized&#39;, &#39;ComputeOptimized&#39;. Type: string (or Expression with resultType string)
     * 
     */
    private final @Nullable Object computeType;
    /**
     * Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272. Type: integer (or Expression with resultType integer)
     * 
     */
    private final @Nullable Object coreCount;

    @CustomType.Constructor
    private ExecuteDataFlowActivityTypePropertiesResponseCompute(
        @CustomType.Parameter("computeType") @Nullable Object computeType,
        @CustomType.Parameter("coreCount") @Nullable Object coreCount) {
        this.computeType = computeType;
        this.coreCount = coreCount;
    }

    /**
     * Compute type of the cluster which will execute data flow job. Possible values include: &#39;General&#39;, &#39;MemoryOptimized&#39;, &#39;ComputeOptimized&#39;. Type: string (or Expression with resultType string)
     * 
    */
    public Optional<Object> computeType() {
        return Optional.ofNullable(this.computeType);
    }
    /**
     * Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272. Type: integer (or Expression with resultType integer)
     * 
    */
    public Optional<Object> coreCount() {
        return Optional.ofNullable(this.coreCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecuteDataFlowActivityTypePropertiesResponseCompute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object computeType;
        private @Nullable Object coreCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecuteDataFlowActivityTypePropertiesResponseCompute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeType = defaults.computeType;
    	      this.coreCount = defaults.coreCount;
        }

        public Builder computeType(@Nullable Object computeType) {
            this.computeType = computeType;
            return this;
        }
        public Builder coreCount(@Nullable Object coreCount) {
            this.coreCount = coreCount;
            return this;
        }        public ExecuteDataFlowActivityTypePropertiesResponseCompute build() {
            return new ExecuteDataFlowActivityTypePropertiesResponseCompute(computeType, coreCount);
        }
    }
}
