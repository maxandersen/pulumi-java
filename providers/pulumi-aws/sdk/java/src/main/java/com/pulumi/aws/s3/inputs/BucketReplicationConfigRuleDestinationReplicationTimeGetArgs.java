// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class BucketReplicationConfigRuleDestinationReplicationTimeGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleDestinationReplicationTimeGetArgs Empty = new BucketReplicationConfigRuleDestinationReplicationTimeGetArgs();

    /**
     * The status of the Replication Time Control. Either `&#34;Enabled&#34;` or `&#34;Disabled&#34;`.
     * 
     */
    @Import(name="status", required=true)
      private final Output<String> status;

    public Output<String> status() {
        return this.status;
    }

    /**
     * A configuration block specifying the time by which replication should be complete for all objects and operations on objects documented below.
     * 
     */
    @Import(name="time", required=true)
      private final Output<BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs> time;

    public Output<BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs> time() {
        return this.time;
    }

    public BucketReplicationConfigRuleDestinationReplicationTimeGetArgs(
        Output<String> status,
        Output<BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs> time) {
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.time = Objects.requireNonNull(time, "expected parameter 'time' to be non-null");
    }

    private BucketReplicationConfigRuleDestinationReplicationTimeGetArgs() {
        this.status = Codegen.empty();
        this.time = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationReplicationTimeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> status;
        private Output<BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs> time;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationReplicationTimeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.time = defaults.time;
        }

        public Builder status(Output<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(String status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }
        public Builder time(Output<BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs> time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }
        public Builder time(BucketReplicationConfigRuleDestinationReplicationTimeTimeGetArgs time) {
            this.time = Output.of(Objects.requireNonNull(time));
            return this;
        }        public BucketReplicationConfigRuleDestinationReplicationTimeGetArgs build() {
            return new BucketReplicationConfigRuleDestinationReplicationTimeGetArgs(status, time);
        }
    }
}
