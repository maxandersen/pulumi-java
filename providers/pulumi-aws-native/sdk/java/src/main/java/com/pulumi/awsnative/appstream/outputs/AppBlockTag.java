// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appstream.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AppBlockTag {
    private final String tagKey;
    private final String tagValue;

    @CustomType.Constructor
    private AppBlockTag(
        @CustomType.Parameter("tagKey") String tagKey,
        @CustomType.Parameter("tagValue") String tagValue) {
        this.tagKey = tagKey;
        this.tagValue = tagValue;
    }

    public String tagKey() {
        return this.tagKey;
    }
    public String tagValue() {
        return this.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppBlockTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tagKey;
        private String tagValue;

        public Builder() {
    	      // Empty
        }

        public Builder(AppBlockTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagKey = defaults.tagKey;
    	      this.tagValue = defaults.tagValue;
        }

        public Builder tagKey(String tagKey) {
            this.tagKey = Objects.requireNonNull(tagKey);
            return this;
        }
        public Builder tagValue(String tagValue) {
            this.tagValue = Objects.requireNonNull(tagValue);
            return this;
        }        public AppBlockTag build() {
            return new AppBlockTag(tagKey, tagValue);
        }
    }
}
