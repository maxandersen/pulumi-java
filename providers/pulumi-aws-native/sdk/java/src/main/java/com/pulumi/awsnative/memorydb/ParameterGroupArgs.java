// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.memorydb;

import com.pulumi.awsnative.memorydb.inputs.ParameterGroupTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ParameterGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ParameterGroupArgs Empty = new ParameterGroupArgs();

    /**
     * A description of the parameter group.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the parameter group.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the parameter group family that this parameter group is compatible with.
     * 
     */
    @Import(name="family", required=true)
    private Output<String> family;

    /**
     * @return The name of the parameter group family that this parameter group is compatible with.
     * 
     */
    public Output<String> family() {
        return this.family;
    }

    /**
     * The name of the parameter group.
     * 
     */
    @Import(name="parameterGroupName")
    private @Nullable Output<String> parameterGroupName;

    /**
     * @return The name of the parameter group.
     * 
     */
    public Optional<Output<String>> parameterGroupName() {
        return Optional.ofNullable(this.parameterGroupName);
    }

    /**
     * An map of parameter names and values for the parameter update. You must supply at least one parameter name and value; subsequent arguments are optional.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Object> parameters;

    /**
     * @return An map of parameter names and values for the parameter update. You must supply at least one parameter name and value; subsequent arguments are optional.
     * 
     */
    public Optional<Output<Object>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * An array of key-value pairs to apply to this parameter group.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ParameterGroupTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this parameter group.
     * 
     */
    public Optional<Output<List<ParameterGroupTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ParameterGroupArgs() {}

    private ParameterGroupArgs(ParameterGroupArgs $) {
        this.description = $.description;
        this.family = $.family;
        this.parameterGroupName = $.parameterGroupName;
        this.parameters = $.parameters;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParameterGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParameterGroupArgs $;

        public Builder() {
            $ = new ParameterGroupArgs();
        }

        public Builder(ParameterGroupArgs defaults) {
            $ = new ParameterGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the parameter group.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the parameter group.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param family The name of the parameter group family that this parameter group is compatible with.
         * 
         * @return builder
         * 
         */
        public Builder family(Output<String> family) {
            $.family = family;
            return this;
        }

        /**
         * @param family The name of the parameter group family that this parameter group is compatible with.
         * 
         * @return builder
         * 
         */
        public Builder family(String family) {
            return family(Output.of(family));
        }

        /**
         * @param parameterGroupName The name of the parameter group.
         * 
         * @return builder
         * 
         */
        public Builder parameterGroupName(@Nullable Output<String> parameterGroupName) {
            $.parameterGroupName = parameterGroupName;
            return this;
        }

        /**
         * @param parameterGroupName The name of the parameter group.
         * 
         * @return builder
         * 
         */
        public Builder parameterGroupName(String parameterGroupName) {
            return parameterGroupName(Output.of(parameterGroupName));
        }

        /**
         * @param parameters An map of parameter names and values for the parameter update. You must supply at least one parameter name and value; subsequent arguments are optional.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Object> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters An map of parameter names and values for the parameter update. You must supply at least one parameter name and value; subsequent arguments are optional.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Object parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param tags An array of key-value pairs to apply to this parameter group.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ParameterGroupTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this parameter group.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ParameterGroupTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this parameter group.
         * 
         * @return builder
         * 
         */
        public Builder tags(ParameterGroupTagArgs... tags) {
            return tags(List.of(tags));
        }

        public ParameterGroupArgs build() {
            $.family = Objects.requireNonNull($.family, "expected parameter 'family' to be non-null");
            return $;
        }
    }

}
