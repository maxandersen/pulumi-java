// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.testing_v1.inputs.TestTargetsForShardArgs;
import java.util.List;
import java.util.Objects;


/**
 * Shards test cases into the specified groups of packages, classes, and/or methods. With manual sharding enabled, specifying test targets via environment_variables or in InstrumentationTest is invalid.
 * 
 */
public final class ManualShardingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManualShardingArgs Empty = new ManualShardingArgs();

    /**
     * Group of packages, classes, and/or test methods to be run for each shard. When any physical devices are selected, the number of test_targets_for_shard must be &gt;= 1 and &lt;= 50. When no physical devices are selected, the number must be &gt;= 1 and &lt;= 500.
     * 
     */
    @Import(name="testTargetsForShard", required=true)
      private final Output<List<TestTargetsForShardArgs>> testTargetsForShard;

    public Output<List<TestTargetsForShardArgs>> testTargetsForShard() {
        return this.testTargetsForShard;
    }

    public ManualShardingArgs(Output<List<TestTargetsForShardArgs>> testTargetsForShard) {
        this.testTargetsForShard = Objects.requireNonNull(testTargetsForShard, "expected parameter 'testTargetsForShard' to be non-null");
    }

    private ManualShardingArgs() {
        this.testTargetsForShard = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManualShardingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<TestTargetsForShardArgs>> testTargetsForShard;

        public Builder() {
    	      // Empty
        }

        public Builder(ManualShardingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.testTargetsForShard = defaults.testTargetsForShard;
        }

        public Builder testTargetsForShard(Output<List<TestTargetsForShardArgs>> testTargetsForShard) {
            this.testTargetsForShard = Objects.requireNonNull(testTargetsForShard);
            return this;
        }
        public Builder testTargetsForShard(List<TestTargetsForShardArgs> testTargetsForShard) {
            this.testTargetsForShard = Output.of(Objects.requireNonNull(testTargetsForShard));
            return this;
        }
        public Builder testTargetsForShard(TestTargetsForShardArgs... testTargetsForShard) {
            return testTargetsForShard(List.of(testTargetsForShard));
        }        public ManualShardingArgs build() {
            return new ManualShardingArgs(testTargetsForShard);
        }
    }
}
