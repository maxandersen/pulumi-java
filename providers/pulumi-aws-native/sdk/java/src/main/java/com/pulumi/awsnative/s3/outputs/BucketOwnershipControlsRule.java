// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.outputs;

import com.pulumi.awsnative.s3.enums.BucketOwnershipControlsRuleObjectOwnership;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketOwnershipControlsRule {
    /**
     * @return Specifies an object ownership rule.
     * 
     */
    private final @Nullable BucketOwnershipControlsRuleObjectOwnership objectOwnership;

    @CustomType.Constructor
    private BucketOwnershipControlsRule(@CustomType.Parameter("objectOwnership") @Nullable BucketOwnershipControlsRuleObjectOwnership objectOwnership) {
        this.objectOwnership = objectOwnership;
    }

    /**
     * @return Specifies an object ownership rule.
     * 
     */
    public Optional<BucketOwnershipControlsRuleObjectOwnership> objectOwnership() {
        return Optional.ofNullable(this.objectOwnership);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketOwnershipControlsRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketOwnershipControlsRuleObjectOwnership objectOwnership;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketOwnershipControlsRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectOwnership = defaults.objectOwnership;
        }

        public Builder objectOwnership(@Nullable BucketOwnershipControlsRuleObjectOwnership objectOwnership) {
            this.objectOwnership = objectOwnership;
            return this;
        }        public BucketOwnershipControlsRule build() {
            return new BucketOwnershipControlsRule(objectOwnership);
        }
    }
}
