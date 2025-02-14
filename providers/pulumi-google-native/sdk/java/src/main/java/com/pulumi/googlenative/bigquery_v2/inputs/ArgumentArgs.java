// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigquery_v2.enums.ArgumentArgumentKind;
import com.pulumi.googlenative.bigquery_v2.enums.ArgumentMode;
import com.pulumi.googlenative.bigquery_v2.inputs.StandardSqlDataTypeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input/output argument of a function or a stored procedure.
 * 
 */
public final class ArgumentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ArgumentArgs Empty = new ArgumentArgs();

    /**
     * Optional. Defaults to FIXED_TYPE.
     * 
     */
    @Import(name="argumentKind")
    private @Nullable Output<ArgumentArgumentKind> argumentKind;

    /**
     * @return Optional. Defaults to FIXED_TYPE.
     * 
     */
    public Optional<Output<ArgumentArgumentKind>> argumentKind() {
        return Optional.ofNullable(this.argumentKind);
    }

    /**
     * Required unless argument_kind = ANY_TYPE.
     * 
     */
    @Import(name="dataType")
    private @Nullable Output<StandardSqlDataTypeArgs> dataType;

    /**
     * @return Required unless argument_kind = ANY_TYPE.
     * 
     */
    public Optional<Output<StandardSqlDataTypeArgs>> dataType() {
        return Optional.ofNullable(this.dataType);
    }

    /**
     * Optional. Specifies whether the argument is input or output. Can be set for procedures only.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<ArgumentMode> mode;

    /**
     * @return Optional. Specifies whether the argument is input or output. Can be set for procedures only.
     * 
     */
    public Optional<Output<ArgumentMode>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Optional. The name of this argument. Can be absent for function return argument.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Optional. The name of this argument. Can be absent for function return argument.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ArgumentArgs() {}

    private ArgumentArgs(ArgumentArgs $) {
        this.argumentKind = $.argumentKind;
        this.dataType = $.dataType;
        this.mode = $.mode;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArgumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArgumentArgs $;

        public Builder() {
            $ = new ArgumentArgs();
        }

        public Builder(ArgumentArgs defaults) {
            $ = new ArgumentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param argumentKind Optional. Defaults to FIXED_TYPE.
         * 
         * @return builder
         * 
         */
        public Builder argumentKind(@Nullable Output<ArgumentArgumentKind> argumentKind) {
            $.argumentKind = argumentKind;
            return this;
        }

        /**
         * @param argumentKind Optional. Defaults to FIXED_TYPE.
         * 
         * @return builder
         * 
         */
        public Builder argumentKind(ArgumentArgumentKind argumentKind) {
            return argumentKind(Output.of(argumentKind));
        }

        /**
         * @param dataType Required unless argument_kind = ANY_TYPE.
         * 
         * @return builder
         * 
         */
        public Builder dataType(@Nullable Output<StandardSqlDataTypeArgs> dataType) {
            $.dataType = dataType;
            return this;
        }

        /**
         * @param dataType Required unless argument_kind = ANY_TYPE.
         * 
         * @return builder
         * 
         */
        public Builder dataType(StandardSqlDataTypeArgs dataType) {
            return dataType(Output.of(dataType));
        }

        /**
         * @param mode Optional. Specifies whether the argument is input or output. Can be set for procedures only.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<ArgumentMode> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Optional. Specifies whether the argument is input or output. Can be set for procedures only.
         * 
         * @return builder
         * 
         */
        public Builder mode(ArgumentMode mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param name Optional. The name of this argument. Can be absent for function return argument.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Optional. The name of this argument. Can be absent for function return argument.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ArgumentArgs build() {
            return $;
        }
    }

}
