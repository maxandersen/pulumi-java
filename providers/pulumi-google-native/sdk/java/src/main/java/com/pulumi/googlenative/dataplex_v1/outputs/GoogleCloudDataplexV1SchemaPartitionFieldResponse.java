// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDataplexV1SchemaPartitionFieldResponse {
    /**
     * @return Partition field name must consist of letters, numbers, and underscores only, with a maximum of length of 256 characters, and must begin with a letter or underscore..
     * 
     */
    private final String name;
    /**
     * @return Immutable. The type of field.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GoogleCloudDataplexV1SchemaPartitionFieldResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * @return Partition field name must consist of letters, numbers, and underscores only, with a maximum of length of 256 characters, and must begin with a letter or underscore..
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Immutable. The type of field.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDataplexV1SchemaPartitionFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDataplexV1SchemaPartitionFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudDataplexV1SchemaPartitionFieldResponse build() {
            return new GoogleCloudDataplexV1SchemaPartitionFieldResponse(name, type);
        }
    }
}
