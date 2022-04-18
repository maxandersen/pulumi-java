// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3outposts.outputs;

import com.pulumi.awsnative.s3outposts.outputs.BucketFilterAndOperator;
import com.pulumi.awsnative.s3outposts.outputs.BucketFilterTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketRuleFilterProperties {
    /**
     * The container for the AND condition for the lifecycle rule. A combination of Prefix and 1 or more Tags OR a minimum of 2 or more tags.
     * 
     */
    private final @Nullable BucketFilterAndOperator andOperator;
    /**
     * Object key prefix that identifies one or more objects to which this rule applies.
     * 
     */
    private final @Nullable String prefix;
    /**
     * Specifies a tag used to identify a subset of objects for an Amazon S3Outposts bucket.
     * 
     */
    private final @Nullable BucketFilterTag tag;

    @CustomType.Constructor
    private BucketRuleFilterProperties(
        @CustomType.Parameter("andOperator") @Nullable BucketFilterAndOperator andOperator,
        @CustomType.Parameter("prefix") @Nullable String prefix,
        @CustomType.Parameter("tag") @Nullable BucketFilterTag tag) {
        this.andOperator = andOperator;
        this.prefix = prefix;
        this.tag = tag;
    }

    /**
     * The container for the AND condition for the lifecycle rule. A combination of Prefix and 1 or more Tags OR a minimum of 2 or more tags.
     * 
    */
    public Optional<BucketFilterAndOperator> andOperator() {
        return Optional.ofNullable(this.andOperator);
    }
    /**
     * Object key prefix that identifies one or more objects to which this rule applies.
     * 
    */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * Specifies a tag used to identify a subset of objects for an Amazon S3Outposts bucket.
     * 
    */
    public Optional<BucketFilterTag> tag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRuleFilterProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketFilterAndOperator andOperator;
        private @Nullable String prefix;
        private @Nullable BucketFilterTag tag;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRuleFilterProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andOperator = defaults.andOperator;
    	      this.prefix = defaults.prefix;
    	      this.tag = defaults.tag;
        }

        public Builder andOperator(@Nullable BucketFilterAndOperator andOperator) {
            this.andOperator = andOperator;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder tag(@Nullable BucketFilterTag tag) {
            this.tag = tag;
            return this;
        }        public BucketRuleFilterProperties build() {
            return new BucketRuleFilterProperties(andOperator, prefix, tag);
        }
    }
}
