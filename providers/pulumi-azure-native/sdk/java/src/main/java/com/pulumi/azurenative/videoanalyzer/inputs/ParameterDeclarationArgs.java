// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.azurenative.videoanalyzer.enums.ParameterType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Single topology parameter declaration. Declared parameters can and must be referenced throughout the topology and can optionally have default values to be used when they are not defined in the pipelines.
 * 
 */
public final class ParameterDeclarationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ParameterDeclarationArgs Empty = new ParameterDeclarationArgs();

    /**
     * The default value for the parameter to be used if the pipeline does not specify a value.
     * 
     */
    @Import(name="default")
    private @Nullable Output<String> default_;

    public Optional<Output<String>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * Description of the parameter.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the parameter.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Type of the parameter.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,ParameterType>> type;

    public Output<Either<String,ParameterType>> type() {
        return this.type;
    }

    private ParameterDeclarationArgs() {}

    private ParameterDeclarationArgs(ParameterDeclarationArgs $) {
        this.default_ = $.default_;
        this.description = $.description;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParameterDeclarationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParameterDeclarationArgs $;

        public Builder() {
            $ = new ParameterDeclarationArgs();
        }

        public Builder(ParameterDeclarationArgs defaults) {
            $ = new ParameterDeclarationArgs(Objects.requireNonNull(defaults));
        }

        public Builder default_(@Nullable Output<String> default_) {
            $.default_ = default_;
            return this;
        }

        public Builder default_(String default_) {
            return default_(Output.of(default_));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder type(Output<Either<String,ParameterType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,ParameterType> type) {
            return type(Output.of(type));
        }

        public ParameterDeclarationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
