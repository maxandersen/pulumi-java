// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights.inputs;

import com.pulumi.azurenative.timeseriesinsights.enums.ReferenceDataKeyPropertyType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A key property for the reference data set. A reference data set can have multiple key properties.
 * 
 */
public final class ReferenceDataSetKeyPropertyArgs extends ResourceArgs {

    public static final ReferenceDataSetKeyPropertyArgs Empty = new ReferenceDataSetKeyPropertyArgs();

    /**
     * The name of the key property.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the key property.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of the key property.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,ReferenceDataKeyPropertyType>> type;

    /**
     * @return The type of the key property.
     * 
     */
    public Optional<Output<Either<String,ReferenceDataKeyPropertyType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private ReferenceDataSetKeyPropertyArgs() {}

    private ReferenceDataSetKeyPropertyArgs(ReferenceDataSetKeyPropertyArgs $) {
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReferenceDataSetKeyPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReferenceDataSetKeyPropertyArgs $;

        public Builder() {
            $ = new ReferenceDataSetKeyPropertyArgs();
        }

        public Builder(ReferenceDataSetKeyPropertyArgs defaults) {
            $ = new ReferenceDataSetKeyPropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the key property.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the key property.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The type of the key property.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,ReferenceDataKeyPropertyType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the key property.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,ReferenceDataKeyPropertyType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The type of the key property.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The type of the key property.
         * 
         * @return builder
         * 
         */
        public Builder type(ReferenceDataKeyPropertyType type) {
            return type(Either.ofRight(type));
        }

        public ReferenceDataSetKeyPropertyArgs build() {
            return $;
        }
    }

}
