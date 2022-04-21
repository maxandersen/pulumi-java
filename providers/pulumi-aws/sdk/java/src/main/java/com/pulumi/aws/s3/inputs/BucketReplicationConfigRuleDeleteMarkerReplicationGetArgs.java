// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs Empty = new BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs();

    /**
     * Whether delete markers should be replicated. Either `&#34;Enabled&#34;` or `&#34;Disabled&#34;`.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }

    private BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs() {}

    private BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs(BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs $) {
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs $;

        public Builder() {
            $ = new BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs();
        }

        public Builder(BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs defaults) {
            $ = new BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public BucketReplicationConfigRuleDeleteMarkerReplicationGetArgs build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
