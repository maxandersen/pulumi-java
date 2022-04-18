// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs.JSONSchemaProps;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomResourceValidation {
    /**
     * openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
     * 
     */
    private final @Nullable JSONSchemaProps openAPIV3Schema;

    @CustomType.Constructor
    private CustomResourceValidation(@CustomType.Parameter("openAPIV3Schema") @Nullable JSONSchemaProps openAPIV3Schema) {
        this.openAPIV3Schema = openAPIV3Schema;
    }

    /**
     * openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
     * 
    */
    public Optional<JSONSchemaProps> openAPIV3Schema() {
        return Optional.ofNullable(this.openAPIV3Schema);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceValidation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JSONSchemaProps openAPIV3Schema;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.openAPIV3Schema = defaults.openAPIV3Schema;
        }

        public Builder openAPIV3Schema(@Nullable JSONSchemaProps openAPIV3Schema) {
            this.openAPIV3Schema = openAPIV3Schema;
            return this;
        }        public CustomResourceValidation build() {
            return new CustomResourceValidation(openAPIV3Schema);
        }
    }
}
