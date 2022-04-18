// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.AsyncOptionsArgs;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.InputMappingArgs;
import com.pulumi.googlenative.deploymentmanager_alpha.inputs.ValidationOptionsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Options allows customized resource handling by Deployment Manager.
 * 
 */
public final class OptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OptionsArgs Empty = new OptionsArgs();

    /**
     * Options regarding how to thread async requests.
     * 
     */
    @Import(name="asyncOptions")
      private final @Nullable Output<List<AsyncOptionsArgs>> asyncOptions;

    public Output<List<AsyncOptionsArgs>> asyncOptions() {
        return this.asyncOptions == null ? Codegen.empty() : this.asyncOptions;
    }

    /**
     * The mappings that apply for requests.
     * 
     */
    @Import(name="inputMappings")
      private final @Nullable Output<List<InputMappingArgs>> inputMappings;

    public Output<List<InputMappingArgs>> inputMappings() {
        return this.inputMappings == null ? Codegen.empty() : this.inputMappings;
    }

    /**
     * The json path to the field in the resource JSON body into which the resource name should be mapped. Leaving this empty indicates that there should be no mapping performed.
     * 
     */
    @Import(name="nameProperty")
      private final @Nullable Output<String> nameProperty;

    public Output<String> nameProperty() {
        return this.nameProperty == null ? Codegen.empty() : this.nameProperty;
    }

    /**
     * Options for how to validate and process properties on a resource.
     * 
     */
    @Import(name="validationOptions")
      private final @Nullable Output<ValidationOptionsArgs> validationOptions;

    public Output<ValidationOptionsArgs> validationOptions() {
        return this.validationOptions == null ? Codegen.empty() : this.validationOptions;
    }

    public OptionsArgs(
        @Nullable Output<List<AsyncOptionsArgs>> asyncOptions,
        @Nullable Output<List<InputMappingArgs>> inputMappings,
        @Nullable Output<String> nameProperty,
        @Nullable Output<ValidationOptionsArgs> validationOptions) {
        this.asyncOptions = asyncOptions;
        this.inputMappings = inputMappings;
        this.nameProperty = nameProperty;
        this.validationOptions = validationOptions;
    }

    private OptionsArgs() {
        this.asyncOptions = Codegen.empty();
        this.inputMappings = Codegen.empty();
        this.nameProperty = Codegen.empty();
        this.validationOptions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AsyncOptionsArgs>> asyncOptions;
        private @Nullable Output<List<InputMappingArgs>> inputMappings;
        private @Nullable Output<String> nameProperty;
        private @Nullable Output<ValidationOptionsArgs> validationOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(OptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asyncOptions = defaults.asyncOptions;
    	      this.inputMappings = defaults.inputMappings;
    	      this.nameProperty = defaults.nameProperty;
    	      this.validationOptions = defaults.validationOptions;
        }

        public Builder asyncOptions(@Nullable Output<List<AsyncOptionsArgs>> asyncOptions) {
            this.asyncOptions = asyncOptions;
            return this;
        }
        public Builder asyncOptions(@Nullable List<AsyncOptionsArgs> asyncOptions) {
            this.asyncOptions = Codegen.ofNullable(asyncOptions);
            return this;
        }
        public Builder asyncOptions(AsyncOptionsArgs... asyncOptions) {
            return asyncOptions(List.of(asyncOptions));
        }
        public Builder inputMappings(@Nullable Output<List<InputMappingArgs>> inputMappings) {
            this.inputMappings = inputMappings;
            return this;
        }
        public Builder inputMappings(@Nullable List<InputMappingArgs> inputMappings) {
            this.inputMappings = Codegen.ofNullable(inputMappings);
            return this;
        }
        public Builder inputMappings(InputMappingArgs... inputMappings) {
            return inputMappings(List.of(inputMappings));
        }
        public Builder nameProperty(@Nullable Output<String> nameProperty) {
            this.nameProperty = nameProperty;
            return this;
        }
        public Builder nameProperty(@Nullable String nameProperty) {
            this.nameProperty = Codegen.ofNullable(nameProperty);
            return this;
        }
        public Builder validationOptions(@Nullable Output<ValidationOptionsArgs> validationOptions) {
            this.validationOptions = validationOptions;
            return this;
        }
        public Builder validationOptions(@Nullable ValidationOptionsArgs validationOptions) {
            this.validationOptions = Codegen.ofNullable(validationOptions);
            return this;
        }        public OptionsArgs build() {
            return new OptionsArgs(asyncOptions, inputMappings, nameProperty, validationOptions);
        }
    }
}
