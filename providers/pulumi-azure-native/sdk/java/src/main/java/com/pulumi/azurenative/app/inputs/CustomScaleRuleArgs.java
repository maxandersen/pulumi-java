// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app.inputs;

import com.pulumi.azurenative.app.inputs.ScaleRuleAuthArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container App container Custom scaling rule.
 * 
 */
public final class CustomScaleRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomScaleRuleArgs Empty = new CustomScaleRuleArgs();

    /**
     * Authentication secrets for the custom scale rule.
     * 
     */
    @Import(name="auth")
    private @Nullable Output<List<ScaleRuleAuthArgs>> auth;

    /**
     * @return Authentication secrets for the custom scale rule.
     * 
     */
    public Optional<Output<List<ScaleRuleAuthArgs>>> auth() {
        return Optional.ofNullable(this.auth);
    }

    /**
     * Metadata properties to describe custom scale rule.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return Metadata properties to describe custom scale rule.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Type of the custom scale rule
     * eg: azure-servicebus, redis etc.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the custom scale rule
     * eg: azure-servicebus, redis etc.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private CustomScaleRuleArgs() {}

    private CustomScaleRuleArgs(CustomScaleRuleArgs $) {
        this.auth = $.auth;
        this.metadata = $.metadata;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomScaleRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomScaleRuleArgs $;

        public Builder() {
            $ = new CustomScaleRuleArgs();
        }

        public Builder(CustomScaleRuleArgs defaults) {
            $ = new CustomScaleRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auth Authentication secrets for the custom scale rule.
         * 
         * @return builder
         * 
         */
        public Builder auth(@Nullable Output<List<ScaleRuleAuthArgs>> auth) {
            $.auth = auth;
            return this;
        }

        /**
         * @param auth Authentication secrets for the custom scale rule.
         * 
         * @return builder
         * 
         */
        public Builder auth(List<ScaleRuleAuthArgs> auth) {
            return auth(Output.of(auth));
        }

        /**
         * @param auth Authentication secrets for the custom scale rule.
         * 
         * @return builder
         * 
         */
        public Builder auth(ScaleRuleAuthArgs... auth) {
            return auth(List.of(auth));
        }

        /**
         * @param metadata Metadata properties to describe custom scale rule.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata Metadata properties to describe custom scale rule.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param type Type of the custom scale rule
         * eg: azure-servicebus, redis etc.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the custom scale rule
         * eg: azure-servicebus, redis etc.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CustomScaleRuleArgs build() {
            return $;
        }
    }

}
