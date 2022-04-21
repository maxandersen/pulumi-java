// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.JSONSchemaPropsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CustomResourceValidation is a list of validation methods for CustomResources.
 * 
 */
public final class CustomResourceValidationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomResourceValidationArgs Empty = new CustomResourceValidationArgs();

    /**
     * openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
     * 
     */
    @Import(name="openAPIV3Schema")
    private @Nullable Output<JSONSchemaPropsArgs> openAPIV3Schema;

    public Optional<Output<JSONSchemaPropsArgs>> openAPIV3Schema() {
        return Optional.ofNullable(this.openAPIV3Schema);
    }

    private CustomResourceValidationArgs() {}

    private CustomResourceValidationArgs(CustomResourceValidationArgs $) {
        this.openAPIV3Schema = $.openAPIV3Schema;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomResourceValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomResourceValidationArgs $;

        public Builder() {
            $ = new CustomResourceValidationArgs();
        }

        public Builder(CustomResourceValidationArgs defaults) {
            $ = new CustomResourceValidationArgs(Objects.requireNonNull(defaults));
        }

        public Builder openAPIV3Schema(@Nullable Output<JSONSchemaPropsArgs> openAPIV3Schema) {
            $.openAPIV3Schema = openAPIV3Schema;
            return this;
        }

        public Builder openAPIV3Schema(JSONSchemaPropsArgs openAPIV3Schema) {
            return openAPIV3Schema(Output.of(openAPIV3Schema));
        }

        public CustomResourceValidationArgs build() {
            return $;
        }
    }

}
