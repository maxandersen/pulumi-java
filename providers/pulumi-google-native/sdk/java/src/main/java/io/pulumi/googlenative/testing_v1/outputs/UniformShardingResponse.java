// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class UniformShardingResponse {
    /**
     * Total number of shards. When any physical devices are selected, the number must be >= 1 and <= 50. When no physical devices are selected, the number must be >= 1 and <= 500.
     * 
     */
    private final Integer numShards;

    @CustomType.Constructor
    private UniformShardingResponse(@CustomType.Parameter("numShards") Integer numShards) {
        this.numShards = numShards;
    }

    /**
     * Total number of shards. When any physical devices are selected, the number must be >= 1 and <= 50. When no physical devices are selected, the number must be >= 1 and <= 500.
     * 
    */
    public Integer numShards() {
        return this.numShards;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UniformShardingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer numShards;

        public Builder() {
    	      // Empty
        }

        public Builder(UniformShardingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numShards = defaults.numShards;
        }

        public Builder numShards(Integer numShards) {
            this.numShards = Objects.requireNonNull(numShards);
            return this;
        }        public UniformShardingResponse build() {
            return new UniformShardingResponse(numShards);
        }
    }
}
