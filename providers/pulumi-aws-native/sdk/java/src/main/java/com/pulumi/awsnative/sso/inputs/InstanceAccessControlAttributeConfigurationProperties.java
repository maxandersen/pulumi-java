// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sso.inputs;

import com.pulumi.awsnative.sso.inputs.InstanceAccessControlAttributeConfigurationAccessControlAttribute;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * The InstanceAccessControlAttributeConfiguration property has been deprecated but is still supported for backwards compatibility purposes. We recomend that you use  AccessControlAttributes property instead.
 * 
 */
public final class InstanceAccessControlAttributeConfigurationProperties extends com.pulumi.resources.InvokeArgs {

    public static final InstanceAccessControlAttributeConfigurationProperties Empty = new InstanceAccessControlAttributeConfigurationProperties();

    @Import(name="accessControlAttributes", required=true)
      private final List<InstanceAccessControlAttributeConfigurationAccessControlAttribute> accessControlAttributes;

    public List<InstanceAccessControlAttributeConfigurationAccessControlAttribute> accessControlAttributes() {
        return this.accessControlAttributes;
    }

    public InstanceAccessControlAttributeConfigurationProperties(List<InstanceAccessControlAttributeConfigurationAccessControlAttribute> accessControlAttributes) {
        this.accessControlAttributes = Objects.requireNonNull(accessControlAttributes, "expected parameter 'accessControlAttributes' to be non-null");
    }

    private InstanceAccessControlAttributeConfigurationProperties() {
        this.accessControlAttributes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAccessControlAttributeConfigurationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<InstanceAccessControlAttributeConfigurationAccessControlAttribute> accessControlAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAccessControlAttributeConfigurationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlAttributes = defaults.accessControlAttributes;
        }

        public Builder accessControlAttributes(List<InstanceAccessControlAttributeConfigurationAccessControlAttribute> accessControlAttributes) {
            this.accessControlAttributes = Objects.requireNonNull(accessControlAttributes);
            return this;
        }
        public Builder accessControlAttributes(InstanceAccessControlAttributeConfigurationAccessControlAttribute... accessControlAttributes) {
            return accessControlAttributes(List.of(accessControlAttributes));
        }        public InstanceAccessControlAttributeConfigurationProperties build() {
            return new InstanceAccessControlAttributeConfigurationProperties(accessControlAttributes);
        }
    }
}
