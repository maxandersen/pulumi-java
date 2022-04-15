// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DistributionGroupListReceiverValueResponse {
    /**
     * The list of distribution groups.
     * 
     */
    private final @Nullable List<String> distributionGroups;

    @CustomType.Constructor
    private DistributionGroupListReceiverValueResponse(@CustomType.Parameter("distributionGroups") @Nullable List<String> distributionGroups) {
        this.distributionGroups = distributionGroups;
    }

    /**
     * The list of distribution groups.
     * 
    */
    public List<String> distributionGroups() {
        return this.distributionGroups == null ? List.of() : this.distributionGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionGroupListReceiverValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> distributionGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionGroupListReceiverValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionGroups = defaults.distributionGroups;
        }

        public Builder distributionGroups(@Nullable List<String> distributionGroups) {
            this.distributionGroups = distributionGroups;
            return this;
        }
        public Builder distributionGroups(String... distributionGroups) {
            return distributionGroups(List.of(distributionGroups));
        }        public DistributionGroupListReceiverValueResponse build() {
            return new DistributionGroupListReceiverValueResponse(distributionGroups);
        }
    }
}
