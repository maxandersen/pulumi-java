// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.azurenative.machinelearning.enums.OutputPortType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Asset output port
 * 
 */
public final class OutputPortArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutputPortArgs Empty = new OutputPortArgs();

    /**
     * Port data type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,OutputPortType>> type;

    /**
     * @return Port data type.
     * 
     */
    public Optional<Output<Either<String,OutputPortType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private OutputPortArgs() {}

    private OutputPortArgs(OutputPortArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutputPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutputPortArgs $;

        public Builder() {
            $ = new OutputPortArgs();
        }

        public Builder(OutputPortArgs defaults) {
            $ = new OutputPortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Port data type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,OutputPortType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Port data type.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,OutputPortType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Port data type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Port data type.
         * 
         * @return builder
         * 
         */
        public Builder type(OutputPortType type) {
            return type(Either.ofRight(type));
        }

        public OutputPortArgs build() {
            $.type = Codegen.stringProp("type").left(OutputPortType.class).output().arg($.type).def("Dataset").getNullable();
            return $;
        }
    }

}
