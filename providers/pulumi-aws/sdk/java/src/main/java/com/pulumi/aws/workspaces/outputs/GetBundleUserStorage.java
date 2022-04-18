// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.workspaces.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBundleUserStorage {
    /**
     * The size of the user storage.
     * 
     */
    private final String capacity;

    @CustomType.Constructor
    private GetBundleUserStorage(@CustomType.Parameter("capacity") String capacity) {
        this.capacity = capacity;
    }

    /**
     * The size of the user storage.
     * 
    */
    public String capacity() {
        return this.capacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBundleUserStorage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String capacity;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBundleUserStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
        }

        public Builder capacity(String capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }        public GetBundleUserStorage build() {
            return new GetBundleUserStorage(capacity);
        }
    }
}
