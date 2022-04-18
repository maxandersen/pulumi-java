// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.transfer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkflowTag {
    /**
     * The name assigned to the tag that you create.
     * 
     */
    private final String key;
    /**
     * Contains one or more values that you assigned to the key name you create.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private WorkflowTag(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * The name assigned to the tag that you create.
     * 
    */
    public String key() {
        return this.key;
    }
    /**
     * Contains one or more values that you assigned to the key name you create.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTag defaults) {
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
        }        public WorkflowTag build() {
            return new WorkflowTag(key, value);
        }
    }
}
