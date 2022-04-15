// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NamedPartitionSchemeDescriptionResponse {
    /**
     * The number of partitions.
     * 
     */
    private final Integer count;
    /**
     * Array of size specified by the ‘count’ parameter, for the names of the partitions.
     * 
     */
    private final List<String> names;
    /**
     * Enumerates the ways that a service can be partitioned.
     * Expected value is 'Named'.
     * 
     */
    private final String partitionScheme;

    @CustomType.Constructor
    private NamedPartitionSchemeDescriptionResponse(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("partitionScheme") String partitionScheme) {
        this.count = count;
        this.names = names;
        this.partitionScheme = partitionScheme;
    }

    /**
     * The number of partitions.
     * 
    */
    public Integer count() {
        return this.count;
    }
    /**
     * Array of size specified by the ‘count’ parameter, for the names of the partitions.
     * 
    */
    public List<String> names() {
        return this.names;
    }
    /**
     * Enumerates the ways that a service can be partitioned.
     * Expected value is 'Named'.
     * 
    */
    public String partitionScheme() {
        return this.partitionScheme;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamedPartitionSchemeDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private List<String> names;
        private String partitionScheme;

        public Builder() {
    	      // Empty
        }

        public Builder(NamedPartitionSchemeDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.names = defaults.names;
    	      this.partitionScheme = defaults.partitionScheme;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder partitionScheme(String partitionScheme) {
            this.partitionScheme = Objects.requireNonNull(partitionScheme);
            return this;
        }        public NamedPartitionSchemeDescriptionResponse build() {
            return new NamedPartitionSchemeDescriptionResponse(count, names, partitionScheme);
        }
    }
}
