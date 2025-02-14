// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.CacheExpirationActionParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the cache expiration action for the delivery rule.
 * 
 */
public final class DeliveryRuleCacheExpirationActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryRuleCacheExpirationActionArgs Empty = new DeliveryRuleCacheExpirationActionArgs();

    /**
     * The name of the action for the delivery rule.
     * Expected value is &#39;CacheExpiration&#39;.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the action for the delivery rule.
     * Expected value is &#39;CacheExpiration&#39;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Defines the parameters for the action.
     * 
     */
    @Import(name="parameters", required=true)
    private Output<CacheExpirationActionParametersArgs> parameters;

    /**
     * @return Defines the parameters for the action.
     * 
     */
    public Output<CacheExpirationActionParametersArgs> parameters() {
        return this.parameters;
    }

    private DeliveryRuleCacheExpirationActionArgs() {}

    private DeliveryRuleCacheExpirationActionArgs(DeliveryRuleCacheExpirationActionArgs $) {
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryRuleCacheExpirationActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryRuleCacheExpirationActionArgs $;

        public Builder() {
            $ = new DeliveryRuleCacheExpirationActionArgs();
        }

        public Builder(DeliveryRuleCacheExpirationActionArgs defaults) {
            $ = new DeliveryRuleCacheExpirationActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the action for the delivery rule.
         * Expected value is &#39;CacheExpiration&#39;.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the action for the delivery rule.
         * Expected value is &#39;CacheExpiration&#39;.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters Defines the parameters for the action.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Output<CacheExpirationActionParametersArgs> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Defines the parameters for the action.
         * 
         * @return builder
         * 
         */
        public Builder parameters(CacheExpirationActionParametersArgs parameters) {
            return parameters(Output.of(parameters));
        }

        public DeliveryRuleCacheExpirationActionArgs build() {
            $.name = Codegen.stringProp("name").output().arg($.name).require();
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            return $;
        }
    }

}
