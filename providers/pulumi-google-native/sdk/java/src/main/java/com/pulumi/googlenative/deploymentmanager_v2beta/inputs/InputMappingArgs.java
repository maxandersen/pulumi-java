// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.deploymentmanager_v2beta.enums.InputMappingLocation;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * InputMapping creates a &#39;virtual&#39; property that will be injected into the properties before sending the request to the underlying API.
 * 
 */
public final class InputMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final InputMappingArgs Empty = new InputMappingArgs();

    /**
     * The name of the field that is going to be injected.
     * 
     */
    @Import(name="fieldName")
    private @Nullable Output<String> fieldName;

    public Optional<Output<String>> fieldName() {
        return Optional.ofNullable(this.fieldName);
    }

    /**
     * The location where this mapping applies.
     * 
     */
    @Import(name="location")
    private @Nullable Output<InputMappingLocation> location;

    public Optional<Output<InputMappingLocation>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Regex to evaluate on method to decide if input applies.
     * 
     */
    @Import(name="methodMatch")
    private @Nullable Output<String> methodMatch;

    public Optional<Output<String>> methodMatch() {
        return Optional.ofNullable(this.methodMatch);
    }

    /**
     * A jsonPath expression to select an element.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private InputMappingArgs() {}

    private InputMappingArgs(InputMappingArgs $) {
        this.fieldName = $.fieldName;
        this.location = $.location;
        this.methodMatch = $.methodMatch;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InputMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InputMappingArgs $;

        public Builder() {
            $ = new InputMappingArgs();
        }

        public Builder(InputMappingArgs defaults) {
            $ = new InputMappingArgs(Objects.requireNonNull(defaults));
        }

        public Builder fieldName(@Nullable Output<String> fieldName) {
            $.fieldName = fieldName;
            return this;
        }

        public Builder fieldName(String fieldName) {
            return fieldName(Output.of(fieldName));
        }

        public Builder location(@Nullable Output<InputMappingLocation> location) {
            $.location = location;
            return this;
        }

        public Builder location(InputMappingLocation location) {
            return location(Output.of(location));
        }

        public Builder methodMatch(@Nullable Output<String> methodMatch) {
            $.methodMatch = methodMatch;
            return this;
        }

        public Builder methodMatch(String methodMatch) {
            return methodMatch(Output.of(methodMatch));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public InputMappingArgs build() {
            return $;
        }
    }

}
