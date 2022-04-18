// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.outputs;

import com.pulumi.awsnative.s3.outputs.BucketRule;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BucketLifecycleConfiguration {
    /**
     * A lifecycle rule for individual objects in an Amazon S3 bucket.
     * 
     */
    private final List<BucketRule> rules;

    @CustomType.Constructor
    private BucketLifecycleConfiguration(@CustomType.Parameter("rules") List<BucketRule> rules) {
        this.rules = rules;
    }

    /**
     * A lifecycle rule for individual objects in an Amazon S3 bucket.
     * 
    */
    public List<BucketRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BucketRule> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        public Builder rules(List<BucketRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(BucketRule... rules) {
            return rules(List.of(rules));
        }        public BucketLifecycleConfiguration build() {
            return new BucketLifecycleConfiguration(rules);
        }
    }
}
