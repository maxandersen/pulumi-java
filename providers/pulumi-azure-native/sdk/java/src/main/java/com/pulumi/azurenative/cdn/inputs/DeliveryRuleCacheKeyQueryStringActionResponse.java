// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.CacheKeyQueryStringActionParametersResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the cache-key query string action for the delivery rule.
 * 
 */
public final class DeliveryRuleCacheKeyQueryStringActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryRuleCacheKeyQueryStringActionResponse Empty = new DeliveryRuleCacheKeyQueryStringActionResponse();

    /**
     * The name of the action for the delivery rule.
     * Expected value is &#39;CacheKeyQueryString&#39;.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Defines the parameters for the action.
     * 
     */
    @Import(name="parameters", required=true)
    private CacheKeyQueryStringActionParametersResponse parameters;

    public CacheKeyQueryStringActionParametersResponse parameters() {
        return this.parameters;
    }

    private DeliveryRuleCacheKeyQueryStringActionResponse() {}

    private DeliveryRuleCacheKeyQueryStringActionResponse(DeliveryRuleCacheKeyQueryStringActionResponse $) {
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryRuleCacheKeyQueryStringActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryRuleCacheKeyQueryStringActionResponse $;

        public Builder() {
            $ = new DeliveryRuleCacheKeyQueryStringActionResponse();
        }

        public Builder(DeliveryRuleCacheKeyQueryStringActionResponse defaults) {
            $ = new DeliveryRuleCacheKeyQueryStringActionResponse(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder parameters(CacheKeyQueryStringActionParametersResponse parameters) {
            $.parameters = parameters;
            return this;
        }

        public DeliveryRuleCacheKeyQueryStringActionResponse build() {
            $.name = Codegen.stringProp("name").arg($.name).require();
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            return $;
        }
    }

}
