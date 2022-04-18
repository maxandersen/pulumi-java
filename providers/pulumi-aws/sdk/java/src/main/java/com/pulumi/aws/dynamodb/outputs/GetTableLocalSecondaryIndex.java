// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTableLocalSecondaryIndex {
    /**
     * The name of the DynamoDB table.
     * 
     */
    private final String name;
    private final List<String> nonKeyAttributes;
    private final String projectionType;
    private final String rangeKey;

    @CustomType.Constructor
    private GetTableLocalSecondaryIndex(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nonKeyAttributes") List<String> nonKeyAttributes,
        @CustomType.Parameter("projectionType") String projectionType,
        @CustomType.Parameter("rangeKey") String rangeKey) {
        this.name = name;
        this.nonKeyAttributes = nonKeyAttributes;
        this.projectionType = projectionType;
        this.rangeKey = rangeKey;
    }

    /**
     * The name of the DynamoDB table.
     * 
    */
    public String name() {
        return this.name;
    }
    public List<String> nonKeyAttributes() {
        return this.nonKeyAttributes;
    }
    public String projectionType() {
        return this.projectionType;
    }
    public String rangeKey() {
        return this.rangeKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableLocalSecondaryIndex defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> nonKeyAttributes;
        private String projectionType;
        private String rangeKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTableLocalSecondaryIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.nonKeyAttributes = defaults.nonKeyAttributes;
    	      this.projectionType = defaults.projectionType;
    	      this.rangeKey = defaults.rangeKey;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nonKeyAttributes(List<String> nonKeyAttributes) {
            this.nonKeyAttributes = Objects.requireNonNull(nonKeyAttributes);
            return this;
        }
        public Builder nonKeyAttributes(String... nonKeyAttributes) {
            return nonKeyAttributes(List.of(nonKeyAttributes));
        }
        public Builder projectionType(String projectionType) {
            this.projectionType = Objects.requireNonNull(projectionType);
            return this;
        }
        public Builder rangeKey(String rangeKey) {
            this.rangeKey = Objects.requireNonNull(rangeKey);
            return this;
        }        public GetTableLocalSecondaryIndex build() {
            return new GetTableLocalSecondaryIndex(name, nonKeyAttributes, projectionType, rangeKey);
        }
    }
}
