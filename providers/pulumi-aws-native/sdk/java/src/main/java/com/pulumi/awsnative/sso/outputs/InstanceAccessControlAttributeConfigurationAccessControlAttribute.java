// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sso.outputs;

import com.pulumi.awsnative.sso.outputs.InstanceAccessControlAttributeConfigurationAccessControlAttributeValue;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceAccessControlAttributeConfigurationAccessControlAttribute {
    private final String key;
    private final InstanceAccessControlAttributeConfigurationAccessControlAttributeValue value;

    @CustomType.Constructor
    private InstanceAccessControlAttributeConfigurationAccessControlAttribute(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") InstanceAccessControlAttributeConfigurationAccessControlAttributeValue value) {
        this.key = key;
        this.value = value;
    }

    public String key() {
        return this.key;
    }
    public InstanceAccessControlAttributeConfigurationAccessControlAttributeValue value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAccessControlAttributeConfigurationAccessControlAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private InstanceAccessControlAttributeConfigurationAccessControlAttributeValue value;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAccessControlAttributeConfigurationAccessControlAttribute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(InstanceAccessControlAttributeConfigurationAccessControlAttributeValue value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public InstanceAccessControlAttributeConfigurationAccessControlAttribute build() {
            return new InstanceAccessControlAttributeConfigurationAccessControlAttribute(key, value);
        }
    }
}
