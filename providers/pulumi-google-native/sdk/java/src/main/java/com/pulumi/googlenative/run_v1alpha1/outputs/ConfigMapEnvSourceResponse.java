// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run_v1alpha1.outputs.LocalObjectReferenceResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConfigMapEnvSourceResponse {
    /**
     * This field should not be used directly as it is meant to be inlined directly into the message. Use the "name" field instead.
     * 
     */
    private final LocalObjectReferenceResponse localObjectReference;
    /**
     * The ConfigMap to select from.
     * 
     */
    private final String name;
    /**
     * (Optional) Specify whether the ConfigMap must be defined
     * 
     */
    private final Boolean optional;

    @CustomType.Constructor
    private ConfigMapEnvSourceResponse(
        @CustomType.Parameter("localObjectReference") LocalObjectReferenceResponse localObjectReference,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("optional") Boolean optional) {
        this.localObjectReference = localObjectReference;
        this.name = name;
        this.optional = optional;
    }

    /**
     * This field should not be used directly as it is meant to be inlined directly into the message. Use the "name" field instead.
     * 
    */
    public LocalObjectReferenceResponse localObjectReference() {
        return this.localObjectReference;
    }
    /**
     * The ConfigMap to select from.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * (Optional) Specify whether the ConfigMap must be defined
     * 
    */
    public Boolean optional() {
        return this.optional;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigMapEnvSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalObjectReferenceResponse localObjectReference;
        private String name;
        private Boolean optional;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigMapEnvSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localObjectReference = defaults.localObjectReference;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder localObjectReference(LocalObjectReferenceResponse localObjectReference) {
            this.localObjectReference = Objects.requireNonNull(localObjectReference);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder optional(Boolean optional) {
            this.optional = Objects.requireNonNull(optional);
            return this;
        }        public ConfigMapEnvSourceResponse build() {
            return new ConfigMapEnvSourceResponse(localObjectReference, name, optional);
        }
    }
}
