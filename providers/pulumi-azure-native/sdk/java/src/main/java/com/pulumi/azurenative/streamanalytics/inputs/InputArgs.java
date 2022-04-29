// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.azurenative.streamanalytics.inputs.ReferenceInputPropertiesArgs;
import com.pulumi.azurenative.streamanalytics.inputs.StreamInputPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An input object, containing all information associated with the named input. All inputs are contained under a streaming job.
 * 
 */
public final class InputArgs extends ResourceArgs {

    public static final InputArgs Empty = new InputArgs();

    /**
     * Resource name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The properties that are associated with an input. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Either<ReferenceInputPropertiesArgs,StreamInputPropertiesArgs>> properties;

    /**
     * @return The properties that are associated with an input. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<Output<Either<ReferenceInputPropertiesArgs,StreamInputPropertiesArgs>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private InputArgs() {}

    private InputArgs(InputArgs $) {
        this.name = $.name;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InputArgs $;

        public Builder() {
            $ = new InputArgs();
        }

        public Builder(InputArgs defaults) {
            $ = new InputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Resource name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param properties The properties that are associated with an input. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Either<ReferenceInputPropertiesArgs,StreamInputPropertiesArgs>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The properties that are associated with an input. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder properties(Either<ReferenceInputPropertiesArgs,StreamInputPropertiesArgs> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param properties The properties that are associated with an input. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder properties(ReferenceInputPropertiesArgs properties) {
            return properties(Either.ofLeft(properties));
        }

        /**
         * @param properties The properties that are associated with an input. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder properties(StreamInputPropertiesArgs properties) {
            return properties(Either.ofRight(properties));
        }

        public InputArgs build() {
            return $;
        }
    }

}
