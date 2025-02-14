// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.azurenative.streamanalytics.inputs.ScalarFunctionPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A function object, containing all information associated with the named function. All functions are contained under a streaming job.
 * 
 */
public final class FunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionArgs Empty = new FunctionArgs();

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
     * The properties that are associated with a function.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<ScalarFunctionPropertiesArgs> properties;

    /**
     * @return The properties that are associated with a function.
     * 
     */
    public Optional<Output<ScalarFunctionPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private FunctionArgs() {}

    private FunctionArgs(FunctionArgs $) {
        this.name = $.name;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionArgs $;

        public Builder() {
            $ = new FunctionArgs();
        }

        public Builder(FunctionArgs defaults) {
            $ = new FunctionArgs(Objects.requireNonNull(defaults));
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
         * @param properties The properties that are associated with a function.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<ScalarFunctionPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The properties that are associated with a function.
         * 
         * @return builder
         * 
         */
        public Builder properties(ScalarFunctionPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public FunctionArgs build() {
            return $;
        }
    }

}
