// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.memorydb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SubnetGroupTag {
    /**
     * The key for the tag. May not be null.
     * 
     */
    private final String key;
    /**
     * The tag's value. May be null.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private SubnetGroupTag(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * The key for the tag. May not be null.
     * 
    */
    public String key() {
        return this.key;
    }
    /**
     * The tag's value. May be null.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetGroupTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetGroupTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public SubnetGroupTag build() {
            return new SubnetGroupTag(key, value);
        }
    }
}
