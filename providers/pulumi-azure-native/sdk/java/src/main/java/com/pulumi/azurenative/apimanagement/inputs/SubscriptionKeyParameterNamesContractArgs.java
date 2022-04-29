// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Subscription key parameter names details.
 * 
 */
public final class SubscriptionKeyParameterNamesContractArgs extends ResourceArgs {

    public static final SubscriptionKeyParameterNamesContractArgs Empty = new SubscriptionKeyParameterNamesContractArgs();

    /**
     * Subscription key header name.
     * 
     */
    @Import(name="header")
    private @Nullable Output<String> header;

    /**
     * @return Subscription key header name.
     * 
     */
    public Optional<Output<String>> header() {
        return Optional.ofNullable(this.header);
    }

    /**
     * Subscription key query string parameter name.
     * 
     */
    @Import(name="query")
    private @Nullable Output<String> query;

    /**
     * @return Subscription key query string parameter name.
     * 
     */
    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    private SubscriptionKeyParameterNamesContractArgs() {}

    private SubscriptionKeyParameterNamesContractArgs(SubscriptionKeyParameterNamesContractArgs $) {
        this.header = $.header;
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionKeyParameterNamesContractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionKeyParameterNamesContractArgs $;

        public Builder() {
            $ = new SubscriptionKeyParameterNamesContractArgs();
        }

        public Builder(SubscriptionKeyParameterNamesContractArgs defaults) {
            $ = new SubscriptionKeyParameterNamesContractArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param header Subscription key header name.
         * 
         * @return builder
         * 
         */
        public Builder header(@Nullable Output<String> header) {
            $.header = header;
            return this;
        }

        /**
         * @param header Subscription key header name.
         * 
         * @return builder
         * 
         */
        public Builder header(String header) {
            return header(Output.of(header));
        }

        /**
         * @param query Subscription key query string parameter name.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Subscription key query string parameter name.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        public SubscriptionKeyParameterNamesContractArgs build() {
            return $;
        }
    }

}
