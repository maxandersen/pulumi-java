// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SingletonPartitionSchemeDescriptionResponse {
    /**
     * Enumerates the ways that a service can be partitioned.
     * Expected value is 'Singleton'.
     * 
     */
    private final String partitionScheme;

    @CustomType.Constructor
    private SingletonPartitionSchemeDescriptionResponse(@CustomType.Parameter("partitionScheme") String partitionScheme) {
        this.partitionScheme = partitionScheme;
    }

    /**
     * Enumerates the ways that a service can be partitioned.
     * Expected value is 'Singleton'.
     * 
    */
    public String partitionScheme() {
        return this.partitionScheme;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SingletonPartitionSchemeDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String partitionScheme;

        public Builder() {
    	      // Empty
        }

        public Builder(SingletonPartitionSchemeDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionScheme = defaults.partitionScheme;
        }

        public Builder partitionScheme(String partitionScheme) {
            this.partitionScheme = Objects.requireNonNull(partitionScheme);
            return this;
        }        public SingletonPartitionSchemeDescriptionResponse build() {
            return new SingletonPartitionSchemeDescriptionResponse(partitionScheme);
        }
    }
}
