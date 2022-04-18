// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AssociationTarget {
    /**
     * Either `InstanceIds` or `tag:Tag Name` to specify an EC2 tag.
     * 
     */
    private final String key;
    /**
     * A list of instance IDs or tag values. AWS currently limits this list size to one value.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private AssociationTarget(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("values") List<String> values) {
        this.key = key;
        this.values = values;
    }

    /**
     * Either `InstanceIds` or `tag:Tag Name` to specify an EC2 tag.
     * 
    */
    public String key() {
        return this.key;
    }
    /**
     * A list of instance IDs or tag values. AWS currently limits this list size to one value.
     * 
    */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssociationTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(AssociationTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public AssociationTarget build() {
            return new AssociationTarget(key, values);
        }
    }
}
